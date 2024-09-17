package com.javarush.kaminsky.entity;

public abstract class Being {
    protected int health;
    protected int quantity;
    protected int speed;
    protected double food;
    protected String view;

    public Being(int health, int quantity, int speed, double food, String view) {
        this.health = health;
        this.quantity = quantity;
        this.speed = speed;
        this.food = food;
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
