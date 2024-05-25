public class SoporteAvanzado extends ManejadorSoporte{
    public void manejarSolicitud(String solicitud) {
        if (solicitud.equals("avanzado")) {
            System.out.println("Soporte Avanzado maneja la solicitud.");
        } else if (siguienteManejador != null) {
            siguienteManejador.manejarSolicitud(solicitud);
        }
    }
}
