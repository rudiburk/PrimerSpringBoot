package org.example.miprimerspringboot4.controller;

import org.example.miprimerspringboot4.entity.Estudiante;
import org.example.miprimerspringboot4.service.IEstudianteService;
import org.example.miprimerspringboot4.service.serviceImpl.EstudianteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/estudiante")
public class EstudianteController {

    @Autowired
    private IEstudianteService estudianteService;

    @GetMapping("/getAll")
    public String getAllEstudiantes(Model model) {
        List<Estudiante> estudiantes = estudianteService.getAllEstudiantes();
        model.addAttribute ("estudiantes", estudiantes); // estudiantes en español
        return  "estudiante";
    }

//    public String getEstudiantesById(Model model, Long id) {
//        Estudiante estudiante = estudianteService.getEstudiante(id);
//        model.addAttribute("estudiante", estudiante);
//        return "estudiante/estudiante";
//    }
}
