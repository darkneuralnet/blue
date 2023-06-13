package p000;

import android.os.Build;
/* renamed from: gX1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C41580gX1 implements InterfaceC35865Se4 {
    /* renamed from: d */
    public static boolean m39195d() {
        if ("blu".equalsIgnoreCase(Build.BRAND) && "studio x10".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m39194e() {
        if ("itel".equalsIgnoreCase(Build.BRAND) && "itel w6004".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m39193f() {
        if ("positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m39192g() {
        if ("vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1805".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m39191h() {
        return m39195d() || m39194e() || m39192g() || m39193f();
    }
}
