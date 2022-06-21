package uz.jl.service;

import lombok.NonNull;
import uz.jl.configs.ApplicationContextHolder;
import uz.jl.dao.AbstractDAO;
import uz.jl.dao.BoardDAO;
import uz.jl.utils.BaseUtil;
import uz.jl.vo.board.BoardCreateVO;
import uz.jl.vo.board.BoardUpdateVO;
import uz.jl.vo.board.BoardVO;
import uz.jl.vo.http.Response;

import java.util.List;

public class BoardService extends AbstractDAO<BoardDAO> implements GenericCRUDService<
        BoardVO,
        BoardCreateVO,
        BoardUpdateVO,
        Long> {
    private static BoardService instance;

    private BoardService() {
        super(
                ApplicationContextHolder.getBean(BoardDAO.class),
                ApplicationContextHolder.getBean(BaseUtil.class)
        );
    }

    public static BoardService getInstance() {
        if (instance == null) {
            instance = new BoardService();
        }
        return instance;
    }

    @Override
    public Response<Long> create(@NonNull BoardCreateVO vo) {
        return null;
    }

    @Override
    public Response<Void> update(@NonNull BoardUpdateVO vo) {
        return null;
    }

    @Override
    public Response<Void> delete(@NonNull Long aLong) {
        return null;
    }

    @Override
    public Response<BoardVO> get(@NonNull Long aLong) {
        return null;
    }

    @Override
    public Response<List<BoardVO>> getAll() {
        return null;
    }
}
