import java.util.ArrayList;
import java.util.List;

public class MatrixComposite implements MatrixComponent {
    private List<List<MatrixComponent>> rows;

    public MatrixComposite(int numRows, int numCols) {
        rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<MatrixComponent> row = new ArrayList<>();
            for (int j = 0; j < numCols; j++) {
                row.add(new MatrixLeaf(0));  // Initialize with zeroes
            }
            rows.add(row);
        }
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
        return rows.get(row).get(col).get(0, 0);
    }

    @Override
    public void set(int row, int col, int value) {
        rows.get(row).set(col, new MatrixLeaf(value));
    }
}