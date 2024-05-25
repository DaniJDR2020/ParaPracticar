public class SoporteEspecializado extends ManejadorSoporte{
    public void manejarSolicitud(String solicitud) {
        if (solicitud.equals("especializado")) {
            System.out.println("Soporte Especializado maneja la solicitud.");
        } else {
            System.out.println("Solicitud no manejada.");
        }
    }
}
