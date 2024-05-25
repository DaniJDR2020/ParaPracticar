public class Main {
    public static void main(String[] args) {
        Application app;
        GUIFactory factory;

        // Cambia este valor para "mac" para crear una interfaz estilo MacOS
        String osName = "windows";

        if (osName.equalsIgnoreCase("windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacOSFactory();
        }

        app = new Application(factory);
        app.paint();
    }
}