package uz.jl.domains;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.jl.enums.WorkSpaceStatus;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WorkSpace extends Auditable {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Convert(converter = uz.jl.enums.WorkSpaceStatus.WorkspaceStatusConvertor.class)
    private WorkSpaceStatus Status;

    @Column(unique = true, nullable = false)
    private String code;

//    @ManyToMany(mappedBy = "AuthUser")
//    private List<AuthUser> userList = new ArrayList<>();
}
