import dao.UserDAO;
import dao.impl.UserDAOImpl;
import entity.User;
import service.UserService;
import service.impl.UserServiceImpl;

import java.util.List;

/**
 * Created by sukenda on 29/07/18.
 * Project Belajar
 */
public class MainBelajar {

    private static UserDAO dao = new UserDAOImpl();

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.save(new User("Nama", "Password"));
    }
}
