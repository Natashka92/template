package com.spring.template.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApiServiceTest {

    @Test
    public void shouldReturnOk() {
        ApiService api = new ApiService();

        assertEquals("ok", api.ok());
    }
}