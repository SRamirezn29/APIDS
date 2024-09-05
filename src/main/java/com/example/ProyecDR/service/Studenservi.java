package com.example.ProyecDR.service;

import com.example.ProyecDR.entity.Estudiante;
import com.example.ProyecDR.repository.EstudianteRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Studenservi
{
    @Autowired
    EstudianteRepositoy estudianteRepositoy;
    public List<Estudiante>getEstudiante()
    {
        return estudianteRepositoy.findAll();
    }

    public Optional<Estudiante> getEstudiante(Long id)
    {
        return estudianteRepositoy.findById(id);
    }

    public void saveORupdate(Estudiante estudiante)
    {
        estudianteRepositoy.save(estudiante);
    }

    public void delete(Long id)
    {
        estudianteRepositoy.deleteById(id);
    }

}
