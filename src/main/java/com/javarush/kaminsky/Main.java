package com.javarush.kaminsky;

import com.javarush.kaminsky.service.Island;
import com.javarush.kaminsky.service.IslandService;
import com.javarush.kaminsky.service.PrototypeFactory;

public class Main {
    public static void main(String[] args) {
        PrototypeFactory factory = new PrototypeFactory();
        Island island = new Island(10);
        IslandService islandService = new IslandService(factory, island);

        islandService.spawnBeings();
        islandService.displayIsland();
    }
}

