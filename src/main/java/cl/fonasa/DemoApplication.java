package cl.fonasa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
@Controller 
public class DemoApplication   {

   public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
   }
   @RequestMapping(value="hello2", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")

   private String hello(Model model) {
     return "saludos";
   }
   
	@GetMapping("/greeting")
	public String greeting(Model model) {
		model.addAttribute("name", "asdasdasd");
		return "saludos";
	}
}
