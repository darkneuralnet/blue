package p000;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
/* renamed from: XY2 */
/* loaded from: classes.dex */
public final class XY2 {

    /* renamed from: XY2$a */
    /* loaded from: classes.dex */
    public static class C9429a {
        private C9429a() {
        }

        /* renamed from: a */
        public static Intent m76861a(Activity activity) {
            return activity.getParentActivityIntent();
        }

        /* renamed from: b */
        public static boolean m76860b(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }

        /* renamed from: c */
        public static boolean m76859c(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }

    private XY2() {
    }

    /* renamed from: a */
    public static Intent m76867a(Activity activity) {
        Intent m76861a = C9429a.m76861a(activity);
        if (m76861a != null) {
            return m76861a;
        }
        String m76865c = m76865c(activity);
        if (m76865c == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, m76865c);
        try {
            if (m76864d(activity, componentName) == null) {
                return Intent.makeMainActivity(componentName);
            }
            return new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + m76865c + "' in manifest");
            return null;
        }
    }

    /* renamed from: b */
    public static Intent m76866b(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String m76864d = m76864d(context, componentName);
        if (m76864d == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), m76864d);
        if (m76864d(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    /* renamed from: c */
    public static String m76865c(Activity activity) {
        try {
            return m76864d(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: d */
    public static String m76864d(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        int i;
        String string;
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 29) {
            i = 269222528;
        } else {
            i = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }

    /* renamed from: e */
    public static void m76863e(Activity activity, Intent intent) {
        C9429a.m76860b(activity, intent);
    }

    /* renamed from: f */
    public static boolean m76862f(Activity activity, Intent intent) {
        return C9429a.m76859c(activity, intent);
    }
}
