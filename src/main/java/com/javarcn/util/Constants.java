package com.javarcn.util;

/**
 * Created by jiacheng on 2017/8/30 0030.
 */
public class Constants {
    public static final String CN_MAN_URL="https://c.y.qq.com/v8/fcg-bin/v8.fcg?channel=singer&page=list&key=cn_man_all&format=json&pagenum=";//+page
    public static final String CN_WOMAM_URL="https://c.y.qq.com/v8/fcg-bin/v8.fcg?channel=singer&page=list&key=cn_woman_all&format=json&pagenum=";//+page
    public static final String CN_TEAM_URL="https://c.y.qq.com/v8/fcg-bin/v8.fcg?channel=singer&page=list&key=cn_team_all&format=json&pagenum=";//+page
    public static final String ALL_SINGER_URL="https://c.y.qq.com/v8/fcg-bin/v8.fcg?channel=singer&page=list&key=all_all_all&format=json&pagenum=";//+page
    public static final String  SINGER_SONG_LIST_URL="https://c.y.qq.com/v8/fcg-bin/fcg_v8_singer_track_cp.fcg?format=json&singermid=%s&order=listen&begin=0&num=%d&songstatus=1";//singermid,num
    public static final String  SINGER_INDEX_URL="https://y.qq.com/n/yqq/singer/%s.html";//singermid //歌手主页url
    public static final int MAN_PAGE_NUM=239;//华语男歌手总页数
    public static final int WOMAN_PAGE_NUM=140;//华语女歌手总页数
    public static final int TEAM_PAGE_NUM=49;//华语组合总页数
    public static final int All_PAGE_NUM=5526;//全部歌手及组合
    public static final String SINGER_TXT_PATH="d:/music/singer.txt";
    public static final String SONG_TXT_PATH="d:/music/song.txt";
}
