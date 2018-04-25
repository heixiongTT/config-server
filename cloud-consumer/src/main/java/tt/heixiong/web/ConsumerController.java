package tt.heixiong.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tt.heixiong.service.ConsumerService;

/**
 * Created by tt on 2018/4/25.
 */
@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @RequestMapping("hi")
    public String hi(String name) {
        return consumerService.sayHello(name);
    }
}
