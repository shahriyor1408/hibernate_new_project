package uz.jl.configs;

import uz.jl.dao.BoardColumnDAO;
import uz.jl.dao.BoardDAO;
import uz.jl.dao.WorkSpaceDao;
import uz.jl.dao.auth.AuthUserDAO;
import uz.jl.service.BoardColumnService;
import uz.jl.service.BoardService;
import uz.jl.service.WorkSpaceService;
import uz.jl.service.auth.AuthUserService;
import uz.jl.utils.BaseUtil;

public class ApplicationContextHolder {

    @SuppressWarnings("unchecked")
    public static  <T> T getBean(String beanName) {
        return switch (beanName) {
            case "AuthUserDAO" -> (T) AuthUserDAO.getInstance();
            case "WorkSpaceDao" -> (T) WorkSpaceDao.getInstance();
            case "BoardDAO" -> (T) BoardDAO.getInstance();
            case "BoardColumnDAO" -> (T) BoardColumnDAO.getInstance();
            case "BaseUtil" -> (T) BaseUtil.getInstance();
            case "AuthUserService" -> (T) AuthUserService.getInstance();
            case "WorkSpaceService" -> (T) WorkSpaceService.getInstance();
            case "BoardService" -> (T) BoardService.getInstance();
            case "BoardColumnService" -> (T) BoardColumnService.getInstance();
            default -> throw new RuntimeException("Bean Not Found");
        };
    }

    public static  <T> T getBean(Class<T> clazz) {
        String beanName = clazz.getSimpleName();
        return getBean(beanName);
    }

}
