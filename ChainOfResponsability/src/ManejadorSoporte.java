abstract class ManejadorSoporte {
        protected ManejadorSoporte siguienteManejador;

        public void establecerSiguiente(ManejadorSoporte manejador) {
            this.siguienteManejador = manejador;
        }

        public abstract void manejarSolicitud(String solicitud);
    }


