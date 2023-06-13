package p000;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/* renamed from: V56 */
/* loaded from: classes.dex */
public class V56 implements InterfaceC35865Se4 {

    /* renamed from: a */
    public static final List<String> f38616a = Arrays.asList("mi a1", "mi a2", "mi a2 lite", "redmi 4x", "redmi 5a", "redmi 6 pro");

    /* renamed from: d */
    public static boolean m80422d() {
        return f38616a.contains(Build.MODEL.toLowerCase(Locale.US));
    }
}
