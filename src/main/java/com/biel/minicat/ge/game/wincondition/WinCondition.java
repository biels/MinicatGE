package com.biel.minicat.ge.game.wincondition;

import com.biel.minicat.ge.game.Game;

/**
 * Created by Biel on 31/1/2017.
 */
public abstract class WinCondition {
    private Game game;

    public WinCondition(Game game) {
        this.game = game;
    }

    protected Game getGame() {
        return game;
    }

    public abstract boolean check();
}
