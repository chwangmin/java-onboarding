package onboarding;

import java.util.ArrayList;

public class Problem2 {
    public static String solution(String cryptogram) {
        StringBuffer tmpCryptogram = new StringBuffer(cryptogram);
        while (true){
            Boolean cryptogramNoDup = true;
            ArrayList<Integer> arrInt = new ArrayList<>();
            for (int i = 0; i < tmpCryptogram.length() - 1; i++) {
                if (tmpCryptogram.charAt(i) == tmpCryptogram.charAt(i+1)) {
                    arrInt.add(i);
                    i++;
                    cryptogramNoDup = false;
                }
            }
            if (cryptogramNoDup){
                break;
            }
            int cnt = 0;
            for (int loop = 0; loop < arrInt.size(); loop++){
                int arrNum = arrInt.get(loop) - cnt;
                for (int i = 0; i< 2 ; i++)
                    tmpCryptogram.deleteCharAt(arrNum);
                cnt = cnt + 2;
            }
        }
        String answer = tmpCryptogram.toString();
        return answer;
    }
}
