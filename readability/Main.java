package readability;

public class Main {
    public static void main(String[] args) {

        Readability text = new Readability(
                "Readability is the ease with which a reader can understand a written text. In natural language, the readability of text depends on its content (the complexity of its vocabulary and syntax) and its presentation (such as typographic aspects like font size, line height, character spacing, and line length).");
        text.resultReadingLevel();
    }


}

