import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[] sortNum = new String[strings.length];

        Arrays.sort(strings);
        ArrayList<String> array = new ArrayList<>();
        for(String value : strings) {
            array.add(value);
        }
        for(int i = 0; i < strings.length; i++){
            sortNum[i] = strings[i].substring(n , n+1);
        }
        Arrays.sort(sortNum);

        for(int i = 0; i < sortNum.length; i++){
            for ( int j = 0; j < array.size(); j++){
                if(sortNum[i].equals(array.get(j).substring(n, n+1))){
                    answer[i] = array.get(j);
                    array.remove(j);
                    break;
                }
            }
        }

        return answer;
    }
}