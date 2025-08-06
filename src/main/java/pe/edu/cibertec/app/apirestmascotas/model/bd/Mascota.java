package pe.edu.cibertec.app.apirestmascotas.model.bd;

import jakarta.annotation.sql.DataSourceDefinitions;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "mascota")
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmascota")
    private Integer idmascota;

    private String nombremascota;
    private Integer edad;

    @ManyToOne
    @JoinColumn(name = "idcliente")
    private Cliente cliente;


}
