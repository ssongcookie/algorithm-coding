class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        // p 의 길이 저장
        int pLength = p.length();
        // 숫자 크기로 비교하기 위해 문자열을 숫자로 변환
        long pNum = Long.parseLong(p);
        
        // pLength만큼 자를 수 있는 마지막 시작 위치까지 반복
        for (int i = 0; i <= t.length() - pLength; i++) {
            // part: 문자열을 자른 결과
            String part = t.substring(i, i + pLength);
            // partNum: 그 문자열을 숫자로 바꾼 결과
            long partNum = Long.parseLong(part);
            
            // 잘라낸 숫자가 p보다 작거나 같으면 개수를 1 증가
            if (partNum <= pNum) {
                answer++;
            }
        }
        return answer;
    }
}