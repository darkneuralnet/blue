package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.fuseable.InterfaceC23552g;
import io.reactivex.internal.fuseable.InterfaceC23554i;
import io.reactivex.internal.fuseable.InterfaceC23555j;
import io.reactivex.internal.queue.C24408b;
import io.reactivex.internal.queue.C24409c;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24467c;
import io.reactivex.internal.util.C24468d;
import io.reactivex.internal.util.C24475k;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.s */
/* loaded from: classes6.dex */
public final class C23797s<T, U> extends AbstractC23695a<T, U> {

    /* renamed from: d */
    public final InterfaceC23492o<? super T, ? extends InterfaceC45761na4<? extends U>> f88978d;

    /* renamed from: e */
    public final boolean f88979e;

    /* renamed from: f */
    public final int f88980f;

    /* renamed from: g */
    public final int f88981g;

    /* renamed from: io.reactivex.internal.operators.flowable.s$a */
    /* loaded from: classes6.dex */
    public static final class C23798a<T, U> extends AtomicReference<InterfaceC46292oT5> implements InterfaceC24494o<U>, InterfaceC23465c {
        private static final long serialVersionUID = -4606175640614850599L;

        /* renamed from: b */
        public final long f88982b;

        /* renamed from: c */
        public final C23799b<T, U> f88983c;

        /* renamed from: d */
        public final int f88984d;

        /* renamed from: e */
        public final int f88985e;

        /* renamed from: f */
        public volatile boolean f88986f;

        /* renamed from: g */
        public volatile InterfaceC23555j<U> f88987g;

        /* renamed from: h */
        public long f88988h;

        /* renamed from: i */
        public int f88989i;

        public C23798a(C23799b<T, U> c23799b, long j) {
            this.f88982b = j;
            this.f88983c = c23799b;
            int i = c23799b.f88996f;
            this.f88985e = i;
            this.f88984d = i >> 2;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32289f(this, interfaceC46292oT5)) {
                if (interfaceC46292oT5 instanceof InterfaceC23552g) {
                    InterfaceC23552g interfaceC23552g = (InterfaceC23552g) interfaceC46292oT5;
                    int mo31868b = interfaceC23552g.mo31868b(7);
                    if (mo31868b == 1) {
                        this.f88989i = mo31868b;
                        this.f88987g = interfaceC23552g;
                        this.f88986f = true;
                        this.f88983c.m32783f();
                        return;
                    } else if (mo31868b == 2) {
                        this.f88989i = mo31868b;
                        this.f88987g = interfaceC23552g;
                    }
                }
                interfaceC46292oT5.mo21023o(this.f88985e);
            }
        }

