package com.zgx.blog.service;

import com.zgx.blog.pojo.MeArticleBody;
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
public interface IMeArticleBodyService extends IService<MeArticleBody> {

    /**
     * 获取全部文章body
     */
    List<MeArticleBody> getAllArticleBody();

}
