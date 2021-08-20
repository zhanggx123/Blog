package com.zgx.blog.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author zgx
 * @since 2021-08-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("me_article_tag")
@ApiModel(value="MeArticleTag对象", description="")
public class MeArticleTag implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer article_id;

    private Integer tag_id;


}
