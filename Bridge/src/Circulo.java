public class Circulo extends Forma{
    public Circulo(Dibujable dibujable) {
        super(dibujable);
    }

    public void dibujar() {
        dibujable.dibujarForma("círculo");
    }
}

class Cuadrado extends Forma {
    public Cuadrado(Dibujable dibujable) {
        super(dibujable);
    }

    public void dibujar() {
        dibujable.dibujarForma("cuadrado");
    }
}
