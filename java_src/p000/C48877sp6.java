package p000;

import android.os.Build;
/* renamed from: sp6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C48877sp6 implements InterfaceC35865Se4 {
    /* renamed from: d */
    public static boolean m13599d() {
        if ("Samsung".equalsIgnoreCase(Build.BRAND) && Build.VERSION.SDK_INT < 29) {
            return true;
        }
        return false;
    }
}
