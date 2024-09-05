package com.example.ProyecDR.Controller;

import com.example.ProyecDR.entity.Estudiante;
import com.example.ProyecDR.service.Studenservi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/estudiantes")
public class EstudianteControll
{
    @Autowired
    private Studenservi studenservi;

    @GetMapping
    public List<Estudiante> getALL()
    {
        return studenservi.getEstudiante();
    }

    @GetMapping("/{estudianteId}")
    public Optional<Estudiante> getBy(@PathVariable("estudianteId") Long estudianteId)
    {
        return  studenservi.getEstudiante(estudianteId);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Estudiante estudiante)
    {
         studenservi.saveORupdate(estudiante);
    }

    @DeleteMapping("/{estudianteId}")
    public void saveUpdate(@PathVariable("estudianteId") Long estudianteId)
    {
        studenservi.delete(estudianteId);
    }

}
