package pe.edu.cibertec.app.apirestmascotas.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.app.apirestmascotas.model.bd.Cliente;
import pe.edu.cibertec.app.apirestmascotas.model.dto.ClienteRequestDto;
import pe.edu.cibertec.app.apirestmascotas.service.IClienteService;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/cliente")
public class ClienteController {
    private IClienteService iClienteService;

    @PostMapping("")
    public ResponseEntity<Cliente> registrarCliente(
            @RequestBody ClienteRequestDto clienteRequestDto
    ){
        return new ResponseEntity<>(
                iClienteService.registrarCliente(clienteRequestDto),
                HttpStatus.CREATED
        );
    }

}
