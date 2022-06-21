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
    static AuthUI authUI = new AuthUI();

    public static void main(String[] args) {

        if (Objects.isNull(Session.sessionUser)) {
            BaseUtils.println("Login -> 1");
            BaseUtils.println("Register -> 2");
        } else {
            BaseUtils.println("\nShow workspace List -> 3");
            BaseUtils.println("Workspace settings -> 4");
            BaseUtils.println("Logout -> 0");
        }

        BaseUtils.println("Quit -> q");
        String choice = BaseUtils.readText("?:");
        switch (choice) {
            case "1" -> authUI.login();
            case "2" -> authUI.register();
            case "3" -> authUI.workSpaceList();
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
        BaseUtils.println("\nCreate workspace -> 1");
        BaseUtils.println("Show workspace   -> 2");
        BaseUtils.println("Update workspace -> 3");
        BaseUtils.println("Delete workspace -> 4");
        BaseUtils.println("Add member       -> 5");
        BaseUtils.println("Back             -> 0");
        BaseUtils.println("Quit             -> q");
        String choice = BaseUtils.readText("?:");
        switch (choice) {
            case "1" -> authUI.workSpaceCreate();
            case "2" -> authUI.workSpaceShow();
            case "3" -> authUI.workSpaceUpdate();
            case "4" -> authUI.workSpaceDelete();
            case "5" -> authUI.add_member();
            case "0" -> {
                return;
            }
            case "q" -> {
                BaseUtils.println("Bye", Colors.CYAN);
                System.exit(0);
            }
            default -> BaseUtils.println("Wrong Choice", Colors.RED);
        }
        workSpaceSettings();
    }

    private void workSpaceShow() {
        /***
         *  Shu workspace chiqib turadi va unga qoshimcha
         *  pastda doskalarga tegishli funksiyalar turadi
         *  Logika yozing oxirida men yozgan narsa chiqib tursin
         */


        BaseUtils.println("\nBoard List -> 1");
        BaseUtils.println("Board settings   -> 2");
        BaseUtils.println("Back             -> 0");
        BaseUtils.println("Quit             -> q");
        String choice = BaseUtils.readText("?:");
        switch (choice) {
            case "1" -> authUI.boardList();
            case "2" -> authUI.boardSettings();
            case "0" -> {
                return;
            }
            case "q" -> {
                BaseUtils.println("Bye", Colors.CYAN);
                System.exit(0);
            }
            default -> BaseUtils.println("Wrong Choice", Colors.RED);
        }
        workSpaceShow();
    }

    private void boardSettings() {
        BaseUtils.println("\nCreate board -> 1");
        BaseUtils.println("Show board   -> 2");
        BaseUtils.println("Update board -> 3");
        BaseUtils.println("Delete board -> 4");
        BaseUtils.println("Back         -> 0");
        BaseUtils.println("Quit         -> q");
        String choice = BaseUtils.readText("?:");
        switch (choice) {
            case "1" -> authUI.boardCreate();
            case "2" -> authUI.boardShow();
            case "3" -> authUI.boardUpdate();
            case "4" -> authUI.boardDelete();
            case "0" -> {
                return;
            }
            case "q" -> {
                BaseUtils.println("Bye", Colors.CYAN);
                System.exit(0);
            }
            default -> BaseUtils.println("Wrong Choice", Colors.RED);
        }
        boardSettings();
    }

    private void boardDelete() {

    }

    private void boardUpdate() {

    }

    private void boardShow() {
        /***
         * Boardni show qilganda board haqida malumotlar va men yozgan narsalar chiqib tursin
         */

        BaseUtils.println("\nColumn List -> 1");
        BaseUtils.println("Column settings   -> 2");
        BaseUtils.println("Back             -> 0");
        BaseUtils.println("Quit             -> q");
        String choice = BaseUtils.readText("?:");
        switch (choice) {
            case "1" -> authUI.columnList();
            case "2" -> authUI.columnSettings();
            case "0" -> {
                return;
            }
            case "q" -> {
                BaseUtils.println("Bye", Colors.CYAN);
                System.exit(0);
            }
            default -> BaseUtils.println("Wrong Choice", Colors.RED);
        }
        boardShow();
    }

    private void columnSettings() {
        BaseUtils.println("\nCreate column -> 1");
        BaseUtils.println("Show column   -> 2");
        BaseUtils.println("Update column -> 3");
        BaseUtils.println("Delete column -> 4");
        BaseUtils.println("Back          -> 0");
        BaseUtils.println("Quit          -> q");
        String choice = BaseUtils.readText("?:");
        switch (choice) {
            case "1" -> authUI.columnCreate();
            case "2" -> authUI.columnShow();
            case "3" -> authUI.columnUpdate();
            case "4" -> authUI.columnDelete();
            case "0" -> {
                return;
            }
            case "q" -> {
                BaseUtils.println("Bye", Colors.CYAN);
                System.exit(0);
            }
            default -> BaseUtils.println("Wrong Choice", Colors.RED);
        }
        columnSettings();
    }

    private void columnDelete() {

    }

    private void columnUpdate() {

    }

    private void columnShow() {
        /***
         * Column show qilinganda column malumotlari va undagi task va
         * uning funksiyalari tursin
         */


        BaseUtils.println("\nTask List       -> 1");
        BaseUtils.println("Task settings   -> 2");
        BaseUtils.println("Back            -> 0");
        BaseUtils.println("Quit            -> q");
        String choice = BaseUtils.readText("?:");
        switch (choice) {
            case "1" -> authUI.taskList();
            case "2" -> authUI.taskSettings();
            case "0" -> {
                return;
            }
            case "q" -> {
                BaseUtils.println("Bye", Colors.CYAN);
                System.exit(0);
            }
            default -> BaseUtils.println("Wrong Choice", Colors.RED);
        }
        columnShow();
    }

    private void taskSettings() {
        BaseUtils.println("\nCreate task -> 1");
        BaseUtils.println("Show task   -> 2");
        BaseUtils.println("Update task -> 3");
        BaseUtils.println("Delete task -> 4");
        BaseUtils.println("Move task   -> 5");
        BaseUtils.println("Back        -> 0");
        BaseUtils.println("Quit        -> q");
        String choice = BaseUtils.readText("?:");
        switch (choice) {
            case "1" -> authUI.taskCreate();
            case "2" -> authUI.taskShow();
            case "3" -> authUI.taskUpdate();
            case "4" -> authUI.taskDelete();
            case "5" -> authUI.taskMove();
            case "0" -> {
                return;
            }
            case "q" -> {
                BaseUtils.println("Bye", Colors.CYAN);
                System.exit(0);
            }
            default -> BaseUtils.println("Wrong Choice", Colors.RED);
        }
        taskSettings();
    }

    private void taskMove() {

    }

    private void taskDelete() {

    }

    private void taskUpdate() {

    }

    private void taskShow() {
        /***
         * Task haqida malumotlar chiqib tursin va unga tegishli funksiyalar ham bo'lsin
         */

        BaseUtils.println("\nComment List       -> 1");
        BaseUtils.println("Comment settings   -> 2");
        BaseUtils.println("Back               -> 0");
        BaseUtils.println("Quit               -> q");
        String choice = BaseUtils.readText("?:");
        switch (choice) {
            case "1" -> authUI.commentList();
            case "2" -> authUI.commentSettings();
            case "0" -> {
                return;
            }
            case "q" -> {
                BaseUtils.println("Bye", Colors.CYAN);
                System.exit(0);
            }
            default -> BaseUtils.println("Wrong Choice", Colors.RED);
        }
        taskShow();
    }

    private void commentSettings() {
        BaseUtils.println("\nCreate comment -> 1");
        BaseUtils.println("Update comment -> 2");
        BaseUtils.println("Delete comment -> 3");
        BaseUtils.println("Back           -> 0");
        BaseUtils.println("Quit           -> q");
        String choice = BaseUtils.readText("?:");
        switch (choice) {
            case "1" -> authUI.commentCreate();
            case "2" -> authUI.commentUpdate();
            case "3" -> authUI.commentDelete();
            case "0" -> {
                return;
            }
            case "q" -> {
                BaseUtils.println("Bye", Colors.CYAN);
                System.exit(0);
            }
            default -> BaseUtils.println("Wrong Choice", Colors.RED);
        }
        commentSettings();
    }

    private void commentDelete() {

    }

    private void commentUpdate() {

    }

    private void commentCreate() {

    }

    private void commentList() {

    }

    private void taskCreate() {

    }

    private void taskList() {

    }

    private void columnCreate() {

    }

    private void columnList() {

    }

    private void boardCreate() {

    }

    private void boardList() {

    }

    private void add_member() {

    }

    private void workSpaceDelete() {

    }

    private void workSpaceUpdate() {

    }

    private void workSpaceCreate() {

    }

    private void workSpaceList() {
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
        Session.sessionUser = null;
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
