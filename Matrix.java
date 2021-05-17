public class Matrix {
    private double[][] a;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        a = new double[rows][columns];
        this.columns = columns;
        this.rows = rows;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (Math.random() * 201) - 100;
            }
        }
    }

    public void sumMatrix(double[][] Matrix2) {
        if (Matrix2[0].length == columns && Matrix2.length == rows) {
            for (int i = 0; i < Matrix2.length; i++) {
                for (int j = 0; j < Matrix2[0].length; j++) {
                    a[i][j] += Matrix2[i][j];
                }
            }
        } else System.out.println("Матрицы сложить нельзя");
    }

    public void multiply(int number) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] *= number;
            }
        }
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(a[rows][columns] + "\t");
            }
            System.out.println();
        }
    }

    public void multiplyMatrix(double[][] Matrix2) {
        if (Matrix2[0].length == rows && Matrix2.length == columns) {
            for (int i = 0; i < Matrix2.length; i++) {
                for (int j = 0; j < Matrix2[0].length; j++) {
                a[i][j] *= Matrix2[j][i];
                }
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }


}
