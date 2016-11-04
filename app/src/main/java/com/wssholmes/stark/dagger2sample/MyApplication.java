package com.wssholmes.stark.dagger2sample;

import android.app.Application;

import com.wssholmes.stark.dagger2sample.components.DaggerDiComponent;
import com.wssholmes.stark.dagger2sample.components.DiComponent;

/**
 * Created by stark on 4/11/16.
 */

public class MyApplication extends Application {
    DiComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerDiComponent.builder().build();
    }

    public DiComponent getComponent(){
        return component;
    }
}
