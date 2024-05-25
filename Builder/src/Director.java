public class Director {
    private CasaBuilder casaBuilder;

    public Director(CasaBuilder casaBuilder) {
        this.casaBuilder = casaBuilder;
    }

    public void construirCasa() {
        casaBuilder.construirCimientos();
        casaBuilder.construirParedes();
        casaBuilder.construirTecho();
    }

    public Casa getCasa() {
        return casaBuilder.getCasa();
    }
}
