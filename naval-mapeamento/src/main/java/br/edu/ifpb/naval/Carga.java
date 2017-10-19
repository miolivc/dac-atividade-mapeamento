
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
@SequenceGenerator(name = "carga_seq", sequenceName = "carga_seq")
public class Carga implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carga_seq")
    private int codCarga;
    @Column(nullable = false, length = 45)
    private String origem;
    @Column(nullable = false, length = 45)
    private String destino;
    
    public Carga() {
    }

    public Carga(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
    }

    public int getCodCarga() {
        return codCarga;
    }

    public void setCodCarga(int codCarga) {
        this.codCarga = codCarga;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

}
