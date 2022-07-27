package id.yogisyaputra.jwt.dto.response;

import lombok.Getter;
import lombok.Setter;

/**
 * project base-jwt-api-spring-boot
 * created Wednesday 27/07/2022
 * author Yogi Syaputra @yogisyaputra
 */

@Setter
@Getter
public class MessageResponse {
    private String message;

    public MessageResponse(String message) {
        this.message = message;
    }
}
