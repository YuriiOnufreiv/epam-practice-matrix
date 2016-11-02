import matrices.Matrix;
import matrices.MatrixFactory;
import matrices.Summator;

/**
 * Created by yurii on 11/1/16.
 */
public class Runner {
    public static void main(String[] args) {
        Matrix m1 = MatrixFactory.createMatrix(3, 3);
        Matrix m2 = MatrixFactory.createMatrix(3, 3);

        Matrix m3 = Summator.sum(m1, m2);

        System.out.println("Matrix 1: \n" + m1);
        System.out.println("Matrix 2: \n" + m2);
        System.out.println("Matrix 3: \n" + m3);
    }
}
