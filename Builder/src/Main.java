public class Main {
    public static void main(String[] args) {
        CasaBuilder builderDeMadera = new CasaDeMaderaBuilder();
        Director director = new Director(builderDeMadera);

        director.construirCasa();
        Casa casaDeMadera = director.getCasa();
        System.out.println(casaDeMadera);  // Salida: Casa con cimientos de madera, paredes de madera y techo de madera

        CasaBuilder builderDeLadrillo = new CasaDeLadrilloBuilder();
        director = new Director(builderDeLadrillo);

        director.construirCasa();
        Casa casaDeLadrillo = director.getCasa();
        System.out.println(casaDeLadrillo);  // Salida: Casa con cimientos de cemento y ladrillos, paredes de ladrillo y techo de tejas
    }
}