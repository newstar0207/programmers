class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;
		
        for(int i = 0; i < lost.length; i++) {
			for(int j = 0; j < reserve.length; j++) {
				if(lost[i] == reserve[j]) {
					answer++;
                    reserve[j] = -10; //  +1, -1 시 겹치지 않는 숫자
					lost[i] = -2; // +1, -1 시 겹치지 않는 숫자
				}
			}
		}
        
		for(int i = 0; i < lost.length; i++) {
			for(int j = 0; j < reserve.length; j++) {
				if(lost[i] == reserve[j] + 1 ) {
					reserve[j] = -15; // +1, -1 시 겹치지 않는 숫자
					answer++;
					break;
				}
				if(lost[i] == reserve[j] -1 ) {
					reserve[j] = -15; // +1, -1 시 겹치지 않는 숫자
					answer++;
					break;
				}
			}
		}
        return answer;
    }
}