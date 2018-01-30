package com.example.demo.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 2018/1/13.
 */
@Component
public class HomeProperties1 {
    @Value("${home.province}")
    private String province;
    @Value("${home.city}")
    private String city;
    @Value("${home.desc}")
    private String desc;

    @Override
    public String toString() {
        return "HomeProperties1{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
