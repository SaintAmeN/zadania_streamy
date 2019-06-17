package com.model.player;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Score {
    private String playerName;
    private int score;
    private Game game;
    private long gameTime;
}
