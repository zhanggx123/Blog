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
@ApiModel(value="Shuoshuo对象", description="")
public class Shuoshuo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "说说记录ID")
    @TableId(value = "shuo_id", type = IdType.AUTO)
    private Integer shuo_id;

    @ApiModelProperty(value = "用户ID")
    private Integer user_id;

    @ApiModelProperty(value = "发布时间")
    private Integer shuo_time;

    @ApiModelProperty(value = "说说发布时的IP地址")
    private String shuo_ip;

    @ApiModelProperty(value = "说说内容")
    private String shuoshuo;

    @ApiModelProperty(value = "栏目ID,默认为3")
    private Integer type_id;


}
