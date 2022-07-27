package id.yogisyaputra.jwt.dto.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

/**
 * project base-jwt-api-spring-boot
 * created Wednesday 27/07/2022
 * author Yogi Syaputra @yogisyaputra
 */

@Setter
@Getter
public class SigninRequest {
    @NotEmpty(message = "username Tidak boleh empty")
    private String username;

    @NotEmpty(message = "password Tidak boleh empty")
    private String password;

    private String email;
    private String role;
}
