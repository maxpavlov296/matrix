public class Main {
    public static void main(String[] args) {
        Matrix first = new Matrix(4, 4);
        double[][] Matrix2 = new double[4][4];
        for (int i = 0; i < Matrix2.length; i++) {
            for (int j = 0; j < Matrix2[0].length; j++) {
                Matrix2[i][j] = (Math.random() * 21) - 10;
            }
        }
        first.sumMatrix(new double[][]{{1, 2, 1, 2}, {2, 1, 2, 1}, {1, 2, 1, 2}, {2, 1, 2, 1}});
        first.multiply(4);
        first.print();
        first.multiplyMatrix(new double[][]{{1, 2, 1, 2}, {2, 1, 2, 1}, {1, 2, 1, 2}, {2, 1, 2, 1}});
        System.out.println(first.getColumns());
        System.out.println(first.getRows());
    }

}
