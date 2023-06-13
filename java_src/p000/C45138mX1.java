package p000;

import android.os.Build;
import androidx.camera.core.impl.C11192d;
import androidx.camera.core.impl.InterfaceC11197f;
/* renamed from: mX1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45138mX1 implements InterfaceC35865Se4 {
    /* renamed from: d */
    public static boolean m25471d() {
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.startsWith("unknown")) {
            String str2 = Build.MODEL;
            if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Cuttlefish") && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !Build.PRODUCT.equals("google_sdk") && !Build.HARDWARE.contains("ranchu"))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m25470e() {
        m25471d();
        return false;
    }

    /* renamed from: f */
    public static boolean m25469f() {
        if ("HONOR".equalsIgnoreCase(Build.BRAND) && "STK-LX1".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m25468g() {
        if ("HUAWEI".equalsIgnoreCase(Build.BRAND) && "SNE-LX1".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m25466i() {
        return m25468g() || m25469f() || m25470e();
    }

    /* renamed from: h */
    public boolean m25467h(InterfaceC11197f.AbstractC11198a<?> abstractC11198a) {
        return abstractC11198a != C11192d.f52582i;
    }
}
