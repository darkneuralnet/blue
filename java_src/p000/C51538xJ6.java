package p000;

import android.os.Build;
import java.util.Locale;
/* renamed from: xJ6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C51538xJ6 implements InterfaceC35865Se4 {
    /* renamed from: d */
    public static boolean m5554d() {
        if ("samsung".equalsIgnoreCase(Build.BRAND) && Build.MODEL.toUpperCase(Locale.US).startsWith("SM-F936")) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m5553e() {
        if ("xiaomi".equalsIgnoreCase(Build.BRAND) && Build.MODEL.toUpperCase(Locale.US).startsWith("MI 8")) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m5552f() {
        return m5554d() || m5553e();
    }
}
