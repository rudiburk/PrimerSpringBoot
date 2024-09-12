package org.example.miprimerspringboot4.service;

import org.example.miprimerspringboot4.entity.Estudiante;

import java.util.List;

public interface IEstudianteService {

    //Crud//



    //seleccionar//
    Estudiante getEstudiante(Long id);

    //enlistar//
    List<Estudiante> getAllEstudiantes();

    //guardar//
    Estudiante saveEstudiante(Estudiante estudiante);

    //updatear//
    Estudiante updateEstudiante(Estudiante estudiante);

    //borrar//
    void deleteEstudiante(Long id);
}
