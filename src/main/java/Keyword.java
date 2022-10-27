import java.util.ArrayList;

public class Keyword {
    private String word;
    private String definition;
    private String seeAlso;
    ArrayList<Keyword> list = new ArrayList<Keyword>();

    public String getWord() {
        return word;
    }

    public Keyword(String word, String definition) {
        this.word = word;
        this.definition = definition;

    }
    public boolean matches(String findWord) {
        if (word.toLowerCase().contains(findWord.toLowerCase())) {
            return true;
        } else
            return false;
    }
    public void addKeyword(Keyword keyword) {
        list.add(keyword);
    }
    public String print(){
        String text = word + ", " + definition;
        text += "\nSee also: \n";
        for (Keyword k: list) {
            text += k.getWord() + " ";
        }
        return text;
    }
    public String toString() {
        return word + " " + definition;
    }

}
