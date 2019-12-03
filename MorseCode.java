public class MorseCode {
    static char c;
    private static String[] morse = {".-",".---","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","/"};
    private static  char[] letter = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',' '};
    public static void main(String[] args) {
        System.out.println(morseCodeToLetters(".... .. / - .... . .-. ."));
    }

   private static String lettersToMoreseCode(String word){
        String answer="";
        for (int i=0; i<word.length();i  ++){
            for(int j = 0;j<letter.length; j++){
                if((c = word.charAt(i))==(letter[j])) {
                       answer=answer+morse[j]+" ";
                }
            }
        }
        return answer;

    }
   static String morseCodeToLetters(String morseIn){
        String[] substr = morseIn.split(" ");
       String answer="";
       for (String a : substr) {
           for (int i = 0; i < a.length(); i++) {
               int j=0;
               String bello;
               boolean b=true;
               do {
                    bello = morse[j];
                   j++;
                   if (a.equals(bello)) {
                       answer = answer + letter[j] +"";
                       break;
                   }
               }while (b=true);
           }
       }


        return answer;

    }
}
