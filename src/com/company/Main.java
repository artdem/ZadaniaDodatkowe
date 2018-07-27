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

        System.out.println("Wpisane imiona to: ";

        for (Object i : nameList) {
            System.out.println(i);
        }
    }
}
