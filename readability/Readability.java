package readability;

import static java.lang.Character.isLetter;

public class Readability {

    //a string
    //calculate letters, words, sentence

    private String text;
    private int wordCount = 0;
    private int letterCount = 0;
    private int sentenceCount = 0;

    public Readability(String text) {
        this.text = text;
    }

    //calculate words
    public int countWords() {
        return this.wordCount;
    }

    public int countLetter() {
        return this.letterCount;
    }

    public int countSentence() {
        return this.sentenceCount;
    }

    private void getWordCount() {
        int counter = 1;
        for (int i = 0; i < this.text.length(); i++) {
            if(this.text.charAt(i) == ' ') {
                counter++;
            }
        }
        wordCount = counter;
    }

    private void getLetterCount() {
        int counter = 0;
        for(int i = 0; i < this.text.length(); i++) {
            if(isLetter(this.text.charAt(i))) {
                counter++;
            }
        }
        this.letterCount = counter;
    }

    private void getSentenceCount() {
        int counter = 0;
        for(int i = 0; i < this.text.length(); i++) {
            if(this.text.charAt(i) == ('.') || this.text.charAt(i) == '!' || this.text.charAt(i) == '?') {
                counter++;
            }
        }
        sentenceCount = counter;
    }

}
