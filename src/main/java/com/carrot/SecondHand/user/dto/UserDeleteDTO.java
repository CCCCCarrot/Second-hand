package com.carrot.SecondHand.user.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@NoArgsConstructor
public class UserDeleteDTO {

    @NotNull
    private Long userId;

    @Builder
    public UserDeleteDTO(Long userId) {
        this.userId = userId;
    }

}
