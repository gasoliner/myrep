package cn.wan.myrep.http;

import cn.wan.myrep.Const;
import cn.wan.myrep.utils.NiceText;
import org.apache.http.Consts;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

/**
 * Created by 万洪基 on 2016/12/19.
 */
public class NiceClient {
    public CloseableHttpClient httpClient;
    private String cookie;
    private String host;
    private String referer;
    private String user_agent;

    public NiceClient() {
        httpClient = HttpClients.createDefault();
    }


    /*
    * 待修改：
    *   setHeader方法不好用
    * */
    public CloseableHttpResponse sendRequest(String url,String method) throws IOException {
        HttpGet httpGet=new HttpGet(NiceText.dealText(url));
        HttpPost httpPost=new HttpPost(NiceText.dealText(url));
        if (cookie!=null){
            httpGet.setHeader("Cookie",cookie);
            httpPost.setHeader("Cookie",cookie);
        }
        if (host!=null){
            httpGet.setHeader("Host",host);
            httpPost.setHeader("Host",host);
        }
        if (referer!=null){
            httpGet.setHeader("Referer",referer);
            httpPost.setHeader("Referer",referer);
        }
        if (user_agent!=null){
            httpGet.setHeader("User-Agent",user_agent);
            httpPost.setHeader("User-Agent",user_agent);
        }
        if (method.equals("GET"))
        {
            return httpClient.execute(httpGet);
        }else{
            return httpClient.execute(httpPost);
        }
    }


//getter and setter


    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    public String getUser_agent() {
        return user_agent;
    }

    public void setUser_agent(String user_agent) {
        this.user_agent = user_agent;
    }
}
