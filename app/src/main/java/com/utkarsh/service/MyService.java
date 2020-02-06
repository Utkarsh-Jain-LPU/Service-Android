package com.utkarsh.service;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        Toast.makeText(this,"Service Created...",Toast.LENGTH_SHORT).show();
        super.onCreate();
    }

    @Override
    public ComponentName startService(Intent service) {
        Toast.makeText(this,"Service Started...",Toast.LENGTH_SHORT).show();
        return super.startService(service);
    }

    @Override
    public boolean stopService(Intent name) {
        Toast.makeText(this,"Service Stopped...",Toast.LENGTH_SHORT).show();
        return super.stopService(name);
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this,"Service Destroyed...",Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}
