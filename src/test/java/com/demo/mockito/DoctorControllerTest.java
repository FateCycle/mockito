package com.demo.mockito;

import com.alibaba.fastjson.JSONObject;
import com.demo.mockito.entity.Doctor;
import com.demo.mockito.mapper.DoctorMapper;
import com.demo.mockito.service.DoctorService;
import com.ktqy.base.core.response.JsonResult;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;
import java.net.URI;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static cn.hutool.core.lang.Singleton.get;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@Slf4j
class DoctorControllerTest {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

//    @Resource
    @Spy
    private DoctorService doctorService;

    @Mock
    private DoctorMapper doctorMapper;


    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext)
                .addFilter((request, response, chain) -> {
                    response.setContentType("application/json");
                    response.setCharacterEncoding("utf-8");
                    chain.doFilter(request, response);
                }, "/*").build();
    }

    @Test
    void testDoctorList() throws Exception {
        Doctor doctor = new Doctor();
        doctor.setId(1);
        doctor.setCode("345678");
        doReturn(doctorMapper).when(doctorService).getBaseMapper();
        when(doctorService.getFirst()).thenReturn(doctor);
        MockHttpServletResponse response = mockMvc.perform(MockMvcRequestBuilders.get("/doctor/list","")).andReturn().getResponse();
        assertThat(response.getStatus()).isEqualTo(200);
        String content = response.getContentAsString();
        JsonResult res = JSONObject.parseObject(content, JsonResult.class);
        assertThat(res.getCode()).isEqualTo("0");
    }

    @Test
    void testSeq() {
        // you can mock concrete classes, not only interfaces
        LinkedList mockedList = mock(LinkedList.class);
        // stubbing appears before the actual execution
        when(mockedList.get(0)).thenReturn("first");
        // the following prints "first"
        System.out.println(mockedList.get(0));
        // the following prints "null" because get(999) was not stubbed
        System.out.println(mockedList.get(999));
    }

}