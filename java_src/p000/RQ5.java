package p000;

import android.os.Build;
import java.util.Locale;
/* renamed from: RQ5 */
/* loaded from: classes.dex */
public class RQ5 implements InterfaceC35865Se4 {
    /* renamed from: d */
    public static boolean m86763d() {
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        if ("SAMSUNG".equals(str.toUpperCase(locale)) && Build.MODEL.toUpperCase(locale).startsWith("SM-A716")) {
            return true;
        }
        return false;
    }
}
