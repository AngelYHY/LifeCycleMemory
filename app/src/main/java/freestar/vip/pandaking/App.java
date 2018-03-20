package freestar.vip.pandaking;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

import vip.freestar.mylogger.Logger;

/**
 * 描述：
 * 作者：一颗浪星
 * 日期：2018/2/27
 * github：
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
//        if (LeakCanary.isInAnalyzerProcess(this)) {
//            // This process is dedicated to LeakCanary for heap analysis.
//            // You should not init your app in this process.
//            return;
//        }
        Logger.init();
        LeakCanary.install(this);
    }
}
