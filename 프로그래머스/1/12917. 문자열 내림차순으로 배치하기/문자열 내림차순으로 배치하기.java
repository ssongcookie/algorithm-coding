import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        //영문자의 문자 코드 순서는 대문자가 소문자보다 작다.
        Arrays.sort(chars);
        
        return new StringBuilder(new String(chars))
            .reverse()
            .toString();
    }
}