
package de.hsbo.fbg.kswe.exceptionhandling.words;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class TextAnalyzer {

    public TextAnalyzer() {
    }

    public String findLongestWord(String text) {
        String longest = "";
        String[] array = text.split(" ");
        for(String current:array){
            if(current.length()>longest.length()){
                longest=current;
            }
        }
        return longest;
    }

}
