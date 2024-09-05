package com.example.ProyecDR.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data
@Entity
@Table(name = "tbl_estudiantes")

public class Estudiante
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Nombre;
    private String Apellido;
    @Column(name = "email_address", unique = true, nullable = false)// no abra otro estudiante con este email
    private String Email;
}
