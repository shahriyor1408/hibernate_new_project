package uz.jl.dao;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import uz.jl.domains.Board;

import java.util.Objects;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BoardDAO extends GenericDAO<Board, Long> {
    private static BoardDAO instance;

    public static BoardDAO getInstance() {
        if (Objects.isNull(instance)) {
            instance = new BoardDAO();
        }
        return instance;
    }
}
