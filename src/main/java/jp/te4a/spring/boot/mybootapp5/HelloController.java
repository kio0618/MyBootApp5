package jp.te4a.spring.boot.mybootapp5;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
    public String index(Model model) {
      //return "this is Spring Boot sample.";
		return "index";
  }
}