package p000;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/* renamed from: UD0 */
/* loaded from: classes.dex */
public class UD0 implements InterfaceC35865Se4 {

    /* renamed from: a */
    public static final List<String> f37002a = Arrays.asList("SM-A3000", "SM-A3009", "SM-A300F", "SM-A300FU", "SM-A300G", "SM-A300H", "SM-A300M", "SM-A300X", "SM-A300XU", "SM-A300XZ", "SM-A300Y", "SM-A300YZ", "SM-J510FN", "5059X");

    /* renamed from: d */
    public static boolean m81822d() {
        return f37002a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
