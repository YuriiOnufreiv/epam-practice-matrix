package matrices;

import matrices.Matrix;

/**
 * Created by yurii on 11/1/16.
 */
public class Summator {
    public static Matrix sum(Matrix m1, Matrix m2) {
        if (m1.getVerticalSize() != m2.getVerticalSize() ||
                m1.getHorizontalSize() != m2.getHorizontalSize()) {
            return null;
        }
        Matrix result = new Matrix(m1.getVerticalSize(), m1.getHorizontalSize());
        for (int i = 0; i < m1.getVerticalSize(); i++) {
            for (int j = 0; j < m1.getHorizontalSize(); j++) {
                result.setElement(i, j, m1.getElement(i, j) + m2.getElement(i, j));
            }
        }
        return result;
    }
}
