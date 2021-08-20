package com.zgx.blog.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@ApiModel(value = "adminLoginParam",description="")
public class AdminLoginParam {

    @ApiModelProperty(value = "用户名",required=true)
    private String username;
    @ApiModelProperty(value = "密码",required = true)
    private String password;

}
