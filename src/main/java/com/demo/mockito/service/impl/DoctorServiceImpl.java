package com.demo.mockito.service.impl;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.mockito.entity.Doctor;
import com.demo.mockito.mapper.DoctorMapper;
import com.demo.mockito.service.DoctorService;
import com.ktqy.base.core.annotation.Note;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;


@Note("责任医生")
@Service
public class DoctorServiceImpl extends ServiceImpl<DoctorMapper, Doctor> implements DoctorService {

    public Doctor getFirst() {
        return this.baseMapper.selectList(new QueryWrapper<>()).stream().findFirst().get();
    }

    public Doctor getDoctorById(String id) {
        return this.baseMapper.getDoctorById(id);
    }

}
