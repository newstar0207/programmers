import java.util.*;
class Solution {
    public int solution(int n) {

        ArrayList<Integer> F = new ArrayList<>();
        F.add(0);
        F.add(1);
        for(int i = 2;i <= n ; i++) {
            int next = (F.get(i - 1) + F.get(i - 2)) % 1234567;
            F.add(next);
        }
        int result = F.get(n);

        return result;
    }
}