package com.example.service.impl;

import com.example.dao.CityDao;
import com.example.domain.City;
import com.example.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2018/1/14.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    public List<City> findAllCity() {
        return cityDao.findAllCity();
    }

    public City findById(Long id) {
        return cityDao.findById(id);
    }

    public Long saveCity(City city) {
        return cityDao.saveCity(city);
    }

    public Long updateCity(City city) {
        return cityDao.updateCity(city);
    }

    public Long deleteCity(Long id) {
        return cityDao.deleteCity(id);
    }
}
