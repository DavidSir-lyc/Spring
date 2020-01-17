import lyc.java.spring.LSpringBean01;
import lyc.java.spring.LSpringBean02;
import lyc.java.spring.LSpringBean03;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // LSpringBean01 ls01 = new LSpringBean01(); // 传统方式实例化
        LSpringBean01 bean01 = context.getBean("springBean01", LSpringBean01.class);
        System.out.println("hello" + bean01.getName());

        LSpringBean02 bean02 = context.getBean("LSpringBean02", LSpringBean02.class);
        bean02.setMsg("注解式创建bean");
        bean02.getMsg();

 /*        ApplicationContext context2 = new AnnotationConfigApplicationContext(JavaConfig.class);
        JavaConfig javaConfig = (JavaConfig) context2.getBean("javaConfigFun");*/
    }
}
