package com.zgx.blog.service;

import com.zgx.blog.pojo.MeCategory;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zgx
 * @since 2021-08-19
 */
public interface IMeCategoryService extends IService<MeCategory> {

    /**
     * 获取文章类型
     */
    List<MeCategory> getArticleType();

}
