package com.cyneck.zero.common.config;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.interceptor.DefaultTransactionAttribute;
import org.springframework.transaction.interceptor.NameMatchTransactionAttributeSource;
import org.springframework.transaction.interceptor.TransactionInterceptor;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.common.config
 * @Description : TODO
 * @Create on : 2019/5/15 14:25
 **/
@Aspect
@Configuration
public class TransactionAdviceConfig {

    private static final String AOP_POINTCUT_EXPRESSION = "execution(* com.***.service..*.*(..))";

    @Autowired
    private PlatformTransactionManager transactionManager;

    @Bean
    public TransactionInterceptor txAdvice() {

        DefaultTransactionAttribute transactionAttr_REQUIRED = new DefaultTransactionAttribute();
        transactionAttr_REQUIRED.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);

        DefaultTransactionAttribute transactionAttr_REQUIRED_READONLY = new DefaultTransactionAttribute();
        transactionAttr_REQUIRED_READONLY.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        transactionAttr_REQUIRED_READONLY.setReadOnly(true);

        NameMatchTransactionAttributeSource source = new NameMatchTransactionAttributeSource();

        source.addTransactionalMethod("save*", transactionAttr_REQUIRED);
        source.addTransactionalMethod("add*", transactionAttr_REQUIRED);
        source.addTransactionalMethod("insert*", transactionAttr_REQUIRED);
        source.addTransactionalMethod("delete*", transactionAttr_REQUIRED);
        source.addTransactionalMethod("update*", transactionAttr_REQUIRED);
        source.addTransactionalMethod("exec*", transactionAttr_REQUIRED);
        source.addTransactionalMethod("set*", transactionAttr_REQUIRED);

        source.addTransactionalMethod("get*", transactionAttr_REQUIRED_READONLY);
        source.addTransactionalMethod("query*", transactionAttr_REQUIRED_READONLY);
        source.addTransactionalMethod("find*", transactionAttr_REQUIRED_READONLY);
        source.addTransactionalMethod("list*", transactionAttr_REQUIRED_READONLY);
        source.addTransactionalMethod("count*", transactionAttr_REQUIRED_READONLY);
        source.addTransactionalMethod("is*", transactionAttr_REQUIRED_READONLY);

        return new TransactionInterceptor(transactionManager, source);
    }

    @Bean
    public Advisor txAdviceAdvisor() {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression(AOP_POINTCUT_EXPRESSION);
        return new DefaultPointcutAdvisor(pointcut, txAdvice());
    }
}
