package uz.jl.configs;

import uz.jl.dao.auth.AuthUserDAO;
import uz.jl.service.auth.AuthUserService;
import uz.jl.utils.BaseUtil;

public class ApplicationContextHolder {

    @SuppressWarnings("unchecked")
    public static  <T> T getBean(String beanName) {
        return switch (beanName) {
            case "AuthUserDAO" -> (T) AuthUserDAO.getInstance();
            case "BaseUtil" -> (T) BaseUtil.getInstance();
            case "AuthUserService" -> (T) AuthUserService.getInstance();
            default -> throw new RuntimeException("Bean Not Found");
        };
    }

    public static  <T> T getBean(Class<T> clazz) {
        String beanName = clazz.getSimpleName();
        return getBean(beanName);
    }

}
