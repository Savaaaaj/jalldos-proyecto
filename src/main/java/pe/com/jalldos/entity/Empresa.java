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
@Entity(name = "Empresa")
@Table(name = "empresa")

public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "codempr")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @Column(name = "nomempr")
    private String nombre;

    @Column(name = "dirempr")
    private String direccion;

    @Column(name = "rucempr")
    private String ruc;
    
     @Column(name = "estempr")
    private boolean estado;

}
