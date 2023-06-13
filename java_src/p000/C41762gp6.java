package p000;

import android.os.Build;
/* renamed from: gp6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C41762gp6 implements InterfaceC50063up6 {
    /* renamed from: d */
    public static boolean m37439d() {
        if ("positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m37438e() {
        return m37439d();
    }

    @Override // p000.InterfaceC50063up6
    /* renamed from: a */
    public boolean mo9692a() {
        return false;
    }

    @Override // p000.InterfaceC50063up6
    /* renamed from: b */
    public boolean mo6489b(InterfaceC33962Kb0 interfaceC33962Kb0, C52885zb4 c52885zb4) {
        if (!m37439d() || interfaceC33962Kb0.mo100139b() != 0 || c52885zb4 != C52885zb4.f121574a) {
            return false;
        }
        return true;
    }
}
