package com.biel.minicat.ge;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Biel on 31/1/2017.
 */
public class MinicatGEPlugin extends JavaPlugin {
    Thread geThread;
    private GEThreadTask geThreadTask;

    @Override
    public void onEnable() {
        super.onEnable();
        startGEThread();
    }

    @Override
    public void onLoad() {
        super.onLoad();
    }

    @Override
    public void onDisable() {
        super.onDisable();
        geThreadTask.stop();
        Bukkit.getLogger().info("Game Engine thread stopped");
    }

    public void startGEThread(){
        geThreadTask = new GEThreadTask();
        geThread = new Thread(geThreadTask);
        geThread.setName("Thread-GE");
        geThread.start();
        Bukkit.getLogger().info("Game Engine thread started");
    }
}
