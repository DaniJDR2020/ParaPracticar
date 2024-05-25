public interface MatrixComponent {
    void add(MatrixComponent component);
    void remove(MatrixComponent component);
    MatrixComponent getChild(int index);
    int get(int row, int col);
    void set(int row, int col, int value);
}