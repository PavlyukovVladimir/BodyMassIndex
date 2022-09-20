package ru.netology;

public class BmiService {
    public double calculate(double weightKg, double heightSm) {
        return weightKg / ((heightSm / 100.0) * (heightSm / 100.0));
    }

    public String interpretation(double bmi) {
        if (bmi >= 40.0) {
            return "\033[91mОжирение 3 степени\033[0m";
        }
        if (bmi >= 35.0) {
            return "\033[31mОжирение 2 степени\033[0m";
        }
        if (bmi >= 30.0) {
            return "\033[33mОжирение 1 степени\033[0m";
        }
        if (bmi >= 25.0) {
            return "\033[93mИзбыточная масса тела (предожирение)\033[0m";
        }
        if (bmi >= 18.5) {
            return "\033[92mНорма\033[0m";
        }
        if (bmi > 16.0) {
            return "\033[96mНедостаточная (дефицит) масса тела\033[0m";
        }
        return "\033[34mВыраженный дефицит массы тела\033[0m";
    }

    public static String colorInterpretation(double bmi) {
        String sbmi = String.format("%6.2f", bmi);
        if (bmi >= 40.0) {
            return "\033[91m" + sbmi + "\033[0m";
        }
        if (bmi >= 35.0) {
            return "\033[31m" + sbmi + "\033[0m";
        }
        if (bmi >= 30.0) {
            return "\033[33m" + sbmi + "\033[0m";
        }
        if (bmi >= 25.0) {
            return "\033[93m" + sbmi + "\033[0m";
        }
        if (bmi >= 18.5) {
            return "\033[92m" + sbmi + "\033[0m";
        }
        if (bmi > 16.0) {
            return "\033[96m" + sbmi + "\033[0m";
        }
        return "\033[34m" + sbmi + "\033[0m";
    }
}
