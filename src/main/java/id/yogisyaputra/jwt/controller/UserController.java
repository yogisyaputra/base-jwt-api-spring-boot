package id.yogisyaputra.jwt.controller;

import id.yogisyaputra.jwt.model.Users;
import id.yogisyaputra.jwt.repo.UserRepo;
import id.yogisyaputra.jwt.utils.security.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * project base-jwt-api-spring-boot
 * created Wednesday 27/07/2022
 * author Yogi Syaputra @yogisyaputra
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class UserController {

    @Autowired
    UserRepo userRepository;

    @Autowired
    JwtUtils jwtUtils;


    @GetMapping("/user")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public ResponseEntity<?> userAccess(HttpServletRequest request) {
        String requestTokenHeader = request.getHeader("Authorization");

        String jwtToken = requestTokenHeader.substring(7);
        String username = jwtUtils.getUserNameFromJwtToken(jwtToken);
        Users user = userRepository.findByUsername(username).get();

        return ResponseEntity.ok(user);

    }
}
