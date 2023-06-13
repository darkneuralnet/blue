package com.google.common.util.concurrent;
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class NullnessCasts {
    private NullnessCasts() {
    }

    @ParametricNullness
    public static <T> T uncheckedCastNullableTToT(T t) {
        return t;
    }

    @ParametricNullness
    public static <T> T uncheckedNull() {
        return null;
    }
}
