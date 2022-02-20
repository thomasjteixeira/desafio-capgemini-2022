package com.github.thomasjteixeira;

import org.junit.Assert;
import org.junit.Test;

public class Q3Anagrama {

    @Test
    public void NumberOfAnagramsInTheSubstring(){
        int anagrams = Anagrams.numberOfAnagrams("abba");
        Assert.assertEquals(4, anagrams);
    }
}
