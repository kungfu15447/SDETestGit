/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerhash;

import java.util.HashMap;

/**
 *
 * @author Frederik Jensen
 */
public class WordCounter
{
    private HashMap<String, Integer> wordCounter;
    
    public WordCounter() {
        wordCounter = new HashMap<>();
    }
    
    private void addWord(String word) {
        wordCounter.put(word, 1);
    }
    
    private void incrementWordCount(String word) {
        int increment = wordCounter.get(word)+1;
        wordCounter.replace(word, increment);
    }
    
    public void countWordInText(String text) {
        String[] words = text.split("\\W+");
        for (String word : words) {
            if (wordCounter.containsKey(word)) {
                incrementWordCount(word);
            } else {
                addWord(word);
            }
        }
    }
    
    public HashMap<String, Integer> getWordCounter() {
        return wordCounter;
    }
    
    public void iterateWordCounter() {
        for (String string : wordCounter.keySet()) {
            System.out.println(string + " : " + wordCounter.get(string));
        }
    }
    
    public void clearWordCounter() {
        wordCounter.clear();
    }
}
