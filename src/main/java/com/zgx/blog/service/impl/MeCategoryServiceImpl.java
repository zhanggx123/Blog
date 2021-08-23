package com.zgx.blog.service.impl;


import com.zgx.blog.pojo.MeCategory;
import com.zgx.blog.mapper.MeCategoryMapper;
import com.zgx.blog.service.IMeCategoryService;
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
public class MeCategoryServiceImpl extends ServiceImpl<MeCategoryMapper, MeCategory> implements IMeCategoryService {

    @Autowired
    private IMeCategoryService meCategoryService;

    @Override
    public List<MeCategory> getArticleType() {
        return meCategoryService.list();
    }
}
