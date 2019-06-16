package com.model;

import java.util.List;

public class Company {
    private String name;
    private String cityHeadquarters;
    private int employees;
    private List<Purchase> purchaseList;
}

// Polecenie 1:
// Wszystkie rozwiązania zapisz w oddzielnych metodach statycznych w klasie Main.
// 1. Wylistuj (system out println) wszystkie firmy
// 2. Wylistuj wszystkie firmy które są z Detroit
// 3. Wylistuj wszystkie firmy z Londynu, posortuj je po ilości pracowników (rosnąco).
// 4. Wylistuj wszystkie firmy z Warszawy. Posortuj je po ilości zakupów (rosnąco) i ilości pracowników (malejąco).
// 5. Zwróć firmę z największą ilością pracowników, która pochodzi z Kijowa.
// 6. Zwróć firmę z najkrótszą nazwą
// 7. Zwróć firmę która nie pochodzi z Kijowa, Londynu i Detroit, która ma najmniej kupionych produktów.
// 8. Każdej firmie dodaj po 1 pracowniku, jeśli pochodzi z Kijowa lub Detroit
// 9.