package com.javarcn.file;

import com.javarcn.model.Singer;
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
public class SingerTxt {
    private static final Logger log = LoggerFactory.getLogger(SingerTxt.class);

    public static void save(List<Singer> list) {
        try {
            PrintWriter writer=new PrintWriter(Constants.SINGER_TXT_PATH,"UTF-8");
            for(Singer singer:list){
                writer.write(singer.getFsinger_name().replace(" ","")+"\r\n");
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
