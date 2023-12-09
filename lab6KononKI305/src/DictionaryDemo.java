public class DictionaryDemo {
    public static void main(String[] args) {
        WordDictionary<WordContainer> englishToUkrainianDictionary = new WordDictionary<>();
        WordDictionary<WordContainer> ukrainianToEnglishDictionary = new WordDictionary<>();

        DictionaryManager.initializeDictionaries(englishToUkrainianDictionary, ukrainianToEnglishDictionary);

        DictionaryManager.displayDictionaries(englishToUkrainianDictionary, "English to Ukrainian Dictionary");
        DictionaryManager.displayDictionaries(ukrainianToEnglishDictionary, "Ukrainian to English Dictionary");

        DictionaryManager.displayMaxElement(englishToUkrainianDictionary, "English to Ukrainian Dictionary");
        DictionaryManager.displayMaxElement(ukrainianToEnglishDictionary, "Ukrainian to English Dictionary");

        DictionaryManager.removeElements(englishToUkrainianDictionary, ukrainianToEnglishDictionary);

        DictionaryManager.displayDictionaries(englishToUkrainianDictionary, "English to Ukrainian Dictionary");
        DictionaryManager.displayDictionaries(ukrainianToEnglishDictionary, "Ukrainian to English Dictionary");

        DictionaryManager.addWordsFromInput(englishToUkrainianDictionary, "English", "Ukrainian");
        DictionaryManager.addWordsFromInput(ukrainianToEnglishDictionary, "Ukrainian", "English");

        DictionaryManager.displayDictionaries(englishToUkrainianDictionary, "Updated English to Ukrainian Dictionary");
        DictionaryManager.displayDictionaries(ukrainianToEnglishDictionary, "Updated Ukrainian to English Dictionary");
    }
}