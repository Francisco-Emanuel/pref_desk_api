package br.com.prefdesk.service;

import br.com.prefdesk.dto.OrdemDTO;
import br.com.prefdesk.entity.Ordem;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class OrdemService {

    @Transactional
    public Ordem criarOrdem(OrdemDTO ordem) {
        Ordem novaOrdem = new Ordem();
        novaOrdem.titulo = ordem.titulo;
        novaOrdem.local = ordem.local;
        novaOrdem.item = ordem.item;

        novaOrdem.persist();

        return novaOrdem;
    }
}
