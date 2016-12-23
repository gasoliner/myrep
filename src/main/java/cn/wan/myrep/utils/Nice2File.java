package cn.wan.myrep.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by 万洪基 on 2016/12/19.
 */
public class Nice2File {
    public static void toFile(String txt,String filename) throws IOException {
        File file=new File(filename);
        if (!file.exists())
        {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        fileOutputStream.write(txt.getBytes());
        fileOutputStream.flush();
        fileOutputStream.close();
    }
}
