import java.util.Arrays;

public class Main {
    public static String transpose(int[][] arr) {
        int a = arr[0].length;
        int b = arr.length;
        int[][] transpose = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                transpose[i][j] = arr[j][i];
            }
        }
        return Arrays.deepToString(transpose);
    }

    public static void main(String[] args) {
        int[][] a= {
                {1,2,3},
                {4,5,6}
        };

        System.out.println(transpose(a));

    }
}