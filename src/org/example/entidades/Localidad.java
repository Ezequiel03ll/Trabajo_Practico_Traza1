package org.example.entidades;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder

public class Localidad {
    private Long id;
    private String nombre;
    private Provincia provincia;




}
