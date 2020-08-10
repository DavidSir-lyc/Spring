import lyc.java.spring.dao.impl.UserDaoImpl_Mysql;
import lyc.java.spring.dao.impl.UserDaoImpl_Redis;
import lyc.java.spring.service.def.UserService;
import lyc.java.spring.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService user = new UserServiceImpl();
        ((UserServiceImpl) user).setUser(new UserDaoImpl_Redis());
        user.getUser();
    }
}
