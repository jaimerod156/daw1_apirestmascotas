package pe.edu.cibertec.app.apirestmascotas.model.dto;

import lombok.Data;

@Data
public class MascotaRequestDto {

    private String nombremascota;
    private Integer edad;
}
