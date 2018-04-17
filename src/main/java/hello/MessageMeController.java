package hello;
import org.springframework.web.bind.annotation.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MessageMeController {

    private static final String template2= "%s says:  %s \n";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(path="/messageme/sender/{sender}/content/{content}", method = RequestMethod.GET)
    @ResponseBody
    public MessageMe messageme(@PathVariable String sender,@PathVariable String content){
        if (sender == null || sender == "") return new MessageMe(counter.incrementAndGet(), String.format(template2,"No sender", "Return to sender"), "No sender");
        return new MessageMe(counter.incrementAndGet(), String.format(template2,sender, content), sender);
    }
}
