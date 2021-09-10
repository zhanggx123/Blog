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
@TableName("user_attention")
@ApiModel(value="UserAttention对象", description="")
public class UserAttention implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增ID")
    @TableId(value = "a_id", type = IdType.AUTO)
    private Integer a_id;

    @ApiModelProperty(value = "用户ID")
    private Integer user_id;

    @ApiModelProperty(value = "关注ID")
    private Integer attention_id;


}
