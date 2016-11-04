package com.wssholmes.stark.dagger2sample;

/**
 * Created by stark on 4/11/16.
 */

public class NetworkApi {

    public boolean validateUser(String userName, String password){

        return !(userName == null || userName.length() == 0);
    }
}
