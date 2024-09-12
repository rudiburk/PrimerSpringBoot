package org.example.miprimerspringboot4.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso", nullable = false, unique = true)
    private Long id;

    @Column(name="nombre_curso", nullable = false, length = 100)
    private String nombreCurso;

    @Column(name="Descripción", nullable = false, length = 250)
    private String descripción;

    public Curso(String nombreCurso, String descripción) {
        this.nombreCurso = nombreCurso;
        this.descripción = descripción;
    }
}
