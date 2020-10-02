package com.spring.template.integrationtests;

import com.spring.template.rest.ApiController;
import com.spring.template.service.ApiService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest({ ApiController.class })
public class ApiControllerTestIT {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private ApiService apiService;

    @Test
    public void shouldReturnOk() throws Exception {
        final String result="ok";
        when(apiService.ok()).thenReturn(result);

        mvc.perform(get("/v1/api"))
            .andExpect(status().isOk())
            .andExpect(content().string(result));
    }
}
