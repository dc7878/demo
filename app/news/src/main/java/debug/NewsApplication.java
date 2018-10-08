package debug;

import android.util.Log;

import com.cc.dc.common.base.BaseApplication;

/**
 * Created by dc on 2018/10/8.
 * NewsApplication
 */

public class NewsApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("NewsApplication", "onCreate....");
    }
}
