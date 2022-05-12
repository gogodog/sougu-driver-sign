package com.pw.diss8.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class SouguZhaomuDriver extends BaseEntity implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String userCode;

    private String password;

    private String phone;

    private String realName;

    private String nickName;

    private String email;

    private Integer sex;

    private String driverAge;

    private String driverCity;

    private String identityCardA;

    private String identityCardB;

    private String drivingLicA;

    private String drivingLicB;

    private String invitationInfo;

    private String invitationMethod;

    private String teamId;

    private Integer status;

    @TableField(fill = FieldFill.INSERT)
    private Integer deleted;

    private Integer fromWhere;

    private String createId;

    private String updateId;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

}