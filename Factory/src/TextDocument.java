public class TextDocument implements Document {
    @Override
    public void open() {
        System.out.println("Abriendo documento de texto...");
    }

    @Override
    public void save() {
        System.out.println("Guardando documento de texto...");
    }

    @Override
    public void close() {
        System.out.println("Cerrando documento de texto...");
    }
}
