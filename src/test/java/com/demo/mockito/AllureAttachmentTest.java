package com.demo.mockito;

import io.qameta.allure.Allure;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;

@Slf4j
@SpringBootTest
public class AllureAttachmentTest {

    @Test
    public void attachTest() {
        Allure.addAttachment("myAttachment","myAttachmentContent");
        try{
            Allure.addAttachment("pictureAttachment","image/png",new FileInputStream("/Users/panxiakai/IdeaProjects/mockito/src/test/resources/img.png"),"jpg");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }



}
