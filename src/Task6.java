public class Task6 {
    public static void main(String[] args) {

        final int n = 3;
        final int m = 2;
        final int l = 2;

        final int[][] result = new int[l][n];
        final int[][] array1 = new int [l][m];
        final int[][] array2 = new int [m][n];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = n*i + j;
            }
        }

        System.out.println("Матриця 1:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = i+1;
            }
        }

        System.out.println("\nМатриця 2:");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        for (int i=0; i<l; ++i)
            for (int j=0; j<n; ++j)
                for (int k=0; k<m; ++k)
                    result[i][j] += array1[i][k] * array2[k][j];

        System.out.println("\nРезультат множення:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}




