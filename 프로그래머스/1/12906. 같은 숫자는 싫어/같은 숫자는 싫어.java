import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        Stack<Integer> dup = new Stack<>();
        dup.push(arr[0]);
         for(int i = 1; i < arr.length; i++){
            if(dup.peek() != arr[i]){
               dup.push(arr[i]);
            }
        }
      
        answer = new int [dup.size()];

        for(int i = dup.size()-1; i >= 0; i--){
            answer[i] = dup.pop();
        }
        
        return answer;
    }
}