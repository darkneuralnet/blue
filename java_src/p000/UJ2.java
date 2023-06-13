package p000;

import android.os.Build;
import java.util.Locale;
/* renamed from: UJ2 */
/* loaded from: classes6.dex */
public class UJ2 {
    private UJ2() {
    }

    /* renamed from: a */
    public static boolean m81640a() {
        return m81639b() || m81637d();
    }

    /* renamed from: b */
    public static boolean m81639b() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("lge");
    }

    /* renamed from: c */
    public static boolean m81638c() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu");
    }

    /* renamed from: d */
    public static boolean m81637d() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("samsung");
    }
}
