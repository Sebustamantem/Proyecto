package com.example.biblioteca.model;

import lombok.allArgsConstructor;
import lombok.norgsConstructor;
import lombok.Data;


@Data // Es una combinacion de varias anotaciones de Lombok
//genera automaticamente los siguientes metodos para la clase:
/**
 * @getter
 * @setter
 * @tostring
 * @equalsamdhashcode
 * @RequiredArgsConstructor
 */

 @AllArgsConstructor
 @NoArgsConstructor
public class LibroModel {

    private int id;
    private String isbn;
    private String titulo;
    private String editorial;
    private int fechaPublicacion;
    private String autor;

}
