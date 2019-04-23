package com.guluwa.mvpdemo.retrofit;

import com.guluwa.mvpdemo.MyApplication;

public class RetrofitFactory {

    private static final Object object = new Object();

    private volatile static RetrofitWorker retrofit;

    public static RetrofitWorker getRetrofit() {
        synchronized (object) {
            if (retrofit == null) {
                retrofit = new RetrofitWorker(MyApplication.getContext());
            }
            return retrofit;
        }
    }
}
