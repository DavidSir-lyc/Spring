package lyc.java.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Component 通用注解
 * @Named 通用注解
 * @Repository 持久化层组件注解
 * @Service 业务层组件注解
 * @Controller 控制层组件注解
 * @Scope 用于指定作用域
 * */
@Component
public class LSpringBean02 {
    private String message;
    /**
     * @PostConstruct 指定初始化回调方法
     * @PreDestroy 指定销毁回调方法
     *
     * */
    public void setMsg(String msg) {
        this.message = msg;
    }
    public void getMsg() {
        System.out.println("learn:"+message);
    }
}
