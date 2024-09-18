package com.javarush.kaminsky;

import com.javarush.kaminsky.entity.Being;
import com.javarush.kaminsky.entity.carnivores.*;
import com.javarush.kaminsky.entity.herbivores.*;
import com.javarush.kaminsky.entity.plants.Plant;
import com.javarush.kaminsky.service.Island;
import com.javarush.kaminsky.service.IslandService;
import com.javarush.kaminsky.service.PrototypeFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        PrototypeFactory prototypeFactory = new PrototypeFactory();
        Island island = new Island(10);
        ExecutorService threadPool = Executors.newFixedThreadPool(20);
        IslandService islandService = new IslandService(prototypeFactory, island, threadPool);
        List<Being> beingsOnTheMap = islandService.getBeingsOnTheMap();

        Class<? extends Being>[] beingClasses = new Class[]{
                Wolf.class, Eagle.class, Fox.class, Snake.class, Bear.class,
                Boar.class, Buffalo.class, Caterpillar.class, Caterpillar.class,
                Deer.class, Deer.class,  Deer.class,  Duck.class, Duck.class, Goat.class,
                Deer.class, Deer.class,  Deer.class,  Duck.class, Duck.class, Goat.class,
                Goat.class, Hare.class, Hare.class, Mouse.class, Mouse.class,
                Deer.class, Deer.class,  Deer.class,  Duck.class, Duck.class, Goat.class,
                Goat.class, Hare.class, Hare.class, Mouse.class, Mouse.class,
                Goat.class, Hare.class, Hare.class, Mouse.class, Mouse.class,
                Sheep.class, Sheep.class, Plant.class, Plant.class,
                Sheep.class, Sheep.class, Plant.class, Plant.class
        };

        for (Class<? extends Being> beingClass : beingClasses) {
            beingsOnTheMap.add(prototypeFactory.getPrototype(beingClass));
        }

        for (Being being : beingsOnTheMap) {
            threadPool.execute(islandService.comeAlive(being));
        }

        threadPool.shutdown();
        try {
            if (!threadPool.awaitTermination(480, java.util.concurrent.TimeUnit.SECONDS)) {
                System.out.println("Прошло 480 секунд, симуляция завершается!");
                threadPool.shutdownNow();
            }
        } catch (InterruptedException e) {
            threadPool.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}
