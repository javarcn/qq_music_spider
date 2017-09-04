package com.javarcn.service;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.javarcn.model.Singer;
import com.javarcn.model.SingerModel;
import com.javarcn.util.Constants;
import com.javarcn.util.HttpUtil;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiacheng on 2017/8/30 0030.
 */
public class SingerService {
    private static final Logger log = LoggerFactory.getLogger(SingerService.class);
    private static List<Singer> singerList = new ArrayList<Singer>();


    public static List<Singer> getSingerList() {
        addManSingerList();
        addWomenSingerList();
        addTeamSingerList();
        return singerList;
    }

    private static void addManSingerList() {
        for (int page = 1; page <= Constants.MAN_PAGE_NUM; page++) {
            String result = HttpUtil.get(Constants.CN_MAN_URL + page);
            addToSingerList(result);
        }
    }

    private static void addWomenSingerList() {
        for (int page = 1; page < Constants.WOMAN_PAGE_NUM; page++) {
            String result = HttpUtil.get(Constants.CN_WOMAM_URL + page);
            addToSingerList(result);
        }

    }

    private static void addTeamSingerList() {
        for (int page = 1; page < Constants.TEAM_PAGE_NUM; page++) {
            String result = HttpUtil.get(Constants.CN_TEAM_URL + page);
            addToSingerList(result);
        }
    }

    private static void addToSingerList(String json) {
        if(StringUtils.isNotBlank(json)){
            SingerModel singerModel = new Gson().fromJson(json, SingerModel.class);
            singerList.addAll(singerModel.getData().getList());
        }
    }

}
