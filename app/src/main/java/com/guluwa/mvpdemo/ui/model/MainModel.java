package com.guluwa.mvpdemo.ui.model;

import com.guluwa.mvpdemo.OnResultListener;
import com.guluwa.mvpdemo.UserBean;
import com.guluwa.mvpdemo.retrofit.ApiService;
import com.guluwa.mvpdemo.retrofit.RetrofitFactory;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainModel {

    public void sendActiveCheckCode(String name, final OnResultListener<UserBean> listener) {
        RetrofitFactory.getRetrofit().createApi(ApiService.class)
                .queryUserByUsername(name)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<UserBean>() {
                    @Override
                    public void accept(UserBean userBean) {
                        listener.success(userBean);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) {
                        listener.failed(throwable.getMessage());
                    }
                });
    }
}
