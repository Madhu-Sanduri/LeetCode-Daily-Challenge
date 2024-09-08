package Leetcode_Spetember;

public class Day_03_Sum_of_Digits_in_String {

    public static int solution(String s,int k){
        StringBuilder sb = new StringBuilder();
        for(char i:s.toCharArray()){
            sb.append(((i-'a')+1));
        }
        while (k>0){
            int sum=0;
            for(int i=0;i<sb.length();i++){
                sum+=sb.charAt(i)-'0';
            }
            sb.delete(0,sb.length());
            sb.append(sum);
            k--;
        }

        return Integer.parseInt(sb.toString());
    }


    public static void main(String[] args) {
        System.out.println(solution("leetcode",2));
        System.out.println(solution("iiii",1));
        System.out.println(solution("madhu",3));
    }
}
