package p000;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
/* renamed from: lX1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C44545lX1 implements InterfaceC35865Se4 {

    /* renamed from: a */
    public static final List<String> f96290a = Arrays.asList("Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL");

    /* renamed from: d */
    public static boolean m27182d() {
        if (f96290a.contains(Build.MODEL) && "Google".equals(Build.MANUFACTURER) && Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }
}
