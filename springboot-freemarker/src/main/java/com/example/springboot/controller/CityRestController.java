package com.example.springboot.controller;

import com.example.springboot.domain.City;
import com.example.springboot.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by admin on 2018/1/14.
 */
@Controller
public class CityRestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CityRestController.class);

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.GET)
    public String findOneCity(@PathVariable("id") Long id, Model model){
        model.addAttribute("city", cityService.findOneCity(id));
        return "city";
    }

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public String findAllCity(Model model){
        List<City> cityList = cityService.findAllCity();
        model.addAttribute("cityList",cityList);
        return "cityList";
    }
}
