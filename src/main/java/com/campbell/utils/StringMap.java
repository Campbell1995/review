package com.campbell.utils;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Campbell
 * @date 2020/7/18
 */
public class StringMap {

    public static void main(String[] args) {
        System.out.println("请输入字符串");
        String line = new Scanner(System.in).nextLine();
        findChar(line);
    }

    public static void findChar(String line) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (!charMap.containsKey(c)) {
                charMap.put(c, 1);
            } else {
                int count = charMap.get(c);
                charMap.put(c, ++count);
            }
        }
        System.out.println(JSONObject.toJSONString(charMap));
    }
}
