package pe.edu.cibertec.app.apirestmascotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.app.apirestmascotas.model.bd.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
}
