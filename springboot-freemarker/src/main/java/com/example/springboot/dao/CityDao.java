package com.example.springboot.dao;

import com.example.springboot.domain.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by admin on 2018/1/15.
 */
public interface CityDao {
    List<City> findAllCity();

    City findOneCity(Long id);

    Long saveCity(City city);

    Long updateCity(City city);

    Long deleteCity(@Param("id") Long id);
 }
