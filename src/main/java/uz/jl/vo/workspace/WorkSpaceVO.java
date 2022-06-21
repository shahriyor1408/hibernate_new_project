package uz.jl.vo.workspace;

import lombok.*;
import uz.jl.vo.GenericVO;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WorkSpaceVO extends GenericVO {
    private String name;
    private String status;
    private String code;
    private Timestamp createdAt;
}
