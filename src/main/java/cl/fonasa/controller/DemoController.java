package transBank;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	  @GetMapping("/hello")

	    public String currentUserName() {

	    	return "saludos";
	    }
}
