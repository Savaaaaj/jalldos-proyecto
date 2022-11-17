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
@Entity(name = "Producto")
@Table(name = "producto")

public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "codpro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @Column(name = "nompro")
    private String nombre;

    @Column(name = "cantcaj")
    private int cantCaja;

    @Column(name = "cantxcaj")
    private int cantxCaja;

    @Column(name = "stockpro")
    private int stock;

    @Column(name = "precsol")
    private float preciosol;

    @Column(name = "precdol")
    private float preciodol;

    @Column(name = "estpro")
    private boolean estado;

    @ManyToOne
    @JoinColumn(name = "codcat", nullable = false)
    private Categoria categoria;

}
