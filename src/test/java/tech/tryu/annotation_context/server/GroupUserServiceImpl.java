package tech.tryu.annotation_context.server;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Service
public class GroupUserServiceImpl implements
        UserServiceInterface, InitializingBean, ApplicationContextAware, BeanNameAware, EnvironmentAware {

    private List<String> users = new ArrayList<String>();

    private ApplicationContext applicationContext;

    private Environment environment;

    private String beanName;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean afterPropertiesSet: GroupUserServiceImpl ");
    }

    @Override
    public void addUser(String username) {
        this.users.add(username);
    }

    @Override
    public List<String> getUser() {
        return this.users;
    }

    @PostConstruct
    public void postConstructMethod() {
        System.out.println("postConstructMethod: GroupUserServiceImpl ");
    }

    @PreDestroy
    public void preDestroyMethod() {
        System.out.println("preDestroyMethod: GroupUserServiceImpl ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContextAware setApplicationContext: GroupUserServiceImpl ");
        this.applicationContext = applicationContext;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanNameAware setBeanName: GroupUserServiceImpl " + name);
        this.beanName = name;
    }

    @Override
    public void setEnvironment(Environment environment) {
        System.out.println("EnvironmentAware setEnvironment: GroupUserServiceImpl " + environment);
        this.environment= environment;
    }
}
