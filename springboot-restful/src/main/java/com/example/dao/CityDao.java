package com.example.dao;

import com.example.domain.City;




import java.util.List;

/**
 * Created by admin on 2018/1/14.
 */
public interface CityDao {

    List<City> findAllCity();

    City findById(Long id);

    Long saveCity(City city);

    Long updateCity(City city);

    Long deleteCity(Long id);
}
