package p000;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.app.NotificationManagerCompat;
import java.io.File;
import java.util.concurrent.Executor;
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: NA0 */
/* loaded from: classes.dex */
public class NA0 {

    /* renamed from: a */
    public static final Object f24227a = new Object();

    /* renamed from: b */
    public static final Object f24228b = new Object();

    /* renamed from: NA0$a */
    /* loaded from: classes.dex */
    public static class C5488a {
        private C5488a() {
        }

        /* renamed from: a */
        public static void m94289a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* renamed from: b */
        public static void m94288b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* renamed from: NA0$b */
    /* loaded from: classes.dex */
    public static class C5489b {
        private C5489b() {
        }

        /* renamed from: a */
        public static File[] m94287a(Context context) {
            return context.getExternalCacheDirs();
        }

        /* renamed from: b */
        public static File[] m94286b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        /* renamed from: c */
        public static File[] m94285c(Context context) {
            return context.getObbDirs();
        }
    }

    /* renamed from: NA0$c */
    /* loaded from: classes.dex */
    public static class C5490c {
        private C5490c() {
        }

        /* renamed from: a */
        public static File m94284a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        public static Drawable m94283b(Context context, int i) {
            return context.getDrawable(i);
        }

        /* renamed from: c */
        public static File m94282c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* renamed from: NA0$d */
    /* loaded from: classes.dex */
    public static class C5491d {
        private C5491d() {
        }

        /* renamed from: a */
        public static int m94281a(Context context, int i) {
            return context.getColor(i);
        }

        /* renamed from: b */
        public static <T> T m94280b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* renamed from: c */
        public static String m94279c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* renamed from: NA0$e */
    /* loaded from: classes.dex */
    public static class C5492e {
        private C5492e() {
        }

        /* renamed from: a */
        public static Context m94278a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        /* renamed from: b */
        public static File m94277b(Context context) {
            return context.getDataDir();
        }

        /* renamed from: c */
        public static boolean m94276c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* renamed from: NA0$f */
    /* loaded from: classes.dex */
    public static class C5493f {
        private C5493f() {
        }

        /* renamed from: a */
        public static Intent m94275a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            Intent registerReceiver;
            if ((i & 4) != 0 && str == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, NA0.m94293k(context), handler);
            }
            registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1);
            return registerReceiver;
        }

        /* renamed from: b */
        public static ComponentName m94274b(Context context, Intent intent) {
            ComponentName startForegroundService;
            startForegroundService = context.startForegroundService(intent);
            return startForegroundService;
        }
    }

    /* renamed from: NA0$g */
    /* loaded from: classes.dex */
    public static class C5494g {
        private C5494g() {
        }

        /* renamed from: a */
        public static Executor m94273a(Context context) {
            Executor mainExecutor;
            mainExecutor = context.getMainExecutor();
            return mainExecutor;
        }
    }

    /* renamed from: a */
    public static int m94303a(Context context, String str) {
        C37259Yd3.m74777d(str, "permission must be non-null");
        if (!T30.m84398c() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            if (NotificationManagerCompat.from(context).areNotificationsEnabled()) {
                return 0;
            }
            return -1;
        }
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    /* renamed from: b */
    public static Context m94302b(Context context) {
        return C5492e.m94278a(context);
    }

    /* renamed from: c */
    public static int m94301c(Context context, int i) {
        return C5491d.m94281a(context, i);
    }

    /* renamed from: d */
    public static ColorStateList m94300d(Context context, int i) {
        return C49785uM4.m10398e(context.getResources(), i, context.getTheme());
    }

    /* renamed from: e */
    public static Drawable m94299e(Context context, int i) {
        return C5490c.m94283b(context, i);
    }

    /* renamed from: f */
    public static File[] m94298f(Context context) {
        return C5489b.m94287a(context);
    }

    /* renamed from: g */
    public static File[] m94297g(Context context, String str) {
        return C5489b.m94286b(context, str);
    }

    /* renamed from: h */
    public static Executor m94296h(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C5494g.m94273a(context);
        }
        return C32379Dh1.m110004a(new Handler(context.getMainLooper()));
    }

    /* renamed from: i */
    public static File m94295i(Context context) {
        return C5490c.m94282c(context);
    }

    /* renamed from: j */
    public static <T> T m94294j(Context context, Class<T> cls) {
        return (T) C5491d.m94280b(context, cls);
    }

    /* renamed from: k */
    public static String m94293k(Context context) {
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (C49227tQ3.m12381c(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    /* renamed from: l */
    public static boolean m94292l(Context context, Intent[] intentArr, Bundle bundle) {
        C5488a.m94289a(context, intentArr, bundle);
        return true;
    }

    /* renamed from: m */
    public static void m94291m(Context context, Intent intent, Bundle bundle) {
        C5488a.m94288b(context, intent, bundle);
    }

    /* renamed from: n */
    public static void m94290n(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            C5493f.m94274b(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
