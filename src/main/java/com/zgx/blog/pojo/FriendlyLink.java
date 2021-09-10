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
@TableName("friendly_link")
@ApiModel(value="FriendlyLink对象", description="")
public class FriendlyLink implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "友情链接自增ID")
    @TableId(value = "link_id", type = IdType.AUTO)
    private Integer link_id;

    @ApiModelProperty(value = "友情链接名称")
    private String link_name;

    @ApiModelProperty(value = "链接地址")
    private String link_url;

    @ApiModelProperty(value = "LOGO图片")
    private String link_logo;

    @ApiModelProperty(value = "在页面显示的顺序")
    private Integer show_order;


}
