package com.company;

public class Logic {

    public static boolean isPalindrome(String word){
        word = word.toLowerCase();
        int forward = 0;
        int backward = word.length()-1;
        while (forward < backward) {
            char forwardChar = word.charAt(forward++);
            char backwardChar = word.charAt(backward--);
            if (forwardChar != backwardChar) {
                return false;
            }
        }
        return true;
    }

}
