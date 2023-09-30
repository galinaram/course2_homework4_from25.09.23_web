package pro.sky.course2.homework.hw1;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorService {
    public String helloCalculator(){
        return "Добро пожаловать в калькулятор!";
    }
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        int sum = num1+num2;
        return num1 + " + " + num2 + " = " + sum;
    }
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int res = num1-num2;
        return num1 + " - " + num2 + " = " + res;
    }
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        int res = num1*num2;
        return num1 + " * " + num2 + " = " + res;
    }
    public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        if (num2 == 0) {
            throw new RuntimeException("На ноль делить нельзя");
        }
        float res = (float) num1 /num2;
        return num1 + " / " + num2 + " = " + res;
    }
}
