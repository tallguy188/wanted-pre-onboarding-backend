package wantedpreonboarding.demo.domain.entity;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@NoArgsConstructor
@Table(name="tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "user_id", nullable = false)
    private Integer userId;


    @Column(name = "user_email", nullable = false)
    private String userEmail;

    @Column(name="user_pw", nullable = false)
    private String userPw;
}
