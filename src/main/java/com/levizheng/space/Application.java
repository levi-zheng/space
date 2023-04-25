package com.levizheng.space;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author levi
 * @since 2023/4/25
 */

@Slf4j
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        log.info("项目启动中...");
        SpringApplication.run(Application.class, args);
    }
}
