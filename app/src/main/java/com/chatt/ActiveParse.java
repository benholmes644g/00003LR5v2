package com.chatt;

import android.app.Application;

import com.parse.Parse;
import com.parse.interceptors.ParseLogInterceptor;

/**
 * Created by mithramedia on 13/07/16.
 */
public class ActiveParse extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("com.unanimous.studio")
                .addNetworkInterceptor(new ParseLogInterceptor())
                //.server("http://192.168.1.197:1337/parse/").build());
                .server("http://23.249.163.152:1338/parse/").build());
    }
}
