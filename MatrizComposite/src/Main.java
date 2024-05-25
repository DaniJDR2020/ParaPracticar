public class Main {
    public static void main(String[] args) {
        MatrixComposite matrix = new MatrixComposite(3, 3);

        matrix.set(0, 0, 1);
        matrix.set(1, 1, 2);
        matrix.set(2, 2, 3);

        System.out.println(matrix.get(0, 0)); // Output: 1
        System.out.println(matrix.get(1, 1)); // Output: 2
        System.out.println(matrix.get(2, 2)); // Output: 3
    }
}