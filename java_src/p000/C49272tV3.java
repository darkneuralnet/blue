package p000;

import java.util.Locale;
import java.util.logging.Logger;
/* renamed from: tV3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49272tV3 {

    /* renamed from: a */
    public static final Logger f110549a = Logger.getLogger(C49272tV3.class.getName());

    /* renamed from: b */
    public static final XK3 f110550b = m12279c();

    /* renamed from: tV3$b */
    /* loaded from: classes6.dex */
    public static final class C28725b implements XK3 {
        private C28725b() {
        }
    }

    private C49272tV3() {
    }

    /* renamed from: a */
    public static String m12281a(String str) {
        if (m12278d(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: b */
    public static String m12280b(double d) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d));
    }

    /* renamed from: c */
    public static XK3 m12279c() {
        return new C28725b();
    }

    /* renamed from: d */
    public static boolean m12278d(String str) {
        return str == null || str.isEmpty();
    }

    /* renamed from: e */
    public static long m12277e() {
        return System.nanoTime();
    }
}
