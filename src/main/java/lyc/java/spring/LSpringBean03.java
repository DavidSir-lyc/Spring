package lyc.java.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 表明这是个Bean的Java配置类
public class LSpringBean03 {
    // 定义 javaConfig Bean
    @Bean // 指定初始化回调，销毁回调
    public void javaConfigFun() { // Bean ID = app
        System.out.println("javaConfig"); // 返回App Bean
    }
}
