package Leetcode_Spetember;

public class Day_02_Students {

    public static int method(int []a,int k){
        int idx = 0;
        while (true) {
            if (idx == a.length) idx = 0;
            if (k < a[idx] || k <= 0) {
                if (idx == a.length) return 0;
                else return idx;
            }

            k = k - a[idx++];

        }
    }
    public static int solution(int[] a, int k) {
//        int idx = 0;
//        while (true) {
//            if (idx == a.length) idx = 0;
//            if (k<a[idx] ||k <= 0) {
//                if(idx==a.length) return 0;
//                else return idx;
//            }
//
//            k = k - a[idx++];
//        }
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        if (k < sum) {
            return method(a,k);
        }

        if(sum%k==0) return 0;
        else{
            while (k>sum){
                k-=sum;
            }
            return method(a,k);
        }
    }

        //int idx=0;
        //            while (true){
        //                if(idx==a.length) idx=0;
        //                k=k-a[idx++];
        //            }
        //        }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1},1000000000));
        System.out.println(solution(new int[]{5,1,5},22)); //0
        System.out.println(solution(new int[]{3,4,1,2},25)); //1
        System.out.println(solution(new int[]{1,2,3},7)); //1
        System.out.println(solution(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},1000000000));
        System.out.println(solution(new int[]{100000, 1, 100000, 1, 100000, 1, 100000, 1, 100000, 1},500000));
    }
}
