package com.demo.mockito;

import io.qameta.allure.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@Slf4j
@SpringBootTest
@Feature("Essential features")
public class AllureAnnotationTest {

    @Test
    @Story("Authentication")
    @Description("分组描述")
    void caseGroupTest() {
        assertThat(2,equalTo(2));
    }


    @Test
    @DisplayName("测试用例的名称")
    @Description("测试用例的描述信息")
    public void caseTitleTest() {
        assertThat(2,equalTo(2));
    }


    @Test
    @Link(name="静态链接",url="www.baidu.com")
    @Description("链接描述")
    public void caseLinkTest() {
        assertThat(2,equalTo(2));
    }


    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("链接描述")
    public void caseLevelTest() {
        assertThat(2,equalTo(2));
    }


    @ParameterizedTest(name = "{displayName} ({argumentsWithNames})")
    @ValueSource(strings = {"johndoe", "johndoe@example.com"})
    void caseParamTest(String login) {
        System.out.println(login);
    }






}
