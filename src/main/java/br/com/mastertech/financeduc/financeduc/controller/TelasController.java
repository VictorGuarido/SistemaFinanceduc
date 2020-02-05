package br.com.mastertech.financeduc.financeduc.controller;

import br.com.mastertech.financeduc.financeduc.model.Pergunta;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TelasController {

    @GetMapping
    public String mostrarHome(){
        return "index";
    }

    @GetMapping("/telaRecomendacoes")
    public String mostrarRecomendacoes(){
        return "recomendacoes";
    }

    @GetMapping("/sobrenos")
    public String mostrarSobreNos(){
        return "sobrenos";
    }

    @GetMapping("/nutrir")
    public String mostrarNutrir(){
        return "nutrir";
    }

//    @GetMapping("/iniciarQuiz")
//    public String mostrarQuiz(){
//        return "quiz";
//    }


}
