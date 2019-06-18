package com.model.day1.game;

public class Main {
    public static void main(String[] args) {
        // Stwórz grę do "poruszania się po ekranie"
        // W grze stwórz pętlę. Użytkownik jest kwadracikiem na ekranie:
        //
        // #####################
        // #                   #
        // #                   #
        // #                   #
        // #                   #
        // #           O       #
        // #                   #
        // #                   #
        // #                   #
        // #                   #
        // #####################

        // Użytkownik na początek podaje wielkość planszy. Po podaniu wielkości na ekranie rysuje się plansza o zadanej wielkości.
        // Użytkownik może poruszać się po stworzonej planszy.
        //
        // Po podaniu wielkości co każdy obieg na ekran powinna być drukowana plansza
        // Po wydrukowaniu planszy użytkownik może podać komendy do poruszania się:
        // góra
        // dół
        // lewo
        // prawo
        //
        // Po podaniu komendy literka powinna zmienić pozycje zgodnie z zadanym kierunkiem.
        // Jeśli użytkownik dotarł do granicy, to nie powinieneś pozwolić mu pójść dalej.
        // W tej sytuacji rzuć wyjątek (ale nie zabijaj aplikacji)
        //
        // Do implementacji POSTARAJ SIĘ użyć klasy Gracz i Plansza. (jeśli wiesz jak zaimplementować grę z użyciem tych klas)
        // jeśli nie, postaraj się rozwiązać zadanie na swój sposób. (Ważny jest efekt końcowy)
        //
        // *Dodatkowe rozwinięcie:
        // Jeśli użytkownik wpisze komendę "Zmień" może podać literkę do zmiany. Np.: Zmień X co powinno sprawić zmianę w znaku którym się porusza, czyli
        // od teraz użytkownik nie porusza się literką O, tylko literką X.
        //
        // #####################
        // #                   #
        // #                   #
        // #                   #
        // #                   #
        // #           X       #
        // #                   #
        // #                   #
        // #                   #
        // #                   #
        // #####################
        //
        // ** Dodatkowe rozwinięcie (wymaga wcześniej zrobienia rozwinięcia 1).
        // Jeśli użytkownik wpisze komendę "Zamaluj" lub "Wymaż" to powinien móc zarysowywać pola na planszy. Zamalowane
        // pola powinny mieć od tego momentu wpisaną literkę którą użytkownik miał ustawioną. Np.

        // #####################
        // #                   #
        // #       XX          #
        // #                   #
        // #                   #
        // #         XXX       #
        // #                   #
        // #                   #
        // #                   #
        // #                   #
        // #####################

        // Powyżej użytkownik znajduje się na jednej z zamalowanych pozycji, i używa literki X. Jeśli zmieni literkę komendą
        // Zmień W
        // To powinien być wyrysowany na znakach:
        // #####################
        // #                   #
        // #       XW          #
        // #                   #
        // #                   #
        // #         XXX       #
        // #                   #
        // #                   #
        // #                   #
        // #                   #
        // #####################

        // Dodatkowe rozwinięcie***:
        // stwórz mechanizm zapisu. Zapisuj planszę do pliku o nazwie "zapisane_X_Y.txt" <- Gdzie X oraz Y to rozmiar planszy (zawsze jest prostokątem).
        // komendy można użyć w dowolnym momencie GRY. jeśli plik istnieje to zostaje zastąpiony.

        // Dodatkowe rozwinięcie****:
        // stwórz mechanizm wczytywania stanu gry. Stan gry może być wczytany tylko na początku aplikacji ZANIM PODANE BĘDĄ ROZMIARY PLANSZY.
        // Aplikacja pyta o rozmiar planszy i w tym momencie powinniśmy móc załadować planszę. Opracowanie komendy/sposobu przyjęcia polecenia wczytania należy do użytkownika.

    }
}
