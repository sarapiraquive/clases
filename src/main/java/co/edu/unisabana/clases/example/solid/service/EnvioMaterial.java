package co.edu.unisabana.clases.example.solid.service;

import co.edu.unisabana.clases.example.solid.modelo.Envio;
import co.edu.unisabana.clases.example.solid.modelo.Estudiante;
import java.util.ArrayList;

public class EnvioMaterial {

  public void enviarMaterialEstudiante(Estudiante estudiante) {
    if (estudiante.carrera.equals("Informatica")) {
      Envio envio = new Envio();
      envio.material = new ArrayList<>();
      envio.material.add("Computador");
      envio.material.add("Mouse");
      envio.saludoDirector = "Jenny envia saludos";
      EmailOutlook email = new EmailOutlook();
      email.enviarEmail(envio);
    }
    if (estudiante.carrera.equals("Administracion")) {
      //lo mismo de arriba pero con otra informacion
    }
    if (estudiante.carrera.equals("Industrial")) {
      //
    }
  }
}
