package tech.tryu.springspi;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.SpringFactoriesLoader;

@Configuration
@ComponentScan(basePackages = {"tech.tryu.springspi"})
public class SpringSPIDemo {

    @Test
    public void demoTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringSPIDemo.class);
        SpringFactoriesLoader.loadFactories(StreamSPI.class,null).forEach(StreamSPI::read);
    }
}
