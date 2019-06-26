package com.model.day1.player;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Arcade { // arcade to maszyna do grania
    private String name; // nazwa maszyny
    private String city; // miasto
    private int gamesPlayed; //ilość rund rozegranych na maszynie. Jeśli wynik był słaby to nie musiał być zapisany na scoreList, dlatego rozmiary mogą się różnić
    private List<Score> scoreList; // lista wyników zarejestrowanych

}
