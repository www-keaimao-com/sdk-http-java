package com.test.model;

public class Msg {

    private Integer requestId;
    private Integer msgId;
    private Integer type;
    private Integer msgType;

    private String  robotWxid;
    private String  fromWxid;
    private String  fromName;
    private String  finalFromWxid;
    private String  finalFromName;
    private String  msg;
    private Integer msgTime;
    private String  fileUrl;

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getMsgType() {
        return msgType;
    }

    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    public String getRobotWxid() {
        return robotWxid;
    }

    public void setRobotWxid(String robotWxid) {
        this.robotWxid = robotWxid;
    }

    public String getFromWxid() {
        return fromWxid;
    }

    public void setFromWxid(String fromWxid) {
        this.fromWxid = fromWxid;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getFinalFromWxid() {
        return finalFromWxid;
    }

    public void setFinalFromWxid(String finalFromWxid) {
        this.finalFromWxid = finalFromWxid;
    }

    public String getFinalFromName() {
        return finalFromName;
    }

    public void setFinalFromName(String finalFromName) {
        this.finalFromName = finalFromName;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(Integer msgTime) {
        this.msgTime = msgTime;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }
}
