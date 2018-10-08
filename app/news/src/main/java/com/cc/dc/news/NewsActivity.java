package com.cc.dc.news;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.cc.dc.common.base.BaseActivity;

@Route(path = "/news/activity")
public class NewsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
    }
}
