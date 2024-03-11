package guard.passer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberCounterJava {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 4, 5, 1, 5, 4);
        System.out.println(count(list));
    }

    public static Map<Integer, Integer> count(List<Integer> list){
        Map<Integer, Integer> answer = new HashMap<>();
        for(int i = 0; i < list.size(); i++){
            Integer temp = list.get(i);
            if(answer.containsKey(temp)){
                answer.put(temp, answer.get(temp) + 1);
            }else{
                answer.put(temp, 1);
            }
        }
        return answer;
    }
}
