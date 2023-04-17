package com.carrot.SecondHand.user.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@EnableJpaAuditing
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(length = 15)
    private String id;

    @Column(length = 20)
    private String password;

    @Column(length = 25)
    private String nickname;

    @Column(length = 15)
    private int phoneNumber;

    @Embedded
    private Address address;

    @CreatedDate // Entity가 생성되어 저장될 때 시간이 자동으로 저장.
    private LocalDateTime reqDate;

    // List<Board> 만들기

    // user 수정
    public void modify(String id, String password, String nickname, int phoneNumber, Address address) {
        this.id = id;
        this.password = password;
        this.nickname = nickname;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

}
