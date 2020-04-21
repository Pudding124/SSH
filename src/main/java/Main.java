import dao.CarDao;
import model.Car;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import util.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Car car = new Car();
        car.setName("G6");
        car.setNumber("ADJ-0360");

        session.save(car);
        tx.commit();
        session.close();
        HibernateUtil.shutdown();



//        // create and configure beans
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("spring-config.xml");
//
//        // retrieve configured instance
//        CarDao service = (CarDao) context.getBean("carDao");
//
//        Car car = service.carQuery("GGG-0393");
//        System.out.println(car.getName());
    }
}
