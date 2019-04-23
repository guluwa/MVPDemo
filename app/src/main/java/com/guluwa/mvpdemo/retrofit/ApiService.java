package com.guluwa.mvpdemo.retrofit;

import com.guluwa.mvpdemo.UserBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

    @GET("/users/{username}")
    Observable<UserBean> queryUserByUsername(@Path("username") String username);
}
