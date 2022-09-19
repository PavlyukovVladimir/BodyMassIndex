package ru.netology;

public class BmiService {
    public Double calculate(Double weight_kg, double height_sm){
        return weight_kg/((height_sm / 100.0) * (height_sm / 100.0));
    }

    public String interpretation(Double bmi){
        if(bmi >= 40.0){
            return "\033[91mОжирение 3 степени\033[0m";
        }
        if(bmi >= 35.0){
            return "\033[95mОжирение 2 степени\033[0m";
        }
        if(bmi >= 30.0){
            return "\033[33mОжирение 1 степени\033[0m";
        }
        if(bmi >= 25.0){
            return "\033[92mИзбыточная масса тела (предожирение)\033[0m";
        }
        if(bmi >= 18.5){
            return "\033[32mНорма\033[0m";
        }
        if(bmi > 16.0){
            return "\033[96mНедостаточная (дефицит) масса тела\033[0m";
        }
        return "\033[94mВыраженный дефицит массы тела\033[0m";
    }
    public String colorInterpretation(Double weight_kg, double height_sm){
        Double bmi = calculate(weight_kg, height_sm);
        String sbmi = String.format("%.2f", bmi);
        if(bmi >= 40.0){
            return "\033[31m%" + sbmi + "\033[0m";
        }
        if(bmi >= 35.0){
            return "\033[35m" + sbmi + "\033[0m";
        }
        if(bmi >= 30.0){
            return "\033[33m" + sbmi + "\033[0m";
        }
        if(bmi >= 25.0){
            return "\033[36m" + sbmi + "\033[0m";
        }
        if(bmi >= 18.5){
            return "\033[32m" + sbmi + "\033[0m";
        }
        if(bmi > 16.0){
            return "\033[34m" + sbmi + "\033[0m";
        }
        return "\033[35m" + sbmi + "\033[0m";
    }
}
