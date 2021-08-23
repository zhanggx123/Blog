package com.zgx.blog.mapper;

import com.zgx.blog.pojo.MeCategory;
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
public interface MeCategoryMapper extends BaseMapper<MeCategory> {

    /**
     * 获取文章类型
     */
    List<MeCategory> getArticleType();

}
