package p000;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
/* renamed from: hE2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C42003hE2 implements InterfaceC35865Se4 {

    /* renamed from: a */
    public static final Set<String> f84897a = new HashSet(Arrays.asList("SM-A520W", "MOTOG3"));

    /* renamed from: d */
    public static boolean m36586d() {
        return f84897a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
