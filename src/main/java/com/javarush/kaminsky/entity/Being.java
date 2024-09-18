package com.javarush.kaminsky.entity;

public abstract class Being {
    protected double health;
    protected int quantity;
    protected int speed;
    protected double food;
    protected String view;
    protected int x;
    protected int y;
    private boolean isDead = false;

    public Being(double health, int quantity, int speed, double food, String view) {
        this.health = health;
        this.quantity = quantity;
        this.speed = speed;
        this.food = food;
        this.view = view;
    }

    public String getView() {
        return view;
    }

    public void takeDamage() {
        double damage = health / 10;
        health -= damage;
        System.out.println("Здоровье: " + health);

        if (health < 1) {
            isDead = true;
            System.out.println(view + " умер.");
        }
    }

    public void restoreHealth(double consumedFood) {
        health += (consumedFood / food) * health;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isAnimalDead() {
        return isDead;
    }

    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getHealth() {
        return health;
    }
}
