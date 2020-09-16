import com.tplink.lxy.dao.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;


public class MyTest {
    @Test
    public void test1(){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        UserEntity userEntity = new UserEntity();
        userEntity.setName("lxy");
        userEntity.setPwd("123");

        session.save(userEntity);

        transaction.commit();
        session.close();
        sessionFactory.close();

    }
}
