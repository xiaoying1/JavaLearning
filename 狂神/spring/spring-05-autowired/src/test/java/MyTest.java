import com.tplink.lxy.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("people", People.class);
        people.getCat().shout();
        people.getDog().shout();
    }
}
