package com.javarush.kaminsky.service;

import com.javarush.kaminsky.entity.Being;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AnimalFactory {
    private static final Set<Class<? extends Being>> TYPES;
    private static final Map<Class<? extends Being>, Being> PROTOTYPES;

    static {
        PROTOTYPES = new HashMap<>();
        TYPES = new HashSet<>();

        TYPES.add()
    }
}
