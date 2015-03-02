package com.example.geovane.parsetest;

import android.app.Application;

/**
 * Created by Geovane on 01/03/2015.
 */
public class App extends Application {
    public void onCreate() {
        Parse.initialize(this, "EGAFT20y1cYZffNLEwZM2mxLuCUeQ3bx156nol8A", "ur88o9sPUSVKSmROZaczovwz05qzUVT94b3NUJNs");
    }
}