        /* renamed from: b */
        public void m32788b(long j) {
            if (this.f88989i != 1) {
                long j2 = this.f88988h + j;
                if (j2 >= this.f88984d) {
                    this.f88988h = 0L;
                    get().mo21023o(j2);
                    return;
                }
                this.f88988h = j2;
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC24463g.m32294a(this);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return get() == EnumC24463g.CANCELLED;
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f88986f = true;
            this.f88983c.m32783f();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            lazySet(EnumC24463g.CANCELLED);
            this.f88983c.m32779k(this, th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(U u) {
            if (this.f88989i != 2) {
                this.f88983c.m32777m(u, this);
            } else {
                this.f88983c.m32783f();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.s$b */
    /* loaded from: classes6.dex */
    public static final class C23799b<T, U> extends AtomicInteger implements InterfaceC24494o<T>, InterfaceC46292oT5 {
        private static final long serialVersionUID = -2117620485640801370L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super U> f88992b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC45761na4<? extends U>> f88993c;

        /* renamed from: d */
        public final boolean f88994d;

        /* renamed from: e */
        public final int f88995e;

        /* renamed from: f */
        public final int f88996f;

        /* renamed from: g */
        public volatile InterfaceC23554i<U> f88997g;

        /* renamed from: h */
        public volatile boolean f88998h;

        /* renamed from: i */
        public final C24467c f88999i = new C24467c();

        /* renamed from: j */
        public volatile boolean f89000j;

        /* renamed from: k */
        public final AtomicReference<C23798a<?, ?>[]> f89001k;

        /* renamed from: l */
        public final AtomicLong f89002l;

        /* renamed from: m */
        public InterfaceC46292oT5 f89003m;

        /* renamed from: n */
        public long f89004n;

        /* renamed from: o */
        public long f89005o;

        /* renamed from: p */
        public int f89006p;

        /* renamed from: q */
        public int f89007q;

        /* renamed from: r */
        public final int f89008r;

        /* renamed from: s */
        public static final C23798a<?, ?>[] f88990s = new C23798a[0];

        /* renamed from: t */
        public static final C23798a<?, ?>[] f88991t = new C23798a[0];

        public C23799b(InterfaceC42141hT5<? super U> interfaceC42141hT5, InterfaceC23492o<? super T, ? extends InterfaceC45761na4<? extends U>> interfaceC23492o, boolean z, int i, int i2) {
            AtomicReference<C23798a<?, ?>[]> atomicReference = new AtomicReference<>();
            this.f89001k = atomicReference;
            this.f89002l = new AtomicLong();
            this.f88992b = interfaceC42141hT5;
            this.f88993c = interfaceC23492o;
            this.f88994d = z;
            this.f88995e = i;
            this.f88996f = i2;
            this.f89008r = Math.max(1, i >> 1);
            atomicReference.lazySet(f88990s);
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f89003m, interfaceC46292oT5)) {
                this.f89003m = interfaceC46292oT5;
                this.f88992b.mo31867a(this);
                if (!this.f89000j) {
                    int i = this.f88995e;
                    if (i == Integer.MAX_VALUE) {
                        interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
                    } else {
                        interfaceC46292oT5.mo21023o(i);
                    }
                }
            }
        }

        /* renamed from: b */
        public boolean m32787b(C23798a<T, U> c23798a) {
            C23798a<?, ?>[] c23798aArr;
            C23798a[] c23798aArr2;
            do {
                c23798aArr = this.f89001k.get();
                if (c23798aArr == f88991t) {
                    c23798a.dispose();
                    return false;
                }
                int length = c23798aArr.length;
                c23798aArr2 = new C23798a[length + 1];
                System.arraycopy(c23798aArr, 0, c23798aArr2, 0, length);
                c23798aArr2[length] = c23798a;
            } while (!C42482i24.m35337a(this.f89001k, c23798aArr, c23798aArr2));
            return true;
        }

        /* renamed from: c */
        public boolean m32786c() {
            if (this.f89000j) {
                m32785d();
                return true;
            } else if (!this.f88994d && this.f88999i.get() != null) {
                m32785d();
                Throwable m32275b = this.f88999i.m32275b();
                if (m32275b != C24475k.f91077a) {
                    this.f88992b.onError(m32275b);
                }
                return true;
            } else {
                return false;
            }
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            InterfaceC23554i<U> interfaceC23554i;
            if (!this.f89000j) {
                this.f89000j = true;
                this.f89003m.cancel();
                m32784e();
                if (getAndIncrement() == 0 && (interfaceC23554i = this.f88997g) != null) {
                    interfaceC23554i.clear();
                }
            }
        }

        /* renamed from: d */
        public void m32785d() {
            InterfaceC23554i<U> interfaceC23554i = this.f88997g;
            if (interfaceC23554i != null) {
                interfaceC23554i.clear();
            }
        }

        /* renamed from: e */
        public void m32784e() {
            C23798a<?, ?>[] andSet;
            C23798a<?, ?>[] c23798aArr = this.f89001k.get();
            C23798a<?, ?>[] c23798aArr2 = f88991t;
            if (c23798aArr != c23798aArr2 && (andSet = this.f89001k.getAndSet(c23798aArr2)) != c23798aArr2) {
                for (C23798a<?, ?> c23798a : andSet) {
                    c23798a.dispose();
                }
                Throwable m32275b = this.f88999i.m32275b();
                if (m32275b != null && m32275b != C24475k.f91077a) {
                    C24508a.m31988u(m32275b);
                }
            }
        }

        /* renamed from: f */
        public void m32783f() {
            if (getAndIncrement() == 0) {
                m32782g();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:100:0x0151, code lost:
            if (r22 != null) goto L84;
         */
        /* JADX WARN: Code restructure failed: missing block: B:102:0x0154, code lost:
            r10 = r13;
            r11 = r22;
            r14 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x0135, code lost:
            if (r10 == r14) goto L126;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x0137, code lost:
            if (r9 != false) goto L125;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x0139, code lost:
            r5 = r24.f89002l.addAndGet(-r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x0141, code lost:
            r5 = kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x0146, code lost:
            r7.m32788b(r10);
            r10 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x014c, code lost:
            r10 = r14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x014f, code lost:
            if (r5 == r10) goto L124;
         */
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void m32782g() {
            boolean z;
            long j;
            long j2;
            boolean z2;
            int i;
            int i2;
            InterfaceC42141hT5<? super U> interfaceC42141hT5 = this.f88992b;
            int i3 = 1;
            while (!m32786c()) {
                InterfaceC23554i<U> interfaceC23554i = this.f88997g;
                long j3 = this.f89002l.get();
                if (j3 == LongCompanionObject.MAX_VALUE) {
                    z = true;
                } else {
                    z = false;
                }
                long j4 = 0;
                long j5 = 0;
                if (interfaceC23554i != null) {
                    while (true) {
                        long j6 = 0;
                        Object obj = null;
                        while (true) {
                            if (j3 == 0) {
                                break;
                            }
                            U poll = interfaceC23554i.poll();
                            if (m32786c()) {
                                return;
                            }
                            if (poll == null) {
                                obj = poll;
                                break;
                            }
                            interfaceC42141hT5.onNext(poll);
                            j5++;
                            j6++;
                            j3--;
                            obj = poll;
                        }
                        if (j6 != 0) {
                            if (z) {
                                j3 = LongCompanionObject.MAX_VALUE;
                            } else {
                                j3 = this.f89002l.addAndGet(-j6);
                            }
                        }
                        if (j3 == 0 || obj == null) {
                            break;
                        }
                    }
                }
                boolean z3 = this.f88998h;
                InterfaceC23554i<U> interfaceC23554i2 = this.f88997g;
                C23798a<?, ?>[] c23798aArr = this.f89001k.get();
                int length = c23798aArr.length;
                if (z3 && ((interfaceC23554i2 == null || interfaceC23554i2.isEmpty()) && length == 0)) {
                    Throwable m32275b = this.f88999i.m32275b();
                    if (m32275b != C24475k.f91077a) {
                        if (m32275b == null) {
                            interfaceC42141hT5.onComplete();
                            return;
                        } else {
                            interfaceC42141hT5.onError(m32275b);
                            return;
                        }
                    }
                    return;
                }
                int i4 = i3;
                if (length != 0) {
                    long j7 = this.f89005o;
                    int i5 = this.f89006p;
                    if (length <= i5 || c23798aArr[i5].f88982b != j7) {
                        if (length <= i5) {
                            i5 = 0;
                        }
                        for (int i6 = 0; i6 < length && c23798aArr[i5].f88982b != j7; i6++) {
                            i5++;
                            if (i5 == length) {
                                i5 = 0;
                            }
                        }
                        this.f89006p = i5;
                        this.f89005o = c23798aArr[i5].f88982b;
                    }
                    int i7 = i5;
                    boolean z4 = false;
                    int i8 = 0;
                    while (true) {
                        if (i8 < length) {
                            if (m32786c()) {
                                return;
                            }
                            C23798a<T, U> c23798a = c23798aArr[i7];
                            Object obj2 = null;
                            while (!m32786c()) {
                                InterfaceC23555j<U> interfaceC23555j = c23798a.f88987g;
                                if (interfaceC23555j == null) {
                                    i = length;
                                } else {
                                    i = length;
                                    Object obj3 = obj2;
                                    long j8 = j4;
                                    while (true) {
                                        if (j3 == j4) {
                                            break;
                                        }
                                        try {
                                            U poll2 = interfaceC23555j.poll();
                                            if (poll2 == null) {
                                                obj3 = poll2;
                                                j4 = 0;
                                                break;
                                            }
                                            interfaceC42141hT5.onNext(poll2);
                                            if (m32786c()) {
                                                return;
                                            }
                                            j3--;
                                            j8++;
                                            obj3 = poll2;
                                            j4 = 0;
                                        } catch (Throwable th) {
                                            C23475a.m33009b(th);
                                            c23798a.dispose();
                                            this.f88999i.m32276a(th);
                                            if (!this.f88994d) {
                                                this.f89003m.cancel();
                                            }
                                            if (m32786c()) {
                                                return;
                                            }
                                            m32778l(c23798a);
                                            i8++;
                                            z4 = true;
                                            i2 = 1;
                                        }
                                    }
                                }
                                boolean z5 = c23798a.f88986f;
                                InterfaceC23555j<U> interfaceC23555j2 = c23798a.f88987g;
                                if (z5 && (interfaceC23555j2 == null || interfaceC23555j2.isEmpty())) {
                                    m32778l(c23798a);
                                    if (m32786c()) {
                                        return;
                                    }
                                    j5++;
                                    z4 = true;
                                }
                                if (j3 == 0) {
                                    z2 = z4;
                                    break;
                                }
                                i7++;
                                if (i7 == i) {
                                    i7 = 0;
                                }
                                i2 = 1;
                                i8 += i2;
                                length = i;
                                j4 = 0;
                            }
                            return;
                        }
                        z2 = z4;
                        break;
                    }
                    this.f89006p = i7;
                    this.f89005o = c23798aArr[i7].f88982b;
                    j2 = j5;
                    j = 0;
                } else {
                    j = 0;
                    j2 = j5;
                    z2 = false;
                }
                if (j2 != j && !this.f89000j) {
                    this.f89003m.mo21023o(j2);
                }
                if (z2) {
                    i3 = i4;
                } else {
                    i3 = addAndGet(-i4);
                    if (i3 == 0) {
                        return;
                    }
                }
            }
        }

        /* renamed from: i */
        public InterfaceC23555j<U> m32781i(C23798a<T, U> c23798a) {
            InterfaceC23555j<U> interfaceC23555j = c23798a.f88987g;
            if (interfaceC23555j == null) {
                C24408b c24408b = new C24408b(this.f88996f);
                c23798a.f88987g = c24408b;
                return c24408b;
            }
            return interfaceC23555j;
        }

        /* renamed from: j */
        public InterfaceC23555j<U> m32780j() {
            InterfaceC23554i<U> interfaceC23554i = this.f88997g;
            if (interfaceC23554i == null) {
                if (this.f88995e == Integer.MAX_VALUE) {
                    interfaceC23554i = new C24409c<>(this.f88996f);
                } else {
                    interfaceC23554i = new C24408b<>(this.f88995e);
                }
                this.f88997g = interfaceC23554i;
            }
            return interfaceC23554i;
        }

        /* renamed from: k */
        public void m32779k(C23798a<T, U> c23798a, Throwable th) {
            if (this.f88999i.m32276a(th)) {
                c23798a.f88986f = true;
                if (!this.f88994d) {
                    this.f89003m.cancel();
                    for (C23798a<?, ?> c23798a2 : this.f89001k.getAndSet(f88991t)) {
                        c23798a2.dispose();
                    }
                }
                m32783f();
                return;
            }
            C24508a.m31988u(th);
        }

        /* renamed from: l */
        public void m32778l(C23798a<T, U> c23798a) {
            C23798a<?, ?>[] c23798aArr;
            C23798a<?, ?>[] c23798aArr2;
            do {
                c23798aArr = this.f89001k.get();
                int length = c23798aArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (c23798aArr[i] == c23798a) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    c23798aArr2 = f88990s;
                } else {
                    C23798a<?, ?>[] c23798aArr3 = new C23798a[length - 1];
                    System.arraycopy(c23798aArr, 0, c23798aArr3, 0, i);
                    System.arraycopy(c23798aArr, i + 1, c23798aArr3, i, (length - i) - 1);
                    c23798aArr2 = c23798aArr3;
                }
            } while (!C42482i24.m35337a(this.f89001k, c23798aArr, c23798aArr2));
        }

        /* renamed from: m */
        public void m32777m(U u, C23798a<T, U> c23798a) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.f89002l.get();
                InterfaceC23555j<U> interfaceC23555j = c23798a.f88987g;
                if (j != 0 && (interfaceC23555j == null || interfaceC23555j.isEmpty())) {
                    this.f88992b.onNext(u);
                    if (j != LongCompanionObject.MAX_VALUE) {
                        this.f89002l.decrementAndGet();
                    }
                    c23798a.m32788b(1L);
                } else {
                    if (interfaceC23555j == null) {
                        interfaceC23555j = m32781i(c23798a);
                    }
                    if (!interfaceC23555j.offer(u)) {
                        onError(new MissingBackpressureException("Inner queue full?!"));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                InterfaceC23555j interfaceC23555j2 = c23798a.f88987g;
                if (interfaceC23555j2 == null) {
                    interfaceC23555j2 = new C24408b(this.f88996f);
                    c23798a.f88987g = interfaceC23555j2;
                }
                if (!interfaceC23555j2.offer(u)) {
                    onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            }
            m32782g();
        }

        /* renamed from: n */
        public void m32776n(U u) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.f89002l.get();
                InterfaceC23555j<U> interfaceC23555j = this.f88997g;
                if (j != 0 && (interfaceC23555j == null || interfaceC23555j.isEmpty())) {
                    this.f88992b.onNext(u);
                    if (j != LongCompanionObject.MAX_VALUE) {
                        this.f89002l.decrementAndGet();
                    }
                    if (this.f88995e != Integer.MAX_VALUE && !this.f89000j) {
                        int i = this.f89007q + 1;
                        this.f89007q = i;
                        int i2 = this.f89008r;
                        if (i == i2) {
                            this.f89007q = 0;
                            this.f89003m.mo21023o(i2);
                        }
                    }
                } else {
                    if (interfaceC23555j == null) {
                        interfaceC23555j = m32780j();
                    }
                    if (!interfaceC23555j.offer(u)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!m32780j().offer(u)) {
                onError(new IllegalStateException("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            m32782g();
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            if (EnumC24463g.m32287h(j)) {
                C24468d.m32274a(this.f89002l, j);
                m32783f();
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            if (this.f88998h) {
                return;
            }
            this.f88998h = true;
            m32783f();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (this.f88998h) {
                C24508a.m31988u(th);
            } else if (this.f88999i.m32276a(th)) {
                this.f88998h = true;
                if (!this.f88994d) {
                    for (C23798a<?, ?> c23798a : this.f89001k.getAndSet(f88991t)) {
                        c23798a.dispose();
                    }
                }
                m32783f();
            } else {
                C24508a.m31988u(th);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            if (this.f88998h) {
                return;
            }
            try {
                InterfaceC45761na4 interfaceC45761na4 = (InterfaceC45761na4) C23544b.m32923e(this.f88993c.apply(t), "The mapper returned a null Publisher");
                if (interfaceC45761na4 instanceof Callable) {
                    try {
                        Object call = ((Callable) interfaceC45761na4).call();
                        if (call != null) {
                            m32776n(call);
                            return;
                        } else if (this.f88995e != Integer.MAX_VALUE && !this.f89000j) {
                            int i = this.f89007q + 1;
                            this.f89007q = i;
                            int i2 = this.f89008r;
                            if (i == i2) {
                                this.f89007q = 0;
                                this.f89003m.mo21023o(i2);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C23475a.m33009b(th);
                        this.f88999i.m32276a(th);
                        m32783f();
                        return;
                    }
                }
                long j = this.f89004n;
                this.f89004n = 1 + j;
                C23798a c23798a = new C23798a(this, j);
                if (m32787b(c23798a)) {
                    interfaceC45761na4.mo23497c(c23798a);
                }
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                this.f89003m.cancel();
                onError(th2);
            }
        }
    }

    public C23797s(AbstractC24490k<T> abstractC24490k, InterfaceC23492o<? super T, ? extends InterfaceC45761na4<? extends U>> interfaceC23492o, boolean z, int i, int i2) {
        super(abstractC24490k);
        this.f88978d = interfaceC23492o;
        this.f88979e = z;
        this.f88980f = i;
        this.f88981g = i2;
    }

    /* renamed from: x1 */
    public static <T, U> InterfaceC24494o<T> m32789x1(InterfaceC42141hT5<? super U> interfaceC42141hT5, InterfaceC23492o<? super T, ? extends InterfaceC45761na4<? extends U>> interfaceC23492o, boolean z, int i, int i2) {
        return new C23799b(interfaceC42141hT5, interfaceC23492o, z, i, i2);
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super U> interfaceC42141hT5) {
        if (C23746g0.m32799b(this.f88638c, interfaceC42141hT5, this.f88978d)) {
            return;
        }
        this.f88638c.m32166W0(m32789x1(interfaceC42141hT5, this.f88978d, this.f88979e, this.f88980f, this.f88981g));
    }
}
