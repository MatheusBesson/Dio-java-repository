public class Main {
    public static void main(String[] args) {
        UniqueWordsSet uniqueWordsSet = new UniqueWordsSet();




        uniqueWordsSet.addWord("Jordan");
        uniqueWordsSet.addWord("Jordan"); // "over wording" in set
        uniqueWordsSet.addWord("Florida");
        uniqueWordsSet.addWord("Guiana");
        uniqueWordsSet.addWord("South");
        uniqueWordsSet.addWord("Asia");
        uniqueWordsSet.addWord("China");
        uniqueWordsSet.addWord("Taiwan");
        uniqueWordsSet.addWord("Washington");

        System.out.println(uniqueWordsSet.showAllUniqueWords());
        uniqueWordsSet.removeWord("Washington");
        System.out.println(uniqueWordsSet.showAllUniqueWords());

        uniqueWordsSet.verifyWord("Washington");
        uniqueWordsSet.verifyWord("China");
    }
}
