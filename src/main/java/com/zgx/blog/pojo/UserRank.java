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
@TableName("user_rank")
@ApiModel(value="UserRank对象", description="")
public class UserRank implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增ID")
    @TableId(value = "rank_id", type = IdType.AUTO)
    private Integer rank_id;

    @ApiModelProperty(value = "等级ID")
    private Integer user_rank_id;

    @ApiModelProperty(value = "等级积分")
    private Integer rank_mark;

    @ApiModelProperty(value = "等级名称")
    private String rank_name;


}
