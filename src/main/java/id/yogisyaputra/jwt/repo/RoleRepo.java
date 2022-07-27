package id.yogisyaputra.jwt.repo;

import id.yogisyaputra.jwt.enums.RoleTypeEnums;
import id.yogisyaputra.jwt.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * project base-jwt-api-spring-boot
 * created Wednesday 27/07/2022
 * author Yogi Syaputra @yogisyaputra
 */
@Repository
public interface RoleRepo extends JpaRepository<Role, String> {
    Optional<Role> findByName(RoleTypeEnums name);

}