package by.itclass._04_java_based;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(ctx.getBean("message"));
        System.out.println(ctx.getBean("car1"));
        System.out.println(ctx.getBean("car2"));
        System.out.println(ctx.getBean("car3"));
    }
}
