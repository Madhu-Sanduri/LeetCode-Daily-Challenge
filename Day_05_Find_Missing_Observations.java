package Leetcode_Spetember;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day_05_Find_Missing_Observations {

    public static List<Integer> backtracking(List<Integer> templist,int []dice_values,int n,int missing_portion,int index){

        if(missing_portion==0 && n==0){
            return templist;
        }
        if(missing_portion==0 || n==0) return null;
        else{
            for(int i=1;i<=6;i++){
                templist.add(i);
                if(backtracking(templist,dice_values,n-1,missing_portion-i,0)!=null){
                    return templist;
                }
                templist.remove(templist.size()-1);
            }
        }
        return null;
    }

    public static String solution(int []a, int mean, int n){
        int out_arr [] = new int[n];
        int sum=0;
        for(int i:a){
            sum+=i;
        }
        int missing_portion= mean*(a.length+n)-sum;

      //  System.out.println(missing_portion);
        List<Integer> list = new ArrayList<>();
        backtracking(list,new int[]{1,2,3,4,5,6},n,missing_portion,0);

        int index=0;
        if(list.size()==0) return Arrays.toString(new int[]{});
        for(int i:list){
            out_arr[index++]=i;
        }
        return Arrays.toString(out_arr);
    }


    public static void main(String[] args) {
//        System.out.println(solution(new int[]{1, 3, 5, 2, 6, 4, 3, 2, 5, 1, 6, 4, 2, 3, 5, 1, 4, 6, 2, 5, 3, 6, 1, 4, 5},4,10000));
        System.out.println(solution(new int[]{1,2,3,4},6,4));
        System.out.println(solution(new int[]{3,2,4,3},4,2));
        System.out.println(solution(new int[]{1,5,6},3,4));
        System.out.println(solution(new int[]{6, 6, 6, 6},6,1));
        System.out.println(solution(new int[]{1,1,1,1},6,1));

    }
}
