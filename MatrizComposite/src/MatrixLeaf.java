public class MatrixLeaf implements MatrixComponent {
    private int value;

    public MatrixLeaf(int value) {
        this.value = value;
    }

    @Override
    public void add(MatrixComponent component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(MatrixComponent component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public MatrixComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int get(int row, int col) {
        if (row == 0 && col == 0) {
            return value;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public void set(int row, int col, int value) {
        if (row == 0 && col == 0) {
            this.value = value;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}