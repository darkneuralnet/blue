package p000;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/* renamed from: c24  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C38907c24 implements InterfaceC35865Se4 {

    /* renamed from: a */
    public static final List<String> f59912a = Arrays.asList("sunfish", "bramble", "redfin", "barbet");

    /* renamed from: d */
    public static boolean m62005d() {
        if ("Google".equals(Build.MANUFACTURER) && f59912a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()))) {
            return true;
        }
        return false;
    }
}
