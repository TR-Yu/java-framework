package tech.tryu.springspi;
/**
 * 该包下是实行Spring SPI的测试代码
 * 首先在src\main\resources\META-INF\spring.factories中配置 key/value ,key 为接口全路径,value 为实现类全路径
 * 使用 Spring SPI 时,需要在pom.xml中引入spring-context依赖,
 * Spring-specific SPI机制是通过 SpringFactoriesLoader#loadFactoryNames加载对应的接口文本内的配置信息,并由 map 保持读取的
 * key=values 值，并在查询是返回对应的 values 值，然后 调用 SpringApplication#createSpringFactoriesInstances(Class, Class[], Object...)方法中通过反射创建实例
 * 而不是直接通过调用 SpringFactoriesLoader#loadFactory 来直接获取到实例List
 */