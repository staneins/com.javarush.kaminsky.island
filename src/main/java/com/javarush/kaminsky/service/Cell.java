package com.javarush.kaminsky.service;

import com.javarush.kaminsky.entity.Being;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    private final List<Being> beings = new ArrayList<>();

    public void addBeing(Being being) {
        beings.add(being);
    }

    public void removeBeing(Being being) {
        beings.remove(being);
    }


    public String getView() {
        if (beings.isEmpty()) {
            return "🌱";
        } else {
            return beings.get(0).getView();
        }
    }
}
