package org.example.miprimerspringboot4.service.serviceImpl;

import org.example.miprimerspringboot4.entity.Curso;
import org.example.miprimerspringboot4.repository.ICursoRepository;
import org.example.miprimerspringboot4.service.ICursoService;
import org.example.miprimerspringboot4.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements ICursoService {

    @Autowired
    private ICursoRepository cursoRepository;

    @Override
    public Curso getCurso(Long id) {
        Curso curso = cursoRepository.findById(id).orElse(null);
        return curso;
    }

    @Override
    public List<Curso> getAllCurso() {
        return cursoRepository.findAll();
    }

    @Override
    public Curso saveCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public Curso updateCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public void deleteCurso(Long id) {
        cursoRepository.deleteById(id);
    }
}
