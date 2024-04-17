package com.demo.mockito.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.mockito.entity.Doctor;
import com.ktqy.base.core.annotation.Note;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Note("责任医生")
@Mapper
public interface DoctorMapper extends BaseMapper<Doctor> {

    @Select("select * from doctor h where h.id = ${id}")
    Doctor getDoctorById(@Param("id") String id);

}
