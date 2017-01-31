package com.biel.minicat.ge.game.controller;

import com.biel.minicat.ge.game.Player;

/**
 * Created by Biel on 31/1/2017.
 */
public abstract class Controller {
    private Player player;

    public Controller(Player player) {
        this.player = player;
    }

    protected Player getPlayer() {
        return player;
    }
}
