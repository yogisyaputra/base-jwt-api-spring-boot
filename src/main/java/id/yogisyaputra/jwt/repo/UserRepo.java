package id.yogisyaputra.jwt.repo;

import id.yogisyaputra.jwt.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * project base-jwt-api-spring-boot
 * created Wednesday 27/07/2022
 * author Yogi Syaputra @yogisyaputra
 */
@Repository
public interface UserRepo extends JpaRepository<Users, String> {
    Optional<Users> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);

}
