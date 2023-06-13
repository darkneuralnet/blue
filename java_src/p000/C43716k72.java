package p000;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/* renamed from: k72  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C43716k72 implements InterfaceC35865Se4 {

    /* renamed from: a */
    public static final List<String> f93957a = Arrays.asList("pixel 4", "pixel 4a", "pixel 4 xl", "pixel 5", "pixel 5a", "pixel 6", "pixel 6a", "pixel 6 pro", "pixel 7", "pixel 7 pro");

    /* renamed from: d */
    public static boolean m29272d() {
        return m29269g() || m29270f();
    }

    /* renamed from: e */
    public static boolean m29271e() {
        return f93957a.contains(Build.MODEL.toLowerCase(Locale.US));
    }

    /* renamed from: f */
    public static boolean m29270f() {
        return Build.ID.startsWith("TD1A");
    }

    /* renamed from: g */
    public static boolean m29269g() {
        return Build.ID.startsWith("TP1A");
    }

    /* renamed from: h */
    public static boolean m29268h() {
        return m29271e() && m29272d();
    }
}
