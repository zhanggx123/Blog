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
@TableName("user_comment")
@ApiModel(value="UserComment对象", description="")
public class UserComment implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "评论自增ID号")
    @TableId(value = "c_id", type = IdType.AUTO)
    private Integer c_id;

    @ApiModelProperty(value = "收到评论的用户ID")
    private Integer user_id;

    @ApiModelProperty(value = "评论栏目ID")
    private Integer type_id;

    @ApiModelProperty(value = "评论内容的ID")
    private Integer commit_id;

    @ApiModelProperty(value = "评论内容")
    private String commit_content;

    @ApiModelProperty(value = "评论者ID")
    private Integer commit_user_id;

    @ApiModelProperty(value = "评论时间")
    private Integer commit_time;

    @ApiModelProperty(value = "评论时的IP地址")
    private String commit_ip;


}
