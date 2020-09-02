package readability;

import static java.lang.Character.isLetter;
import static java.lang.StrictMath.round;

public class Readability {

    //a string
    //calculate letters, words, sentence

    private String text;
    private int wordCount;
    private int letterCount;
    private int sentenceCount;
    private float readingLevelResult;

    public Readability(String text) {
        this.text = text;
    }


    private int countWords() {
        return this.wordCount;
    }

    private int countLetter() {
        return this.letterCount;
    }

    private int countSentence() {
        return this.sentenceCount;
    }

    //calculate words in the text
    private void getWordCount() {
        int counter = 1;
        for (int i = 0; i < this.text.length(); i++) {
            if(this.text.charAt(i) == ' ') {
                counter++;
            }
        }
        this.wordCount = counter;
    }

    //calculate how many letters in the text
    private void getLetterCount() {
        int counter = 0;
        for(int i = 0; i < this.text.length(); i++) {
            if(isLetter(this.text.charAt(i))) {
                counter++;
            }
        }
        this.letterCount = counter;
    }

    //calculate how many sentences in the text
    private void getSentenceCount() {
        int counter = 0;
        for(int i = 0; i < this.text.length(); i++) {
            if(this.text.charAt(i) == ('.') || this.text.charAt(i) == '!' || this.text.charAt(i) == '?') {
                counter++;
            }
        }
        this.sentenceCount = counter;
    }

    private void getReadingLevel() {
        getSentenceCount();
        getWordCount();
        getLetterCount();

        float sentence = (float) countSentence();
        float words = (float) countWords();
        float letter = (float) countLetter();

        //calculate average level of Letter
        float averageLetter = letter / words * 100;
        float averageSentence = sentence / words * 100;
        float readingLevel = (float) 0.0588 * averageLetter - (float) 0.296 * averageSentence - (float) 15.8;
        this.readingLevelResult = readingLevel;
    }

    public void resultReadingLevel() {
        getReadingLevel();
        if(round(readingLevelResult) >= 16) {
            System.out.println(readingLevelResult);
            System.out.println("Grade 16+");
        } else if (round(readingLevelResult) < 1) {
            System.out.println(round(readingLevelResult));
            System.out.println("Before Grade 1");
        } else {
            System.out.println(round(readingLevelResult));
            System.out.format("Grade %d", round(readingLevelResult));
        }
    }

}
