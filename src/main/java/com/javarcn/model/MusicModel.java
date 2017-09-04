package com.javarcn.model;

/**
 * Created by jiacheng on 2017/8/31 0031.
 */
public class MusicModel {
    private String code;
    private MusicData data=new MusicData();
    private String message;
    private String subcode;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public MusicData getData() {
        return data;
    }

    public void setData(MusicData data) {
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
