package com.google.android.gms.internal.gtm;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
@TargetApi(24)
/* loaded from: classes5.dex */
public final class zzfv {
    private static final Method zza;
    private static final Method zzb;

    static {
        Method method;
        Method method2 = null;
        try {
            method = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            }
            method = null;
        }
        zza = method;
        try {
            method2 = UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
        } catch (NoSuchMethodException unused2) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
            }
        }
        zzb = method2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(Context context, JobInfo jobInfo, String str, String str2) {
        Integer num;
        int intValue;
        Method method;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        jobScheduler.getClass();
        if (zza != null && context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") == 0) {
            Method method2 = zzb;
            if (method2 != null) {
                try {
                    num = (Integer) method2.invoke(UserHandle.class, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    if (Log.isLoggable("JobSchedulerCompat", 6)) {
                        Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                    }
                }
                if (num != null) {
                    intValue = num.intValue();
                    method = zza;
                    if (method != null) {
                        try {
                            Integer num2 = (Integer) method.invoke(jobScheduler, jobInfo, "com.google.android.gms", Integer.valueOf(intValue), "DispatchAlarm");
                            if (num2 == null) {
                                return 0;
                            }
                            return num2.intValue();
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.e("DispatchAlarm", "error calling scheduleAsPackage", e2);
                        }
                    }
                    return jobScheduler.schedule(jobInfo);
                }
            }
            intValue = 0;
            method = zza;
            if (method != null) {
            }
            return jobScheduler.schedule(jobInfo);
        }
        return jobScheduler.schedule(jobInfo);
    }
}
