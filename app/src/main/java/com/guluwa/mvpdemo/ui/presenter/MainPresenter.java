package com.guluwa.mvpdemo.ui.presenter;

import com.guluwa.mvpdemo.OnResultListener;
import com.guluwa.mvpdemo.UserBean;
import com.guluwa.mvpdemo.ui.model.MainModel;
import com.guluwa.mvpdemo.ui.view.MainActivity;

public class MainPresenter {

    private MainActivity mMainView;
    private MainModel mMainModel;

    public MainPresenter(MainActivity mMainView) {
        this.mMainView = mMainView;
    }

    {
        mMainModel = new MainModel();
    }

    public void sendActiveCheckCode(String name) {
        mMainModel.sendActiveCheckCode(name, new OnResultListener<UserBean>() {
            @Override
            public void success(UserBean result) {
                mMainView.setText(result.getAvatar_url());
            }

            @Override
            public void failed(String msg) {
                mMainView.setText(msg);
            }
        });
    }
}
