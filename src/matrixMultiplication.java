/**
 * Created by ml996 on 12/21/16.
 */
public class matrixMultiplication {
    public static int[][] multiply(int[][] a, int[][] b){
        int rL = a[0].length;
        int cL = a.length;
        int rL2 = b[0].length;
        int cL2 = b.length;
        if(rL!=cL2){
            return new int[][]{{0}};
        }
        int[][] c = new int[cL][rL2];
        for(int i = 0; i < cL; i++){
            for(int j = 0; j < rL2; j++){
                for(int k = 0; k < rL; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
    public static void printMatrix(int[][] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
        int[][] a = { {1,2,-2,0}, {-3,4,7,2}, {6,0,3,1}};
        int[][] b = {{-1,3}, {0,9}, {1,-11}, {4,-5}};
        int[][] c = multiply(a,b);
        printMatrix(c);
    }
}
