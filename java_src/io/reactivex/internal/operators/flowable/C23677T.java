package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.flowables.AbstractC23477a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.internal.fuseable.InterfaceC23552g;
import io.reactivex.internal.fuseable.InterfaceC23555j;
import io.reactivex.internal.queue.C24408b;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24468d;
import io.reactivex.internal.util.C24475k;
import io.reactivex.internal.util.EnumC24479n;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.T */
/* loaded from: classes6.dex */
public final class C23677T<T> extends AbstractC23477a<T> implements InterfaceC23684V<T> {

    /* renamed from: c */
    public final AbstractC24490k<T> f88569c;

    /* renamed from: d */
    public final AtomicReference<C23680c<T>> f88570d;

    /* renamed from: e */
    public final int f88571e;

    /* renamed from: f */
    public final InterfaceC45761na4<T> f88572f;

    /* renamed from: io.reactivex.internal.operators.flowable.T$a */
    /* loaded from: classes6.dex */
    public static final class C23678a<T> implements InterfaceC45761na4<T> {

        /* renamed from: b */
        public final AtomicReference<C23680c<T>> f88573b;

        /* renamed from: c */
        public final int f88574c;

        public C23678a(AtomicReference<C23680c<T>> atomicReference, int i) {
            this.f88573b = atomicReference;
            this.f88574c = i;
        }

