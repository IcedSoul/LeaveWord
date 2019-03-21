package com.leaveword.config;

import org.aspectj.lang.annotation.AdviceName;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 *
 * @author IcedSoul
 *
 */
@Component
public class KiekerAspect {
    @Pointcut("execution(public * com.leaveword..*.*(..))")
    @AdviceName("opEMII")
    public void log(){}
}
