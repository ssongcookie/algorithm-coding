class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a = n;
        int b = m;
        
        // 최대공약수(GCD) = 두 수가 공통으로 가지고 있는 인수(약수)의 곱
        // 최소공배수(LCM) = 두 수를 곱한 뒤 공통으로 들어간 부분(최대공약수)을 한 번 제거한 값
        // LCM = (a × b) / GCD
        
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
            System.out.println(a + " " + b);
        }
        
        answer[0] = a;
        answer[1] = n * m / a;
        
        return answer;
    }
}