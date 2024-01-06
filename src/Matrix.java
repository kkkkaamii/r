public class Matrix {
    private double[][] matrix;
    private int rows;
    private int columns;


    public Matrix(double[][] matrix) {
        this.matrix = matrix;
        this.rows = matrix.length;
        this.columns = matrix[0].length;
    }


    public Matrix add(Matrix otherMatrix) {
        return new Matrix(new double[rows][columns]);
    }

    public Matrix multiply(double scalar) {
        return new Matrix(new double[rows][columns]);
    }

    public void printMatrix() {
    }
}