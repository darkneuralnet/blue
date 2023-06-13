package p000;

import android.os.Build;
/* renamed from: gI6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41450gI6 implements InterfaceC32381Dh3 {
    /* renamed from: d */
    public static boolean m39652d() {
        if ("motorola".equalsIgnoreCase(Build.BRAND) && "MotoG3".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m39651e() {
        if ("samsung".equalsIgnoreCase(Build.BRAND) && "SM-G532F".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m39650f() {
        if ("samsung".equalsIgnoreCase(Build.BRAND) && "SM-J700F".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m39649g(C36761Wa0 c36761Wa0) {
        return m39652d() || m39651e() || m39650f();
    }
}
