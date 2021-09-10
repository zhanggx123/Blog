package com.zgx.blog.pojo;

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
@TableName("about_blog")
@ApiModel(value="AboutBlog对象", description="")
public class AboutBlog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户ID")
    private Integer blog_id;

    @ApiModelProperty(value = "博客关键字")
    private String blog_keyword;

    @ApiModelProperty(value = "博客描述")
    private String blog_description;

    @ApiModelProperty(value = "博客名称")
    private String blog_name;

    @ApiModelProperty(value = "博客标题")
    private String blog_title;


}
