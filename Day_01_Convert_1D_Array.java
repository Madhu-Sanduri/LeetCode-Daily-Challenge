package Leetcode_Spetember;

import java.util.Arrays;

public class Day_01_Convert_1D_Array {

    public static int[][] solution(int []a,int m,int n){
        int [][]out = new int[m][n];
        if(m*n!=a.length) return new int[][]{{}};
        else{
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    out[i][j]=a[i*n+j];
                }
            }
        }
        for(int []i:out){
            System.out.println(Arrays.toString(i));
        }
        return new int[][]{{}};
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4,5,6,7,8,9,10},2,5));
        System.out.println(solution(new int[]{1,2,3,4},2,2));
        System.out.println(solution(new int[]{1,2,3},1,3));
        System.out.println(solution(new int[]{1,2},1,1));
    }
}
