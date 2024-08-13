package Practice2;

public class RevAlpha {
    public static void main(String[] args) {

        String sentence = "The quick brown fox jumps. over the lazy dog!";
        StringBuilder letterSentence = new StringBuilder();

        for(char c: sentence.toCharArray()){
            if(Character.isLetter(c)){
                letterSentence.append(c);
            }
        }
        letterSentence.reverse();

        int letterIndex = 0;
        StringBuilder outputSentence = new StringBuilder();

        for(char c: sentence.toCharArray()){
            if(Character.isLetter(c)){
                outputSentence.append(letterSentence.charAt(letterIndex));
                letterIndex++;
            }
            else{
                outputSentence.append(c);
            }
        }

        System.out.println(sentence);
        System.out.println(outputSentence);
    }
}
// ab, cde.
// ed, cba.