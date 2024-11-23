package org.example.tpgraphql;

import org.example.tpgraphql.entity.Compte;
import org.example.tpgraphql.entity.TypeCompte;
import org.example.tpgraphql.repository.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class TpGraphQlApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpGraphQlApplication.class, args);
    }



    @Bean
    CommandLineRunner start(CompteRepository compteRepository){
        return args -> {
            // Initialisation des comptes
            compteRepository.save(new Compte(null, Math.random()*9000, new Date(), TypeCompte.EPARGNE));
            compteRepository.save(new Compte(null, Math.random()*9000, new Date(), TypeCompte.COURANT));
            compteRepository.save(new Compte(null, Math.random()*9000, new Date(), TypeCompte.EPARGNE));
        };
    }
}
