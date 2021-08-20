package com.zgx.blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zgx.blog.config.security.component.JwtTokenUtils;
import com.zgx.blog.pojo.RespBean;
import com.zgx.blog.pojo.SysUser;
import com.zgx.blog.mapper.SysUserMapper;
import com.zgx.blog.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zgx
 * @since 2021-08-19
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Autowired
    private SysUserMapper userMapper;
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JwtTokenUtils jwtTokenUtils;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    /**
     * 登录之后返回token
     * @param username
     * @param password
     * @param request
     * @return
     */
    @Override
    public RespBean login(String username, String password, HttpServletRequest request) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        if(null==userDetails||passwordEncoder.matches(password,userDetails.getPassword())){
            return RespBean.error("用户名或密码不正确");
        }
        UsernamePasswordAuthenticationToken authenticationToken=new
                UsernamePasswordAuthenticationToken(userDetails,
                null,userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        String token = jwtTokenUtils.generateToken(userDetails);
        Map<String,String> tokenMap=new HashMap<>();
        tokenMap.put("token",token);
        tokenMap.put("tokenHead",tokenHead);
        return RespBean.success("登录成功",tokenMap);
    }

    @Override
    public SysUser getUserByUserName(String username) {

        return userMapper.selectOne(new QueryWrapper<SysUser>().eq("nickname",username));
    }
}
