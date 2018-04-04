package br.edu.ifpb.naval;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author miolivc
 * @mail miolivc@outlook.com
 * @since 19/10/2017
 */
public class Application {

    public static void main(String[] args) {
        
        Comandante comandante = new Comandante("Capitão​ ​Jack​ ​ Sparrow", "Disney");
        Navio navio = new Navio("Navio Pirata", 232.32, "Disney");
        Carga carga2 = new Carga("Cajazeiras", "Joao Pessoa");        
        Produto produto = new Produto("Limpeza", "Brom Brill");
 
        Transporte transporte = new Transporte(navio, carga2, new Date(2017, 10, 23), 2500.00);

        
        navio.setComandante(comandante);
        comandante.getNavios().add(navio);
        transporte.getProdutos().add(produto);
        
        
        EntityManager manager = Persistence
                .createEntityManagerFactory("naval-mapeamento")
                .createEntityManager();

        manager.getTransaction().begin();
        manager.persist(transporte); 
        manager.persist(produto);   
        manager.getTransaction().commit();

    }

}
