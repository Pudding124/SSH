package action;

import dao.CarDao;
import model.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarAction {
    String name;
    String number;
    CarDao carDao;

    public CarDao getCarDao() {
        return carDao;
    }

    public void setCarDao(CarDao carDao) {
        this.carDao = carDao;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String execute() throws Exception {

        // create and configure beans
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");

        // retrieve configured instance
        CarDao service = (CarDao) context.getBean("carDao");

        if(getNumber() != null) {
            System.out.println("Number: " + getNumber());
            Car car = service.carQuery(getNumber());
            System.out.println(car.getName());
            setName(car.getName());
            return "success";
        }

        return "error";

    }
}
