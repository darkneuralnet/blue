package com.uber.autodispose;
/* loaded from: classes7.dex */
final class AutoDisposeUtil {
    private AutoDisposeUtil() {
        throw new InstantiationError();
    }

    /* renamed from: a */
    public static <T> T m45225a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
