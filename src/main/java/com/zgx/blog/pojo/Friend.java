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
@ApiModel(value="Friend对象", description="")
public class Friend implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增ID")
    @TableId(value = "f_id", type = IdType.AUTO)
    private Integer f_id;

    @ApiModelProperty(value = "用户ID")
    private Integer user_id;

    @ApiModelProperty(value = "好友ID")
    private Integer friend_id;


}
