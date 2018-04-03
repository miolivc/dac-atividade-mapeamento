
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
@SequenceGenerator(name = "produto_seq", sequenceName = "produto_seq")
public class Produto implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_seq")
    private int codProduto;
    @Column(length = 30, nullable = false)
    private String categoria;
    @Column(length = 45, nullable = false)
    private String nome;

    public Produto() {
    }

    public Produto(String categoria, String nome) {
        this.categoria = categoria;
        this.nome = nome;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" + "codProduto=" + codProduto + ", categoria=" + categoria + ", nome=" + nome + '}';
    }
   
}
