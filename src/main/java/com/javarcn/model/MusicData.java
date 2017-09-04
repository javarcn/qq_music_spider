package com.javarcn.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiacheng on 2017/8/31 0031.
 */
public class MusicData {
    private List<MusicDetail> list=new ArrayList<MusicDetail>();
    private String singer_id;
    private String singer_mid;
    private String singer_name;
    private int total;

    public List<MusicDetail> getList() {
        return list;
    }

    public void setList(List<MusicDetail> list) {
        this.list = list;
    }

    public String getSinger_id() {
        return singer_id;
    }

    public void setSinger_id(String singer_id) {
        this.singer_id = singer_id;
    }

    public String getSinger_mid() {
        return singer_mid;
    }

    public void setSinger_mid(String singer_mid) {
        this.singer_mid = singer_mid;
    }

    public String getSinger_name() {
        return singer_name;
    }

    public void setSinger_name(String singer_name) {
        this.singer_name = singer_name;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
