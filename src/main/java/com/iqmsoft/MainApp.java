package com.iqmsoft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iqmsoft.student.Student;
import com.iqmsoft.student.StudentJdbcRepository;

@SpringBootApplication
public class MainApp {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StudentJdbcRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(MainApp.class, args);
    }

}
