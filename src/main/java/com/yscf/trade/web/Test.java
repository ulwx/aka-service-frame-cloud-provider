package com.yscf.trade.web;

import com.github.ulwx.aka.webmvc.AkaWebMvcProperties;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class Test implements InitializingBean {
    @Autowired
    private AkaWebMvcProperties akaWebMvcProperties;

    public void test(){
        String url=akaWebMvcProperties.getIndexUrl();
        int i=0;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        int i=0;
    }
}
