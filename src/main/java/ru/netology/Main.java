package ru.netology;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        int len = 100;
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < len; i++) {
            double weight = 50 + random.nextDouble() * (200 - 50);
            double heights = 120 + random.nextDouble() * (200 - 120);
            System.out.printf("Для веса %.2f и роста %.2f индекс массы составляет ", weight, heights);
            System.out.println(bmiService.colorInterpretation(weight, heights));
        }
    }
}