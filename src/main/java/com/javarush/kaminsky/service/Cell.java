package com.javarush.kaminsky.service;

import com.javarush.kaminsky.entity.Being;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    private List<Being> beings = new ArrayList<>();

    public void addBeing(Being being) {
        beings.add(being);
    }

    public void removeBeing(Being being) {
        beings.remove(being);
    }

    public List<Being> getBeings() {
        return beings;
    }

    public String getView() {
        if (beings.isEmpty()) {
            return "🏔️";
        } else {
            StringBuilder viewBuilder = new StringBuilder();
            for (Being being : beings) {
                viewBuilder.append(being.getView());
            }
            return viewBuilder.toString();
        }
    }
}
