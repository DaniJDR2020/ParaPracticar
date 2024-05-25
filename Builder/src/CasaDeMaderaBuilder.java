public class CasaDeMaderaBuilder implements CasaBuilder {
    private Casa casa;

    public CasaDeMaderaBuilder() {
        this.casa = new Casa();
    }

    public void construirCimientos() {
        casa.setCimientos("madera");
    }

    public void construirParedes() {
        casa.setParedes("madera");
    }

    public void construirTecho() {
        casa.setTecho("madera");
    }

    public Casa getCasa() {
        return casa;
    }
}
