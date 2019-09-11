package com.ibm;

import com.ibm.model.ClienteEntity;
import com.ibm.model.ProdutoEntity;
import com.ibm.model.Produto_VendaEntity;
import com.ibm.model.VendaEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.ibm.repository")
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.ibm")
@EntityScan(basePackageClasses = {ClienteEntity.class, ProdutoEntity.class, Produto_VendaEntity.class, VendaEntity.class})
@SpringBootApplication
public class ApplicationController {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationController.class, args);
    }
}