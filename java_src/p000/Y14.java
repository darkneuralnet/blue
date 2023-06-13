package p000;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
/* renamed from: Y14 */
/* loaded from: classes.dex */
public class Y14 implements InterfaceC35865Se4 {

    /* renamed from: a */
    public static final Set<String> f44454a = new HashSet(Arrays.asList("HWELE", "HW-02L", "HWVOG", "HWYAL", "HWLYA", "HWCOL", "HWPAR"));

    /* renamed from: b */
    public static final Set<String> f44455b = new HashSet(Arrays.asList("ELS-AN00", "ELS-TN00", "ELS-NX9", "ELS-N04"));

    /* renamed from: d */
    public static boolean m75824d() {
        if ("Huawei".equalsIgnoreCase(Build.MANUFACTURER)) {
            Set<String> set = f44454a;
            String str = Build.DEVICE;
            Locale locale = Locale.US;
            if (set.contains(str.toUpperCase(locale)) || f44455b.contains(Build.MODEL.toUpperCase(locale))) {
                return true;
            }
        }
        return false;
    }
}
