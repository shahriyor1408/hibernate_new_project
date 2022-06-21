package uz.jl.vo.board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.jl.vo.BaseVO;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardCreateVO implements BaseVO {
    private String name;
}
