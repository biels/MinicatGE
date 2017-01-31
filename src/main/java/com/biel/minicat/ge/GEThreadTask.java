package com.biel.minicat.ge;

/**
 * Task executed by GEThread
 */
public class GEThreadTask implements Runnable {
    private long lastLoopTime = System.nanoTime();
    private final int TARGET_TPS = 60;
    private final long OPTIMAL_TIME = 1000000000 / TARGET_TPS;
    private long tpsSecondCounter;
    private int tps;
    private boolean running = true;
    @Override
    public void run() {
        while (running){
            long now = System.nanoTime();
            long updateLength = now - lastLoopTime;
            lastLoopTime = now;
            double sigma = updateLength / ((double)OPTIMAL_TIME);
            double delta = 1D/updateLength;
            //TPS Counter
            tpsSecondCounter += updateLength;
            tps++;
            if(tpsSecondCounter >= 10e9){
                //Every second
                tpsSecondCounter = 0;
                tps = 0;
            }

            //Execute logic
            tick(delta);

            //Interpolate time
            try {
                double waitTime = (lastLoopTime - System.nanoTime() + OPTIMAL_TIME) / 10e6;
                Thread.sleep((long) waitTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
    private void tick(double delta){

    }
    synchronized public void stop(){
        running = false;
    }
}
