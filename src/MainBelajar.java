import entity.User;
import service.UserService;
import service.impl.UserServiceImpl;

/**
 * Created by sukenda on 29/07/18.
 * Project Belajar
 */
public class MainBelajar {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.save(new User("Nama", "Password"));
    }
}
