package matrices;

import java.util.Arrays;

/**
 * Created by yurii on 11/1/16.
 */
public class Matrix {
    private int[][] a;

    Matrix(int row, int col) {
        a = new int[row][col];
    }

    public int getElement(int row, int col) {
        if (indexIsOutOfBounds(row, col)) {
            throw new IndexOutOfBoundsException();
        }
        return a[row][col];
    }

    public void setElement(int row, int col, int value) {
        if (indexIsOutOfBounds(row, col)) {
            throw new IndexOutOfBoundsException();
        }
        a[row][col] = value;
    }

    public int getHorizontalSize() {
        return a[0].length;
    }

    public int getVerticalSize() {
        return a.length;
    }

    private boolean indexIsOutOfBounds(int row, int col) {
        return row < 0 || row >= a.length ||
                col < 0 || col >= a[0].length;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            stringBuilder.append(Arrays.toString(a[i])).append("\n");
        }
        return stringBuilder.toString();
    }
}
