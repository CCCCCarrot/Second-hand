package com.carrot.SecondHand.user.dto;


import com.carrot.SecondHand.user.entity.Address;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserInsertDTO {

    @NotBlank
    private String id;

    @NotBlank
    private String password;

    @NotBlank
    private String nickname;

    @NotNull
    private int phoneNumber;

    @NotNull
    private Address address;

    @Builder
    public UserInsertDTO(String id, String password, String nickname, int phoneNumber, Address address) {
        this.id = id;
        this.password = password;
        this.nickname = nickname;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

}
