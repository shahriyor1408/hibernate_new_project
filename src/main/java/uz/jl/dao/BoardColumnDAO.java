package uz.jl.dao;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import uz.jl.domains.BoardColumn;

import java.util.Objects;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BoardColumnDAO extends GenericDAO<BoardColumn, Long> {
    private static BoardColumnDAO instance;

    public static BoardColumnDAO getInstance() {
        if (Objects.isNull(instance)) {
            instance = new BoardColumnDAO();
        }
        return instance;
    }
}
