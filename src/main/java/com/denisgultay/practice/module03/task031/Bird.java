package com.denisgultay.practice.module03.task031;

public class Bird {


    public static final String I_AM = " I am walking\n" + " I am flying\n" + " I am singing\n" + " I am Bird\n";
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
            System.out.println(" I am " + name);
        }
        System.out.println(I_AM);
    }
}
