package com.zgx.blog.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
@TableName("me_article")
@ApiModel(value="MeArticle对象", description="")
public class MeArticle implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer comment_counts;

    private LocalDateTime create_date;

    private String summary;

    private String title;

    private Integer view_counts;

    private Integer weight;

    private Long author_id;

    private Long body_id;

    private Integer category_id;


}
