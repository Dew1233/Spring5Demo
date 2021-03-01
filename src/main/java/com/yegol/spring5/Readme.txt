IOC操作Bean管理
1基于xml实现自动装配
    bean标签属性autowrite,配置自动装配
    autowrite属性常用两个值：
    byName根据属性名称注入，注入bean的id值和类属性名称一样
    byType根据属性类型注入

2IOC操作Bean管理(外部属性文件)
(1)直接配置数据库信息
   a  druid配置连接池
   b  引入jar包
(2)引入外部属性文件配置数据库连接池
   a 创建外部属性文件写上数据库的信息
   b 把外部properties属性文件引入spring配置文件 新建jdbc.properties
     引入context名称空间

3IOC操作Bean管理(基于注解方式)
注解：是代码特殊标记，格式：@注解名称(属性名称=属性值，属性名称=属性值……)
     注解作用在 类上面 方法上面 属性上面
     目的：简化xml文件配置

     针对Bean管理中创建对象提供注解
     @Component //bean4
     @Service
     @Contorller
     @Repositiry
     四个注解功能都是一样的，都可以用来创建bean实例

4基于注解方式实现对象创建
     1引入依赖
     额外引入aop依赖jar包
     2开启组件扫描
     3创建类，在类上面添加创建对象注解
     增加context配置
      xmlns:context="http://www.springframework.org/schema/context"
      http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-3.0.xsd


5基于注解方式实现属性注入
     1@Autowired:根据属性类型进行自动配置
     1.1把service和dao对象创建出来,在service和dao类中添加创建对象注解
     1.2在service注入dao对象,在service类中添加dao类型属性，在属性上面使用注解


     2@Qualifier：根据属性名称进行注入
     2.1要和@Autowired一起使用，

     3@Resource：可以根据类型注入，可以根据名称注入
     @Resource(name = "userDaoImpl1")
     4@Value:注入普通类型属性

    6完全注解开发、
    1创建配置类，代替xml配置文件
    @Configuration

    2创建测试类















