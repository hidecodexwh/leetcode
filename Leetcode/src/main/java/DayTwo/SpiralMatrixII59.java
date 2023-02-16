package DayTwo;

public class SpiralMatrixII59 {
    public static void main(String[] args) {
        int n = 3;

        int[][] ints = generateMatrix(n);
        System.out.println("OK");
    }

    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int counter = 1;

        for(int loop = 0; loop < n / 2; loop++){
            int i = loop;
            int j = loop;
            int insertNumOfBorder = n - 1 - 2 * loop;

            //top border
            for(int k = 0; k < insertNumOfBorder; k++){
                matrix[i][j] = counter;
                counter++;
                j++;
            }

            //right border
            for(int k = 0; k < insertNumOfBorder; k++){
                matrix[i][j] = counter;
                counter++;
                i++;
            }

            //bottom border
            for(int k = 0; k < insertNumOfBorder; k++){
                matrix[i][j] = counter;
                counter++;
                j--;
            }

            //left border
            for(int k = 0; k < insertNumOfBorder; k++){
                matrix[i][j] = counter;
                counter++;
                i--;
            }
        }

        if(n % 2 == 1){
            matrix[n/2][n/2] = counter;
        }

        return matrix;
    }
}
