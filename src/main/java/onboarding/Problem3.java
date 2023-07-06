package onboarding;

import java.util.stream.Stream;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;
        for (int sequenceNumber = 0; sequenceNumber <= number; sequenceNumber++) {
            int[] digits = Stream.of(String.valueOf(sequenceNumber).split("")).mapToInt(Integer::parseInt).toArray();
            for (int checkTSN : digits) {
                if (checkTSN == 3 || checkTSN == 6 || checkTSN == 9){
                    answer +=1;
                }
            }
        }
        return answer;
    }
}
