package com.moon.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JavaSpringProp implements InitializingBean {

    private static final Logger logger = LoggerFactory.getLogger(JavaSpringProp.class);

    private String ip;

    private int port;

    private String username = "hello";

    private static String password = "word";

    public String getIp() {
        return ip;
    }

    @Value("127.0.0.1")
    private void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        port = 6666;
    }

    public void outContent() {

        logger.info("ip: {}", getIp());
        logger.info("port: {}", getPort());
        logger.info("username: {}", getUsername());
        logger.info("password: {}", password);
    }

}
