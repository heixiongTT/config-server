package tt.heixiong.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tt on 2018/4/25.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "hello")
    public String sayHello(String name) {
        return "hello, " + name + "!";
    }
}
