package br.com.mastertech.financeduc.financeduc.controller;
import br.com.mastertech.financeduc.financeduc.model.Eventos;
import br.com.mastertech.financeduc.financeduc.service.EventosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EventosController {

    @Autowired
    private EventosService service;

    @GetMapping("/cadastrar")
    public String telaCadastrarEventos() {
        return "CadastrarEventos";
    }

    @PostMapping("/cadastrar")
    public String cadastrarEventos(Eventos eventos) {
        service.cadastrarEventos(eventos);
        return "CadastrarEventos";

    }
}
