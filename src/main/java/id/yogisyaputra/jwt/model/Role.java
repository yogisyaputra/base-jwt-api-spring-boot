package id.yogisyaputra.jwt.model;

import id.yogisyaputra.jwt.enums.RoleTypeEnums;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * project base-jwt-api-spring-boot
 * created Wednesday 27/07/2022
 * author Yogi Syaputra @yogisyaputra
 */

@Entity
@Table(name = "roles")
@Getter
@Setter
public class Role {

    private static final long serialVersionUID = -6778467676663927940L;

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id",unique = true)
    private String id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private RoleTypeEnums name;
}
