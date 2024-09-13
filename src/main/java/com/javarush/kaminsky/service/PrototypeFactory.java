package com.javarush.kaminsky.service;

import com.javarush.kaminsky.entity.*;
import com.javarush.kaminsky.entity.carnivores.*;
import com.javarush.kaminsky.entity.herbivores.*;
import com.javarush.kaminsky.entity.plants.Plant;

import java.util.*;

public class PrototypeFactory {
    private static final Set<Class<? extends Being>> TYPES;
    private static final Map<Class<? extends Being>, Being> PROTOTYPES;

    static {
        PROTOTYPES = new HashMap<>();
        TYPES = new HashSet<>();

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
        if (PROTOTYPES.containsKey(type)) {
            return PROTOTYPES.get(type);
        }

        Being being = createPrototype(type);
        return being;
    }

    public Collection<Being> getPrototypes() {
        return PROTOTYPES.values();
    }

    public Map<Class<? extends Being>, Being> getPrototypesMap() {
        return PROTOTYPES;
    }

    private static void init() {
        for (Class<? extends Being> type : TYPES) {
            Being being = createPrototype(type);
            PROTOTYPES.put(type, being);
        }
    }

    private static Being createPrototype(Class<? extends Being> type) {
        return loadObject(type);
    }

    private static Being loadObject(Class<? extends Being> type) {
        Being being;
    }
}
