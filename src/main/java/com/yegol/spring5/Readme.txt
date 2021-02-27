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
     @Component
     @Service
     @Contorller
     @Repositiry
     四个注解功能都是一样的，都可以用来创建bean实例

     基于注解方式实现对象创建
     引入依赖

     开启组件扫描

