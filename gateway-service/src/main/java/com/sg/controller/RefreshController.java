package com.sg.controller;

import com.sg.entity.Zuul_route;
import com.sg.router.DynamicRouteLocator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sg.service.RefreshRouteService;

import java.util.List;

/**
 * Created by zsy.
 */
@RestController
public class RefreshController {

    @Autowired
    RefreshRouteService refreshRouteService;

    private JdbcTemplate jdbcTemplate;

    @PostMapping("/refresh")
    public String refreshRoute() {
        return refreshRouteService.refreshRoute();
    }
}
