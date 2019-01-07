/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watertankproject;

import java.util.ArrayList;

/**
 *
 * @author niroth
 */
public class ControlRoom {

    private ArrayList<WaterLevelObserver> observersList = new ArrayList<>();
    private int waterLevel;

    public void addWaterLevelObserver(WaterLevelObserver waterLevelObserver) {
        observersList.add(waterLevelObserver);
    }

    public void removeWaterLevelObserver(WaterLevelObserver waterLevelObserver) {
        observersList.remove(waterLevelObserver);
    }

    public void notifyObservers() {
        for (WaterLevelObserver waterLevelObserver : observersList) {
            waterLevelObserver.update(waterLevel);
        }
    }

    public void setWaterLevel(int waterLevel) {
        if (this.waterLevel != waterLevel) {
            this.waterLevel = waterLevel;
            notifyObservers();
        }
    }
}
