package p000;

import android.os.Build;
/* renamed from: wh1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C51163wh1 implements InterfaceC50063up6 {
    /* renamed from: d */
    public static boolean m6488d() {
        if ("Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J400G".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m6487e() {
        if ("Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J710MN".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m6486f() {
        if ("Samsung".equalsIgnoreCase(Build.BRAND) && "SM-G610M".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m6485g() {
        return m6488d() || m6486f() || m6487e();
    }

    @Override // p000.InterfaceC50063up6
    /* renamed from: b */
    public boolean mo6489b(InterfaceC33962Kb0 interfaceC33962Kb0, C52885zb4 c52885zb4) {
        if (m6488d()) {
            if (c52885zb4 == C52885zb4.f121576c || c52885zb4 == C52885zb4.f121577d) {
                return true;
            }
            return false;
        } else if ((m6486f() || m6487e()) && c52885zb4 == C52885zb4.f121576c) {
            return true;
        } else {
            return false;
        }
    }
}
