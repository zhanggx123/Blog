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
@TableName("secret_message")
@ApiModel(value="SecretMessage对象", description="")
public class SecretMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增私信ID")
    @TableId(value = "secret_id", type = IdType.AUTO)
    private Integer secret_id;

    @ApiModelProperty(value = "发信者ID")
    private Integer send_id;

    @ApiModelProperty(value = "收信者ID")
    private Integer receive_id;

    @ApiModelProperty(value = "私信标题")
    private String message_topic;

    @ApiModelProperty(value = "私信内容")
    private String message_content;


}
