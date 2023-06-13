package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
/* renamed from: tQ3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49227tQ3 {
    private C49227tQ3() {
    }

    /* renamed from: a */
    public static int m12383a(Context context, String str) {
        String str2;
        if (Binder.getCallingPid() == Process.myPid()) {
            str2 = context.getPackageName();
        } else {
            str2 = null;
        }
        return m12382b(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    /* renamed from: b */
    public static int m12382b(Context context, String str, int i, int i2, String str2) {
        boolean z;
        int m42588b;
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String m42587c = C20096el.m42587c(str);
        if (m42587c == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (myUid == i2 && C37259Yd3.m74780a(packageName, str2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m42588b = C20096el.m42589a(context, i2, m42587c, str2);
        } else {
            m42588b = C20096el.m42588b(context, m42587c, str2);
        }
        if (m42588b == 0) {
            return 0;
        }
        return -2;
    }

    /* renamed from: c */
    public static int m12381c(Context context, String str) {
        return m12382b(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
