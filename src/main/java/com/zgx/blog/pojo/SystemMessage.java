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
@TableName("system_message")
@ApiModel(value="SystemMessage对象", description="")
public class SystemMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "系统通知ID")
    @TableId(value = "system_id", type = IdType.AUTO)
    private Integer system_id;

    @ApiModelProperty(value = "接受者ID")
    private Integer send_id;

    @ApiModelProperty(value = "用户组ID")
    private Integer group_id;

    @ApiModelProperty(value = "1时发送所有用户，0时则不采用")
    private Integer send_default;

    @ApiModelProperty(value = "通知内容")
    private String system_topic;

    @ApiModelProperty(value = "通知内容")
    private String system_content;


}
