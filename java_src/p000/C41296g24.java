package p000;

import android.os.Build;
/* renamed from: g24  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C41296g24 implements InterfaceC35865Se4 {
    /* renamed from: d */
    public static boolean m40274d() {
        if ("HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) && "HUAWEI ALE-L04".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m40273e() {
        if ("OPPO".equalsIgnoreCase(Build.MANUFACTURER) && "A37F".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m40272f() {
        if ("Samsung".equalsIgnoreCase(Build.MANUFACTURER) && "sm-j111f".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m40271g() {
        if ("Samsung".equalsIgnoreCase(Build.MANUFACTURER) && "sm-j320f".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m40270h() {
        if ("Samsung".equalsIgnoreCase(Build.MANUFACTURER) && "sm-j700f".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m40269i() {
        if (!m40274d() && !m40271g() && !m40270h() && !m40272f() && !m40273e()) {
            return false;
        }
        return true;
    }
}
