package p000;

import android.content.Context;
/* renamed from: cR3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C39139cR3 {
    /* renamed from: a */
    public static boolean m61310a(Context context, String str) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null && strArr.length > 0) {
                for (String str2 : strArr) {
                    if (str2.equals(str)) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m61309b(Context context, String str) {
        return NA0.m94303a(context, str) == 0;
    }
}
