package br.com.mastertech.financeduc.financeduc.controller;
import br.com.mastertech.financeduc.financeduc.model.Eventos;
import br.com.mastertech.financeduc.financeduc.model.Pergunta;
import br.com.mastertech.financeduc.financeduc.service.EventosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
<<<<<<< HEAD
=======
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
>>>>>>> 6063d45d61d94018c0b270aa5cd98e3641c9df2e
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

<<<<<<< HEAD
    @GetMapping("/recomendacoes")
    public ModelAndView listarEventos() {
        ModelAndView pagina = new ModelAndView("recomendacoes");
=======
    @GetMapping("/eventos")
    public ModelAndView listarEventos() {
        ModelAndView pagina = new ModelAndView("ListarEventos");
>>>>>>> 6063d45d61d94018c0b270aa5cd98e3641c9df2e
        Iterable<Eventos> eventos = service.listarEventos();
        pagina.addObject("eventos", eventos);
        return pagina;

<<<<<<< HEAD

=======
>>>>>>> 6063d45d61d94018c0b270aa5cd98e3641c9df2e
    }
}
