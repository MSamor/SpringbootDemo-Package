package vip.maosi.son2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import vip.maosi.son1.Son1Service;
import vip.maosi.son1.Son1ServiceNoBean;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    Son1Service son1Service;

    @GetMapping("/hello2")
    public void hello2(){
         son1Service.helloSon1();
         new Son1ServiceNoBean().helloSon1NoBean();
    }
}
