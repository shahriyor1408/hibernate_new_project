package uz.jl.service;

import lombok.NonNull;
import uz.jl.configs.ApplicationContextHolder;
import uz.jl.dao.AbstractDAO;
import uz.jl.dao.WorkSpaceDao;
import uz.jl.utils.BaseUtil;
import uz.jl.vo.http.Response;
import uz.jl.vo.workspace.WorkSpaceCreateVO;
import uz.jl.vo.workspace.WorkSpaceUpdateVO;
import uz.jl.vo.workspace.WorkSpaceVO;

import java.util.List;

public class WorkSpaceService extends AbstractDAO<WorkSpaceDao> implements GenericCRUDService<
        WorkSpaceVO,
        WorkSpaceCreateVO,
        WorkSpaceUpdateVO,
        Long> {

    private static WorkSpaceService instance;

    private WorkSpaceService() {
        super(
                ApplicationContextHolder.getBean(WorkSpaceDao.class),
                ApplicationContextHolder.getBean(BaseUtil.class)
        );
    }

    @Override
    public Response<Long> create(@NonNull WorkSpaceCreateVO vo) {
        return null;
    }

    @Override
    public Response<Void> update(@NonNull WorkSpaceUpdateVO vo) {
        return null;
    }

    @Override
    public Response<Void> delete(@NonNull Long aLong) {
        return null;
    }

    @Override
    public Response<WorkSpaceVO> get(@NonNull Long aLong) {
        return null;
    }

    @Override
    public Response<List<WorkSpaceVO>> getAll() {
        return null;
    }

    public static WorkSpaceService getInstance() {
        if (instance == null) {
            instance = new WorkSpaceService();
        }
        return instance;
    }
}
