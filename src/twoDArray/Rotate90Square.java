package twoDArray;
public class Rotate90Square {
    public static void main(String[] args) {
        int[][] mat= {{1,2,3},{4,5,6},{7,8,9}};
        rotateMat2(mat);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
    //this function rotate the matrix with the use of a 1d array
    public static void rotateMat1(int[][] mat) {
        int N = mat.length, M = mat[0].length;
        int[] arr = new int[N*M];
        int k=0;
        for (int i = 0; i < M; i++) {
            for (int j = N-1; j >=0 ; j--) {
                 arr[k++]  = mat[j][i];
            }
        }
        k=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                mat[i][j]= arr[k++];
            }
        }
    }

    //this function rotate the array without the use of 1d array
    public static void rotateMat2(int[][] mat) {

    }
}
