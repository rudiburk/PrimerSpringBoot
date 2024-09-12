package org.example.miprimerspringboot4.service;

import org.example.miprimerspringboot4.entity.Estudiante;
import org.example.miprimerspringboot4.entity.Profesor;

import java.util.List;

public interface IProfesorService {
    Profesor getProfesor(Long id);

    //enlistar//
    List<Profesor> getAllProfesor();

    //guardar//
    Profesor saveProfesor(Profesor profesor);

    //updatear//
    Profesor updateProfesor(Profesor profesor);

    //borrar//
    void deleteProfesor(Long id);
}
