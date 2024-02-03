package co.edu.unisabana.clases.example.solid.service;


import co.edu.unisabana.clases.example.solid.modelo.Envio;

public class EmailOutlook {

  void enviarEmail(Envio envio) {
    System.out.println("ESTABLECIENDO CONEXION CON EL SERVIDOR");
    System.out.println("EMAIL ENVIADO y correspondencia " + envio);
  }
}
