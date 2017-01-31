package com.biel.minicat.ge.game.character;

import com.biel.minicat.ge.Com;

/**
 * Created by Biel on 31/1/2017.
 */
public class Cooldown {
    private int remainingTicks;
    private int maxTicks;

    public double getMaxSeconds(){
        return Com.ticksToSeconds(maxTicks);
    }
    public double getRemainingSeconds(){
        return Com.ticksToSeconds(remainingTicks);
    }
}
