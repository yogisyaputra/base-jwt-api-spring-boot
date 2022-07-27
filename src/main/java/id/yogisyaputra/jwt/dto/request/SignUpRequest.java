package id.yogisyaputra.jwt.dto.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;

/**
 * project base-jwt-api-spring-boot
 * created Wednesday 27/07/2022
 * author Yogi Syaputra @yogisyaputra
 */

@Setter
@Getter
public class SignUpRequest {

    @NotEmpty
    @Size(min = 3, max = 20)
    private String username;

    @NotEmpty
    @Size(min = 6, max = 40)
    private String password;

    @NotEmpty
    @Size(max = 50)
    @Email
    private String email;

    private Set<String> role;
}
