public class Main {
    public static void main(String[] args) {
        Keyword keyword = new Keyword("Cake", "Fluffy bread");
        System.out.println(keyword);

        Boolean keywordMatch = keyword.matches("Pepsi");
        System.out.println(keywordMatch);

        keyword.addKeyword(new Keyword("Chips", "Crispy and salty"));
        keyword.addKeyword(new Keyword("Chocolate", "Sweet and delicious"));
        System.out.println(keyword.print());

    }
}
