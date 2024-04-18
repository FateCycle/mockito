package com.demo.mockito;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


@SpringBootTest
public class AllureStatusTest {

//    @Test
//    void caseBrokenTest(){
//       int i = 1 / 0;
//    }


    @Disabled
    @Test
    void caseSkipTest() {

    }

//    @Test
//    void caseFailedTest() {
//        assertThat(2,equalTo(3));
//    }

    @Test
    void casePassedTest() {
        assertThat(2,equalTo(2));
    }

}
