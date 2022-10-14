package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {


        if(sentence.length()==0)return new HashMap<>();

        sentence=sentence.replaceAll("[.,]","");
        String[] s = sentence.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String s1 : s) {
            map.merge(s1.toLowerCase(), 1, Integer::sum);
        }

        return map;
    }
}
