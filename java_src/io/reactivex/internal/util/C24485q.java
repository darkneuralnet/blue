package io.reactivex.internal.util;
/* renamed from: io.reactivex.internal.util.q */
/* loaded from: classes8.dex */
public final class C24485q {
    private C24485q() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static int m32223a(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }
}
