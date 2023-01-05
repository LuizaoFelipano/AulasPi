package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.eventos.models.Eventos;

@Controller
public class EventosController {

	@RequestMapping("/eventos/form")
	public String form() {
		System.out.println("Pagína de criação de evento.");
		return "formEvento";
	}

	@GetMapping("/eventos")
	public String adicionar(Eventos evento) {

		return "evento-adicionado";
	}
}
