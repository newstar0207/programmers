import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap<>();
		for (String str : participant) {
			Integer n = map.get(str);
			if (n == null) {
				map.put(str, 1);
			} else {
				map.put(str, 1 + n);
			}
		}

		for (String str : completion) {
			int num = map.get(str);
			if (num > 1) {
				map.put(str, num - 1);
			} else {
				map.remove(str);
			}
		}
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		
        return iter.next();
        
    }
}