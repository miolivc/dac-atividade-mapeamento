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
        Navio n = new Navio("Going Merry", 100, "Japão");
        Comandante c = new Comandante("Luffy", "Japão");
        Carga carga = new Carga("ilha do ceu", "novo mundo");
        Produto p = new Produto("Fruta do diabo", "gomu gomu no mi");
        Transporte t = new Transporte(n, carga, new Date(2018, 04, 01), 10);

        n.setComandante(c);
        c.getNavios().add(n);
        t.getProdutos().add(p);
        EntityManager manager = Persistence
                .createEntityManagerFactory("naval-mapeamento")
                .createEntityManager();

        manager.getTransaction().begin();
        manager.persist(p);
        manager.persist(t);

        manager.getTransaction().commit();

    }

}
