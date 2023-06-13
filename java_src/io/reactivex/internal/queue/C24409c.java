package io.reactivex.internal.queue;

import io.reactivex.internal.fuseable.InterfaceC23554i;
import io.reactivex.internal.util.C24485q;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* renamed from: io.reactivex.internal.queue.c */
/* loaded from: classes6.dex */
public final class C24409c<T> implements InterfaceC23554i<T> {

    /* renamed from: j */
    public static final int f90904j = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: k */
    public static final Object f90905k = new Object();

    /* renamed from: c */
    public int f90907c;

    /* renamed from: d */
    public long f90908d;

    /* renamed from: e */
    public final int f90909e;

    /* renamed from: f */
    public AtomicReferenceArray<Object> f90910f;

    /* renamed from: g */
    public final int f90911g;

    /* renamed from: h */
    public AtomicReferenceArray<Object> f90912h;

    /* renamed from: b */
    public final AtomicLong f90906b = new AtomicLong();

    /* renamed from: i */
    public final AtomicLong f90913i = new AtomicLong();

    public C24409c(int i) {
        int m32223a = C24485q.m32223a(Math.max(8, i));
        int i2 = m32223a - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(m32223a + 1);
        this.f90910f = atomicReferenceArray;
        this.f90909e = i2;
        m32376a(m32223a);
        this.f90912h = atomicReferenceArray;
        this.f90911g = i2;
        this.f90908d = i2 - 1;
        m32358t(0L);
    }

    /* renamed from: c */
    public static int m32375c(int i) {
        return i;
    }

    /* renamed from: d */
    public static int m32374d(long j, int i) {
        return m32375c(((int) j) & i);
    }

    /* renamed from: h */
    public static <E> Object m32370h(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* renamed from: r */
    public static void m32360r(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: a */
    public final void m32376a(int i) {
        this.f90907c = Math.min(i / 4, f90904j);
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    /* renamed from: e */
    public final long m32373e() {
        return this.f90913i.get();
    }

    /* renamed from: f */
    public final long m32372f() {
        return this.f90906b.get();
    }

    /* renamed from: g */
    public final long m32371g() {
        return this.f90913i.get();
    }

    /* renamed from: i */
    public final AtomicReferenceArray<Object> m32369i(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        int m32375c = m32375c(i);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) m32370h(atomicReferenceArray, m32375c);
        m32360r(atomicReferenceArray, m32375c, null);
        return atomicReferenceArray2;
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public boolean isEmpty() {
        return m32368j() == m32371g();
    }

    /* renamed from: j */
    public final long m32368j() {
        return this.f90906b.get();
    }

    /* renamed from: k */
    public final T m32367k(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f90912h = atomicReferenceArray;
        return (T) m32370h(atomicReferenceArray, m32374d(j, i));
    }

    /* renamed from: l */
    public final T m32366l(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f90912h = atomicReferenceArray;
        int m32374d = m32374d(j, i);
        T t = (T) m32370h(atomicReferenceArray, m32374d);
        if (t != null) {
            m32360r(atomicReferenceArray, m32374d, null);
            m32361q(j + 1);
        }
        return t;
    }

    /* renamed from: m */
    public boolean m32365m(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f90910f;
        long m32368j = m32368j();
        int i = this.f90909e;
        long j = 2 + m32368j;
        if (m32370h(atomicReferenceArray, m32374d(j, i)) == null) {
            int m32374d = m32374d(m32368j, i);
            m32360r(atomicReferenceArray, m32374d + 1, t2);
            m32360r(atomicReferenceArray, m32374d, t);
            m32358t(j);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f90910f = atomicReferenceArray2;
        int m32374d2 = m32374d(m32368j, i);
        m32360r(atomicReferenceArray2, m32374d2 + 1, t2);
        m32360r(atomicReferenceArray2, m32374d2, t);
        m32359s(atomicReferenceArray, atomicReferenceArray2);
        m32360r(atomicReferenceArray, m32374d2, f90905k);
        m32358t(j);
        return true;
    }

    /* renamed from: n */
    public T m32364n() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f90912h;
        long m32373e = m32373e();
        int i = this.f90911g;
        T t = (T) m32370h(atomicReferenceArray, m32374d(m32373e, i));
        if (t == f90905k) {
            return m32367k(m32369i(atomicReferenceArray, i + 1), m32373e, i);
        }
        return t;
    }

    /* renamed from: o */
    public final void m32363o(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f90910f = atomicReferenceArray2;
        this.f90908d = (j2 + j) - 1;
        m32360r(atomicReferenceArray2, i, t);
        m32359s(atomicReferenceArray, atomicReferenceArray2);
        m32360r(atomicReferenceArray, i, f90905k);
        m32358t(j + 1);
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.f90910f;
            long m32372f = m32372f();
            int i = this.f90909e;
            int m32374d = m32374d(m32372f, i);
            if (m32372f < this.f90908d) {
                return m32357u(atomicReferenceArray, t, m32372f, m32374d);
            }
            long j = this.f90907c + m32372f;
            if (m32370h(atomicReferenceArray, m32374d(j, i)) == null) {
                this.f90908d = j - 1;
                return m32357u(atomicReferenceArray, t, m32372f, m32374d);
            } else if (m32370h(atomicReferenceArray, m32374d(1 + m32372f, i)) == null) {
                return m32357u(atomicReferenceArray, t, m32372f, m32374d);
            } else {
                m32363o(atomicReferenceArray, m32372f, m32374d, t, i);
                return true;
            }
        }
        throw new NullPointerException("Null is not a valid element");
    }

    /* renamed from: p */
    public int m32362p() {
        long m32371g = m32371g();
        while (true) {
            long m32368j = m32368j();
            long m32371g2 = m32371g();
            if (m32371g == m32371g2) {
                return (int) (m32368j - m32371g2);
            }
            m32371g = m32371g2;
        }
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23554i, io.reactivex.internal.fuseable.InterfaceC23555j
    public T poll() {
        boolean z;
        AtomicReferenceArray<Object> atomicReferenceArray = this.f90912h;
        long m32373e = m32373e();
        int i = this.f90911g;
        int m32374d = m32374d(m32373e, i);
        T t = (T) m32370h(atomicReferenceArray, m32374d);
        if (t == f90905k) {
            z = true;
        } else {
            z = false;
        }
        if (t != null && !z) {
            m32360r(atomicReferenceArray, m32374d, null);
            m32361q(m32373e + 1);
            return t;
        } else if (!z) {
            return null;
        } else {
            return m32366l(m32369i(atomicReferenceArray, i + 1), m32373e, i);
        }
    }

    /* renamed from: q */
    public final void m32361q(long j) {
        this.f90913i.lazySet(j);
    }

    /* renamed from: s */
    public final void m32359s(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        m32360r(atomicReferenceArray, m32375c(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    /* renamed from: t */
    public final void m32358t(long j) {
        this.f90906b.lazySet(j);
    }

    /* renamed from: u */
    public final boolean m32357u(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        m32360r(atomicReferenceArray, i, t);
        m32358t(j + 1);
        return true;
    }
}
