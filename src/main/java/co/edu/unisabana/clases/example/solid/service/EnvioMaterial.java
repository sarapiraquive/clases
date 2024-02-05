package co.edu.unisabana.clases.example.solid.service;


import co.edu.unisabana.clases.example.solid.modelo.Estudiante;
import java.util.HashMap;
import java.util.Map;


public class EnvioMaterial {
  private final Map<String, MaterialInterface> estrategias = new HashMap<>();

  public EnvioMaterial() {
    estrategias.put("Informatica", new EnvioInformatica());
    estrategias.put("Administracion", new EnvioAdmin());
    estrategias.put("Administracion", new EnvioIndustrial());
  }

  public void enviarMaterialEstudiante(Estudiante estudiante) {
    MaterialInterface estrategia = estrategias.get(estudiante.carrera);
    if (estrategia != null) {
      estrategia.enviarMaterial(estudiante);
    } else {
      throw new IllegalArgumentException("Carrera no soportada: " + estudiante.carrera);
    }
  }
}
