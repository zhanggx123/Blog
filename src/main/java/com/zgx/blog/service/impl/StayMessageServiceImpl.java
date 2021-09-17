package com.zgx.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zgx.blog.mapper.StayMessageMapper;
import com.zgx.blog.pojo.RespBean;
import com.zgx.blog.pojo.StayMessage;
import com.zgx.blog.service.IStayMessageService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zgx
 * @since 2021-09-10
 */
@Service
public class StayMessageServiceImpl extends ServiceImpl<StayMessageMapper, StayMessage> implements IStayMessageService {

    private IStayMessageService stayMessageService;

    @Override
    public RespBean addMessage(StayMessage stayMessage) {
        if(stayMessageService.save(stayMessage)){
            return RespBean.success("留言成功!");
        }
        return RespBean.error("留言失败!");
    }

    @Override
    public RespBean delMessage(Integer id) {
        if(stayMessageService.removeById(id)){
            return RespBean.success("删除成功!");
        }
        return RespBean.error("删除失败!");
    }

    @Override
    public List<StayMessage> selectMessage() {
        List<StayMessage> stayMessageList = stayMessageService.list();
        return stayMessageList;
    }
}
