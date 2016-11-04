package com.wssholmes.stark.dagger2sample.modules;

import com.wssholmes.stark.dagger2sample.NetworkApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by stark on 4/11/16.
 */

@Module
public class NetworkApiModule {

    @Provides
    @Singleton
    public NetworkApi getNetwork(){
        return new NetworkApi();
    }
}
