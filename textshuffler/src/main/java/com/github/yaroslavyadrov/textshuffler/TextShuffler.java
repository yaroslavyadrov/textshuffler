package com.github.yaroslavyadrov.textshuffler;


import java.util.ArrayList;
import java.util.List;

/**
 * That class just shuffle your string and gives back
 * **/

public class TextShuffler {
    public static String shuffle(String input){
        List<Character> characters = new ArrayList<Character>();
        for(char c:input.toCharArray()){
            characters.add(c);
        }
        StringBuilder output = new StringBuilder(input.length());
        while(characters.size()!=0){
            int randPicker = (int)(Math.random()*characters.size());
            output.append(characters.remove(randPicker));
        }
        return output.toString();
    }

}
