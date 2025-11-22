class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        int sum = Integer.parseInt(str1+str2);
        
        int mul = 2 * a * b;
        
        if(mul > sum){
            answer = mul;
        }else{
            answer = sum;
        }
        
        return answer;
    }
}