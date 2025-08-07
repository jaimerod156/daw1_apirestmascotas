package pe.edu.cibertec.app.apirestmascotas.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.app.apirestmascotas.model.bd.Cliente;
import pe.edu.cibertec.app.apirestmascotas.model.bd.Mascota;
import pe.edu.cibertec.app.apirestmascotas.model.dto.ClienteRequestDto;
import pe.edu.cibertec.app.apirestmascotas.model.dto.MascotaRequestDto;
import pe.edu.cibertec.app.apirestmascotas.repository.ClienteRepository;

@AllArgsConstructor
@Service
public class ClienteService implements IClienteService{
    private ClienteRepository clienteRepository;
    private IMascotaService iMascotaService;

    @Transactional
    @Override
    public Cliente registrarCliente(ClienteRequestDto clienteRequestDto) {
        Cliente cliente = new Cliente();
        cliente.setNombreclente(clienteRequestDto.getNombrecliente());
        cliente.setApellidocliente(clienteRequestDto.getApellidocliente());

        Cliente nuevoCliente = clienteRepository.save(cliente);
        Mascota mascota;
        for(MascotaRequestDto mascotaRequestDto: clienteRequestDto.getMascotas()){
            mascota = new Mascota();
            mascota.setNombremascota(mascotaRequestDto.getNombremascota());
            mascota.setEdad(mascotaRequestDto.getEdad());
            mascota.setCliente(nuevoCliente);
            iMascotaService.registrarMascota(mascota);
        }

        return nuevoCliente;
    }
}
