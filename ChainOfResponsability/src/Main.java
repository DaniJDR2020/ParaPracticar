public class Main {
    public static void main(String[] args) {
        ManejadorSoporte soporteBasico = new SoporteBasico();
        ManejadorSoporte soporteAvanzado = new SoporteAvanzado();
        ManejadorSoporte soporteEspecializado = new SoporteEspecializado();

        soporteBasico.establecerSiguiente(soporteAvanzado);
        soporteAvanzado.establecerSiguiente(soporteEspecializado);

        soporteBasico.manejarSolicitud("basico");        // Salida: Soporte Básico maneja la solicitud.
        soporteBasico.manejarSolicitud("avanzado");      // Salida: Soporte Avanzado maneja la solicitud.
        soporteBasico.manejarSolicitud("especializado"); // Salida: Soporte Especializado maneja la solicitud.
        soporteBasico.manejarSolicitud("otro");          // Salida: Solicitud no manejada.
    }
}