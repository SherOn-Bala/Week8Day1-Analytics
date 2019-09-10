package ca.judacribz.week8day1_analytics;

import android.app.Application;

import com.flurry.android.FlurryAgent;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        new FlurryAgent.Builder()
                .withLogEnabled(true)
                .build(this, "WX554HG5GV8QTPW2J666");
    }
}
