package com.example.demo.mapper;

import com.example.demo.entity.Menu;
import com.sun.xml.internal.ws.api.model.MEP;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by admin on 2018/1/30.
 */
@Component
public interface MenuMapper {
    List<Menu> getAllMenu();

    List<Menu> getMenusByHrId(Long hrId);

    List<Long> getMenuByRid(Long rid);

    List<Menu> menuTree();
}
