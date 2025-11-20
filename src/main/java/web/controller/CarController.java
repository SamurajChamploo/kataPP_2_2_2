package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.dao.CarDaoImpl;

@Controller
public class CarController {

    private final CarDao carDao;

    public CarController(CarDaoImpl carDao) {
        this.carDao = carDao;
    }

    @GetMapping("/cars")
    public String printCars(@RequestParam(name = "count", required = false) Integer count, ModelMap model) {
        if (count == null || count <= 0 || count >= 5) {
            model.addAttribute("carsList", carDao.printCars(5));
        }else {
            model.addAttribute("carsList", carDao.printCars(count));
        }
        return "cars";
    }
}
