package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class IndexController {
	
	@RequestMapping("/")
	public String Index() {
		System.out.println("Chamou o método Index. (Página Home)");
		return "home";
	}
}
