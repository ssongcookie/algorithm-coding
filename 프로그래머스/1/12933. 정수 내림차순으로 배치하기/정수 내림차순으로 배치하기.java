import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        int arr[] = new int[String.valueOf(n).length()];
        int i = 0;
        
        while ( n > 0 ) {
            arr[i] = (int)(n % 10);
            n /= 10;
            i++;
        }
        
        Arrays.sort(arr);
        
        for(int j = arr.length -1; j >= 0; j--){
            answer = answer * 10 + arr[j];
        }
        
        return answer;
    }
}