package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarsController {

    private final CarServiceImpl carServiceImpl;

    public CarsController(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", carServiceImpl.getCars(count));
        return "cars";
    }
}
