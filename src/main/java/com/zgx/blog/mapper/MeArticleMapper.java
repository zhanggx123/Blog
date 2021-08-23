package com.zgx.blog.mapper;

import com.zgx.blog.pojo.MeArticle;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zgx
 * @since 2021-08-19
 */
@Mapper
public interface MeArticleMapper extends BaseMapper<MeArticle> {

    /**
     * 查询全部文章
     */
    List<MeArticle> queryArticleAll();

}
