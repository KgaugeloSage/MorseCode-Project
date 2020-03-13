import java.util.ArrayList;
import java.util.Arrays;

public class MorseCode {
    ArrayList<String> morse = new ArrayList<>();
    ArrayList<Character> letter = new ArrayList<>();
    static char c;
    private static String[] morseIn = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","/"};
    private static  Character[] letterIn = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',' '};




    String lettersToMoreseCode(String word){
        setMoresAndLetters();
        String wordCaps = word.toUpperCase();
        String answer="";
        for (int i=0; i<wordCaps.length();i  ++){
                answer = answer+ morse.get(letter.indexOf(wordCaps.charAt(i))) + " ";
        }
        return answer;

    }
     String morseCodeToLetters(String morseIn){
        String[] substr = morseIn.split(" ");
       String answer="";
       for(int i = 0; i < substr.length; ++i){
           answer = answer+ letter.get(morse.indexOf(substr[i]));
       }
        return answer;

    }

    void setMoresAndLetters(){
        letter.addAll(Arrays.asList(letterIn));
        morse.addAll(Arrays.asList(morseIn));
    }
}
