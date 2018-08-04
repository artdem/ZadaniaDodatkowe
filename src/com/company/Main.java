package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

////        Zadanie 10:
//        System.out.println("Zadanie 10:\n");
//
//        String name;
//        Scanner nameReader = new Scanner(System.in);
//
//        Set nameList = new HashSet();
//
//        do {
//            System.out.println("Podaj imię:");
//            name = nameReader.nextLine();
//            if (!name.equals("END")) {
//                nameList.add(name);
//            }
//        } while (!name.equals("END"));
//
//        System.out.println("\nLiczba wpisanych imion: " + nameList.size() + "\n");
//        if (nameList.size() > 0) {
//            System.out.println("Wpisane imiona to: ");
//        }
//
//        for (Object i : nameList) {
//            System.out.println(i);
//        }
//
////        Zadanie 11:
//        System.out.println("\nZadanie 11:\n");
//
//        String palindrome;
//        Scanner palindromeReader = new Scanner(System.in);
//        Set palindromeList = new HashSet();
//
//        do {
//            System.out.println("Wpisz palindrom:");
//            palindrome = palindromeReader.nextLine();
//            if (!palindrome.equals("END")) {
//                if (Logic.isPalindrome(palindrome) == true) {
//                    palindromeList.add(palindrome);
//                }
//            }
//        } while (!palindrome.equals("END"));
//
//        System.out.println("\nLiczba wpisanych prawidłowych palindromów: " + palindromeList.size() + "\n");
//        if (palindromeList.size() > 0) {
//            System.out.println("Wpisane prawidłowo palindromy to: ");
//        }
//
//        for (Object i : palindromeList) {
//            System.out.println(i);
//        }

//        Zadanie 2 (zajęcia):

        System.out.println("\nZadanie 2 (zajęcia:\n");

        List<Integer> liczbyZZakresu = new ArrayList<>(Arrays.asList(1, 23, 235, 412, 869, 12, 245, 532, 641, 11, 246, 225, 689, 978, 999, 840, 100));
        System.out.println("Liczby z listy:");
        for (int i : liczbyZZakresu){
            System.out.print(i + ", ");
        }

        System.out.println("\n\nLiczby z HashSet:");
        Set<Integer> liczbyHS = new HashSet<>();
        liczbyHS.addAll(liczbyZZakresu);

        for (int i : liczbyHS){
            System.out.print(i + ", ");
        }

        System.out.println("\n\nLiczby z TreeSet:");
        Set<Integer> liczbyTS = new TreeSet<>();
        liczbyTS.addAll(liczbyZZakresu);

        for (int i : liczbyTS){
            System.out.print(i + ", ");
        }

//        Zadanie 3 (zajęcia):

        System.out.println("Zadnie 3 (zajęcia): ");

        Book book1 = new Book("Book1 author", "Book1 Title", 100);
        Book book2 = new Book("Book2 author", "Book2 Title", 1400);
        Book book5 = new Book("Book5 author", "Book5 Title", 240);
        Book book3 = new Book("Book1 author", "Book1 Title", 100);
        Book book4 = new Book("Book4 author", "Book4 Title", 167);

        Set<Book> bookList = new HashSet<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book5);
        bookList.add(book3);
        bookList.add(book4);

        System.out.println("\nLista książek:");
        for (Book i : bookList) {
            System.out.println(i);
        }




    }
}
