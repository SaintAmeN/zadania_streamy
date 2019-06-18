package com.model.day2.coffeshop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Magazyn {
    // mapa dodatków, kluczem jest nazwa, wartością jest ilość.
    private Map<String, Double> dodatki = new HashMap<>();

    // mapa stanu magazynowego ziarenek kawy
    // kluczem jest nazwa typu ziarenek
    // dostępne klucze: znajdują się w enumie
    private Map<CoffeeBeanType, Double> kawa = new HashMap<>();

    public Magazyn() {
        // tutaj tworzę inicjalną mapę wszystkich dostępnych ziarenek.
        for (CoffeeBeanType coffeBeanType : CoffeeBeanType.values()) {
            kawa.put(coffeBeanType, 0.0);
        }
    }

    public void zasilStanMagazynowy(String nazwa, double ilosc) {
        // todo: implementacja metody która dodaje ilość
        //  pod zmienną 'nazwa' może się znajdować nazwa dodatku lub kawy.
    }

    public Optional<Double> sprawdzStanMagazynowyDodatku(String nazwa) {
        // todo: implementacja - zwraca ilość danego produktu
        //  jeśli podanego produktu nie ma w żadnym stanie magazynowym, to zwróć jego brak (empty)
        return null;
    }

    public boolean czyStarczySkladnikowNaKawe(CoffeeType coffeType) {
        // todo: implementacja
        return false;
    }

    public List<CoffeeAddition> podajListeBrakujacychSkladnikow(CoffeeType coffeType) {
        // todo: metoda zwraca listę składników ktorych brakuje do stworzenia kawy.
        return null;
    }

    public Coffee zróbKawę(CoffeeType coffeType, CoffeeBeanType coffeBeanType) {
        // todo: implementacja. powinna tworzyć obiekt Coffee i go zwracać. Jeśli nie udaje się 
        //  zrobić kawy z jakiegoś względu to rzucamy exception (patrz katalog exceptions)
        //  PAMIĘTAJ by zredukować ilość ziaren i dodatków po zrobieniu kawy!!
        return null;
    }

    public List<CoffeeType> zwróćWszystkieDostepneKawy() {
        // todo: zwracamy kawy które są dostępne (całą kolekcję dostępnych w ofercie)
        return null;
    }

    public List<CoffeeType> zwrocTeKawyKtoreMoznaZrobic() {
        // todo: zwracamy listę tych kaw które można zrobić ze składników które posiadamy
        return null;
    }

    public Double zwrocIloscZiaren(CoffeeBeanType coffeeBeanType) {
        // todo:
        return null;
    }

    public Double zwrocIloscDodatku(String nazwa) {
        // todo:
        return null;
    }

    public void zwrocWszystkieKombinacjeWszystkichDostepnychKaw() {
        // todo: czyli zwracamy listę np. americano mozna zrobic na 9 sposobów, bo można zrobić z 0 typów ziarenek.
        //  metoda ma wypisywać wszystkie typy:
    }

    public void wypiszStanDodatków() {
        // todo: wypisz je na ekran w przejrzystej formie
    }

    public void wypiszStanZiaren() {
        // todo: wypisz je na ekran w przejrzystej formie
    }
}
