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
@ApiModel(value="Ad对象", description="")
public class Ad implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增ID")
    @TableId(value = "ad_id", type = IdType.AUTO)
    private Integer ad_id;

    @ApiModelProperty(value = "0,站外广告;从1开始代表的是该广告所处的广告位,同表ad_postition中的字段position_id的值")
    private Integer position_id;

    @ApiModelProperty(value = "广告类型,0图片;1flash;2代码3文字")
    private Integer media_type;

    @ApiModelProperty(value = "该条广告记录的广告名称")
    private String ad_name;

    @ApiModelProperty(value = "广告链接地址")
    private String ad_link;

    @ApiModelProperty(value = "广告链接的表现,文字广告就是文字或图片和flash就是它们的地址")
    private String ad_code;

    @ApiModelProperty(value = "广告开始时间")
    private Integer start_time;

    @ApiModelProperty(value = "广告结束时间")
    private Integer end_time;

    @ApiModelProperty(value = "广告联系人")
    private String link_man;

    @ApiModelProperty(value = "广告联系人的邮箱")
    private String link_email;

    @ApiModelProperty(value = "广告联系人得电话")
    private String link_phone;

    @ApiModelProperty(value = "广告点击次数")
    private Integer click_count;

    @ApiModelProperty(value = "该广告是否关闭;1开启; 0关闭; 关闭后广告将不再有效")
    private Integer enabled;


}
