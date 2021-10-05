package com.zgx.blog.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zgx
 * @since 2021-09-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="User对象", description="")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户ID")
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer user_id;

    @ApiModelProperty(value = "用户组ID")
    private Integer group_id;

    @ApiModelProperty(value = "用户名")
    private String user_name;

    @ApiModelProperty(value = "用户密码")
    private String user_pwd;

    @ApiModelProperty(value = "用户手机号码")
    private Integer user_phone;

    @ApiModelProperty(value = "用户性别")
    private String user_sex;

    @ApiModelProperty(value = "用户QQ号码")
    private Integer user_qq;

    @ApiModelProperty(value = "用户EMAIL地址")
    private String user_email;

    @ApiModelProperty(value = "用户地址")
    private String user_address;

    @ApiModelProperty(value = "用户积分")
    private Integer user_mark;

    @ApiModelProperty(value = "用户等级")
    private Integer user_rank_id;

    @ApiModelProperty(value = "用户上一次登录IP地址")
    private String user_last_login_ip;

    @ApiModelProperty(value = "用户生日")
    private Integer user_birthday;

    @ApiModelProperty(value = "自我描述")
    private String user_description;

    @ApiModelProperty(value = "用户头像存储路径")
    private String user_image_url;

    @ApiModelProperty(value = "毕业学校")
    private String user_school;

    @ApiModelProperty(value = "用户注册时间")
    private Integer user_register_time;

    @ApiModelProperty(value = "用户注册时IP地址")
    private String user_register_ip;

    @ApiModelProperty(value = "用户上次更新博客时间")
    private Integer user_last_update_time;

    @ApiModelProperty(value = "用户微博")
    private String user_weibo;

    @ApiModelProperty(value = "用户血型")
    private String user_blood_type;

    @ApiModelProperty(value = "用户语录")
    private String user_says;

    @ApiModelProperty(value = "是否锁定，0为不锁定，1为锁定")
    private Integer user_lock;

    @ApiModelProperty(value = "是否冻结，0为不冻结，1为冻结")
    private Integer user_freeze;

    @ApiModelProperty(value = "拥有权限")
    private String user_power;


}
