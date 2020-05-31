package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Klilent klient1 = new Klilent("Kasia", "Kowalska", "1988-05-28");
        klient1.setHaslo("Mandarynki");
        Klilent klient2 = new Klilent("Basia", "Wolska", "1978-05-18");
        Klilent klient3 = new Klilent("Jadwiga", "Jedyna", "1989-05-15");
        Klilent[] tablicaKlientow = new Klilent[]{klient1, klient2, klient3};
        for (Klilent i : tablicaKlientow) {
            System.out.println("login to " + i.getLogin());
        }
        System.out.println("Wpisz swoj login :");
        String login = in.nextLine();
        // komentarz

        boolean loginIstnieje = false;
        for (int i = 0; i < tablicaKlientow.length; i++) {

            if (tablicaKlientow[i].getLogin().equals(login)) {
                loginIstnieje = true;
                if (tablicaKlientow[i].getHaslo() == null) {
                    System.out.println("Witaj " + tablicaKlientow[i].getImie() + " jesteś tu pierwszy raz wiec muszisz ustawic swoje haslo :))");
                    String haslo = in.nextLine();
                    System.out.println(" Dobrze, teraz potwierdz swoje haslo: ");
                    if (in.nextLine().equals(haslo)) {
                        tablicaKlientow[i].setHaslo(haslo);
                        System.out.println("Brawo udało Ci się ustawić hasło");
                    } else {
                        System.out.println("Podaj dwa takie same hasla, sprobuj ponownie");
                    }
                    break;
                } else {
                    System.out.println(" Podaj haslo: ");
                    String haslo = in.nextLine();
                    if (haslo.equals(tablicaKlientow[i].getHaslo())) {
                        System.out.println(" Witaj " + tablicaKlientow[i].getImie());
                    } else {
                        System.out.println("Niestety, bledne haslo, spróbuj jeszcze raz!");
                    }
                    break;
                }
            }
        }
        if (loginIstnieje == false) {
            System.out.println(" Nie ma takiej nazwy użytkownika");
        }
    }
}

