package com.model.day2.modelowanie;

public class Main {
    public static void main(String[] args) {
        // TODO: Twoim zadaniem jest zaimplementowanie systemu z którego będzie korzystać salon fryzjerski
        //  Salon przyjmuje klientów na umówioną porę. Każdy klient musi zostawić imie i numer telefonu by się umówić.
        //
        //  Fryzjer powinien mieć możliwość:
        //      -- dodania wizyty (zapisania) Przy zapisie musi być dodana informacja na jaką godzinę, kto (imie + numer), co chce zrobić (może być enum z listą wszystkich usług fryzjera)
        //      -- zrealizowania wizyty (czyli odchaczenia jako wykonanej) - przy realizowaniu fryzjer może zaznaczyć ile skasował klienta.
        //      -- odchaczenia wizyty jako nie zrealizowanej bo ktoś się nie pojawił :( (ktoś może zapomniał o wizycie)
        //      -- anulowania wizyty (czyli usunięcie wpisu)
        //      -- listowania wizyt
        //      -- wypisywania jakie usługi są dostępne u fryzjera
        //      -- sprawdzania czy wizyta jest aktualna (czy dana osoba posiada wizytę) - tutaj musimy podać dokładną datę i godzinę i imie, a następnie sprawdzamy czy dana osoba miała wizytę.
        //              Zastanów się co zrobić jeśli wizyta jest np. 15 min później. Może ta osoba się pomyliła. Zwróć w tym wypadku poprawną datę i godzinę wizyty która rzeczywiście była umówiona.
        //              Np. jeśli wizyta jest na godzinę 15:00 w 10.05.2019, a ktoś podał inną datę to wylistuj rzeczywiste daty i godziny wizyt tej osoby.
        //      -- podliczania zrealizowanych wizyt. Jeśli przy wizycie było napisane że jest zrealizowana i że fryzjer potrącił klienta na jakąś kwotę,
        //              To powinna istnieć metoda która sumuje wszystkie kwoty za wizyty i zwraca sumę.
        //      -- podliczania ilości wizyt anulowanych
        //      -- podliczania ilości wizyt nie zrealizowanych ponieważ klient się nie pojawił.


        // UWAGI!:
        // - zakładamy że przy dodawaniu/realizowaniu itp. musimy podawać daty i godziny wizyt.
        // - można odchaczyć/dodawać/usuwać itp. wizyty sprzed 10 lat itd. czyli nie ma mechanizmu sprawdzającego poprawność dat.
        // - wszelkie pytania śmiało piszcie :)

    }
}
