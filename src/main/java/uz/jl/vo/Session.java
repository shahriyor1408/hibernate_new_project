package uz.jl.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.jl.enums.AuthRole;
import uz.jl.vo.auth.AuthUserVO;

public class Session extends GenericVO {
    public static SessionUser sessionUser;

    public static void setSessionUser(AuthUserVO session) {
        sessionUser = new SessionUser(session);
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SessionUser {
        private Long id;
        private String username;
        private AuthRole role;

        public SessionUser(AuthUserVO session) {
            this.id = session.getId();
            this.username = session.getUsername();
            this.role = session.getRole();
        }
    }
}
