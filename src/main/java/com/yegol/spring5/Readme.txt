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
  ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
  User user = context.getBean("user",User.class);








AOP：面向切面编程
    目的：对业务逻辑的各个部分进行隔离
    不改变原代码添加新的功能：直接增加一个模块（权限判断模块）
    1AOP底层使用动态代理
    1.1有接口情况，使用JDK动态代理
    创建UserDaoImpl接口实现类(User)代理对象，利用代理对象将功能增强
   1.1.1 Class Proxy类（静态的可以直接调用）
    newProxyInstance(ClassLoader loader,类<>[] interfaces ,InvecationHandler h)
    参数1：类加载器
    参数2：增强方法所在接口，这个类实现的接口，支持多个接口
    参数3：实现这个接口InvocationHandler ,创建代理对象，写增强的方法
    1.1.2 创建一个Interface接口

    1.2没有接口情况，使用CGLIB动态代理
    创建当前类子类的代理对象
AOP术语：
    1、连接点
    类中哪些方法可以被增强就被称为连接点
    2、切入点
    类中被真正增强的方法，切入点
    3、通知(增强)
    (1)实际增强的逻辑部分
    (2)通知有多种类型：
    前置通知
    后置通知
    环绕通知
    异常通知
    最终通知
    4、切面
    动作：把通知应用到切入点过程
AOP操作(准备)
1、spring框架一般基于AspectJ实现AOP操作
AspectJ:独立AOP操作，一般把AspectJ和Spring框架一起使用
2、基于AspectJ实现AOP操作
   2.1基于xml配置文件实现
   ///////
   2.1.1创建两个类，增强类和被增强类，创建方法

   2.1.2在spring配置文件中创建两个类对象

   2.1.3在spring配置文件 bean6.xml中配置切入点

   2.2基于注解方式实现
   2.2.1开启aop注解
   <aop:aspectj-autoproxy></aop:aspectj-autoproxy>
        利用注释配置相应的切入点规则：
        前置通知 @Before
        环绕通知@Around
        后置通知@AfterReturning
        异常通知@AfterThrowing
        最终通知@After

3、项目中引入AOP相关依赖
4、切入点表达式
   4.1切入点表达式作用：知道对哪个类里面的哪个方法进行增强
   4.2语法结构
       execution([权限修饰符][返回类型][类全路径][方法名称]([参数列表]))

       举例：对com.yegol.spring5.UserImpl类里面的add进行增强
       excution(* com.yegol.spring5.UserImpl.add(...)
       所有方法就要用*

完全使用注解开发：
创建配置类，不需要创建xml配置文件



