package p000;

import android.os.Build;
/* renamed from: KP2 */
/* loaded from: classes.dex */
public class KP2 implements InterfaceC35865Se4 {
    /* renamed from: d */
    public static boolean m98915d() {
        if ("itel".equalsIgnoreCase(Build.BRAND) && "itel w6004".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m98914e() {
        if ("positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m98913f() {
        return m98914e() || m98915d();
    }
}
