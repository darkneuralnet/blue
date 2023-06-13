package p000;

import android.os.Build;
import android.util.Pair;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
/* renamed from: hf0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C42249hf0 implements InterfaceC35865Se4 {

    /* renamed from: a */
    public static final Set<Pair<String, String>> f85634a = new HashSet(Collections.singletonList(Pair.create("SAMSUNG", "SM-G981U1")));

    /* renamed from: e */
    public static boolean m36110e() {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return f85634a.contains(Pair.create(str.toUpperCase(locale), Build.MODEL.toUpperCase(locale)));
    }

    /* renamed from: d */
    public int m36111d() {
        return 1;
    }
}
