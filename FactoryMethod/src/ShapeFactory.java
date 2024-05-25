public abstract class ShapeFactory {
    public abstract Shape createShape();

    public void renderShape() {
        Shape shape = createShape();
        shape.draw();
    }
}

