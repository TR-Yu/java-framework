package tech.tryu.transaction;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "tech.tryu.transaction")
public class TransactionDemo {

    @Test
    public void transactionTest() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TransactionDemo.class);


    }
}
