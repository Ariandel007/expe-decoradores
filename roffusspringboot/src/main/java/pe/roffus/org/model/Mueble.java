package pe.roffus.org.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Mueble {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer codMueble;

    public String nombreMueble;
    public double alto;
    public double ancho;
    public double largo;
    public String descripcion;
    public String imagen;
    public String icono;

    @ManyToOne
    @JoinColumn(name="codSubCategoria")
    public SubCategoria subcategoria;

    @ManyToOne
    @JoinColumn(name="codTienda")
    public TiendaVirtual tiendaVirtual;
}
