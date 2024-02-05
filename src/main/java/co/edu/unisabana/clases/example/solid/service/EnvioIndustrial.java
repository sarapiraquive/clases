package co.edu.unisabana.clases.example.solid.service;

import co.edu.unisabana.clases.example.solid.modelo.Envio;
import co.edu.unisabana.clases.example.solid.modelo.Estudiante;

import java.util.ArrayList;

public class EnvioIndustrial implements MaterialInterface{
    @Override
    public void enviarMaterial(Estudiante estudiante) {
        Envio envio = new Envio();
        envio.material = new ArrayList<>();
        envio.material.add("Casco");
        envio.material.add("Laptop");
        envio.saludoDirector = "Martha envía saludos";
        EmailOutlook email = new EmailOutlook();
        email.enviarEmail(envio);
    }
}
