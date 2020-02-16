package com.test.service;


import com.test.comm.enums.MsgTypeEnum;
import com.test.comm.enums.RequestTypeEnum;
import com.test.comm.sdk.Api;
import com.test.model.Msg;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by andy QQ 1525555556 on 2020/02/13
 */
@Service
public class DispatchService {

    public void disp(Msg msg) throws IOException {
        RequestTypeEnum requestTypeEnum = RequestTypeEnum.map.get(msg.getType());
        String msgTypeDesc = msg.getMsgType()==0 ? "未知": MsgTypeEnum.map.get(msg.getMsgType()).getDesc();
        System.out.println("收到msg，事件code: "+requestTypeEnum.getType()+" ("+requestTypeEnum.getDesc()+" - "+msgTypeDesc+") msg: "+msg.getMsg());
        switch (requestTypeEnum){
            case PRIVATE:
                Api.send_text_msg(msg.getRobotWxid(), msg.getFromWxid(), "我已经收到你的消息:"+msg.getMsg());
                break;
            case GROUP:
                Api.send_text_msg(msg.getRobotWxid(), msg.getFromWxid(), "我已经收到("+msg.getFinalFromName()+") 消息为:"+msg.getMsg());
                break;
            case UNKNOW:
                break;
            case MEMBER_ADD:
                break;
            case MEMBER_DEC:
                break;
            case VERFIGY:
                break;
            case SCAN_CASH_MONEY:
                break;
            case TRANSFER:
                break;
            case STARTUP:
                break;
            case LOGIN_SUCC:
                break;
            case LOGIN_OFF:
                break;
            default:
                break;
        }

    }
}
