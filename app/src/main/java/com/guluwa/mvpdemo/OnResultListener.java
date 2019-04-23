package com.guluwa.mvpdemo;

public interface OnResultListener<T> {

    void success(T result);

    void failed(String msg);
}
