
public class Task5 {
    public static void main(String[] args) {

                final int n = 5;
                final int m = 2;

                final int[][] result = new int[n][m];
                final int[][] array = new int [m][n];

                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                    array[i][j] = n*i + j;
                    }
                }

                System.out.println("Матриця n X m\n");
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println();
                }

                for (int i = 0; i < result.length; i++) {
                    for (int j = 0; j < result[i].length; j++) {
                        result[i][j] = array[j][i];
                    }
                }

                System.out.println("\nТранспонована матриця m X n\n");
                for (int i = 0; i < result.length; i++) {
                    for (int j = 0; j < result[i].length; j++) {
                        System.out.print(result[i][j] + " ");

                    }
                    System.out.println();
                }
            }
        }