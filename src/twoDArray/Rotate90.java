package twoDArray;
public class Rotate90 {
    public static void main(String[] args) {
        int[][] mat= {{1,2,3},{4,5,6},{7,8,9}};
        rotateMat(mat);
    }
    public static void rotateMat(int[][] mat) {
        int N = mat.length, M = mat[0].length;
        int[][] rot = new int[M][N];
        for (int i = 0;i < M; i++) {
            for (int j = 0; j < N; j++) {
                rot[i][N-1-j] = mat[j][i];
            }
        }
        //I am print the new Matrix because we can not do rot = mat, cos they are not compatible!
        for (int i = 0; i < rot.length; i++) {
            for (int j = 0; j < rot[0].length; j++) {
                System.out.print(rot[i][j]);
            }
            System.out.println();
        }
    }
}
