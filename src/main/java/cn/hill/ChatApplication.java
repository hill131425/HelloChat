package cn.hill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author jingyalong
 *  <p>
 *  Email 523356538@qq.com
 *  <p>
 * @date 2020年3月25日 09:45:55
 */
@SpringBootApplication
@MapperScan("cn.hill.dao")
public class ChatApplication extends SpringBootServletInitializer {
    /**
     * 重写configure方法，加载启动类
     * @param application
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ChatApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(ChatApplication.class, args);
        System.out.println("ヾ(◍°∇°◍)ﾉﾞ    启动成功      ヾ(◍°∇°◍)ﾉﾞ\n");
    }
}
