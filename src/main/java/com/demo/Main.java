package com.demo;

import org.apache.camel.CamelContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Main.class, args);

        CamelContext camelContext = (CamelContext)ctx.getBean("camelContext");

        try {
            camelContext.addRoutes(new MyRouteBuilder());
            camelContext.start();

            Thread.sleep(600*100);
            camelContext.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
