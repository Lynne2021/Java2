public class LetterTracker {
    private int[] letterOccurrences;
    private int textSize;


    public LetterTracker(){
        letterOccurrences = new int[26];
        textSize=0;
    }
    public LetterTracker(String s){
        s = s.replaceAll("[^a-zA-Z]","").toLowerCase();

        textSize=s.length();
        letterOccurrences = new int[26];


        for(int i=0;i<s.length();i++)
            letterOccurrences[s.charAt(i) -'a']++;
    }

    public int getLetterCount(char letter){
        return letterOccurrences[Character.toLowerCase(letter) -'a'];
    }

    public void setLetterCount(char letter, int value){
        textSize = textSize - this.getLetterCount(letter) + value;

        letterOccurrences[Character.toLowerCase(letter) -'a'] = value;

    }

    public int size(){
        return textSize;
    }

    public boolean isEmpty(){
        return textSize == 0;
    }

    public String toString(){
        StringBuilder sB = new StringBuilder("[");

        for(int i=0;i<26;i++){
            for(int j=0;j<letterOccurrences[i];j++) {
                sB.append((char) ('a' + i));
            }
        }
        sB.append("]");
        return sB.toString();
    }
    public LetterTracker add(LetterTracker secondTracker){

        LetterTracker newLetterTracker = new LetterTracker();

        for(int i=0;i<26;i++) {
            int newValue = this.getLetterCount((char) ('a' + i)) + secondTracker.getLetterCount((char) ('a' + i));
            newLetterTracker.setLetterCount((char) ('a' + i), newValue);
        }
        return newLetterTracker;
    }

    public LetterTracker subtract(LetterTracker secondTracker){

        LetterTracker newLetterTracker = new LetterTracker();

        for(int i=0;i<26;i++) {
            int newValue = this.getLetterCount((char) ('a' + i)) - secondTracker.getLetterCount((char) ('a' + i));
            if(newValue<0)
                newValue = 0;
            newLetterTracker.setLetterCount((char) ('a' + i), newValue);
        }
        return newLetterTracker;
    }

}




