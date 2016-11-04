package com.wssholmes.stark.dagger2sample.components;

import com.wssholmes.stark.dagger2sample.MainActivity;
import com.wssholmes.stark.dagger2sample.modules.NetworkApiModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by stark on 4/11/16.
 */

@Singleton
@Component(modules = {NetworkApiModule.class})

public interface DiComponent {

    //to update fields in the activities.
    void inject(MainActivity activity);
}
