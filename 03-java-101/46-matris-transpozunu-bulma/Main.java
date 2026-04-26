public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                { 2, 3, 4 },
                { 5, 6, 4 }
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matris :");
        printMatrix(matrix);

        System.out.println("Transpoze :");
        printMatrix(transpose);
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + "    ");
            }
            System.out.println();
        }
    }
}
