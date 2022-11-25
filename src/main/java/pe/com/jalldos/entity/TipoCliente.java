
package pe.com.jalldos.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "TipoCliente")
@Table(name = "tipocliente")

public class TipoCliente implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codtipocli")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @Column(name = "tipocli")
    private String tipoCliente;

    @Column(name = "estipcli")
    private boolean estado;
    
}
