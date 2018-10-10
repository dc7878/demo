package com.cc.dc.app;

import com.alibaba.android.arouter.launcher.ARouter;
import com.cc.dc.common.base.BaseApplication;

/**
 * Created by dc on 2018/10/8.
 * AppApplication
 */

public class AppApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        ARouter.init(this);
    }
}
