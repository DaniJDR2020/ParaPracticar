public class Main {
    public static void main(String[] args) {
        // Obtener la única instancia de DatabaseConnectionManager
        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getInstance();

        // Conectar a la base de datos
        connectionManager.connect();

        // Desconectar de la base de datos
        connectionManager.disconnect();

        // Intentar obtener otra instancia para demostrar que es la misma
        DatabaseConnectionManager anotherConnectionManager = DatabaseConnectionManager.getInstance();
        System.out.println("¿Son las mismas instancias?: " + (connectionManager == anotherConnectionManager));
    }
}