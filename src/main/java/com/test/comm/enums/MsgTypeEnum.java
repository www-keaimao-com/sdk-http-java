package com.test.comm.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by winn on 2020/02/12.
 */
public enum MsgTypeEnum {
    PRIVATE(1, "文本"),
    GROUP(3, "图片"),
    UNKNOW(34, "语音"),
    MEMBER_ADD(42, "名片"),
    MEMBER_DEC(43, "视频"),
    VERFIGY(47, "表情"),
    SCAN_CASH_MONEY(48, "位置"),
    TRANSFER(49, "链接"),
    STARTUP(2001, "红包"),
    LOGIN_SUCC(2002, "小程序"),
    LOGIN_OFF(2003, "群邀请")
    ;

    private Integer type;
    private String  desc;

    public static Map<Integer, MsgTypeEnum> map = new HashMap<Integer, MsgTypeEnum>();

    static {
        MsgTypeEnum[] enums = MsgTypeEnum.values();
        for (MsgTypeEnum e : enums){
            map.put(e.getType(), e);
        }
    }

    private MsgTypeEnum(Integer type, String desc){
        this.type = type;
        this.desc = desc;
    }

    public Integer getType() {
        return this.type;
    }

    public String getDesc() {
        return this.desc;
    }

    public MsgTypeEnum getEnum(Integer  type){
        return map.get(type);
    }

    public Map getEnumMap(){
        return map;
    }

}
