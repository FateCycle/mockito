package com.demo.mockito;


import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@Slf4j
@SpringBootTest
public class AllureStepTest {


    @Test
    void caseTest() {
    }


    @Test
    void caseStepTest() {
        step1();
        step2();
        step3();
    }


    @Step("把冰箱打开")
    void step1() {
        assertThat(2,equalTo(2));
    }

    @Step("把大象装进去")
    void step2(){
        assertThat(2,equalTo(2));
    }


    @Step("把冰箱关上")
    void step3(){
        assertThat(2,equalTo(2));
    }


}
