package p000;

import android.os.Build;
/* renamed from: sW5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C48690sW5 implements InterfaceC35865Se4 {
    /* renamed from: d */
    public static boolean m14119d() {
        if ("LENOVO".equalsIgnoreCase(Build.MANUFACTURER) && "Q706F".equalsIgnoreCase(Build.DEVICE)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m14118e() {
        if ("OPPO".equalsIgnoreCase(Build.MANUFACTURER) && "OP4E75L1".equalsIgnoreCase(Build.DEVICE)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m14117f() {
        if ("SAMSUNG".equalsIgnoreCase(Build.MANUFACTURER)) {
            String str = Build.DEVICE;
            if ("F2Q".equalsIgnoreCase(str) || "Q2Q".equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m14116g() {
        if (Build.VERSION.SDK_INT < 33 && (m14117f() || m14118e() || m14119d())) {
            return true;
        }
        return false;
    }
}
