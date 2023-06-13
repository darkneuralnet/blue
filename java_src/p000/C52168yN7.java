package p000;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
@TargetApi(24)
/* renamed from: yN7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52168yN7 {

    /* renamed from: a */
    public static final Method f119476a;

    /* renamed from: b */
    public static final Method f119477b;

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
        f119476a = method;
        try {
            method2 = UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
        } catch (NoSuchMethodException unused2) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
            }
        }
        f119477b = method2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m3531a(Context context, JobInfo jobInfo, String str, String str2) {
        Integer num;
        int intValue;
        Method method;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        jobScheduler.getClass();
        if (f119476a != null && context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") == 0) {
            Method method2 = f119477b;
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
                    method = f119476a;
                    if (method != null) {
                        try {
                            Integer num2 = (Integer) method.invoke(jobScheduler, jobInfo, "com.google.android.gms", Integer.valueOf(intValue), "UploadAlarm");
                            if (num2 == null) {
                                return 0;
                            }
                            return num2.intValue();
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.e("UploadAlarm", "error calling scheduleAsPackage", e2);
                        }
                    }
                    return jobScheduler.schedule(jobInfo);
                }
            }
            intValue = 0;
            method = f119476a;
            if (method != null) {
            }
            return jobScheduler.schedule(jobInfo);
        }
        return jobScheduler.schedule(jobInfo);
    }
}
