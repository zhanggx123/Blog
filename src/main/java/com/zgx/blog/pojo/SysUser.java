package com.zgx.blog.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Collection;

import io.swagger.annotations.ApiModel;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


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
@TableName("sys_user")
@Accessors(chain = true)
@ApiModel(value="SysUser对象", description="")
public class SysUser implements Serializable , UserDetails {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String account;

    private Boolean admin;

    private String avatar;

    private LocalDateTime create_date;

    private Boolean deleted;

    private String email;

    private LocalDateTime last_login;

    private String mobile_phone_number;

    private String nickname;

    private String password;

    private String salt;

    private String status;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }


    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
