package org.evolution;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "org.evolution.user.dao.mapper")
@SpringBootApplication
public class EvolutionMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(EvolutionMainApplication.class,args);
    }
}
