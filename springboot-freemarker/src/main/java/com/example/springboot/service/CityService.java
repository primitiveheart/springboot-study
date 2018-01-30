package com.example.springboot.service;

import com.example.springboot.domain.City;

import java.util.List;

/**
 * Created by admin on 2018/1/15.
 */
public interface CityService {
    List<City> findAllCity();

    City findOneCity(Long id);

    Long saveCity(City city);

    Long updateCity(City city);

    Long deleteCity(Long id);

}
