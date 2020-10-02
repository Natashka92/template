package com.spring.template.rest;

import com.spring.template.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class ApiController {
    @Autowired
    private final ApiService apiService;

    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }

    @RequestMapping(value = "/v1/api", method = GET)
    public String api() {
        return apiService.ok();
    }
}
