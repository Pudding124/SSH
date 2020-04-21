package action;

import dao.CarDao;
import model.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarSaveAction {
    String name;
    String number;
    String state;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String execute() throws Exception {

        // create and configure beans
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");

        // retrieve configured instance
        CarDao service = (CarDao) context.getBean("carDao");

        if(getName() != null && getNumber() != null) {
            System.out.println("Save Name: " + getName());
            System.out.println("Save Number: " + getNumber());
            Car car = new Car();
            car.setName(getName());
            car.setNumber(getNumber());
            service.save(car);
            System.out.println("成功儲存");
            return "success";
        }else {
            setState("儲存失敗");
        }
        return "error";

    }
}
