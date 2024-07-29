package by.itclass._02_car;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("02_car.xml");
        var cars = new ArrayList<SimpleCar>();
        cars.add((SimpleCar) ctx.getBean("car1"));
        cars.add((SimpleCar) ctx.getBean("car2"));
        cars.add((SimpleCar) ctx.getBean("car3"));
        cars.add((SimpleCar) ctx.getBean("car4"));
        cars.add((SimpleCar) ctx.getBean("car5"));

        cars.forEach(System.out::println);

        System.out.println("-----------------------");

        System.out.println(ctx.getBean("car6"));
    }
}
