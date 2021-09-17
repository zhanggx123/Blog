package com.zgx.blog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zgx.blog.pojo.RespBean;
import com.zgx.blog.pojo.StayMessage;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zgx
 * @since 2021-09-10
 */
public interface StayMessageMapper extends BaseMapper<StayMessage> {

    /**
     * 增加留言
     */
    RespBean addMessage(StayMessage stayMessage);

    /**
     * 删除留言
     */
    RespBean delMessage(Integer id);
    /**
     * 展示留言
     */
    List<StayMessage> selectMessage(StayMessage stayMessage);

}
