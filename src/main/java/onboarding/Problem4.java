package onboarding;

public class Problem4 {
    public static String solution(String word) {
        StringBuilder tmpAnswer = new StringBuilder(word.length());

        for (int i = 0; i< word.length();i++) {
            int letter = word.charAt(i);
            if (letter >= 65 && letter <= 77){
                letter = 90 - (letter - 65);
            }
            else if (letter >= 97 && letter <= 109){
                letter = 122 - (letter - 97);
            }
            else if (letter >= 78 && letter <= 90){
                letter = 77 - (letter - 78);
            }
            else if (letter >= 110 && letter <= 122){
                letter = 109 - (letter - 110);
            }
            tmpAnswer.append((char)letter);
        }
        return String.valueOf(tmpAnswer);
    }
}
