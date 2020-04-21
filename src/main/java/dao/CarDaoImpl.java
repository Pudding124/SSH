package dao;

import model.Car;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class CarDaoImpl implements CarDao {

    public void save(Car car) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        car.setName(car.getName());
        car.setNumber(car.getNumber());

        session.save(car);
        tx.commit();
    }

    public Car carQuery(String number) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Car c where c.number=?");
        // 設定查詢參數
        query.setString(0, number);
        Car car = (Car) query.uniqueResult();
        return car;
    }
}
