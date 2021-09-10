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
@TableName("power_list")
@ApiModel(value="PowerList对象", description="")
public class PowerList implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增ID")
    @TableId(value = "p_id", type = IdType.AUTO)
    private Integer p_id;

    @ApiModelProperty(value = "权限ID")
    private Integer power_id;

    @ApiModelProperty(value = "权限描述")
    private String power_name;


}
