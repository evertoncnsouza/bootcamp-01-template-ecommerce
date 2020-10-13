package io.github.evertoncnsouza.rest.controller;


import io.github.evertoncnsouza.domain.entity.Pergunta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Service
public class Emails {

    @Autowired
    private Mailer mailer;

    public void pergunta(@Valid @NotNull Pergunta pergunta) {

        mailer.send("<html>...</html>","Você tem uma pergunta...",pergunta.getNavegador().getEmail(),
                "novapergunta@nossomercadolivre.com",pergunta.getDono().getEmail());
    }

}



