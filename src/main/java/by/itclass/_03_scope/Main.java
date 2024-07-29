package by.itclass._03_scope;

import by.itclass._02_car.SimpleCar;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("03_scope.xml");
        var car1 = (SimpleCar) ctx.getBean("car");
        var car2 = (SimpleCar) ctx.getBean("car");
        var car3 = (SimpleCar) ctx.getBean("car");

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());
    }
}
