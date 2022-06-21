package uz.jl.domains;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.jl.enums.BoardStatus;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Board extends Auditable {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Convert(converter = uz.jl.enums.BoardStatus.BoardStatusConvertor.class)
    private BoardStatus boardStatus;

    /***
     * Oziga tegishli workspacega boglanishi kerak
     */
}
