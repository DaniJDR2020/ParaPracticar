public class Main {
    public static void main(String[] args) {
        Dibujable dibujarEnPantalla = new DibujarEnPantalla();
        Dibujable dibujarEnImpresora = new DibujarEnImpresora();

        Forma circuloEnPantalla = new Circulo(dibujarEnPantalla);
        Forma cuadradoEnImpresora = new Cuadrado(dibujarEnImpresora);

        circuloEnPantalla.dibujar();  // Salida: Dibujar círculo en pantalla
        cuadradoEnImpresora.dibujar();  // Salida: Dibujar cuadrado en impresora
    }
}