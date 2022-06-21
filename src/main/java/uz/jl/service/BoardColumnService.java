package uz.jl.service;

import lombok.NonNull;
import uz.jl.configs.ApplicationContextHolder;
import uz.jl.dao.AbstractDAO;
import uz.jl.dao.BoardColumnDAO;
import uz.jl.utils.BaseUtil;
import uz.jl.vo.board_column.BoardColumnCreateVO;
import uz.jl.vo.board_column.BoardColumnUpdateVO;
import uz.jl.vo.board_column.BoardColumnVO;
import uz.jl.vo.http.Response;

import java.util.List;

public class BoardColumnService extends AbstractDAO<BoardColumnDAO> implements GenericCRUDService<
        BoardColumnVO,
        BoardColumnCreateVO,
        BoardColumnUpdateVO,
        Long> {

    private static BoardColumnService instance;
//    private final AuthUserValidator validator;

    private BoardColumnService() {
        super(
                ApplicationContextHolder.getBean(BoardColumnDAO.class),
                ApplicationContextHolder.getBean(BaseUtil.class)
        );
    }

    public static BoardColumnService getInstance() {
        if (instance == null) {
            instance = new BoardColumnService();
        }
        return instance;
    }

    @Override
    public Response<Long> create(@NonNull BoardColumnCreateVO vo) {
        return null;
    }

    @Override
    public Response<Void> update(@NonNull BoardColumnUpdateVO vo) {
        return null;
    }

    @Override
    public Response<Void> delete(@NonNull Long aLong) {
        return null;
    }

    @Override
    public Response<BoardColumnVO> get(@NonNull Long aLong) {
        return null;
    }

    @Override
    public Response<List<BoardColumnVO>> getAll() {
        return null;
    }
}
