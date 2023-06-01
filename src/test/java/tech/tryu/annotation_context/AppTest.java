package tech.tryu.annotation_context;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import tech.tryu.annotation_context.server.UserServiceImpl;

import java.util.List;

@Configuration
@ComponentScan(basePackages = {"tech.tryu.annotation"})
public class AppTest {

    @Test
    public void annotationBasedSpringDemo() {
        // 初始化获取到 ApplicationContext
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppTest.class);

        System.out.println(context.getApplicationStartup());
        context.start();
        UserServiceImpl userService = context.getBean(UserServiceImpl.class);
        userService.addUser("yutianren");
        userService.addUser("mother");
        userService.addUser("father");

        List<String> user = userService.getUser();
        user.forEach(System.out::println);

    }
}
