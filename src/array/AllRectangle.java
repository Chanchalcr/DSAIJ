package array;

public class AllRectangle {
    public static void main(String[] args) {
        int [][]mat = {{1,2,-1,-4,-20},{-8,-3,4,2,1},{3,8,10,1,3},{-4,-1,1,7,-6}};
        allOfRectangles(mat,4,4);
    }
    public static void allOfRectangles(int [][]mat, int m, int n) {

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    System.out.println(mat[j][k]);
                }
            }
        }
    }
}
