package com.guluwa.mvpdemo.ui.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.guluwa.mvpdemo.ui.presenter.MainPresenter;
import com.guluwa.mvpdemo.R;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private MainPresenter mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
        mMainPresenter = new MainPresenter(this);
        mMainPresenter.sendActiveCheckCode("guluwa");
    }

    public void setText(String text) {
        textView.setText(text);
    }
}
