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
@ApiModel(value="Article对象", description="")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "日志自增ID号")
    @TableId(value = "article_id", type = IdType.AUTO)
    private Integer article_id;

    @ApiModelProperty(value = "文章名称")
    private String article_name;

    @ApiModelProperty(value = "发布时间")
    private Integer article_time;

    @ApiModelProperty(value = "发布IP")
    private String article_ip;

    @ApiModelProperty(value = "查看人数")
    private Integer article_click;

    @ApiModelProperty(value = "所属分类")
    private Integer sort_article_id;

    @ApiModelProperty(value = "所属用户ID")
    private Integer user_id;

    @ApiModelProperty(value = "栏目ID")
    private Integer type_id;

    @ApiModelProperty(value = "文章的模式:0为私有，1为公开，2为仅好友查看")
    private Integer article_type;

    @ApiModelProperty(value = "文章内容")
    private String article_content;

    @ApiModelProperty(value = "是否置顶:0为否，1为是")
    private Integer article_up;

    @ApiModelProperty(value = "是否博主推荐:0为否，1为是")
    private Integer article_support;


}
