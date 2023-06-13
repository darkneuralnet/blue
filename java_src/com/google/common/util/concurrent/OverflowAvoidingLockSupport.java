package com.google.common.util.concurrent;

import java.util.concurrent.locks.LockSupport;
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class OverflowAvoidingLockSupport {
    static final long MAX_NANOSECONDS_THRESHOLD = 2147483647999999999L;

    private OverflowAvoidingLockSupport() {
    }

    public static void parkNanos(Object obj, long j) {
        LockSupport.parkNanos(obj, Math.min(j, (long) MAX_NANOSECONDS_THRESHOLD));
    }
}
