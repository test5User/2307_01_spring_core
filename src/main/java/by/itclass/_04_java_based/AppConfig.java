package by.itclass._04_java_based;

import by.itclass._02_car.ComplexCar;
import by.itclass._02_car.Engine;
import by.itclass._02_car.SimpleCar;
import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean
    public String message() {
        return "Hello world!!!";
    }

    @Bean
    public SimpleCar car1() {
        return new SimpleCar();
    }

    @Bean
    public SimpleCar car2() {
        return new SimpleCar("Ford Escort");
    }

    @Bean
    public Engine engine() {
        return new Engine("Diesel");
    }

    @Bean
    public ComplexCar car3() {
        return new ComplexCar(3, "Tesla", engine());
    }
}
