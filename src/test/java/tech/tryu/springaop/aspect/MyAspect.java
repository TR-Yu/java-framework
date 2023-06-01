package tech.tryu.springaop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.tryu.springaop.service.PrintServerInterface;

@Aspect
@Component
public class MyAspect {

    private static final String POINT_CUT = "execution(* tech.tryu.springaop.service.PrintServerInterface.print(..))";

    @Autowired
    private PrintServerInterface printServerInterface;

    // 定义独立的切点 Pointcut
    @Pointcut("execution(* tech.tryu.springaop.service.PrintServerInterface.print(..))")
    public void print() {
    }

    @Before("print()")
    public void beforePrint() {
        System.out.println("beforePrint");
    }

    @Around("within(tech.tryu.springaop.service.PrintServerImpl)")
    public Object aroundPrint(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println(String.join(" ",pjp.getKind(),"aroundPrint","before",pjp.getSignature().getName()));
        Object proceed = pjp.proceed();
        System.out.println(String.join(" ",pjp.getKind(),"aroundPrint","after",String.valueOf(proceed),pjp.getSignature().getName()));
        return proceed;
    }

    @After("print()")
    public void afterPrint() {
        System.out.println("afterPrint");
    }

    @AfterReturning(pointcut = "within(tech.tryu.springaop.service.PrintServerImpl)",returning = "retVal" )
    public void afterReturningPrint(Object retVal) {
        System.out.println("afterReturningPrint");
    }
    @AfterThrowing(pointcut = "within(tech.tryu.springaop.service.PrintServerImpl)",throwing = "ex")
    public void afterThrowingPrint(Exception ex) {
        System.out.println("afterThrowingPrint");
    }
}
