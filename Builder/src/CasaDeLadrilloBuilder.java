public class CasaDeLadrilloBuilder implements CasaBuilder{
    private Casa casa;

    public CasaDeLadrilloBuilder() {
        this.casa = new Casa();
    }

    public void construirCimientos() {
        casa.setCimientos("cemento y ladrillos");
    }

    public void construirParedes() {
        casa.setParedes("ladrillo");
    }

    public void construirTecho() {
        casa.setTecho("tejas");
    }

    public Casa getCasa() {
        return casa;
    }
}
