package kr.co.ijkim.sideproject.user.model.entity;

import kr.co.ijkim.sideproject.common.EntityBase;
import lombok.Getter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Getter
@DynamicInsert
@DynamicUpdate
public class User extends EntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;
    @Column(length = 30, nullable = false, unique = true)
    private String userId;
    @Column(length = 100, nullable = false)
    private String password;
    @Column(length = 50, nullable = false)
    private String email;
    @Column(length = 10, nullable = false)
    private String userName;
    @Column(length = 20, nullable = false)
    private String phoneNumber;
    @Column(length = 10, nullable = false)
    private String role;


}
