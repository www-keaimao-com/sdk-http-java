package com.test.controller;

import com.test.model.Msg;
import com.test.service.DispatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;


@RestController
public class WxController {

    @Autowired
    private DispatchService dispatchService;

    /**
     * Created by andy QQ 1525555556 on 2020/02/13
     */

    @RequestMapping(value = "/api")
    public String wxMsg(HttpServletRequest request, @RequestBody String body){
        Msg msg = new Msg();
        msg.setRequestId(toInt(request.getParameter("rid")));
        msg.setMsgType(toInt(request.getParameter("msg_type")));
        msg.setType(toInt(request.getParameter("type")));
        msg.setMsgId(toInt(request.getParameter("msg_id")));
        msg.setRobotWxid(request.getParameter("robot_wxid"));
        msg.setFromWxid(request.getParameter("from_wxid"));
        msg.setFromName(request.getParameter("from_name"));
        msg.setFinalFromWxid(request.getParameter("final_from_wxid"));
        msg.setFinalFromName(request.getParameter("final_from_name"));
        msg.setMsg(request.getParameter("msg"));
        msg.setMsgTime(toInt(request.getParameter("time")));
        msg.setFileUrl(request.getParameter("file_url"));

        try {
            dispatchService.disp(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String result = "rtn ok";
        return result;
    }


    private Integer toInt(String agr){
        return agr!=null ? Integer.valueOf(agr) : 0;
    }




}
