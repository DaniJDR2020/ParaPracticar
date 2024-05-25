abstract class Forma {
    protected Dibujable dibujable;

    protected Forma(Dibujable dibujable) {
        this.dibujable = dibujable;
    }

    abstract void dibujar();
}
