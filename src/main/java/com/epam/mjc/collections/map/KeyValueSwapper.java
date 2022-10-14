package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {


        HashMap<String, Integer> map = new HashMap<>();


        for (Map.Entry<Integer, String> integerStringEntry : sourceMap.entrySet()) {

            if (map.containsKey(integerStringEntry.getValue())) {

                if (map.get(integerStringEntry.getValue()) > integerStringEntry.getKey()) {
                    map.put(integerStringEntry.getValue(), integerStringEntry.getKey());
                }


            } else {
                map.put(integerStringEntry.getValue(), integerStringEntry.getKey());
            }
        }

        return map;

    }
}
