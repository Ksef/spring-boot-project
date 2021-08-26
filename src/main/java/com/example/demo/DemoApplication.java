package com.example.demo;


//Создать спринг проект.
//        Модель -
//        Client
//        id
//        name
//        email
//        postmapping('/clients') записвает клиента в бд
//        getmapping('/clients') - возвращает всех клиентов в бд
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
