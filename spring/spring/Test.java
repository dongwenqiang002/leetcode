import dao.UserDao;
import service.UserService;
import springUtil.SpringApp;

public class Test {


    public static void main(String[] a){
        SpringApp app = new SpringApp();
        NN service = (NN) app.getBean("NN");
        String name = service.aa();
        System.out.println(name);
    }
}
