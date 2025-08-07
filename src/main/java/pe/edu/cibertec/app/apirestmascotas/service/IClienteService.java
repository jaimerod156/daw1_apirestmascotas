package pe.edu.cibertec.app.apirestmascotas.service;

import pe.edu.cibertec.app.apirestmascotas.model.bd.Cliente;
import pe.edu.cibertec.app.apirestmascotas.model.dto.ClienteRequestDto;

public interface IClienteService {

    Cliente registrarCliente(ClienteRequestDto clienteRequestDto);
}
