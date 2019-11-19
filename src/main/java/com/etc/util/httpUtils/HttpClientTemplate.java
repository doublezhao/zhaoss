package com.etc.util.httpUtils;

import java.util.Map;

/**
 * @Author kzhao
 * @Date 10/29/2019 12:32 PM
 **/

    public abstract class HttpClientTemplate implements HttpClient {

        //全局headers，即所有请求都会添加，可以被用户指定的headers覆盖
        protected Map<String, String> globalHeaders;

        protected static final String CONTENT_TYPE_JSON = "application/x-www-form-urlencoded";//default  application/x-www-form-urlencoded  application/x-www-form-urlencoded
        //json格式，限定
        protected static final String CONTENT_TYPE_JSON_PATTERN = CONTENT_TYPE_JSON + "; charset={0}";//default

        protected HttpClientConfiguration configuration = HttpClientConfiguration.common();

        protected String charset = configuration.getCharset();

        private volatile boolean init = false;

        public  HttpClientTemplate(){

        }

        public HttpClientTemplate(HttpClientConfiguration configuration) {
            if (configuration != null) {
                this.configuration = configuration;
                this.globalHeaders = configuration.getGlobalHeaders();
            }
        }

        public void setGlobalHeaders(Map<String, String> globalHeaders) {
            this.globalHeaders = globalHeaders;
            configuration.setGlobalHeaders(globalHeaders);
        }

        public synchronized void init() {
            if (init) {
                return;
            }
            init = true;
        }

        protected HttpClientConfiguration configuration() {
            return this.configuration;
        }

    }

