package com.javarush.kaminsky.entity;

public abstract class Being {
    protected int health;
    protected int power;
    protected int speed;
    protected String view;

    public Being(int health, int power, int speed, String view) {
        this.health = health;
        this.power = power;
        this.speed = speed;
        this.view = view;
    }

    public String getView() {
        return view;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println(view + " умер.");
        }
    }

    public int getHealth() {
        return health;
    }
}
