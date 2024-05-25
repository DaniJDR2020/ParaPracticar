public class NombresColeccion implements ColeccionNombres{
    private String[] nombres;

    public NombresColeccion(String[] nombres) {
        this.nombres = nombres;
    }

    public Iterator crearIterator() {
        return new NombreIterator(nombres);
    }
}
