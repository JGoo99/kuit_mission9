package kuit3.backend.dto.user;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PatchNicknameRequest {

    @NotNull(message = "nickname: {NotNull}")
    private String nickname;

}