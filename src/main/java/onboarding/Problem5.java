package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        List<Integer> answer = new ArrayList<>();
        
        int firstBankNote = 50000;

        for (int i = 0; i < 8; i++){
            int number = money / firstBankNote;
            money = money - number * firstBankNote;
            if (i % 2 == 0){
                firstBankNote /= 5;
            } else{
                firstBankNote /= 2;
            }
            answer.add(number);
        }
        answer.add(money);
        return answer;
    }
}
