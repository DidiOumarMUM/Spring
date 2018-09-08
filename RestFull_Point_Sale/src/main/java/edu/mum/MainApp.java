package edu.mum;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@EnableJpaAuditing
@EnableAutoConfiguration
@EntityScan("edu.mum")
@SpringBootApplication
public class MainApp {

	final public static void main(String[] args) {
		// TODO Auto-generated method stub
       SpringApplication.run(MainApp.class, args);
		//System.out.println(integerReplacement(10000)) ;
	}
	

}
