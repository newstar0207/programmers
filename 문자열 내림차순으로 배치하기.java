import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";

        String[] array = s.split("");
        Arrays.sort(array, new MyComparator());

        for(String value : array){
            answer += value;
        }

        return answer;
    }
}

class MyComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }

}