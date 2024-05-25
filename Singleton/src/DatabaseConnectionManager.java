public class DatabaseConnectionManager {
    private static DatabaseConnectionManager instance;
    private String connectionString;

    private DatabaseConnectionManager() {
        // Aquí podrías inicializar la conexión a la base de datos
        // Pero por simplicidad, solo establecemos la cadena de conexión
        connectionString = "jdbc:mysql://localhost:3306/mydatabase";
    }

    public static synchronized DatabaseConnectionManager getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionManager();
        }
        return instance;
    }

    public void connect() {
        // Aquí podrías abrir la conexión a la base de datos
        System.out.println("Conectado a la base de datos: " + connectionString);
    }

    public void disconnect() {
        // Aquí podrías cerrar la conexión a la base de datos
        System.out.println("Desconectado de la base de datos");
    }
}