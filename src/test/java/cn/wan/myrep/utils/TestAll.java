package cn.wan.myrep.utils;

import cn.wan.myrep.http.NiceClient;
import org.apache.http.client.methods.HttpPost;
import org.junit.Test;

import java.io.IOException;


/**
 * Created by 万洪基 on 2016/12/23.
 */
public class TestAll {

    @Test
    public void toFileTest(){
        try {
            Nice2File.toFile("杨金政在跳高","F:\\yangjinzheng.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFanxing(){
        NiceClient niceClient=new NiceClient();
        HttpPost httpPost=new HttpPost();
        niceClient.setHeaders(httpPost);
    }
}