package com.example.ProyecDR.repository;

import com.example.ProyecDR.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepositoy  extends JpaRepository<Estudiante,Long>
{

}
