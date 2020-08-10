1. spring核心功能就是：解耦！！！托管对象，随用随拿！！！
   spring的IOC容器是map结构，key是String类型，val是Object类型

2. 核心容器的2个接口
    ApplicationContext：（实际开发常用）
    他在构建核心容器时，创建对象采用的策略是：立即加载，只要一读完配置文件，就创建其中的对象。
    BeanFactory：
    他在构建核心容器时，创建对象采用的策略是：立即加载，什么时候根据id获取对象，什么时候创建对象。


3. 加载配置bean文件的方式如下：
* FileSystemXmlApplicationContext: 通过文件路径加载bean的xml配置文件
* ClassPathXmlApplicationContext: 通过类路径加载bean的xml配置文件
* WebXmlApplicationContext: 通过web网址加载bean的xml配置文件

4. 依赖注入的数据类型：
* 基本数据类型和string
* 其他的bean类型（在配置文件中或者注释过的bean）
* 复杂类型/集合类型

5. 依赖注入的方式：
* 使用构造函数提供
* 使用set方法提供
* 使用注解提供

6. 注解的分类：
* 用于创建对象的
    @Component： 把当前类对象存入spring容器，默认值是当前类名的首字母小写名。
    @Controller, @Service, @Repository： 和@Component功能一样，为了提供明确的3曾结构中。分别用在表现层，业务层，持久层。

* 用于数据注入的
    @Autowired: 自动按照类型注入
    @Qualifier:
* 用于改变作用范围的
* 生命周期相关