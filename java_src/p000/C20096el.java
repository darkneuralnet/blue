package p000;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
/* renamed from: el */
/* loaded from: classes.dex */
public final class C20096el {

    /* renamed from: el$a */
    /* loaded from: classes.dex */
    public static class C20097a {
        private C20097a() {
        }

        /* renamed from: a */
        public static <T> T m42586a(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* renamed from: b */
        public static int m42585b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        /* renamed from: c */
        public static int m42584c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        /* renamed from: d */
        public static String m42583d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* renamed from: el$b */
    /* loaded from: classes.dex */
    public static class C20098b {
        private C20098b() {
        }

        /* renamed from: a */
        public static int m42582a(AppOpsManager appOpsManager, String str, int i, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        /* renamed from: b */
        public static String m42581b(Context context) {
            String opPackageName;
            opPackageName = context.getOpPackageName();
            return opPackageName;
        }

        /* renamed from: c */
        public static AppOpsManager m42580c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    private C20096el() {
    }

    /* renamed from: a */
    public static int m42589a(Context context, int i, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager m42580c = C20098b.m42580c(context);
            int m42582a = C20098b.m42582a(m42580c, str, Binder.getCallingUid(), str2);
            if (m42582a != 0) {
                return m42582a;
            }
            return C20098b.m42582a(m42580c, str, i, C20098b.m42581b(context));
        }
        return m42588b(context, str, str2);
    }

    /* renamed from: b */
    public static int m42588b(Context context, String str, String str2) {
        return C20097a.m42584c((AppOpsManager) C20097a.m42586a(context, AppOpsManager.class), str, str2);
    }

    /* renamed from: c */
    public static String m42587c(String str) {
        return C20097a.m42583d(str);
    }
}
