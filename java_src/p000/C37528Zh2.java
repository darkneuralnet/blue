package p000;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
/* renamed from: Zh2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37528Zh2 implements InterfaceC45052mN5 {

    /* renamed from: a */
    public static final Set<String> f48964a = new HashSet(Arrays.asList("heroqltevzw", "heroqltetmo", "k61v1_basic_ref"));

    /* renamed from: d */
    public static boolean m72667d(C36761Wa0 c36761Wa0) {
        return f48964a.contains(Build.DEVICE.toLowerCase(Locale.US));
    }
}
