package uz.jl.dao;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import uz.jl.domains.WorkSpace;

import java.util.Objects;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class WorkSpaceDao extends GenericDAO<WorkSpace, Long> {
    private static WorkSpaceDao instance;

    public static WorkSpaceDao getInstance() {
        if (Objects.isNull(instance)) {
            instance = new WorkSpaceDao();
        }
        return instance;
    }
}
