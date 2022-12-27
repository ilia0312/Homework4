public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }


    public static void task2 () {
        System.out.println("Задача 2");

        int temperature = 10;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
    }


    public static void task3 () {
        System.out.println("Задача 3");

        int speed = 70;
        if (speed >= 60) {
            System.out.println("Если скорость " +speed+ ", то придется заплатить штраф");
        }
        else {
            System.out.println("Если скорость " +speed+ ", то можно ездить спокойно");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");

        int manAge = 24;

        if (manAge >= 2 && manAge <= 6) {
            System.out.println("Если возраст человека равен " +manAge+ ", то ему нужно ходить в детский сад");
        }
        else if (manAge >= 7 && manAge <= 18) {
            System.out.println("Если возраст человека равен " +manAge+ ", то ему нужно ходить в школу");
        }
        else if (manAge > 18 && manAge <= 24) {
            System.out.println("Если возраст человека равен " +manAge+ ", то ему нужно ходить в университет");
        }
        else if (manAge > 24) {
            System.out.println("Если возраст человека равен " +manAge+ ", то ему нужно ходить на работу");
        }
        else if (manAge < 2) {
            System.out.println("Если возраст человека равен " +manAge+ ", то ему ни куда не нужно ходить");
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int childAge = 13;
        if (childAge <= 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        }
        else if (childAge < 14){
            System.out.println("Если возраст человека равен " + childAge + ", то ему нельзя кататься на аттракционе без споровождения взрослых");
        }
        else if (childAge >= 14){
            System.out.println("Если возраст человека равен " + childAge + ", то ему можно кататься на аттракционе");
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");

        int sitPlace = 60;
        int standPlace = 30;
        boolean freeSitPlace = sitPlace < 60;
        boolean freeStandPlace = standPlace < 42;
        boolean notPlace = sitPlace == 60 && standPlace == 42;
        if (freeSitPlace) {
            System.out.println("В вагоне есть места сидячие");
        }
        else {
            System.out.println("В вагоне нет места сидячего");
        }
        if (freeStandPlace) {
            System.out.println("В вагоне есть места стоячие");
        }
        else {
            System.out.println("В вагоне нет места стоячего");
        }
        if (notPlace) {
            System.out.println("В вагоне нет мест");
        }
        else {
            System.out.println("В вагоне есть места");
        }
        }

    public static void task7 () {
        System.out.println("Задача 7");
        int one = 11;
        int two = 2;
        int three = 34;
        boolean biggerNumberOne = one > two && one > three;
        boolean biggerNumberTwo = two > one && two > three;
        boolean biggerNumberThree = three > two && three > one;
        if (biggerNumberOne) {
            System.out.println("Большее число " + one );
        }
        else if (biggerNumberTwo){
            System.out.println("Большее число " + two );
        }
        else if (biggerNumberThree){
            System.out.println("Большее число " + three );
        }

        }

    }

