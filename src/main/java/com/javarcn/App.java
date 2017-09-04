package com.javarcn;

import com.javarcn.file.SingerTxt;
import com.javarcn.file.SongTxt;
import com.javarcn.model.MusicDetail;
import com.javarcn.model.Singer;
import com.javarcn.service.SingerService;
import com.javarcn.service.SongService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        long start_time = System.currentTimeMillis();
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        log.info("—、开始爬取歌手");
        List<MusicDetail> songList = new ArrayList<MusicDetail>();
        List<Singer> singerList = SingerService.getSingerList();
        log.info("二、华语歌手及组合数量共计：{}位：", singerList.size());
        for (Singer singer : singerList) {
            List<MusicDetail> list = SongService.getSongList(singer.getFsinger_mid());
            songList.addAll(list);
        }
        log.info("三、华语歌曲抓取完毕：共计：{}首", songList.size());
        long grap_time = System.currentTimeMillis();
        log.info("四、爬取所有华语歌手歌曲共耗时：{}秒", (grap_time - start_time) / 1000);
        log.info("五、开始将数据写入txt：");
        SingerTxt.save(singerList);
        SongTxt.save(songList);
        long write_time = System.currentTimeMillis();
        log.info("六、写入完毕！写入共耗时：{}秒", (write_time - grap_time) / 1000);
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }
}
