package com.ritesh.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application.yml")
public class Properties
{
    @Autowired
    private Environment env;

    public void printEnvProps()
    {
        System.out.println(env.getProperty("APP_NAME"));
        System.out.println(env.getProperty("server.port"));
    }
}
