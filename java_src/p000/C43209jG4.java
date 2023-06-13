package p000;

import android.os.Build;
/* renamed from: jG4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C43209jG4 implements InterfaceC35865Se4 {
    /* renamed from: d */
    public static boolean m30902d() {
        if ("Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m30901e() {
        return m30902d();
    }
}
