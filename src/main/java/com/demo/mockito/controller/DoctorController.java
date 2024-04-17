package com.demo.mockito.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.demo.mockito.entity.Doctor;
import com.demo.mockito.service.DoctorService;
import com.ktqy.base.core.response.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/doctor" )
@Api(tags = "责任医生管理")
public class DoctorController {

    @Autowired
    private final DoctorService doctorService;

    @ApiOperation(value = "列表查询", notes = "列表查询")
    @GetMapping("/list" )
    public JsonResult<Doctor> getSysParameterPage() {
        return JsonResult.ok(doctorService.getFirst());
    }

}
