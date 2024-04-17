package com.demo.mockito.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;


@Data
@TableName("doctor")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "责任医生")
public class Doctor extends Model<Doctor> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="医生编码")
    private String code;

    @ApiModelProperty(value="姓名")
    private String name;

    @ApiModelProperty(value="性别:0:男,1:女")
    private Integer sex;

    @ApiModelProperty(value="团队ID")
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private Integer teamId;

    @ApiModelProperty(value="团队名称")
    private String teamName;

    @ApiModelProperty(value="密码")
    private String password;

    @ApiModelProperty(value="创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value="更新时间")
    private LocalDateTime updateTime;

}
