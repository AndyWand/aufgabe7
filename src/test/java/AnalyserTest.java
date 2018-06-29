/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import de.hsbo.fbg.kswe.exceptionhandling.words.TextAnalyzer;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Andreas Wandert
 */
public class AnalyserTest {

    @Test
    public void analyser_test() {
        String text = "lore ipsum dolore";
        TextAnalyzer a = new TextAnalyzer();
        Assert.assertEquals("dolore", a.findLongestWord(text));
    }
}
