package com.example.demo.mapper;

import com.example.demo.entity.Hr;
import com.example.demo.entity.Role;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by admin on 2018/1/30.
 */
@Component
public interface HrMapper {
    Hr loadUserByUsername(String username);

    List<Role> getRolesByHrId(Long id);
}
