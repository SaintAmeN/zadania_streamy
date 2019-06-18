package com.model.day2.coffeshop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean czyPracowacDalej = true;

        String komenda;
        do{
            System.out.println("Co chcesz dalej zrobić?");
            komenda = scanner.nextLine();

            if(komenda.equalsIgnoreCase("quit")){
                czyPracowacDalej = false;
            }

            if(komenda.equalsIgnoreCase("dodaj")){
                // todo: dodaj stan magazynowy
            }
            // todo: w ten sam sposób zaimplementuj polecenia komend dla wszystkich pozostałych
            //  metod w klasie magazyn.
            //  Wszystkie metody muszą mieć możliwość bycia wywołanym jakąś komendą.


        }while (czyPracowacDalej);

        System.out.println("Kończę pracę.");
    }
}
