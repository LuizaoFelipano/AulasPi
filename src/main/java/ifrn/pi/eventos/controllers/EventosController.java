package ifrn.pi.eventos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.eventos.models.Eventos;
import ifrn.pi.eventos.repositories.EventoRepository;

@Controller
public class EventosController {

	@Autowired
	private EventoRepository er;

	@RequestMapping("/eventos/form")
	public String form() {
		System.out.println("Pagína de criação de evento.");
		return "formEvento";
	}

	@GetMapping("/eventos")
	public String adicionar(Eventos evento) {
		System.out.println(evento);
		er.save(evento);
		return "evento-adicionado";
	}
}
