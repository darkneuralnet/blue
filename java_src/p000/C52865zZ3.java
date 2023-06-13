package p000;

import android.text.TextUtils;
import java.util.Collection;
/* renamed from: zZ3  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52865zZ3 {
    private C52865zZ3() {
    }

    /* renamed from: a */
    public static void m1114a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static String m1113b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    /* renamed from: c */
    public static <T extends Collection<Y>, Y> T m1112c(T t) {
        if (!t.isEmpty()) {
            return t;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    /* renamed from: d */
    public static <T> T m1111d(T t) {
        return (T) m1110e(t, "Argument must not be null");
    }

    /* renamed from: e */
    public static <T> T m1110e(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
