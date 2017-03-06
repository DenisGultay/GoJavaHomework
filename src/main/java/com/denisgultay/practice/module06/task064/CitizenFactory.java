package com.denisgultay.practice.module06.task064;

public class CitizenFactory {


    private static class Englishman implements Citizen {
        public Englishman() {
        }

        public String sayHello() {
            return "Hello!!!";
        }
    }

    private static class Chinese implements Citizen {
        public Chinese() {
        }

        public String sayHello() {
            return "Nĭ hăo!!!!";
        }
    }

    private static class Russian implements Citizen {
        public Russian() {
        }

        public String sayHello() {
            return "Привет!!!!";
        }
    }

    private static class Italian implements Citizen {
        public Italian() {
        }

        public String sayHello() {
            return "Ciao!!!!";
        }
    }

    public static Citizen englishman() {
        return new Englishman();
    }

    public static Citizen chinese() {
        return new Chinese();
    }

    public static Citizen russian() {
        return new Russian();
    }

    public static Citizen italian() {
        return new Italian();
    }
}

