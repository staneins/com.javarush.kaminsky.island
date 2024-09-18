package com.javarush.kaminsky.service;

import com.javarush.kaminsky.entity.*;
import com.javarush.kaminsky.entity.carnivores.*;
import com.javarush.kaminsky.entity.herbivores.*;
import com.javarush.kaminsky.entity.plants.Plant;

import java.util.*;

public class PrototypeFactory {
    private static final Set<Class<? extends Being>> TYPES = new HashSet<>();
    private static final Map<Class<? extends Being>, Being> PROTOTYPES = new HashMap<>();

    static {
        TYPES.add(Bear.class);
        TYPES.add(Eagle.class);
        TYPES.add(Fox.class);
        TYPES.add(Snake.class);
        TYPES.add(Wolf.class);
        TYPES.add(Boar.class);
        TYPES.add(Buffalo.class);
        TYPES.add(Caterpillar.class);
        TYPES.add(Deer.class);
        TYPES.add(Duck.class);
        TYPES.add(Goat.class);
        TYPES.add(Horse.class);
        TYPES.add(Hare.class);
        TYPES.add(Mouse.class);
        TYPES.add(Sheep.class);
        TYPES.add(Plant.class);
        init();
    }

    public Being getPrototype(Class<? extends Being> type) {
        return PROTOTYPES.get(type);
    }

    private static void init() {
        for (Class<? extends Being> type : TYPES) {
            Being being = createPrototype(type);
            PROTOTYPES.put(type, being);
        }
    }

    private static Being createPrototype(Class<? extends Being> type) {
        return switch (type.getSimpleName()) {
            case "Bear" -> new Bear(500, 5, 2, 80, "\uD83D\uDC3B");
            case "Eagle" -> new Eagle(6, 20, 3, 1, "🦅");
            case "Fox" -> new Fox(8, 30, 2, 2, "🦊");
            case "Snake" -> new Snake(15, 30, 1, 3, "🐍");
            case "Wolf" -> new Wolf(50, 15, 3, 8, "🐺");
            case "Boar" -> new Boar(400, 50, 2, 50, "🐗");
            case "Buffalo" -> new Buffalo(700, 10, 3, 100, "🐃");
            case "Caterpillar" -> new Caterpillar(0.01, 1000, 0, 0, "🐛");
            case "Deer" -> new Deer(300, 20, 4, 50, "🦌");
            case "Duck" -> new Duck(1, 200, 4, 0.15, "🦆");
            case "Goat" -> new Goat(60, 140, 3, 10, "🐐");
            case "Hare" -> new Hare(2, 150, 2, 0.45, "🐇");
            case "Horse" -> new Horse(400, 20, 4, 60, "🐎");
            case "Mouse" -> new Mouse(0.05, 500, 1, 0.01, "🐁");
            case "Sheep" -> new Sheep(70, 140, 3, 15, "🐑");
            case "Plant" -> new Plant(1, 200, 0, 0, "🌿");
            default -> throw new IllegalArgumentException("Неизвестное существо: " + type.getSimpleName());
        };
    }

    }

