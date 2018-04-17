package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    private static final String template1= "Hello, %s!";
    private static final String template2= "From: %s %s \n";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template1, name));
    }

    /*@RequestMapping(path="/greetme/from/{from}/msg/{msg}", method = RequestMethod.GET)
    @ResponseBody
    public MessageMe messageme(@PathVariable String from,@PathVariable String msg){
        return new MessageMe(counter.incrementAndGet(), String.format(template2,from, msg));
    }*/
}
