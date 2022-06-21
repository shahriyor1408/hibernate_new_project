package uz.jl.vo.workspace;

import lombok.*;
import uz.jl.vo.GenericVO;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WorkSpaceCreateVO extends GenericVO {
    private String name;
    private String code;
}
