package com.model.company;

import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class Purchase {             // klasa reprezentuje zakup
    private Product product;        // produkt zakupiony
    private LocalDate purchaseDate; // data dokonania zakupu
    private double quantity;        // zakupiona ilość produktu
    private UNIT unit;              // jednostka zakupu (np. w gramach)
}
