import java.util.Scanner;

public class DictionaryManager {
    public static void initializeDictionaries(WordDictionary<WordContainer> engToUkrDictionary,
                                              WordDictionary<WordContainer> ukrToEngDictionary) {
        engToUkrDictionary.addElement(new WordContainer("apple", "яблуко"));
        engToUkrDictionary.addElement(new WordContainer("banana", "банан"));
        engToUkrDictionary.addElement(new WordContainer("orange", "апельсин"));

        ukrToEngDictionary.addElement(new WordContainer("яблуко", "apple"));
        ukrToEngDictionary.addElement(new WordContainer("банан", "banana"));
        ukrToEngDictionary.addElement(new WordContainer("апельсин", "orange"));
    }

    public static void displayDictionaries(WordDictionary<WordContainer> dictionary, String dictionaryName) {
        System.out.println(dictionaryName + ": " + dictionary.getElements());
    }

    public static void displayMaxElement(WordDictionary<WordContainer> dictionary, String dictionaryName) {
        WordContainer maxElement = dictionary.getMaxElement();
        System.out.println("Max element in " + dictionaryName + ": " + maxElement);
    }

    public static void removeElements(WordDictionary<WordContainer> engToUkrDictionary,
                                      WordDictionary<WordContainer> ukrToEngDictionary) {
        engToUkrDictionary.removeElement(new WordContainer("banana", "банан"));
        ukrToEngDictionary.removeElement(new WordContainer("банан", "banana"));
        System.out.println("After removing elements:");
    }

    public static void addWordsFromInput(WordDictionary<WordContainer> dictionary, String fromLanguage, String toLanguage) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word in " + fromLanguage + ":");
        String word = scanner.nextLine();

        System.out.println("Enter the translation in " + toLanguage + ":");
        String translation = scanner.nextLine();

        WordContainer newWord = new WordContainer(word, translation);
        dictionary.addElement(newWord);

        System.out.println("Word added to the dictionary: " + newWord);
    }
}

