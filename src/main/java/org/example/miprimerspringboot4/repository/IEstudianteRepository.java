package org.example.miprimerspringboot4.repository;

import org.example.miprimerspringboot4.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudianteRepository extends JpaRepository<Estudiante, Long> {
    //si el id es int, seria <Estudiante, Integer>//

}
