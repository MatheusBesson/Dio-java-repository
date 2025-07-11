import java.util.HashSet;
import java.util.Set;

public class UniqueWordsSet {
    Set<String> uniqueWordsSet;

    public UniqueWordsSet() {
        this.uniqueWordsSet = new HashSet<>();
    }

    public void addWord(String word) {
        uniqueWordsSet.add(word);
        System.out.println("Word " + word + " added to the set. \n");
    }

    public void removeWord(String word) {
        String trimWord = word.trim();
        if(!uniqueWordsSet.isEmpty()) {
            for(String s: uniqueWordsSet) {
                if(s.trim().equalsIgnoreCase(trimWord)) {
                    uniqueWordsSet.remove(s);
                    System.out.println("Word " + s + " removed from the set.\n");
                    break;
                }
            }
        }
    }

    public void verifyWord(String word) {
        String trimWord = word.trim();
     //   uniqueWordsSet.contains(trimWord);
        boolean flag = false;
        for(String s: uniqueWordsSet) {
            if(s.trim().equalsIgnoreCase(trimWord)) {
                System.out.println("Word " + word + " found.\n");
                flag = true;
            }
        }
        if(!flag) {
            System.out.println("Word doesn't exist in the set.\n");
        }
    }

    public String showAllUniqueWords() {
       return uniqueWordsSet.toString();
    }


}
