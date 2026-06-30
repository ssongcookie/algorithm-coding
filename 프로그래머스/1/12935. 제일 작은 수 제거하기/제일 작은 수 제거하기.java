import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        //최솟값 찾기
        int min = Arrays.stream(arr).min().getAsInt();
        
        //최솟값 아닌 것만 리스트에 담기
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : arr){
            if(n != min){
                list.add(n);
            }
        }
        
        //빈 리스트인 경우 -1 넣기
        if(list.isEmpty()){
            list.add(-1);
        }
        
        //배열로 반환
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}