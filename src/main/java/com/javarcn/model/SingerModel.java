package com.javarcn.model;

/**
 * Created by jiacheng on 2017/8/31 0031.
 */
public class SingerModel {
    private String code;
    private SingerData data = new SingerData();
    private String message;
    private String subcode;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public SingerData getData() {
        return data;
    }

    public void setData(SingerData data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSubcode() {
        return subcode;
    }

    public void setSubcode(String subcode) {
        this.subcode = subcode;
    }
}
