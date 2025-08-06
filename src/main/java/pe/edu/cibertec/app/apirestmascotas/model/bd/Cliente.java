package pe.edu.cibertec.app.apirestmascotas.model.bd;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcliente")
    private Integer idcliente;

    @Column(name = "nombrecliente")
    private String nombreclente;

    @Column(name = "apellidocliente")
    private String apellidocliente;
}
