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
public class Comment extends Auditable{
    @Column
    private String message;

    /***
     * Oziga tegishli ownerga boglanadi
     */

}
