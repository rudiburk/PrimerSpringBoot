package org.example.miprimerspringboot4.service.serviceImpl;

import org.example.miprimerspringboot4.entity.Estudiante;
import org.example.miprimerspringboot4.repository.IEstudianteRepository;
import org.example.miprimerspringboot4.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("PersonaServiceImpl")
public class EstudianteServiceImpl implements IEstudianteService {

    @Autowired
    private IEstudianteRepository estudianteRepository;


    @Override
    public Estudiante getEstudiante(Long id) {
        Estudiante estudiante = estudianteRepository.findById(id).orElse(null);  //el .orElse(null) es porque si no lo encuentra, es null
        return estudiante;
    }

    @Override
    public List<Estudiante> getAllEstudiantes() {
        return estudianteRepository.findAll();
    }

    @Override
    public Estudiante saveEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public Estudiante updateEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public void deleteEstudiante(Long id) {
        estudianteRepository.deleteById(id);
        //public void deleteEstudiante(Estudiante estudiante){
        //personaRepository.delete(estudiante); delete por objeto//
        //}

    }
}
