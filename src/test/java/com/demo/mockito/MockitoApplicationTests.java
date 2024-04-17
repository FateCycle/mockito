//package com.demo.mockito;
//
//import cn.hutool.json.JSONUtil;
//import com.alibaba.fastjson.JSONObject;
//import com.demo.mockito.entity.Doctor;
//import com.demo.mockito.service.DoctorService;
//import com.ktqy.base.core.response.JsonResult;
//import ktm.test.helper.json.JsonFileSource;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.mock.web.MockHttpServletResponse;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.mockito.Mockito.when;
//
//@SpringBootTest
//class MockitoApplicationTests {
//
//    private MockMvc mockMvc;
//
//    @Autowired
//    private WebApplicationContext webApplicationContext;
//
//    @Autowired
//    private DoctorService doctorService;
//
//
//    @BeforeEach
//    void setUp() {
//        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext)
//                .addFilter((request, response, chain) -> {
//                    response.setContentType("application/json");
//                    response.setCharacterEncoding("utf-8");
//                    chain.doFilter(request, response);
//                }, "/*").build();
//    }
//
//}
