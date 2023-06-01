package tech.tryu.xml_context;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.tryu.xml_context.services.PetStoreServiceImpl;

/**
 * Unit test for simple App.
 */
public class AppTest {

    // XML 配置的 spring 容器初始化
    @Test
    public void XMLClassConfig() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("configure/services.xml");
        PetStoreServiceImpl petStore = applicationContext.getBean("petStore", PetStoreServiceImpl.class);
        System.out.println(petStore);
    }
}
