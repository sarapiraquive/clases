package co.edu.unisabana.clases.example.solid.main;

import co.edu.unisabana.clases.example.solid.modelo.Estudiante;
import co.edu.unisabana.clases.example.solid.service.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MateriasInterface> materiasServices = new ArrayList<>();
        materiasServices.add(new MateriasInformatica());
        materiasServices.add(new MateriasAdministracion());
        materiasServices.add(new MateriasIndustrial());

        MainController mainController = new MainController(materiasServices);
        mainController.ejecutar();
    }
}

