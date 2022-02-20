package com.github.thomasjteixeira;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestQ3Anagrams {

    @Test
    public void NumberOfAnagramsInTheSubstringTest1(){
        int anagrams = Q3Anagrams.numberOfAnagrams("ovo");
        assertEquals(2, anagrams);
    }

    @Test
    public void NumberOfAnagramsInTheSubstringTest2(){
        int anagrams = Q3Anagrams.numberOfAnagrams("ifailuhkqq");
        assertEquals(3, anagrams);
    }

    @Test
    public void NumberOfAnagramsInTheSubstringTest3(){
        int anagrams = Q3Anagrams.numberOfAnagrams("abcd");
        assertEquals(0, anagrams);
    }

    @Test
    public void isAnagram(){
        assertTrue(Q3Anagrams.isAnagram("ovo","oov"));
    }

    @Test
    public void isNotAnagram(){
        assertFalse(Q3Anagrams.isAnagram("ovo","ovi"));
    }
}
