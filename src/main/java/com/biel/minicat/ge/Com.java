package com.biel.minicat.ge;

/**
 * Created by Biel on 31/1/2017.
 */
public class Com {
    public static final int TPS = 25;
    public static double ticksToSeconds(long ticks){
        return ticks / TPS;
    }
    public static long secondsToTicks(double seconds){
        return Math.round(seconds * TPS);
    }
}
