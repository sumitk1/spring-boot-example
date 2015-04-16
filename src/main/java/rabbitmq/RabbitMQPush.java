package rabbitmq;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author sumitk
 * Date   4/15/15
 */

@RestController
@EnableAutoConfiguration
public class RabbitMQPush {

    @RequestMapping("/push")
    String somePush(){
        return "Hellp Push";
    }

}
