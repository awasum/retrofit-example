package com.awasum.retrofitgithub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class RetrofitGithubApplication {

    public static void main(String[] args) {
        SpringApplication.run(RetrofitGithubApplication.class, args);

        String user = "awasum";
        try {
            GithubUser githubUser = new GithubUserService().getUser(user);
            System.out.println(githubUser.getId());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
