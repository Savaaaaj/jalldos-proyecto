package pe.com.jalldos.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "Cliente")
@Table(name = "cliente")

public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "codcli")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @Column(name = "nomcli")
    private String nombre;
    
    @Column(name = "apepcli")
    private String apellidoPat;
    
    @Column(name = "apemcli")
    private String apellidoMat;
    
     @Column(name = "nomempr")
    private String Nomempresa;
     
     @Column(name = "ruc")
    private String ruc;

    @Column(name = "dircli")
    private String direccion;

    @Column(name = "dnicli")
    private String dni;

    @Column(name = "telcli")
    private String telefono;

    @Column(name = "estcli")
    private boolean estado;
    
    @ManyToOne
    @JoinColumn(name = "coddis", nullable = false)
    private Distrito distrito;
     
    @ManyToOne
    @JoinColumn(name = "codtipocli", nullable = false)
    private TipoCliente tipocliente;

}
