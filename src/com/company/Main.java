package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        recommendation();
        recommendation();
        recommendation();
        recommendation();
        recommendation();
    }

    public static String variants(int age, int temperature) {

        if ((age >= 20 && age <= 45) && (temperature >= -20 && temperature <= 30)) {
            return "Можно идти гулять.";
        } else if (age < 20 && (temperature >= 0 && temperature <= 28)) {
            return "Можно идти гулять.";
        } else if (age > 45 && (temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять.";
        } else return "Оставайтесь дома.";
    }

    public static int generateRandomAge() {

        Random random = new Random();
        int age = random.nextInt(85);
        return age;
    }

    public static int generateRandomTemrerature() {

        Random random = new Random();
        int temp = random.nextInt(45);
        return temp - 35;
    }
    public static void recommendation(){
        int age = generateRandomAge();
        int temperature = generateRandomTemrerature();
        System.out.println("Возраст " + age +  " Температура на улице " + temperature + " градусов.");
        System.out.println("Рекомендуем Вам; " + variants(age, temperature));
        System.out.println(" ");
        System.out.println("--------------------------------------------");
    }
}
