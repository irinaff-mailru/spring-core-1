package sorokin.dev.task6.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PaymentAspect {

    @Before("execution(* sorokin.dev.task6.PaymentService.processPayment(..))")
    public void beforePayment(JoinPoint joinPoint) {
        System.out.println("Начало выполнения метода: " + joinPoint.getSignature().getName());
    }

    @AfterReturning(
            pointcut = "execution(* sorokin.dev.task6.PaymentService.checkStatus(..))",
            returning = "result"
    )
    public void afterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("Метод: " + joinPoint.getSignature().getName() + " завершился. Результат: " + result);
    }

    @AfterThrowing(
            pointcut = "execution(* sorokin.dev.task6.PaymentService.processPayment(..))",
            throwing = "ex"
    )
    public void afterThrowing(JoinPoint joinPoint, Exception ex) {
        System.out.println("Ошибка при выполнении метода: " + joinPoint.getSignature().getName());
        System.out.println("Причина: " + ex.getMessage());
    }

    @Around("execution(* sorokin.dev.task6.PaymentService.processPayment(..))")
    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Проверка статуса платежа...");
        Object result = pjp.proceed();
        System.out.println("Проверка завершена.");
        return result;
    }

}
