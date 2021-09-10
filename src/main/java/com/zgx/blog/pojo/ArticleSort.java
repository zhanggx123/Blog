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
@TableName("article_sort")
@ApiModel(value="ArticleSort对象", description="")
public class ArticleSort implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "文章自增ID")
    @TableId(value = "sort_article_id", type = IdType.AUTO)
    private Integer sort_article_id;

    @ApiModelProperty(value = "该分类所属用户")
    private Integer user_id;

    @ApiModelProperty(value = "分类名称")
    private String sort_article_name;


}
