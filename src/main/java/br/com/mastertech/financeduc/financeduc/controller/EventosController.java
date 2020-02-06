package br.com.mastertech.financeduc.financeduc.controller;
import br.com.mastertech.financeduc.financeduc.model.Eventos;
import br.com.mastertech.financeduc.financeduc.model.Pergunta;
import br.com.mastertech.financeduc.financeduc.service.EventosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.net.BindException;

@Controller
public class EventosController {

    @Autowired
    private EventosService service;

    @GetMapping("/cadastro")
    public String telaCadastrarEventos() {
        return "CadastrarEventos";
    }

    @PostMapping("/cadastrar")
    public String cadastrarEventos(Eventos eventos) {
        service.cadastrarEventos(eventos);
        return "CadastrarEventos";

    }
    @GetMapping("/recomendacoes")
    public ModelAndView listarEventos() {
        ModelAndView pagina = new ModelAndView("recomendacoes");
        Iterable<Eventos> eventos = service.listarEventos();
        pagina.addObject("eventos", eventos);
        return pagina;

    }
}
