package com.test.comm.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by winn on 2020/02/12.
 */
public enum RequestTypeEnum {
    PRIVATE(100, "私聊消息"),
    GROUP(200, "群聊消息"),
    UNKNOW(300, "未知消息"),
    MEMBER_ADD(400, "新人进群"),
    MEMBER_DEC(410, "有人退群"),
    VERFIGY(500, "好友请求验证"),
    SCAN_CASH_MONEY(600, "二维码收款"),
    TRANSFER(700, "好友转账"),
    STARTUP(800, "软件启动"),
    LOGIN_SUCC(900, "账号登录成功"),
    LOGIN_OFF(910, "账号下线")
    ;

    private Integer type;
    private String  desc;

    public static Map<Integer, RequestTypeEnum> map = new HashMap<Integer, RequestTypeEnum>();

    static {
        RequestTypeEnum[] enums = RequestTypeEnum.values();
        for (RequestTypeEnum e : enums){
            map.put(e.getType(), e);
        }
    }

    private RequestTypeEnum(Integer type, String desc){
        this.type = type;
        this.desc = desc;
    }

    public Integer getType() {
        return this.type;
    }

    public String getDesc() {
        return this.desc;
    }

    public RequestTypeEnum getEnum(Integer  type){
        return map.get(type);
    }

    public Map getEnumMap(){
        return map;
    }

}
