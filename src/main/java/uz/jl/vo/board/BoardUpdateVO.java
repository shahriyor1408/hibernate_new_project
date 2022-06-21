package uz.jl.vo.board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.jl.vo.GenericVO;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardUpdateVO extends GenericVO {
    private String name;
}
