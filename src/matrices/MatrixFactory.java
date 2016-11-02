package matrices;

/**
 * Created by yurii on 11/1/16.
 */
public class MatrixFactory {
    public static Matrix createMatrix(int row, int col) {
        Matrix matrix = new Matrix(row, col);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix.setElement(i, j, (int) (Math.random() * row * col));
            }
        }
        return matrix;
    }
}
