package uz.jl.ui;

import uz.jl.BaseUtils;
import uz.jl.Colors;
import uz.jl.configs.ApplicationContextHolder;
import uz.jl.service.auth.AuthUserService;
import uz.jl.vo.Session;
import uz.jl.vo.auth.AuthUserCreateVO;
import uz.jl.vo.http.Response;

import java.util.Objects;

public class AuthUI {
    static AuthUserService service = ApplicationContextHolder.getBean(AuthUserService.class);

    public static void main(String[] args) {
        AuthUI authUI = new AuthUI();

        if (Objects.isNull(Session.sessionUser)) {
            BaseUtils.println("Login -> 1");
            BaseUtils.println("Register -> 2");
        } else {
            BaseUtils.println("Show workspaces -> 3");
            BaseUtils.println("Workspace settings -> 4");
            BaseUtils.println("Logout -> 0");
        }

        BaseUtils.println("Quit -> q");
        String choice = BaseUtils.readText("?:");
        switch (choice) {
            case "1" -> authUI.login();
            case "2" -> authUI.register();
            case "3" -> authUI.showWorkSpace();
            case "4" -> authUI.workSpaceSettings();
            case "0" -> authUI.logout();
            case "q" -> {
                BaseUtils.println("Bye", Colors.CYAN);
                System.exit(0);
            }
            default -> BaseUtils.println("Wrong Choice", Colors.RED);
        }
        main(args);
    }

    private void workSpaceSettings() {
//        for Javohir
    }

    private void showWorkSpace() {
//      for Javohir
    }

    /***
     * Board
     * for Jahongir aka
     * tables relationships
     */


    /***
     * Mirfayz column
     */

    /***
     * Shohruh aka task function
     */



    private void logout() {
        Session.setSessionUser(null);
    }

    private void register() {
        AuthUserCreateVO vo = AuthUserCreateVO.builder()
                .username(BaseUtils.readText("Create username: "))
                .email(BaseUtils.readText("Enter email: "))
                .password(BaseUtils.readText("Create password: "))
                .build();
        print_response(service.create(vo));
    }

    private void login() {
        String username = BaseUtils.readText("Enter username: ");
        String password = BaseUtils.readText("Enter password: ");
        print_response(service.login(username, password));
    }

    public void print_response(Response response) {
        String color = !response.isOk() ? Colors.RED : Colors.GREEN;
        BaseUtils.println(BaseUtils.gson.toJson(response.getBody()), color);
    }
}
