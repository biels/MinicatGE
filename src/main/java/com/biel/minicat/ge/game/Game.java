package com.biel.minicat.ge.game;

import com.biel.minicat.ge.game.controller.Controller;
import com.biel.minicat.ge.game.wincondition.WinCondition;

import java.util.List;

/**
 * Created by Biel on 31/1/2017.
 */
public class Game {
    //Players
    List<Player> players;
    List<Controller> controllers;
    WinCondition winCondition;
}
