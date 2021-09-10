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
@ApiModel(value="Visitor对象", description="")
public class Visitor implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "访客记录ID")
    @TableId(value = "v_id", type = IdType.AUTO)
    private Integer v_id;

    @ApiModelProperty(value = "访客ID")
    private Integer visitor_id;

    @ApiModelProperty(value = "来访时间")
    private Integer visitor_time;

    @ApiModelProperty(value = "被访用户ID")
    private Integer user_id;

    @ApiModelProperty(value = "访客IP地址")
    private String visitor_ip;

    @ApiModelProperty(value = "访问板块ID")
    private Integer type_id;

    @ApiModelProperty(value = "查看某板块的某个子项目，如查看相册板块的第3个相册，该ID对应该相册的ID号")
    private Integer where_id;


}
