package org.example.miprimerspringboot4.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="profesores")
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_profesor", nullable = false, unique = true)
    private Long id;

    @Column(name="nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name="apellido", nullable = false, length = 50)
    private String apellido;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "asignatura", nullable = false, length = 200)
    private String asignatura;

    public Profesor(String nombre, String apellido, String email, String asignatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.asignatura = asignatura;
    }
}
