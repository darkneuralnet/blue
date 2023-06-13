package p000;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
/* renamed from: fa4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41017fa4 {
    private C41017fa4() {
    }

    /* renamed from: b */
    public static boolean m41160b(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    /* renamed from: c */
    public static void m41159c(Context context) {
        if (C41610ga4.m39148b(context)) {
            return;
        }
        m41156f(new ExecutorC49647u74(), context, m41155g(context));
    }

    /* renamed from: d */
    public static boolean m41158d(Context context) {
        String notificationDelegate;
        if (!PlatformVersion.isAtLeastQ()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
            }
            return false;
        } else if (!m41160b(context)) {
            Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
            return false;
        } else {
            notificationDelegate = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate();
            if (!"com.google.android.gms".equals(notificationDelegate)) {
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "GMS core is set for proxying");
                return true;
            }
            return true;
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m41157e(Context context, boolean z, TaskCompletionSource taskCompletionSource) {
        String notificationDelegate;
        try {
            if (!m41160b(context)) {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                return;
            }
            C41610ga4.m39147c(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else {
                notificationDelegate = notificationManager.getNotificationDelegate();
                if ("com.google.android.gms".equals(notificationDelegate)) {
                    notificationManager.setNotificationDelegate(null);
                }
            }
        } finally {
            taskCompletionSource.trySetResult(null);
        }
    }

    @TargetApi(29)
    /* renamed from: f */
    public static Task<Void> m41156f(Executor executor, final Context context, final boolean z) {
        if (!PlatformVersion.isAtLeastQ()) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: ea4
            @Override // java.lang.Runnable
            public final void run() {
                C41017fa4.m41157e(context, z, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: g */
    public static boolean m41155g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
