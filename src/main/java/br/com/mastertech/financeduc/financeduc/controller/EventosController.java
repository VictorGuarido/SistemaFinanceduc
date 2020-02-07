package br.com.mastertech.financeduc.financeduc.controller;
import br.com.mastertech.financeduc.financeduc.model.Eventos;
import br.com.mastertech.financeduc.financeduc.service.EventosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;

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
        return "telaCadastrado";

    }
    @ExceptionHandler({BindException.class})
    public String tratarErrosValidacao(BindException exception, Model model) {
        model.addAttribute("erros", exception.getFieldErrors());
        return "cadastrar";
    }
    @GetMapping("/recomendacoes")
    public ModelAndView listarEventos() {
        ModelAndView pagina = new ModelAndView("recomendacoes");
        Iterable<Eventos> eventos = service.listarEventos();
        pagina.addObject("eventos", eventos);
        return pagina;

    }

    @GetMapping("excluir/{id}")
    public String excluirEventos(@PathVariable("id") long id, Model model){
        service.excluirEventos(id);
        return "telaExcluir";

    }
}
