public class SoporteBasico extends ManejadorSoporte {
    public void manejarSolicitud(String solicitud) {
        if (solicitud.equals("basico")) {
            System.out.println("Soporte Básico maneja la solicitud.");
        } else if (siguienteManejador != null) {
            siguienteManejador.manejarSolicitud(solicitud);
        }
    }
}
