public class BPrinting {
    public static void main(String[] args) {
        String [][] matrix = new String [7][4];

        for (int rows = 0; rows < matrix.length; rows++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if ((rows == 0) || (rows == 3) || (rows == 6)) {
                    matrix[rows][col] = " * ";
                }
                else if ((col == 0) || (col == 3)) {
                    matrix[rows][col] = " * ";
                }
                else {
                    matrix[rows][col] = "   ";
                }
            }
        }

        for (String [] rows : matrix) {
            for (String col : rows) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}