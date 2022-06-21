package uz.jl.vo.workspace;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.jl.enums.WorkSpaceStatus;
import uz.jl.vo.GenericVO;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WorkSpaceUpdateVO extends GenericVO {
    private String name;
    private WorkSpaceStatus status;
    private String code;
}
