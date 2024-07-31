package by.itclass._06_annotation_based;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //var ctx = new AnnotationConfigApplicationContext(ConnectionManager.class, Controller.class, Dao.class, Service.class);
        var ctx = new AnnotationConfigApplicationContext("by.itclass._06_annotation_based");
//        System.out.println(ctx.getBean(ConnectionManager.class));
//        System.out.println(ctx.getBean(Controller.class));
//        System.out.println(ctx.getBean(Dao.class));
//        System.out.println(ctx.getBean(Service.class));
        System.out.println(ctx.getBean(Controller.class));
    }
}
