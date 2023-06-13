package com.google.common.util.concurrent;
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class Platform {
    private Platform() {
    }

    public static boolean isInstanceOfThrowableClass(Throwable th, Class<? extends Throwable> cls) {
        return cls.isInstance(th);
    }
}
