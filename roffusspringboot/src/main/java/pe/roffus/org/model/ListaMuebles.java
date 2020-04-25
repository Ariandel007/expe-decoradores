package pe.roffus.org.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ListaMuebles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer codLista;

    public String nombreLista;

    @ManyToOne
    @JoinColumn(name="codMueble")
    public Mueble mueble;

    public double coordX;
    public double coordY;
    public double rotacion;
}
