package org.example.miprimerspringboot4.service.serviceImpl;

import org.example.miprimerspringboot4.entity.Profesor;
import org.example.miprimerspringboot4.repository.IProfesorRepository;
import org.example.miprimerspringboot4.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorServiceImpl implements IProfesorService {

    @Autowired
    private IProfesorRepository profesorRepository;

    @Override
    public Profesor getProfesor(Long id) {
        Profesor profesor = profesorRepository.findById(id).orElse(null);
        return profesor;
    }

    @Override
    public List<Profesor> getAllProfesor() {
        return profesorRepository.findAll();
    }

    @Override
    public Profesor saveProfesor(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    @Override
    public Profesor updateProfesor(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    @Override
    public void deleteProfesor(Long id) {
        profesorRepository.deleteById(id);
    }
}
