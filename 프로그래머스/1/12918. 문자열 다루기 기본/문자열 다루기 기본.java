class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if (s.length() != 4 && s.length() != 6) {
            answer = false;
        }
        
        for (int i = 0; i < s.length(); i++) {
            // 해당 문자가 숫자가 아니면 False
            if (!Character.isDigit(s.charAt(i))) {
                answer = false;
            }
        }
        return answer;
    }
}