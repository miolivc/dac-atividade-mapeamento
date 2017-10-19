
package br.edu.ifpb.naval;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    
    public Comandante() {
    }

    public Comandante(String nome, String pais) {
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}
