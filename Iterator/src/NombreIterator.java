public class NombreIterator implements Iterator{
    private String[] nombres;
    private int posicion;

    public NombreIterator(String[] nombres) {
        this.nombres = nombres;
        this.posicion = 0;
    }

    public boolean hasNext() {
        return posicion < nombres.length;
    }

    public String next() {
        return nombres[posicion++];
    }
}
