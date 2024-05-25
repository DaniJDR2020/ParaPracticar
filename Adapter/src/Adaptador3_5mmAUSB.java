public class Adaptador3_5mmAUSB implements ConectorUSB{
    private ConectorDe3_5mm conectorDe3_5mm;

    public Adaptador3_5mmAUSB(ConectorDe3_5mm conectorDe3_5mm) {
        this.conectorDe3_5mm = conectorDe3_5mm;
    }

    public void conectarConUSB() {
        conectorDe3_5mm.conectarCon3_5mm();
    }
}
