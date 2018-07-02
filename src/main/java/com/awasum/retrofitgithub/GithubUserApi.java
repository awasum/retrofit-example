package com.awasum.retrofitgithub;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface GithubUserApi {

    @GET("/users")
    public Call<List<GithubUser>> getUsers(
            @Query("per_page") int per_page,
            @Query("page") int page);

    @GET("/users/{username}")
    public Call<GithubUser> getUser(@Path("username") String username);
}

