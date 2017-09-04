package com.javarcn.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiacheng on 2017/8/31 0031.
 */
public class SingerData {
    private List<Singer> list=new ArrayList<Singer>();
    private int per_page;
    private int total;
    private int total_page;

    public List<Singer> getList() {
        return list;
    }

    public void setList(List<Singer> list) {
        this.list = list;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal_page() {
        return total_page;
    }

    public void setTotal_page(int total_page) {
        this.total_page = total_page;
    }
}
