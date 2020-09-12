import com.tplink.lxy.config.config;
import com.tplink.lxy.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        User user = context.getBean("getUser",User.class);
        System.out.println(user.getName());
    }
}
