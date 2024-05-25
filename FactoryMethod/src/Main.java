public class Main {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        ShapeFactory squareFactory = new SquareFactory();

        // Crear y dibujar un círculo
        circleFactory.renderShape();

        // Crear y dibujar un cuadrado
        squareFactory.renderShape();
    }
}