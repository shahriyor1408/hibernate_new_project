package uz.jl.vo.board_column;

import lombok.*;
import uz.jl.vo.GenericVO;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardColumnUpdateVO extends GenericVO {
    private String name;
    private Long order;
    private String code;
}
