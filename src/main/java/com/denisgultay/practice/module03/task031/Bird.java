package com.denisgultay.practice.module03.task031;

public class Bird {

    private String line1 = "I am walking";
    private String line2 = "I am flying";
    private String line3 = "I am singing";
    private String line4 = "I am Bird";

    private String name;

    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.someoneSing();

        Bird birdGovorun = new Bird("Govorun");
        birdGovorun.someoneSing();

    }

    public Bird() {
    }

    public Bird(String name) {
        this.name = name;
    }

    public void someoneSing() {

        if (name != null) {
            System.out.println("I am " + name);
        }
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
    }
}
