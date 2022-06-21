package uz.jl.domains;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoardColumn extends Auditable {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Long order;

    @Column(unique = true, nullable = false)
    private String code;

    /***
     * Oziga tegishli Boardga boglanishi kerak
     */
}
