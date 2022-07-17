package twoDArray;
public class Rotate_K_Right {
    public static void main(String[] args) {
        int[][] mat= {{1,2,3},{4,5,6},{7,8,9}};
        int k = 4;
        kRotate(mat,k);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
    public static void kRotate(int[][] mat, int k) {
        k = k % mat[0].length;
        for (int i = 0; i < mat.length; i++) {
            for (int t = 0; t < k; t++) {
                int temp = mat[i][mat[0].length-1];
                for (int j = mat[0].length-2; j >=0; j--) {
                    mat[i][j+1] = mat[i][j];
                }
                mat[i][0] = temp;
            }
        }
    }
}
