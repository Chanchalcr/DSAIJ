package twoDArray;
public class Transpose {
    public static void main(String[] args) {
        int[][] mat= {{1,2,3},{0,0,0}};
        transMat(mat);
    }
    public static void transMat(int[][] mat) {
        int N = mat.length, M = mat[0].length;
        int[][] trans = new int[M][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                trans[j][i] = mat[i][j];
            }
        }
        for (int i = 0; i < trans.length; i++) {
            for (int j = 0; j < trans[0].length; j++) {
                System.out.print(trans[i][j]);
            }
            System.out.println();
        }
    }
}
