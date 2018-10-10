package debug;

import android.util.Log;

import com.cc.dc.common.base.BaseApplication;

/**
 * Created by dc on 2018/10/9.
 * MainApplication
 */

public class MainApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("MainApplication", "onCreate");
    }
}
