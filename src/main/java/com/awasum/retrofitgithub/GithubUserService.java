package com.awasum.retrofitgithub;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class GithubUserService {

    private GithubUserApi githubUserApi;

    public GithubUserService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        githubUserApi = retrofit.create(GithubUserApi.class);
    }

    GithubUser getUser(String username) throws IOException {
        return githubUserApi.getUser(username).execute().body();
    }
}
