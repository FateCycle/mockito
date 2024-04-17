package com.demo.mockito.service;



import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.mockito.entity.Doctor;
import com.ktqy.base.core.annotation.Note;
import org.apache.ibatis.annotations.Param;

@Note("责任医生")
public interface DoctorService extends IService<Doctor> {
    Doctor getFirst();
    Doctor getDoctorById(String id);

}
