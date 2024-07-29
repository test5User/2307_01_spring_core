package by.itclass._01_base;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("01_helloworld.xml");
        var defaultMessage = ctx.getBean("default_message");
        var message = ctx.getBean("message");
        System.out.println("M1 = " + defaultMessage);
        System.out.println("M2 = " + message);
    }
}
