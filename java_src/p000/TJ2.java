package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
/* renamed from: TJ2 */
/* loaded from: classes2.dex */
public class TJ2 {
    /* renamed from: a */
    public static ActivityInfo m83894a(Context context, Class cls) {
        try {
            ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
            if (activityInfoArr != null) {
                for (ActivityInfo activityInfo : activityInfoArr) {
                    if (activityInfo.name.equals(cls.getName())) {
                        return activityInfo;
                    }
                }
                return null;
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m83893b(Context context, String str, Class cls) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Intent addCategory = intent.setData(Uri.parse(str + "://")).addCategory("android.intent.category.DEFAULT").addCategory("android.intent.category.BROWSABLE");
        ActivityInfo m83894a = m83894a(context, cls);
        if (m83894a != null && m83894a.launchMode == 2 && C13650cj.m61026a(context, addCategory)) {
            return true;
        }
        return false;
    }
}
