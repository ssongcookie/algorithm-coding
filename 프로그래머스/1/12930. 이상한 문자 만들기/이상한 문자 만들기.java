class Solution {
    public String solution(String s) {
        // 빈 문자열 조립 상자
        StringBuilder answer = new StringBuilder();
        int idx = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == ' ') {
                answer.append(ch);
                // 공백이면 새로운 단어 시작
                idx = 0;
            } else {
                if (idx % 2 == 0) {
                    // 대문자
                    answer.append(Character.toUpperCase(ch));
                } else {
                    // 소문자
                    answer.append(Character.toLowerCase(ch));
                }
                // 다음 인덱스
                idx++;
            }
            

        }
        return answer.toString();
    }
}