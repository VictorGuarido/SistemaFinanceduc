package br.com.mastertech.financeduc.financeduc.service;
import br.com.mastertech.financeduc.financeduc.model.Eventos;
import br.com.mastertech.financeduc.financeduc.repository.EventosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventosService {

    @Autowired
    private EventosRepository repository;

    public Eventos cadastrarEventos(Eventos eventos){
        return repository.save(eventos);
    }



}
