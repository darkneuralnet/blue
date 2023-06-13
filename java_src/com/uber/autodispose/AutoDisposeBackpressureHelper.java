package com.uber.autodispose;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.LongCompanionObject;
/* loaded from: classes7.dex */
final class AutoDisposeBackpressureHelper {
    private AutoDisposeBackpressureHelper() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static long m45232a(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == LongCompanionObject.MAX_VALUE) {
                return LongCompanionObject.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, m45231b(j2, j)));
        return j2;
    }

    /* renamed from: b */
    public static long m45231b(long j, long j2) {
        long j3 = j + j2;
        return j3 < 0 ? LongCompanionObject.MAX_VALUE : j3;
    }
}
