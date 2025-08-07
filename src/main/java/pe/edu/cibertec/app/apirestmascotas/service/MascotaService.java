package pe.edu.cibertec.app.apirestmascotas.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.app.apirestmascotas.model.bd.Mascota;
import pe.edu.cibertec.app.apirestmascotas.repository.MascotaRepository;

@AllArgsConstructor
@Service
public class MascotaService implements IMascotaService{
    private MascotaRepository mascotaRepository;

    @Override
    public Mascota registrarMascota(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }
}
