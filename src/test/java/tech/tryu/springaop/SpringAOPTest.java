package tech.tryu.springaop;

import org.junit.Test;
import org.springframework.context.annotation.*;
import tech.tryu.springaop.aspect.MyAspect;
import tech.tryu.springaop.service.PrintServerInterface;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "tech.tryu.springaop")
public class SpringAOPTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringAOPTest.class);
        MyAspect bean = context.getBean(MyAspect.class);
        context.getBeansOfType(PrintServerInterface.class).forEach((k, v) -> {
            System.out.println(k + " " + v);
            v.print("test");
        });
    }
}
