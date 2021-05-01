class Solution {
    public int solution(int num1) {
        int answer = 0;
        long num = num1;
        if(num == 1){
            return 0;
        }
        do{
            if(answer == 500) return -1;
            answer++;
            num = num % 2 == 0 ? num / 2 : num * 3 + 1;
        }while(num != 1);
        return answer;
    }
}