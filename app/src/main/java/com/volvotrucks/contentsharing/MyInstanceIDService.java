package com.volvotrucks.contentsharing;

import android.content.Intent;
import android.util.Log;

import com.google.firebase.iid.*;
/**
 * Created by admin on 25.01.2018.
 */

public class MyInstanceIDService extends FirebaseInstanceIdService {

    private static final String TAG = "MyInstanceIDService";

    @Override
    public void onTokenRefresh() {

        Log.d(TAG, "Refreshing GCM Registration Token");

        Intent intent = new Intent(this, RegistrationIntentService.class);
        startService(intent);
    }
}
