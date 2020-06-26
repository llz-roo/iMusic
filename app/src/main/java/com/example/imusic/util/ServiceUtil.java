package com.example.imusic.util;

import android.app.ActivityManager;
import android.content.Context;

import java.util.List;

public class ServiceUtil {
    public static boolean isServiceRunning(Context context, String serviceName) {
        ActivityManager am = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningServiceInfo> infos = am.getRunningServices(100);
        for (ActivityManager.RunningServiceInfo info : infos) {
            String name = info.service.getClassName();
            if (name.equals(serviceName)) {
                return true;
            }
        }
        return false;
    }

}
