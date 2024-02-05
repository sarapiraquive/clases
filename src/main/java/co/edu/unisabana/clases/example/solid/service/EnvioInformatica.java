package co.edu.unisabana.clases.example.solid.service;

import java.util.ArrayList;
import co.edu.unisabana.clases.example.solid.modelo.Envio;
import co.edu.unisabana.clases.example.solid.modelo.Estudiante;

public class EnvioInformatica implements MaterialInterface {

    @Override
    public void enviarMaterial(Estudiante estudiante) {
        Envio envio = new Envio();
        envio.material = new ArrayList<>();
        envio.material.add("Computador");
        envio.material.add("Mouse");
        envio.saludoDirector = "Jenny envía saludos";
        EmailOutlook email = new EmailOutlook();
        email.enviarEmail(envio);
    }
}
