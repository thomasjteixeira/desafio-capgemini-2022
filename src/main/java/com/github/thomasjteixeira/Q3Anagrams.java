package com.github.thomasjteixeira;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q3Anagrams {
    public static int numberOfAnagrams(String s) {
        int anagrams = 0;
        List<String> substringList = new ArrayList<>();
        for (int i = 0; i <= s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String substring = s.substring(i,j);
                substringList.add(substring);
            }
        }

        for (int i = 0; i < substringList.size(); i++) {
            for (int j = i + 1; j < substringList.size(); j++) {
                if(isAnagram(substringList.get(i), substringList.get(j))){
                    anagrams++;
                }
            }
        }
        return anagrams;
    }

    public static boolean isAnagram(String s1, String s2) {
        return sortString(s1).equals(sortString(s2));
    }

    public static String sortString(String s){
        char[] stringToChar = s.toCharArray();
        Arrays.sort(stringToChar);
        String sortedString = new String(stringToChar);
        return sortedString;
    }


}
