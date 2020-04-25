package pe.roffus.org.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SubCategoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer codSubCategoria;

    @ManyToOne
    @JoinColumn(name="codCategoria")
    public Categoria categoria;

    public String nombreSubCategoria;
}
