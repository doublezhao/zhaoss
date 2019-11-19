package com.etc.util.httpUtils;
import java.util.Map;
/**
 * @Author kzhao
 * @Date 10/29/2019 11:07 AM
 **/

public interface HttpClient {

    public String get(String uri);
    public String get(String uri, Map<String, String> parameters);
    public String get(String uri, Map<String, String> parameters, Map<String, String> headers);

    //post json request
    public String post(String uri);
    public String post(String uri, String content);
    public String post(String uri, String content, Map<String, String> parameters);
    public String post(String uri, String content, Map<String, String> parameters, Map<String, String> headers);

    //post form request
    public String post(String uri, Map<String, String> parameters);



    /**
     * 返回底层的httpClient，通常情况是用户希望直接使用此client做自定义操作。
     *
     * @return
     */
    public Object getClient();

    public String clientType();
}
