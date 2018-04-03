
package br.edu.ifpb.naval;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author miolivc
 * @mail miolivc@outlook.com
 * @since 19/10/2017
 */
@Entity
@SequenceGenerator(name = "comandante_seq", sequenceName = "comandante_seq")
public class Comandante implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comandante_seq")
    private int idComandante;
    @Column(length = 30, nullable = false)
    private String nome;
    @Column(length = 20, nullable = false)
    private String pais;
    @OneToMany
    private List<Navio> navios;
    
    public Comandante() {
        this.navios = new ArrayList<>();
    }

    public Comandante(String nome, String pais) {
        this.navios = new ArrayList<>();
        this.nome = nome;
        this.pais = pais;
    }
    
    public int getIdComandante() {
        return idComandante;
    }

    public void setIdComandante(int idComandante) {
        this.idComandante = idComandante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Navio> getNavios() {
        return navios;
    }

    public void setNavios(List<Navio> navios) {
        this.navios = navios;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}
