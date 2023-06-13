package p000;

import android.os.Build;
/* renamed from: Ui1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C36366Ui1 implements InterfaceC35865Se4 {
    /* renamed from: d */
    public static boolean m81046d() {
        if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m81045e() {
        return m81046d();
    }
}
