package com.zgx.blog.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="AdminParam对象", description="")
public class AdminParam {

    @ApiModelProperty(value = "id不用传")
    private Integer id;

    @ApiModelProperty(value = "用户名" )
    private String username;
    @ApiModelProperty(value = "密码")
    private String password;


}
