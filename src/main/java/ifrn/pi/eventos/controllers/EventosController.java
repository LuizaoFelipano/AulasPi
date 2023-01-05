package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventosController {

	@RequestMapping("/eventos/form")
	public String form() {
		System.out.println("Pagína de criação de evento.");
		return "formEvento";
	}
}
