
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
@Entity(name = "Boleta")
@Table(name = "boleta")

public class Boleta implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "codbol")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    
    @ManyToOne
    @JoinColumn(name = "codpro", nullable = false)
    private Producto producto;
    
    @ManyToOne
    @JoinColumn(name = "codempr", nullable = false)
    private Empresa empresa;
   
    @ManyToOne
    @JoinColumn(name = "codcli", nullable = false)
    private Cliente cliente;
    
    @Column(name = "estbol")
    private boolean estado;
    
}
