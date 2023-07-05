package onboarding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;

        if (pobi.get(0)+1 != pobi.get(1)) {
            answer = -1;
            return answer;
        }
        if (crong.get(0)+1 != crong.get(1)) {
            answer = -1;
            return answer;
        }

        int pobiMaxLeftPageNumber = maxPageNumberCal(pobi.get(0));
        int pobiMaxRightPageNumber = maxPageNumberCal(pobi.get(1));

        int pobiMaxNumber;
        pobiMaxNumber = maxNumberGive(pobiMaxLeftPageNumber, pobiMaxRightPageNumber);

        int crongMaxLeftPageNumber = maxPageNumberCal(crong.get(0));
        int crongMaxRightPageNumber = maxPageNumberCal(crong.get(1));

        int crongMaxNumber;
        crongMaxNumber = maxNumberGive(crongMaxLeftPageNumber, crongMaxRightPageNumber);

        if (pobiMaxNumber > crongMaxNumber)
            answer = 1;
        else if (crongMaxNumber > pobiMaxNumber)
            answer = 2;
        else
            answer = 0;

        return answer;
    }

    public static int maxPageNumberCal(int page){
        int maxPageNumber = 0;

        ArrayList<Integer> arrNum = new ArrayList<>();
        while (page > 0) {
            arrNum.add(page % 10);
            page /= 10;
        }

        int plusNum = 0;
        for (int loop = 0; loop < arrNum.size(); loop++) {
            plusNum += arrNum.get(loop);
        }
        int mulNum = 1;
        for (int loop = 0; loop < arrNum.size(); loop++) {
            mulNum *= arrNum.get(loop);
        }

        maxPageNumber = maxNumberGive(plusNum, mulNum);

        return maxPageNumber;
    }

    public static int maxNumberGive(int first, int second){
        if (first > second)
            return first;
        else
            return second;
    }
}