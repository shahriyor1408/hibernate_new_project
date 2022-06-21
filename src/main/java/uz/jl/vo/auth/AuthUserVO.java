package uz.jl.vo.auth;

import lombok.*;
import uz.jl.enums.AuthRole;
import uz.jl.vo.GenericVO;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthUserVO extends GenericVO {
    private String username;
    private String email;
    private AuthRole role;
    private Timestamp createdAt;
}