        @Override // p000.InterfaceC45761na4
        /* renamed from: c */
        public void mo23497c(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
            C23680c<T> c23680c;
            C23679b<T> c23679b = new C23679b<>(interfaceC42141hT5);
            interfaceC42141hT5.mo31867a(c23679b);
            while (true) {
                c23680c = this.f88573b.get();
                if (c23680c == null || c23680c.mo1769e()) {
                    C23680c<T> c23680c2 = new C23680c<>(this.f88573b, this.f88574c);
                    if (C42482i24.m35337a(this.f88573b, c23680c, c23680c2)) {
                        c23680c = c23680c2;
                    } else {
                        continue;
                    }
                }
                if (c23680c.m32875b(c23679b)) {
                    break;
                }
            }
            if (c23679b.get() == Long.MIN_VALUE) {
                c23680c.m32872g(c23679b);
            } else {
                c23679b.f88576c = c23680c;
            }
            c23680c.m32873d();
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.T$b */
    /* loaded from: classes6.dex */
    public static final class C23679b<T> extends AtomicLong implements InterfaceC46292oT5 {
        private static final long serialVersionUID = -4453897557930727610L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super T> f88575b;

        /* renamed from: c */
        public volatile C23680c<T> f88576c;

        /* renamed from: d */
        public long f88577d;

        public C23679b(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
            this.f88575b = interfaceC42141hT5;
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            C23680c<T> c23680c;
            if (get() != Long.MIN_VALUE && getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE && (c23680c = this.f88576c) != null) {
                c23680c.m32872g(this);
                c23680c.m32873d();
            }
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            if (EnumC24463g.m32287h(j)) {
                C24468d.m32273b(this, j);
                C23680c<T> c23680c = this.f88576c;
                if (c23680c != null) {
                    c23680c.m32873d();
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.T$c */
    /* loaded from: classes6.dex */
    public static final class C23680c<T> extends AtomicInteger implements InterfaceC24494o<T>, InterfaceC23465c {

        /* renamed from: j */
        public static final C23679b[] f88578j = new C23679b[0];

        /* renamed from: k */
        public static final C23679b[] f88579k = new C23679b[0];
        private static final long serialVersionUID = -202316842419149694L;

        /* renamed from: b */
        public final AtomicReference<C23680c<T>> f88580b;

        /* renamed from: c */
        public final int f88581c;

        /* renamed from: g */
        public volatile Object f88585g;

        /* renamed from: h */
        public int f88586h;

        /* renamed from: i */
        public volatile InterfaceC23555j<T> f88587i;

        /* renamed from: f */
        public final AtomicReference<InterfaceC46292oT5> f88584f = new AtomicReference<>();

        /* renamed from: d */
        public final AtomicReference<C23679b<T>[]> f88582d = new AtomicReference<>(f88578j);

        /* renamed from: e */
        public final AtomicBoolean f88583e = new AtomicBoolean();

        public C23680c(AtomicReference<C23680c<T>> atomicReference, int i) {
            this.f88580b = atomicReference;
            this.f88581c = i;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32289f(this.f88584f, interfaceC46292oT5)) {
                if (interfaceC46292oT5 instanceof InterfaceC23552g) {
                    InterfaceC23552g interfaceC23552g = (InterfaceC23552g) interfaceC46292oT5;
                    int mo31868b = interfaceC23552g.mo31868b(7);
                    if (mo31868b == 1) {
                        this.f88586h = mo31868b;
                        this.f88587i = interfaceC23552g;
                        this.f88585g = EnumC24479n.m32243e();
                        m32873d();
                        return;
                    } else if (mo31868b == 2) {
                        this.f88586h = mo31868b;
                        this.f88587i = interfaceC23552g;
                        interfaceC46292oT5.mo21023o(this.f88581c);
                        return;
                    }
                }
                this.f88587i = new C24408b(this.f88581c);
                interfaceC46292oT5.mo21023o(this.f88581c);
            }
        }

        /* renamed from: b */
        public boolean m32875b(C23679b<T> c23679b) {
            C23679b<T>[] c23679bArr;
            C23679b[] c23679bArr2;
            do {
                c23679bArr = this.f88582d.get();
                if (c23679bArr == f88579k) {
                    return false;
                }
                int length = c23679bArr.length;
                c23679bArr2 = new C23679b[length + 1];
                System.arraycopy(c23679bArr, 0, c23679bArr2, 0, length);
                c23679bArr2[length] = c23679b;
            } while (!C42482i24.m35337a(this.f88582d, c23679bArr, c23679bArr2));
            return true;
        }

        /* renamed from: c */
        public boolean m32874c(Object obj, boolean z) {
            int i = 0;
            if (obj != null) {
                if (EnumC24479n.m32238j(obj)) {
                    if (z) {
                        C42482i24.m35337a(this.f88580b, this, null);
                        C23679b<T>[] andSet = this.f88582d.getAndSet(f88579k);
                        int length = andSet.length;
                        while (i < length) {
                            andSet[i].f88575b.onComplete();
                            i++;
                        }
                        return true;
                    }
                } else {
                    Throwable m32240h = EnumC24479n.m32240h(obj);
                    C42482i24.m35337a(this.f88580b, this, null);
                    C23679b<T>[] andSet2 = this.f88582d.getAndSet(f88579k);
                    if (andSet2.length != 0) {
                        int length2 = andSet2.length;
                        while (i < length2) {
                            andSet2[i].f88575b.onError(m32240h);
                            i++;
                        }
                    } else {
                        C24508a.m31988u(m32240h);
                    }
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:111:0x0014, code lost:
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x0124, code lost:
            if (r11 == 0) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0129, code lost:
            if (r25.f88586h == 1) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x012b, code lost:
            r25.f88584f.get().mo21023o(r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0137, code lost:
            r4 = r0;
            r3 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x013b, code lost:
            if (r11 == 0) goto L84;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x013d, code lost:
            r3 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0140, code lost:
            if (r25.f88586h == 1) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0142, code lost:
            r25.f88584f.get().mo21023o(r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x014e, code lost:
            r3 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x0153, code lost:
            if (r14 == 0) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x0155, code lost:
            if (r8 != false) goto L75;
         */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void m32873d() {
            boolean z;
            T t;
            boolean z2;
            T t2;
            boolean z3;
            InterfaceC23555j<T> interfaceC23555j;
            boolean z4;
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<C23679b<T>[]> atomicReference = this.f88582d;
            boolean z5 = true;
            C23679b<T>[] c23679bArr = atomicReference.get();
            int i = 1;
            while (true) {
                Object obj = this.f88585g;
                InterfaceC23555j<T> interfaceC23555j2 = this.f88587i;
                if (interfaceC23555j2 != null && !interfaceC23555j2.isEmpty()) {
                    z = false;
                } else {
                    z = z5;
                }
                if (m32874c(obj, z)) {
                    return;
                }
                if (!z) {
                    int length = c23679bArr.length;
                    int i2 = 0;
                    long j = LongCompanionObject.MAX_VALUE;
                    for (C23679b<T> c23679b : c23679bArr) {
                        long j2 = c23679b.get();
                        if (j2 != Long.MIN_VALUE) {
                            j = Math.min(j, j2 - c23679b.f88577d);
                        } else {
                            i2++;
                        }
                    }
                    if (length == i2) {
                        Object obj2 = this.f88585g;
                        try {
                            t = interfaceC23555j2.poll();
                        } catch (Throwable th) {
                            C23475a.m33009b(th);
                            this.f88584f.get().cancel();
                            obj2 = EnumC24479n.m32241g(th);
                            this.f88585g = obj2;
                            t = null;
                        }
                        if (t == null) {
                            z2 = z5;
                        } else {
                            z2 = false;
                        }
                        if (m32874c(obj2, z2)) {
                            return;
                        }
                        if (this.f88586h != z5) {
                            this.f88584f.get().mo21023o(1L);
                        }
                    } else {
                        int i3 = 0;
                        while (true) {
                            long j3 = i3;
                            if (j3 >= j) {
                                break;
                            }
                            Object obj3 = this.f88585g;
                            try {
                                t2 = interfaceC23555j2.poll();
                            } catch (Throwable th2) {
                                C23475a.m33009b(th2);
                                this.f88584f.get().cancel();
                                obj3 = EnumC24479n.m32241g(th2);
                                this.f88585g = obj3;
                                t2 = null;
                            }
                            if (t2 == null) {
                                z3 = z5;
                            } else {
                                z3 = false;
                            }
                            if (m32874c(obj3, z3)) {
                                return;
                            }
                            if (z3) {
                                z = z3;
                                break;
                            }
                            Object m32239i = EnumC24479n.m32239i(t2);
                            int length2 = c23679bArr.length;
                            int i4 = 0;
                            boolean z6 = false;
                            while (i4 < length2) {
                                C23679b<T> c23679b2 = c23679bArr[i4];
                                long j4 = c23679b2.get();
                                if (j4 != Long.MIN_VALUE) {
                                    if (j4 != LongCompanionObject.MAX_VALUE) {
                                        interfaceC23555j = interfaceC23555j2;
                                        z4 = z3;
                                        c23679b2.f88577d++;
                                    } else {
                                        interfaceC23555j = interfaceC23555j2;
                                        z4 = z3;
                                    }
                                    c23679b2.f88575b.onNext(m32239i);
                                } else {
                                    interfaceC23555j = interfaceC23555j2;
                                    z4 = z3;
                                    z6 = true;
                                }
                                i4++;
                                interfaceC23555j2 = interfaceC23555j;
                                z3 = z4;
                            }
                            InterfaceC23555j<T> interfaceC23555j3 = interfaceC23555j2;
                            boolean z7 = z3;
                            i3++;
                            C23679b<T>[] c23679bArr2 = atomicReference.get();
                            if (z6 || c23679bArr2 != c23679bArr) {
                                break;
                            }
                            interfaceC23555j2 = interfaceC23555j3;
                            z = z7;
                            z5 = true;
                        }
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
                c23679bArr = atomicReference.get();
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            C23679b<T>[] c23679bArr = this.f88582d.get();
            C23679b<T>[] c23679bArr2 = f88579k;
            if (c23679bArr != c23679bArr2 && this.f88582d.getAndSet(c23679bArr2) != c23679bArr2) {
                C42482i24.m35337a(this.f88580b, this, null);
                EnumC24463g.m32294a(this.f88584f);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f88582d.get() == f88579k;
        }

        /* renamed from: g */
        public void m32872g(C23679b<T> c23679b) {
            C23679b<T>[] c23679bArr;
            C23679b[] c23679bArr2;
            do {
                c23679bArr = this.f88582d.get();
                int length = c23679bArr.length;
                if (length != 0) {
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (c23679bArr[i].equals(c23679b)) {
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
                        c23679bArr2 = f88578j;
                    } else {
                        C23679b[] c23679bArr3 = new C23679b[length - 1];
                        System.arraycopy(c23679bArr, 0, c23679bArr3, 0, i);
                        System.arraycopy(c23679bArr, i + 1, c23679bArr3, i, (length - i) - 1);
                        c23679bArr2 = c23679bArr3;
                    }
                } else {
                    return;
                }
            } while (!C42482i24.m35337a(this.f88582d, c23679bArr, c23679bArr2));
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            if (this.f88585g == null) {
                this.f88585g = EnumC24479n.m32243e();
                m32873d();
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (this.f88585g == null) {
                this.f88585g = EnumC24479n.m32241g(th);
                m32873d();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            if (this.f88586h == 0 && !this.f88587i.offer(t)) {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            } else {
                m32873d();
            }
        }
    }

    public C23677T(InterfaceC45761na4<T> interfaceC45761na4, AbstractC24490k<T> abstractC24490k, AtomicReference<C23680c<T>> atomicReference, int i) {
        this.f88572f = interfaceC45761na4;
        this.f88569c = abstractC24490k;
        this.f88570d = atomicReference;
        this.f88571e = i;
    }

    /* renamed from: B1 */
    public static <T> AbstractC23477a<T> m32876B1(AbstractC24490k<T> abstractC24490k, int i) {
        AtomicReference atomicReference = new AtomicReference();
        return C24508a.m31992q(new C23677T(new C23678a(atomicReference, i), abstractC24490k, atomicReference, i));
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        this.f88572f.mo23497c(interfaceC42141hT5);
    }

    @Override // io.reactivex.internal.operators.flowable.InterfaceC23684V
    /* renamed from: b */
    public InterfaceC45761na4<T> mo32865b() {
        return this.f88569c;
    }

    @Override // io.reactivex.internal.operators.flowable.InterfaceC23684V
    /* renamed from: e */
    public int mo32864e() {
        return this.f88571e;
    }

    @Override // io.reactivex.flowables.AbstractC23477a
    /* renamed from: y1 */
    public void mo32844y1(InterfaceC23484g<? super InterfaceC23465c> interfaceC23484g) {
        C23680c<T> c23680c;
        while (true) {
            c23680c = this.f88570d.get();
            if (c23680c != null && !c23680c.mo1769e()) {
                break;
            }
            C23680c<T> c23680c2 = new C23680c<>(this.f88570d, this.f88571e);
            if (C42482i24.m35337a(this.f88570d, c23680c, c23680c2)) {
                c23680c = c23680c2;
                break;
            }
        }
        boolean z = false;
        if (!c23680c.f88583e.get() && c23680c.f88583e.compareAndSet(false, true)) {
            z = true;
        }
        try {
            interfaceC23484g.accept(c23680c);
            if (z) {
                this.f88569c.m32166W0(c23680c);
            }
        } catch (Throwable th) {
            C23475a.m33009b(th);
            throw C24475k.m32256e(th);
        }
    }
}
