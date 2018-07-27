package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

//        Zadanie 10:
        System.out.println("Zadanie 10:\n");

        String name;
        Scanner nameReader = new Scanner(System.in);

        Set nameList = new HashSet();

        do {
            System.out.println("Podaj imię:");
            name = nameReader.nextLine();
            if (!name.equals("END")) {
                nameList.add(name);
            }
        } while (!name.equals("END"));

        System.out.println("\nLiczba wpisanych imion: " + nameList.size() + "\n");
        if (nameList.size()>0) {
            System.out.println("Wpisane imiona to: ");
        }

        for (Object i : nameList) {
            System.out.println(i);
        }

//        Zadanie 11:
        System.out.println("\nZadanie 11:\n");

        String palindrome;
        Scanner palindromeReader = new Scanner(System.in);
        Set palindromeList = new HashSet();

        do {
            System.out.println("Wpisz palindrom:");
            palindrome = palindromeReader.nextLine();
            if (!palindrome.equals("END")){
                if (Logic.isPalindrome(palindrome) == true){
                    palindromeList.add(palindrome);
                }
            }
        }while (!palindrome.equals("END"));

        System.out.println("\nLiczba wpisanych prawidłowych palindromów: " + palindromeList.size() + "\n");
        if (palindromeList.size()>0) {
            System.out.println("Wpisane prawidłowo palindromy to: ");
        }

        for (Object i : palindromeList) {
            System.out.println(i);
        }



    }
}
