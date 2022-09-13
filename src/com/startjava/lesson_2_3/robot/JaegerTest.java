package com.startjava.lesson_2_3.robot;

public class JaegerTest {

    public static void main(String[] args) {
        System.out.println("\n###Battle with kaiju###\n");
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Crimson Typhoon");
        jaeger1.setWeapon("IB22 Plasmacaster");
        jaeger1.setPowerMove("Jet Kick");
        jaeger1.setArmor(6);
        jaeger1.setPower(98.6F);
        jaeger1.setAmmo(20);

        jaeger1.move();
        System.out.println(jaeger1.getPowerMove());
        jaeger1.setPower(86.3F);
        System.out.println(jaeger1.getModelName() + " power level: " + jaeger1.getPower() + " %");

        jaeger1.strike();
        System.out.println(jaeger1.getWeapon());
        jaeger1.setAmmo(17);
        System.out.println(jaeger1.getModelName() + " ammo level: " + jaeger1.getAmmo() + " units");

        System.out.println(jaeger1.getModelName() + " is hit by kaiju");
        System.out.println(jaeger1.getModelName() + " armor level: " + jaeger1.getArmor() +
                " units");

        Jaeger jaeger2 = new Jaeger("Striker Eureka", "Assault Mount 3.25 \"Sting-Blades\"",
                "Six Shooter", 9, 76.4F, 10);
        System.out.println("\nThe second jaeger - " + jaeger2.getModelName() +
                ", joins the battle\n");

        jaeger2.move();
        System.out.println(jaeger2.getPowerMove());
        jaeger2.setPower(63.5F);
        System.out.println(jaeger2.getModelName() + " power level: " + jaeger2.getPower() + " %");

        jaeger2.strike();
        System.out.println(jaeger2.getWeapon());
        jaeger2.setAmmo(6);
        System.out.println(jaeger2.getModelName() + " ammo level: " + jaeger2.getAmmo() + " units");

        System.out.println("\nKaiju bites " + jaeger1.getModelName());
        jaeger1.setArmor(0);
        System.out.println(jaeger1.getModelName() + " armor level: " + jaeger1.getArmor() +
                " units");
        jaeger1.setAlive(false);
        System.out.println(jaeger1.getModelName() + " alive status: " + jaeger1.isAlive());
        System.out.println();

        jaeger2.setWeapon("WMB2x90 AKM Chest launcher");
        jaeger2.strike();
        System.out.println(jaeger2.getWeapon());
        System.out.println("Kaiju is killed by " + jaeger2.getModelName());
    }
}