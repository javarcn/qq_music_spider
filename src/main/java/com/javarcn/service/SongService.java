package com.javarcn.service;

import com.google.gson.Gson;
import com.javarcn.model.MusicDetail;
import com.javarcn.model.MusicModel;
import com.javarcn.model.Song;
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
public class SongService {
    private static final Logger log = LoggerFactory.getLogger(SongService.class);


    public static List<MusicDetail> getSongList(String singerMid) {
        List<MusicDetail> musicDetailList = new ArrayList<MusicDetail>();
        MusicModel musicModel = null;
        String url = String.format(Constants.SINGER_SONG_LIST_URL, singerMid, getSongNum(singerMid));
        String result = HttpUtil.get(url);
        if (StringUtils.isNotBlank(result)) {
            musicModel = new Gson().fromJson(result, MusicModel.class);
            musicDetailList.addAll(musicModel.getData().getList());
        }
        return musicDetailList;
    }

    private static int getSongNum(String singerMid) {
        String url = String.format(Constants.SINGER_SONG_LIST_URL, singerMid, 1);
        String result = HttpUtil.get(url);
        if (StringUtils.isNotBlank(result)) {
            MusicModel musicModel = new Gson().fromJson(result, MusicModel.class);
            return musicModel.getData().getTotal();
        }
        return 0;
    }
}
