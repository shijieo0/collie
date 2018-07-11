package com.huawei.wsd.dto;

import com.huawei.wsd.util.UUIDGenerator;

/**
 * Created by ShiJie on 2018-06-24 23:41
 */
public class Response {

    private String msgId;

    public Response() {
        this.msgId = UUIDGenerator.getUUID();
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }
}
