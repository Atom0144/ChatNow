package com.satish.chatnow;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ChatNowApplication extends Application{
    @Override
    public void onCreate() {
        Parse.enableLocalDatastore(this);
        super.onCreate();
        Parse.initialize(this, "PMKloonmdHxwe5mfge6z06oX2yAUM8kvTy3mJjdj", "45Rm8lEUwtMRcjPKDRq0QcAUVdyYknBJKXmGUhZZ");


    }
}
