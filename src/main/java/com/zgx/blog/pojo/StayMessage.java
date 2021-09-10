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
@TableName("stay_message")
@ApiModel(value="StayMessage对象", description="")
public class StayMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "留言表自增ID")
    @TableId(value = "stay_id", type = IdType.AUTO)
    private Integer stay_id;

    @ApiModelProperty(value = "用户ID")
    private Integer user_id;

    @ApiModelProperty(value = "留言者ID")
    private Integer stay_user_id;

    @ApiModelProperty(value = "留言内容")
    private String message_content;

    @ApiModelProperty(value = "留言用户的IP地址")
    private String stay_user_ip;

    @ApiModelProperty(value = "留言时间")
    private Integer message_stay_time;

    @ApiModelProperty(value = "地区")
    private String place;


}
