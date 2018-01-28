1. Spring Boot的优势
    (1)Spring Boot在开发的过程中省去了大量的配置，让开发人员能更加专注于程序的开发;
    (2)Spring Boot可以以jar包的形式来运行，运行一个Spring Boot项目我们只需要通过java -jar xx.jar
    来运行，非常方便;
    (3)Spring Boot可以内嵌Tomcat，这样我们无需以war包的形式部署项目;
    (4)使用Spring或者SpringMVC我们需要添加大量的依赖，而这些依赖很多都是固定的，
    Spring Boot 通过starter能够帮助我们简化Maven配置;
    ......

2. idea中Spring Boot项目的搭建
    附上博文地址：http://blog.csdn.net/u012702547/article/details/53740047

3. 入口类和@SpringBootApplication注解
    (1)在项目建立后会在项目的根目录下会有一个artifactId+Application命名规则的入口类，本项目的入口类为：SpringbootStudy1Application,
    这个类有一个@SpringBootApplication注解，这是整个Spring Boot的核心注解，它的目的就是开启Spring Boot的自动配置;
    (2)@SpringBootApplication则是一个组合注解,我们可以在源码中看到它组合了@SpringBootConfiguration、@EnableAutoConfiguration以及@ComponentScan，
    我们在开发的过程中如果不使用@SpringBootApplication，则可以组合使用这三个注解。这三个注解中，@SpringBootConfiguration实际上就是@Configuration注解，表明这个类是一个配置类，
    @EnableAutoConfiguration则表示让Spring Boot根据类路径中的jar包依赖为当前项目进行自动配置


4. Spring Boot中bean的注入及配置文件管理
    (1)对于实体类的注入有两种方式，一个是直接在application.properties文件中写入属性，
    另一种则是用一个单独的配置文件去配置，并通过注解@Component、@ConfigurationProperties和@PropertySource
    让Spring Boot来注入
    (2)还可以在application.properties中进行中文乱码的适配已经日志输出、访问路径修改等，还可以适配不同开发环境下
    的配置文件