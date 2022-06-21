package uz.jl.vo.board_column;

import lombok.*;
import uz.jl.vo.GenericVO;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardColumnVO extends GenericVO {
    private String name;
    private Long order;
    private String code;
}
