import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rabbitmq.RabbitMQPush;

/**
 * Author sumitk
 * Date   4/6/15
 */

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/health")
    String home1() {
        return "The health!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(RabbitMQPush.class, args);
    }

}