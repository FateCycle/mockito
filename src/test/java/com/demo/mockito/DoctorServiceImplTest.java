//package com.demo.mockito;
//
//import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
//import com.demo.mockito.entity.Doctor;
//import com.demo.mockito.mapper.DoctorMapper;
//import com.demo.mockito.service.DoctorService;
//import com.demo.mockito.service.impl.DoctorServiceImpl;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Answers;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.boot.test.context.SpringBootTest;
//
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.ArgumentMatchers.eq;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//@SpringBootTest
//public class DoctorServiceImplTest {
//
//    @InjectMocks
//    DoctorServiceImpl doctorServiceImpl;
//
//    @BeforeEach
//    void setUp() {
//        //mock父类函数
//        doctorServiceImpl = mock(DoctorServiceImpl.class, Answers.CALLS_REAL_METHODS);
//        MockitoAnnotations.openMocks(this);
//    }
//
//    @Test
//    void testSelectFollowUpDetail() {
//        LambdaQueryChainWrapper lambdaQueryChainWrapper = mock(LambdaQueryChainWrapper.class);
//        when(doctorServiceImpl.lambdaQuery()).thenReturn(lambdaQueryChainWrapper);
//
//        Doctor doctor = new Doctor();
//        doctor.setName("医生A");
//        when(lambdaQueryChainWrapper.eq(any(), eq("test"))).thenReturn(lambdaQueryChainWrapper);
//        when(lambdaQueryChainWrapper.one()).thenReturn(doctor);
//
//        Doctor actual = doctorServiceImpl.getDoctorById("test");
//        assertThat(actual).isEqualTo(doctor);
//    }
//}
