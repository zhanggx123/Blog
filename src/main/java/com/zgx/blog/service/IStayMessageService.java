package com.zgx.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zgx.blog.pojo.RespBean;
import com.zgx.blog.pojo.StayMessage;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zgx
 * @since 2021-09-10
 */
public interface IStayMessageService extends IService<StayMessage> {

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
    List<StayMessage> selectMessage();

}
