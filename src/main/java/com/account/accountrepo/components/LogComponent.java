package com.account.accountrepo.components;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogComponent {
    private static final Logger LOGGER = LoggerFactory.getLogger("com.account.accountrepo.LogComponent");

    @Around("execution(* com.account.accountrepo.controller..*.* (..))")
    public Object logBeforeAndAfterServiceMethods(ProceedingJoinPoint pjp) throws Throwable {
        LOGGER.info("{} has started execution.", pjp.getSignature());
        Object resultOfMethodCall = pjp.proceed();
        LOGGER.info("{} finished execution", pjp.getSignature());
        return resultOfMethodCall;
    }
}
