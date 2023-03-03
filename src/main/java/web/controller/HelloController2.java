package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceInt;

@Controller
public class HelloController2 {
    private CarServiceInt carServiceInt;
    private Car head;
    @Autowired
    public HelloController2(CarServiceInt carServiceInt, Car head) {
        this.carServiceInt = carServiceInt;
        this.head = head;
    }

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count",required = false,defaultValue = "5")int count,ModelMap model){
        model.addAttribute("head",head.getHead());
        model.addAttribute("cars",carServiceInt.getCars(count));
        return "cars";
    }
}
