package br.com.mastertech.financeduc.financeduc.controller;

import br.com.mastertech.financeduc.financeduc.model.Pergunta;
import br.com.mastertech.financeduc.financeduc.service.PerguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PerguntaController {
    @Autowired
    private PerguntaService service;

    @GetMapping("/cadastrarPergunta")
    public String telaCadastrarPergunta(){
        return "CadastroPergunta";
    }

    @PostMapping("/cadastrarPergunta")
    public String cadastrarPergunta(Pergunta pergunta){
        service.cadastrarPergunta(pergunta);
        return "CadastroPergunta";
    }

    @GetMapping("/iniciarQuiz")
    public ModelAndView listaPerguntas(Pergunta pergunta, Model model){
        ModelAndView pagina = new ModelAndView("quiz");
        Iterable<Pergunta> perguntas = service.listarTodos();
        pagina.addObject("perguntas", perguntas);
        return pagina;
    }
}
