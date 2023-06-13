package p000;

import android.os.Build;
import java.util.Locale;
/* renamed from: T30 */
/* loaded from: classes.dex */
public class T30 {
    private T30() {
    }

    /* renamed from: a */
    public static boolean m84400a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        if (str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) < 0) {
            return false;
        }
        return true;
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m84399b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    /* renamed from: c */
    public static boolean m84398c() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && (i < 32 || !m84400a("Tiramisu", Build.VERSION.CODENAME))) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m84397d() {
        if (Build.VERSION.SDK_INT >= 33 && m84400a("UpsideDownCake", Build.VERSION.CODENAME)) {
            return true;
        }
        return false;
    }
}
