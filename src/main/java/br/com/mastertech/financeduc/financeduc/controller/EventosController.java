package br.com.mastertech.financeduc.financeduc.controller;

import br.com.mastertech.financeduc.financeduc.model.Eventos;
import br.com.mastertech.financeduc.financeduc.service.EventosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;

@Controller
public class EventosController {

    @Autowired
    private EventosService service;

    @GetMapping("/cadastro")
    public String telaCadastrarEventos(){
        return "CadastrarEventos";
    }

    @PostMapping("/cadastrar")
    public String cadastrarEventos(@Valid Eventos eventos) {
        service.cadastrarEventos(eventos);
        return "CadastrarEventos";

    }
    @ExceptionHandler({BindException.class})
    public String tratarErros(BindException exception, Model model){
        try {
            model.addAttribute("erros", exception.getFieldErrors());
            return "cadastro";
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}
