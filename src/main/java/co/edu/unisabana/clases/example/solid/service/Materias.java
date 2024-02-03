package co.edu.unisabana.clases.example.solid.service;

public class Materias {
    public String obtenerMaterias(String carrera) {
        switch (carrera) {
            case "Informatica":
                return "Programacion, Arquitectura, Base de datos";
            case "Administracion":
                return "Negocios, Administracion I, Historia de la Administracion";
            case "Industrial":
                return "Procesos, Analitica de datos, Gestion de Calidad";
            default:
                return "Carrera no encontrada";
        }
    }
}
