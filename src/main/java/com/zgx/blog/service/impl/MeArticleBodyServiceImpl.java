package com.zgx.blog.service.impl;

import com.zgx.blog.pojo.MeArticleBody;
import com.zgx.blog.mapper.MeArticleBodyMapper;
import com.zgx.blog.service.IMeArticleBodyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zgx
 * @since 2021-08-19
 */
@Service
public class MeArticleBodyServiceImpl extends ServiceImpl<MeArticleBodyMapper, MeArticleBody> implements IMeArticleBodyService {

    @Autowired
    private IMeArticleBodyService articleBodyService;

    @Override
    public List<MeArticleBody> getAllArticleBody() {
        return articleBodyService.list();
    }
}
