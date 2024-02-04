package co.edu.unisabana.clases.example.solid.service;

import java.util.ArrayList;
import co.edu.unisabana.clases.example.solid.modelo.Envio;
import co.edu.unisabana.clases.example.solid.modelo.Estudiante;

public class EnvioAdmin implements MaterialInterface {

    @Override
    public void enviarMaterial(Estudiante estudiante) {
        Envio envio = new Envio();
        envio.material = new ArrayList<>();
        envio.material.add("Computador");
        envio.material.add("Cuenta de forex");
        envio.saludoDirector = "Catherine envía saludos";
        EmailOutlook email = new EmailOutlook();
        email.enviarEmail(envio);
    }
}
