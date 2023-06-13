package io.reactivex.internal.util;

import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.util.d */
/* loaded from: classes8.dex */
public final class C24468d {
    private C24468d() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static long m32274a(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == LongCompanionObject.MAX_VALUE) {
                return LongCompanionObject.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, m32272c(j2, j)));
        return j2;
    }

    /* renamed from: b */
    public static long m32273b(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j2 == LongCompanionObject.MAX_VALUE) {
                return LongCompanionObject.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, m32272c(j2, j)));
        return j2;
    }

    /* renamed from: c */
    public static long m32272c(long j, long j2) {
        long j3 = j + j2;
        return j3 < 0 ? LongCompanionObject.MAX_VALUE : j3;
    }

    /* renamed from: d */
    public static long m32271d(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == LongCompanionObject.MAX_VALUE) {
                return LongCompanionObject.MAX_VALUE;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                C24508a.m31988u(new IllegalStateException("More produced than requested: " + j3));
                j3 = 0L;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }

    /* renamed from: e */
    public static long m32270e(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j2 == LongCompanionObject.MAX_VALUE) {
                return LongCompanionObject.MAX_VALUE;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                C24508a.m31988u(new IllegalStateException("More produced than requested: " + j3));
                j3 = 0L;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }
}
