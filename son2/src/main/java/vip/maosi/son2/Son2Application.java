package vip.maosi.son2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import vip.maosi.son1.Son1Service;
import vip.maosi.son1.Son1ServiceNoBean;

@SpringBootApplication
@ComponentScan(basePackages = "vip.maosi")
public class Son2Application {
    public static void main(String[] args) {
        SpringApplication.run(Son2Application.class, args);
    }

}
