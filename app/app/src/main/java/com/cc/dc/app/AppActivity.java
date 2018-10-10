package com.cc.dc.app;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.cc.dc.common.base.BaseActivity;

public class AppActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 跳转到News Module
     * @param view
     */
    public void clickToNewsModule(View view) {
        ARouter.getInstance().build("/news/activity").navigation();
    }
}
