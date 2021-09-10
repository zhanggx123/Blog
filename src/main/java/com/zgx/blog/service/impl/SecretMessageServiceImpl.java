package com.zgx.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zgx.blog.mapper.SecretMessageMapper;
import com.zgx.blog.pojo.SecretMessage;
import com.zgx.blog.service.ISecretMessageService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zgx
 * @since 2021-09-10
 */
@Service
public class SecretMessageServiceImpl extends ServiceImpl<SecretMessageMapper, SecretMessage> implements ISecretMessageService {

}
