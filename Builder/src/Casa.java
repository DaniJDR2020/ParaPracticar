public class Casa {
    private String paredes;
    private String techo;
    private String cimientos;

    public void setParedes(String paredes) {
        this.paredes = paredes;
    }

    public void setTecho(String techo) {
        this.techo = techo;
    }

    public void setCimientos(String cimientos) {
        this.cimientos = cimientos;
    }

    @Override
    public String toString() {
        return "Casa con cimientos de " + cimientos + ", paredes de " + paredes + " y techo de " + techo;
    }
}
