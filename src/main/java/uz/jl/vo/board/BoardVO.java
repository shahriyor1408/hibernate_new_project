package uz.jl.vo.board;

import lombok.*;
import uz.jl.enums.BoardStatus;
import uz.jl.vo.GenericVO;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardVO extends GenericVO {
    private String name;
    private BoardStatus boardStatus;
}
