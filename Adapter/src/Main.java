public class Main {
    public static void main(String[] args) {
        ConectorDe3_5mm conectorAntiguo = new ConectorDe3_5mm();
        ConectorUSB adaptador = new Adaptador3_5mmAUSB(conectorAntiguo);

        adaptador.conectarConUSB();  // Salida: Conectado con conector de 3.5mm
    }
}