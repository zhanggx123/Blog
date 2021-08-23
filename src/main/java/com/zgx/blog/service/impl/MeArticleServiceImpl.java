package com.zgx.blog.service.impl;

import com.zgx.blog.pojo.MeArticle;
import com.zgx.blog.mapper.MeArticleMapper;
import com.zgx.blog.service.IMeArticleService;
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
public class MeArticleServiceImpl extends ServiceImpl<MeArticleMapper, MeArticle> implements IMeArticleService {

    @Autowired
    private MeArticleMapper meArticleMapper;

    @Override
    public List<MeArticle> queryArticleAll() {
        return meArticleMapper.queryArticleAll();
    }
}
