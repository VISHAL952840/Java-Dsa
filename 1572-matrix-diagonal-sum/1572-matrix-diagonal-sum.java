class Solution {
    public static int diagonalSum(int[][] mat) {
        int Sum = 0;

        for (int i=0; i<mat.length; i++){
            //pd
            Sum += mat[i][i];
            //sd
            if(i != mat.length-1-i)
            Sum +=mat[i][mat.length-i-1];
 
        }
        return Sum;
    }
}