public class Matrix {

    private int rows;
    private int columns;
    private int[][] elements;

    // Constructor to initialize number of rows and columns
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        elements = new int[rows][columns];
    }

    // Method to get the number of rows
    public int getRows() {
        return rows;
    }

    // Method to get the number of columns
    public int getColumns() {
        return columns;
    }

    // Method to set the element of the matrix at a given position (i, j)
    public void setElement(int i, int j, int value) {
        if (i >= 0 && i < rows && j >= 0 && j < columns) {
            elements[i][j] = value;
        } else {
            System.out.println("Invalid position");
        }
    }

    // Method to add two matrices
    public Matrix add(Matrix matrix) {
        if (this.rows != matrix.getRows() || this.columns != matrix.getColumns()) {
            System.out.println("Matrices cannot be added");
            return null;
        }

        Matrix result = new Matrix(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.elements[i][j] = this.elements[i][j] + matrix.elements[i][j];
            }
        }

        return result;
    }

    // Method to multiply two matrices
    public Matrix multiply(Matrix matrix) {
        if (this.columns != matrix.getRows()) {
            System.out.println("Matrices cannot be multiplied");
            return null;
        }

        Matrix result = new Matrix(this.rows, matrix.getColumns());

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < matrix.getColumns(); j++) {
                for (int k = 0; k < this.columns; k++) {
                    result.elements[i][j] += this.elements[i][k] * matrix.elements[k][j];
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {
        // Creating two matrices
        Matrix matrix1 = new Matrix(2, 3);
        Matrix matrix2 = new Matrix(3, 2);

        // Adding elements to the first matrix
        matrix1.setElement(0, 0, 1);
        matrix1.setElement(0, 1, 2);
        matrix1.setElement(0, 2, 3);
        matrix1.setElement(1, 0, 4);
        matrix1.setElement(1, 1, 5);
        matrix1.setElement(1, 2, 6);

        // Adding elements to the second matrix
        matrix2.setElement(0, 0, 7);
        matrix2.setElement(0, 1, 8);
        matrix2.setElement(1, 0, 9);
        matrix2.setElement(1, 1, 10);
        matrix2.setElement(2, 0, 11);
        matrix2.setElement(2, 1, 12);

        // Adding two matrices
        Matrix sum = matrix1.add(matrix2);
        if (sum != null) {
            System.out.println("Sum of matrices:");
            printMatrix(sum);
        }

        // Multiplying two matrices
        Matrix product = matrix1.multiply(matrix2);
        if (product != null) {
            System.out.println("Product of matrices:");
            printMatrix(product);
        }
    }

    // Method to print the elements of a matrix
    public static void printMatrix(Matrix matrix) {
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getColumns(); j++) {
                System.out.print(matrix.elements[i][j] + " ");
            }
            System.out.println();
        }
    }
}

