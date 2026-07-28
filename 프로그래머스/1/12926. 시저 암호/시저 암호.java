class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == ' ') {
                answer.append(ch);
            } else if (ch >= 'A' && ch <= 'Z') {
                //현재 알파벳의 위치에 n칸을 더한 뒤, 26개를 넘어가면 다시 처음부터(0부터) 시작하도록
                char move = (char)('A' + (ch - 'A' + n) % 26);
                answer.append(move);
            } else {
                char move = (char)('a' + (ch - 'a' + n) % 26);
                answer.append(move);
            }
            
        }
        return answer.toString();
    }
}