package uz.jl.vo.board_column;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.jl.vo.GenericVO;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardColumnCreateVO extends GenericVO {
    private String name;
    private String code;
}
