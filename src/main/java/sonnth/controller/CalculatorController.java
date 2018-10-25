package sonnth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/")
    public String calculator(Model model, String first_number, String second_number, String operator) {

        Double firstNumber = Double.parseDouble(first_number);
        Double secondNumber = Double.parseDouble(second_number);

        double res = 0;
        switch (operator) {
            case "+":
                res = firstNumber + secondNumber;
                break;
            case "-":
                res = firstNumber - secondNumber;
                break;
            case "*":
                res = firstNumber * secondNumber;
                break;
            case "/":
                res = firstNumber / secondNumber;
        }
        model.addAttribute("result", res);
        return "index";
    }

}
