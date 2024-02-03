package co.edu.unisabana.clases.example.solid.main;

import co.edu.unisabana.clases.example.solid.modelo.Estudiante;
import co.edu.unisabana.clases.example.solid.service.EnvioMaterial;
import co.edu.unisabana.clases.example.solid.service.MateriasInterface;

import java.util.List;

public class MainController {
    private List <MateriasInterface> materiasInterface;

    public MainController(List <MateriasInterface> materiasInterface){
        this.materiasInterface = materiasInterface;
    }
    public void ejecutar(){
        Estudiante[] listadoEstudiantes = {
                new Estudiante("Daniel", "Informatica"),
                new Estudiante("Monica", "Administracion"),
                new Estudiante("Liliana", "Industrial")
        };
        verMateriasEstudiantes(listadoEstudiantes);
        EnvioMaterial material = new EnvioMaterial();
        material.enviarMaterialEstudiante(new Estudiante("Daniel", "Informatica"));
    }
    private void verMateriasEstudiantes(Estudiante[] estudiantes) {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getNombre() + ":");
            for (MateriasInterface materiasInterface : materiasInterface) {
                System.out.println(materiasInterface.obtenerMaterias(estudiante.getCarrera()));
            }
        }
    }
}
