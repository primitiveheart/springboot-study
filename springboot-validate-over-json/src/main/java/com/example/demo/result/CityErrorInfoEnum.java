package com.example.demo.result;

/**
 * Created by admin on 2018/1/15.
 */
public enum CityErrorInfoEnum implements ErrorInfoInterface {

    PARAMS_NO_COMPLETE("000001","params no complete"),
    CITY_EXIT("000002","city exit");

    CityErrorInfoEnum(String code, String message){
        this.code = code;
        this.message = message;
    }

    private String code;

    private String message;

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
