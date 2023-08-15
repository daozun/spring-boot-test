package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.demo.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName(value = "demo_user")
public class UserEntity extends BaseEntity {
    /**
     * 名字
     **/
    private String name;

    /**
     * 性别
     **/
    private Integer sex;

    /**
     * 生日
     **/
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    /**
     * 手机号
     **/
    private String mobile;

    /**
     * 邮箱
     **/
    private String email;

    /**
     * 状态 1 正常 0 禁用
     */
    private Integer status;
}
