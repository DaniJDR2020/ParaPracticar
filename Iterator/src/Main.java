public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "María", "Luis", "Ana"};
        ColeccionNombres coleccion = new NombresColeccion(nombres);
        Iterator iterador = coleccion.crearIterator();

        while (iterador.hasNext()) {
            String nombre = (String) iterador.next();
            System.out.println(nombre);
        }
    }
}
