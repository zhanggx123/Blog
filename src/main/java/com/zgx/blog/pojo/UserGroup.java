package com.zgx.blog.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("user_group")
@ApiModel(value="UserGroup对象", description="")
public class UserGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增ID号")
    @TableId(value = "g_id", type = IdType.AUTO)
    private Integer g_id;

    @ApiModelProperty(value = "用户组ID")
    private Integer group_id;

    @ApiModelProperty(value = "用户组名")
    private String group_name;

    @ApiModelProperty(value = "用户权限")
    private String group_power;


}
