public class DibujarEnPantalla implements Dibujable{
    public void dibujarForma(String forma) {
        System.out.println("Dibujar " + forma + " en pantalla");
    }
}

class DibujarEnImpresora implements Dibujable {
    public void dibujarForma(String forma) {
        System.out.println("Dibujar " + forma + " en impresora");
    }
}
