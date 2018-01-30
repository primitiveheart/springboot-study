package com.example.demo.utils;

import com.example.demo.entity.Hr;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by admin on 2018/1/30.
 */
public class HrUtil {
    public static Hr getCurrentHr(){
        return (Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
