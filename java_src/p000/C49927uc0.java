package p000;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/* renamed from: uc0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C49927uc0 implements InterfaceC35865Se4 {

    /* renamed from: a */
    public static final Set<String> f112664a = new HashSet(Arrays.asList("samsungexynos7570", "samsungexynos7870", "qcom"));

    /* renamed from: d */
    public static boolean m9977d() {
        if ("SAMSUNG".equalsIgnoreCase(Build.BRAND) && f112664a.contains(Build.HARDWARE.toLowerCase())) {
            return true;
        }
        return false;
    }
}
