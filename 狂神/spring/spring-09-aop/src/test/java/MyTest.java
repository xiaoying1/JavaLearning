import com.tplink.lxy.service.Userservice;
import com.tplink.lxy.service.UserserviceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //动态代理的是接口
        Userservice userService = context.getBean("userService", Userservice.class);
        userService.select();
    }
}
