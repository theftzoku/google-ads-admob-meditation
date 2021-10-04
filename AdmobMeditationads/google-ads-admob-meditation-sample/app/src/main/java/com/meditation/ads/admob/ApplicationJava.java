package com.meditation.ads.admob;

import androidx.multidex.MultiDexApplication;

import com.google.android.gms.ads.MobileAds;

public class ApplicationJava extends MultiDexApplication {

    MyHelper appOpenManager;

    @Override
    public void onCreate() {
        super.onCreate();
        MobileAds.initialize(this, initializationStatus -> {
        });

        appOpenManager = new MyHelper(this);
    }
}
