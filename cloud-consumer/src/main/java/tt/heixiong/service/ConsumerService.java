package tt.heixiong.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by tt on 2018/4/25.
 */
@FeignClient(value = "cloud-provider")
public interface ConsumerService {

    @RequestMapping(value = "/hello")
    public String sayHello(@RequestParam(value = "name")String name);
}
