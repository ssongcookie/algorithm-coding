class Solution {
    public int solution(int[][] sizes) {
        int mw = 0;
        int mh = 0;
        
        for (int i = 0; i <sizes.length; i++) {
            // 긴 쪽을 가로
            int w = Math.max(sizes[i][0], sizes[i][1]);
            // 짧은 쪽을 세로
            int h = Math.min(sizes[i][0], sizes[i][1]);
            
            // 가장 큰 가로와 세로 저장
            mw = Math.max(mw, w);
            mh = Math.max(mh, h);
        }
        
        return mw * mh;
    }
}