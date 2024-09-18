package com.javarush.kaminsky.service;

import com.javarush.kaminsky.entity.Being;
import java.util.List;

public class BeingLifeCycle implements Runnable {
    private Being being;
    private IslandService islandService;
    private List<Being> beingsOnTheMap;

    public BeingLifeCycle(Being being, IslandService islandService, List<Being> beingsOnTheMap) {
        this.being = being;
        this.islandService = islandService;
        this.beingsOnTheMap = islandService.getBeingsOnTheMap();
    }

    @Override
    public void run() {
        try {
            while (!being.isAnimalDead()) {
                islandService.move(being);
                islandService.getHungry(being);
                islandService.eat(being);
                islandService.breed(being);
                if (being.isAnimalDead()) {
                    islandService.removeBeingFromCell(being, being.getX(), being.getY());
                    break;
                }

                islandService.displayIsland();
                if (islandService.onlyCarnivoresLeft(beingsOnTheMap)) {
                    System.out.println("На острове остались одни хищники!");
                    System.exit(0);
                }
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(being.getClass().getSimpleName() + " interrupted.");
            e.printStackTrace();
        }
    }
}
