package br.com.mastertech.financeduc.financeduc.service;
import br.com.mastertech.financeduc.financeduc.model.Eventos;
import br.com.mastertech.financeduc.financeduc.repository.EventosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EventosService {

    @Autowired
    private EventosRepository repository;

    public Eventos cadastrarEventos(Eventos eventos){
        eventos.setDataCriacao(LocalDate.now());
        eventos.setAtivo(Boolean.TRUE);
        return repository.save(eventos);
    }

    public Iterable<Eventos> listarEventos() {
        Iterable<Eventos> eventos = repository.findAll();
        return eventos;
    }


}
