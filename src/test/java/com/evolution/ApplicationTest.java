package com.evolution;

import org.evolution.EvolutionMainApplication;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ApplicationTest {



    @Test
    public void test1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(EvolutionMainApplication.class);

        ExecutorService executorService = Executors.newCachedThreadPool();
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor();

        System.out.println(context.getBean("userController"));
    }
}
