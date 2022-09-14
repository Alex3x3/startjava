package com.startjava.lesson_2_3_4.robot;

public class Jaeger {

    private String modelName;
    private String weapon;
    private String powerMove;
    private int armor;
    private float power;
    private int ammo;
    private boolean alive;

    public Jaeger() {
        alive = true;
    }

    public Jaeger(String modelName, String weapon, String powerMove,
                  int armor, float power, int ammo) {
        this.modelName = modelName;
        this.weapon = weapon;
        this.powerMove = powerMove;
        this.armor = armor;
        this.power = power;
        this.ammo = ammo;
        alive = true;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getPowerMove() {
        return powerMove;
    }

    public void setPowerMove(String powerMove) {
        this.powerMove = powerMove;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        if (armor >= 0) {
            this.armor = armor;
        }
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        if (power >= 0) {
            this.power = power;
        }
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        if (ammo >= 0) {
            this.ammo = ammo;
        }
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        if (this.alive) {
            this.alive = alive;
        }
    }

    public void move() {
        System.out.print(modelName + " makes a powermove: ");
    }

    public void strike() {
        System.out.print(modelName + " strikes kaiju with ");
    }
}