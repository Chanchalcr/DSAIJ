package twoDArray;
public class RowWaveForm {
    public static void main(String[] args) {
        int[][] mat= {
                {1,2,3},
                {3,3,3},
                {7,8,9}
        };
        waveForm(mat);
    }
    public static void waveForm(int[][] mat) {
        int N = mat.length;
        int M = mat[0].length;
        int[] ans = new int[N*M];
        int k=0;
        for(int i=0; i< N; i++) {
            if(i%2 == 0) {
                for (int j = 0; j < M ; j++) {
                    ans[k++] = mat[i][j];
                }
            } else{
                for (int j = M-1; j >= 0 ; j--) {
                    ans[k++] = mat[i][j];
                }
            }
        }
        for (int i = 0; i <N*M ; i++) {
            System.out.print(ans[i]);
        }
    }
}
