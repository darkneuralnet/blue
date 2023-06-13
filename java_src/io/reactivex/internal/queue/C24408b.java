package io.reactivex.internal.queue;

import io.reactivex.internal.fuseable.InterfaceC23554i;
import io.reactivex.internal.util.C24485q;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* renamed from: io.reactivex.internal.queue.b */
/* loaded from: classes6.dex */
public final class C24408b<E> extends AtomicReferenceArray<E> implements InterfaceC23554i<E> {

    /* renamed from: g */
    public static final Integer f90898g = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;

    /* renamed from: b */
    public final int f90899b;

    /* renamed from: c */
    public final AtomicLong f90900c;

    /* renamed from: d */
    public long f90901d;

    /* renamed from: e */
    public final AtomicLong f90902e;

    /* renamed from: f */
    public final int f90903f;

    public C24408b(int i) {
        super(C24485q.m32223a(i));
        this.f90899b = length() - 1;
        this.f90900c = new AtomicLong();
        this.f90902e = new AtomicLong();
        this.f90903f = Math.min(i / 4, f90898g.intValue());
    }

    /* renamed from: a */
    public int m32382a(long j) {
        return ((int) j) & this.f90899b;
    }

    /* renamed from: c */
    public int m32381c(long j, int i) {
        return ((int) j) & i;
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    /* renamed from: d */
    public E m32380d(int i) {
        return get(i);
    }

    /* renamed from: e */
    public void m32379e(long j) {
        this.f90902e.lazySet(j);
    }

    /* renamed from: f */
    public void m32378f(int i, E e) {
        lazySet(i, e);
    }

    /* renamed from: g */
    public void m32377g(long j) {
        this.f90900c.lazySet(j);
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public boolean isEmpty() {
        return this.f90900c.get() == this.f90902e.get();
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public boolean offer(E e) {
        if (e != null) {
            int i = this.f90899b;
            long j = this.f90900c.get();
            int m32381c = m32381c(j, i);
            if (j >= this.f90901d) {
                long j2 = this.f90903f + j;
                if (m32380d(m32381c(j2, i)) == null) {
                    this.f90901d = j2;
                } else if (m32380d(m32381c) != null) {
                    return false;
                }
            }
            m32378f(m32381c, e);
            m32377g(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23554i, io.reactivex.internal.fuseable.InterfaceC23555j
    public E poll() {
        long j = this.f90902e.get();
        int m32382a = m32382a(j);
        E m32380d = m32380d(m32382a);
        if (m32380d == null) {
            return null;
        }
        m32379e(j + 1);
        m32378f(m32382a, null);
        return m32380d;
    }
}
