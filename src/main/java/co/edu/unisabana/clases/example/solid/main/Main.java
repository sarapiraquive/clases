package co.edu.unisabana.clases.example.solid.main;

import co.edu.unisabana.clases.example.solid.modelo.Estudiante;
import co.edu.unisabana.clases.example.solid.service.EnvioMaterial;
import co.edu.unisabana.clases.example.solid.service.Materias;

public class Main {
    public static void main(String[] args) {
        Estudiante[] listadoEstudiantes = {
                new Estudiante("Daniel", "Informatica"),
                new Estudiante("Monica", "Administracion"),
                new Estudiante("Liliana", "Industrial")
        };
        verMateriasEstudiantes(listadoEstudiantes);
        EnvioMaterial material = new EnvioMaterial();
        material.enviarMaterialEstudiante(new Estudiante("Daniel", "Informatica"));
    }

    public static void verMateriasEstudiantes(Estudiante[] estudiantes) {
        Materias materias = new Materias();
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getNombre() + ":");
            System.out.println(materias.obtenerMaterias(estudiante.getCarrera()));

            }
        }
    }