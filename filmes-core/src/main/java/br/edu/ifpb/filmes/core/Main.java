
package br.edu.ifpb.filmes.core;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author miolivc
 * @mail miolivc@outlook.com
 * @since 01/10/2017
 */
public class Main {

    public static void main(String[] args) {
        
        System.out.println("Testando criaçao da base de dados... ");
        
        Ator ator = new Ator("Lynda Curtney", "Feminino", "Brasileira");
        Filme filme = new Filme("Algum filme", 2001, "Comedia", "Sei la");
        filme.getAtores().add(ator);
        Evento evento = new Evento("Melhores filmes", "Hollywood", 2002);
        FilmeEvento filmeEvento = new FilmeEvento();
        filmeEvento.setFilme(filme);
        filmeEvento.setEvento(evento);
        filmeEvento.setNota(10);
        
        EntityManager manager = Persistence
                .createEntityManagerFactory("filmes-core")
                .createEntityManager();
        
        manager.getTransaction().begin();
        manager.persist(filmeEvento);
        manager.getTransaction().commit();
        
    }
    
}
