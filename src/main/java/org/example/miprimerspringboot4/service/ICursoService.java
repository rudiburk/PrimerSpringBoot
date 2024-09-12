package org.example.miprimerspringboot4.service;

import org.example.miprimerspringboot4.entity.Curso;
import org.example.miprimerspringboot4.entity.Profesor;

import java.util.List;

public interface ICursoService {
    Curso getCurso(Long id);

    //enlistar//
    List<Curso> getAllCurso();

    //guardar//
    Curso saveCurso(Curso curso);

    //updatear//
    Curso updateCurso(Curso curso);

    //borrar//
    void deleteCurso(Long id);
}
