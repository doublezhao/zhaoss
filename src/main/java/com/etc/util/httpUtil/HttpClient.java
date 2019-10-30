package com.etc.util.httpUtil;
import java.util.Map;
/**
 * @Author kzhao
 * @Date 10/29/2019 11:07 AM
 **/

public interface HttpClient {

    /**
     * 普通get操作
     *
     * @param uri 不应该包含查询字符串
     * @return
     */
    public String get(String uri);

    /**
     * @param uri        不包含查询字符串
     * @param parameters 查询字符串，编码之前原始字符串，内部会提供编码和转义。默认UTF-8
     * @return
     */
    public String get(String uri, Map<String, String> parameters);

    /**
     * @param uri        不应该包含查询字符串
     * @param parameters 查询字符串，编码之前的原始字符串
     * @param headers    http header
     * @return
     */
    public String get(String uri, Map<String, String> parameters, Map<String, String> headers);

    /**
     * 普通post
     *
     * @param uri 不应该包含查询字符串
     * @return
     */
    public String post(String uri);

    /**
     * 数据将通过body发送
     *
     * @param uri     不应该包含查询字符串
     * @param content JSON内容文本，应该使用与client相同的编码进行
     * @return
     */
    public String post(String uri, String content);

    /**
     * 数据将通过body发送
     *
     * @param uri        不应该包含查询字符串
     * @param content    JSON格式文本
     * @param parameters 查询字符串
     * @return
     */
    public String post(String uri, String content, Map<String, String> parameters);

    /**
     * 数据将通过body发送
     *
     * @param uri        不应该包含查询字符串
     * @param content    JSON格式文本，body
     * @param parameters 查询字符串
     * @param headers    headers
     * @return
     */
    public String post(String uri, String content, Map<String, String> parameters, Map<String, String> headers);

    /**
     * 返回底层的httpClient，通常情况是用户希望直接使用此client做自定义操作。
     *
     * @return
     */
    public Object getClient();

    public String clientType();
}
