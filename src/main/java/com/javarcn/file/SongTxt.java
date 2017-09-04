package com.javarcn.file;

import com.javarcn.model.MusicDetail;
import com.javarcn.model.Song;
import com.javarcn.util.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by jiacheng on 2017/8/30 0030.
 */
public class SongTxt {
    private static final Logger log= LoggerFactory.getLogger(SongTxt.class);

    public static void save(List<MusicDetail> list){
        try {
            PrintWriter writer=new PrintWriter(Constants.SONG_TXT_PATH,"UTF-8");
            for(MusicDetail detail:list){
                writer.write(detail.getMusicData().getSongname()+"\r\n");
            }
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}
