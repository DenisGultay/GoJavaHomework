package com.denisgultay.practice.module03.task031;

public class Bird {

    enum IAmDoingSomething {walking, flying, singing, Bird}

    public static final String I_AM = "I am ";
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
        System.out.println(I_AM + IAmDoingSomething.walking);
        System.out.println(I_AM + IAmDoingSomething.flying);
        System.out.println(I_AM + IAmDoingSomething.singing);
        System.out.println(I_AM + IAmDoingSomething.Bird);
    }
}
