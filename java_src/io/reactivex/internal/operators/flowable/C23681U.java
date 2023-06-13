package io.reactivex.internal.operators.flowable;

import io.reactivex.InterfaceC24494o;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.flowables.AbstractC23477a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.internal.disposables.InterfaceC23504g;
import io.reactivex.internal.fuseable.InterfaceC23552g;
import io.reactivex.internal.fuseable.InterfaceC23555j;
import io.reactivex.internal.queue.C24408b;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24468d;
import io.reactivex.internal.util.C24475k;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.U */
/* loaded from: classes6.dex */
public final class C23681U<T> extends AbstractC23477a<T> implements InterfaceC23504g {

    /* renamed from: c */
    public final InterfaceC45761na4<T> f88588c;

    /* renamed from: d */
    public final int f88589d;

    /* renamed from: e */
    public final AtomicReference<C23683b<T>> f88590e = new AtomicReference<>();

    /* renamed from: io.reactivex.internal.operators.flowable.U$a */
    /* loaded from: classes6.dex */
    public static final class C23682a<T> extends AtomicLong implements InterfaceC46292oT5 {
        private static final long serialVersionUID = 2845000326761540265L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super T> f88591b;

        /* renamed from: c */
        public final C23683b<T> f88592c;

        /* renamed from: d */
        public long f88593d;

        public C23682a(InterfaceC42141hT5<? super T> interfaceC42141hT5, C23683b<T> c23683b) {
            this.f88591b = interfaceC42141hT5;
            this.f88592c = c23683b;
        }

        /* renamed from: a */
        public boolean m32871a() {
            return get() == Long.MIN_VALUE;
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f88592c.m32867g(this);
                this.f88592c.m32868d();
            }
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            C24468d.m32273b(this, j);
            this.f88592c.m32868d();
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.U$b */
    /* loaded from: classes6.dex */
    public static final class C23683b<T> extends AtomicInteger implements InterfaceC24494o<T>, InterfaceC23465c {

        /* renamed from: l */
        public static final C23682a[] f88594l = new C23682a[0];

        /* renamed from: m */
        public static final C23682a[] f88595m = new C23682a[0];
        private static final long serialVersionUID = -1672047311619175801L;

        /* renamed from: b */
        public final AtomicReference<C23683b<T>> f88596b;

        /* renamed from: c */
        public final AtomicReference<InterfaceC46292oT5> f88597c = new AtomicReference<>();

        /* renamed from: d */
        public final AtomicBoolean f88598d = new AtomicBoolean();

        /* renamed from: e */
        public final AtomicReference<C23682a<T>[]> f88599e = new AtomicReference<>(f88594l);

        /* renamed from: f */
        public final int f88600f;

        /* renamed from: g */
        public volatile InterfaceC23555j<T> f88601g;

        /* renamed from: h */
        public int f88602h;

        /* renamed from: i */
        public volatile boolean f88603i;

        /* renamed from: j */
        public Throwable f88604j;

        /* renamed from: k */
        public int f88605k;

        public C23683b(AtomicReference<C23683b<T>> atomicReference, int i) {
            this.f88596b = atomicReference;
            this.f88600f = i;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32289f(this.f88597c, interfaceC46292oT5)) {
                if (interfaceC46292oT5 instanceof InterfaceC23552g) {
                    InterfaceC23552g interfaceC23552g = (InterfaceC23552g) interfaceC46292oT5;
                    int mo31868b = interfaceC23552g.mo31868b(7);
                    if (mo31868b == 1) {
                        this.f88602h = mo31868b;
                        this.f88601g = interfaceC23552g;
                        this.f88603i = true;
                        m32868d();
                        return;
                    } else if (mo31868b == 2) {
                        this.f88602h = mo31868b;
                        this.f88601g = interfaceC23552g;
                        interfaceC46292oT5.mo21023o(this.f88600f);
                        return;
                    }
                }
                this.f88601g = new C24408b(this.f88600f);
                interfaceC46292oT5.mo21023o(this.f88600f);
            }
        }

        /* renamed from: b */
        public boolean m32870b(C23682a<T> c23682a) {
            C23682a<T>[] c23682aArr;
            C23682a[] c23682aArr2;
            do {
                c23682aArr = this.f88599e.get();
                if (c23682aArr == f88595m) {
                    return false;
                }
                int length = c23682aArr.length;
                c23682aArr2 = new C23682a[length + 1];
                System.arraycopy(c23682aArr, 0, c23682aArr2, 0, length);
                c23682aArr2[length] = c23682a;
            } while (!C42482i24.m35337a(this.f88599e, c23682aArr, c23682aArr2));
            return true;
        }

        /* renamed from: c */
        public boolean m32869c(boolean z, boolean z2) {
            C23682a<T>[] andSet;
            if (!z || !z2) {
                return false;
            }
            Throwable th = this.f88604j;
            if (th != null) {
                m32866i(th);
                return true;
            }
            for (C23682a<T> c23682a : this.f88599e.getAndSet(f88595m)) {
                if (!c23682a.m32871a()) {
                    c23682a.f88591b.onComplete();
                }
            }
            return true;
        }

        /* renamed from: d */
        public void m32868d() {
            boolean z;
            boolean z2;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC23555j<T> interfaceC23555j = this.f88601g;
            int i = this.f88605k;
            int i2 = this.f88600f;
            int i3 = i2 - (i2 >> 2);
            if (this.f88602h != 1) {
                z = true;
            } else {
                z = false;
            }
            int i4 = 1;
            InterfaceC23555j<T> interfaceC23555j2 = interfaceC23555j;
            int i5 = i;
            while (true) {
                if (interfaceC23555j2 != null) {
                    C23682a<T>[] c23682aArr = this.f88599e.get();
                    long j = LongCompanionObject.MAX_VALUE;
                    boolean z3 = false;
                    for (C23682a<T> c23682a : c23682aArr) {
                        long j2 = c23682a.get();
                        if (j2 != Long.MIN_VALUE) {
                            j = Math.min(j2 - c23682a.f88593d, j);
                            z3 = true;
                        }
                    }
                    if (!z3) {
                        j = 0;
                    }
                    for (long j3 = 0; j != j3; j3 = 0) {
                        boolean z4 = this.f88603i;
                        try {
                            T poll = interfaceC23555j2.poll();
                            if (poll == null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (m32869c(z4, z2)) {
                                return;
                            }
                            if (z2) {
                                break;
                            }
                            for (C23682a<T> c23682a2 : c23682aArr) {
                                if (!c23682a2.m32871a()) {
                                    c23682a2.f88591b.onNext(poll);
                                    c23682a2.f88593d++;
                                }
                            }
                            if (z && (i5 = i5 + 1) == i3) {
                                this.f88597c.get().mo21023o(i3);
                                i5 = 0;
                            }
                            j--;
                            if (c23682aArr != this.f88599e.get()) {
                                break;
                            }
                        } catch (Throwable th) {
                            C23475a.m33009b(th);
                            this.f88597c.get().cancel();
                            interfaceC23555j2.clear();
                            this.f88603i = true;
                            m32866i(th);
                            return;
                        }
                    }
                    if (m32869c(this.f88603i, interfaceC23555j2.isEmpty())) {
                        return;
                    }
                }
                this.f88605k = i5;
                i4 = addAndGet(-i4);
                if (i4 == 0) {
                    return;
                }
                if (interfaceC23555j2 == null) {
                    interfaceC23555j2 = this.f88601g;
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f88599e.getAndSet(f88595m);
            C42482i24.m35337a(this.f88596b, this, null);
            EnumC24463g.m32294a(this.f88597c);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f88599e.get() == f88595m;
        }

        /* renamed from: g */
        public void m32867g(C23682a<T> c23682a) {
            C23682a<T>[] c23682aArr;
            C23682a[] c23682aArr2;
            do {
                c23682aArr = this.f88599e.get();
                int length = c23682aArr.length;
                if (length != 0) {
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (c23682aArr[i] == c23682a) {
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
                        c23682aArr2 = f88594l;
                    } else {
                        C23682a[] c23682aArr3 = new C23682a[length - 1];
                        System.arraycopy(c23682aArr, 0, c23682aArr3, 0, i);
                        System.arraycopy(c23682aArr, i + 1, c23682aArr3, i, (length - i) - 1);
                        c23682aArr2 = c23682aArr3;
                    }
                } else {
                    return;
                }
            } while (!C42482i24.m35337a(this.f88599e, c23682aArr, c23682aArr2));
        }

        /* renamed from: i */
        public void m32866i(Throwable th) {
            C23682a<T>[] andSet;
            for (C23682a<T> c23682a : this.f88599e.getAndSet(f88595m)) {
                if (!c23682a.m32871a()) {
                    c23682a.f88591b.onError(th);
                }
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f88603i = true;
            m32868d();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (this.f88603i) {
                C24508a.m31988u(th);
                return;
            }
            this.f88604j = th;
            this.f88603i = true;
            m32868d();
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            if (this.f88602h == 0 && !this.f88601g.offer(t)) {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            } else {
                m32868d();
            }
        }
    }

    public C23681U(InterfaceC45761na4<T> interfaceC45761na4, int i) {
        this.f88588c = interfaceC45761na4;
        this.f88589d = i;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        C23683b<T> c23683b;
        while (true) {
            c23683b = this.f88590e.get();
            if (c23683b != null) {
                break;
            }
            C23683b<T> c23683b2 = new C23683b<>(this.f88590e, this.f88589d);
            if (C42482i24.m35337a(this.f88590e, c23683b, c23683b2)) {
                c23683b = c23683b2;
                break;
            }
        }
        C23682a<T> c23682a = new C23682a<>(interfaceC42141hT5, c23683b);
        interfaceC42141hT5.mo31867a(c23682a);
        if (c23683b.m32870b(c23682a)) {
            if (c23682a.m32871a()) {
                c23683b.m32867g(c23682a);
                return;
            } else {
                c23683b.m32868d();
                return;
            }
        }
        Throwable th = c23683b.f88604j;
        if (th != null) {
            interfaceC42141hT5.onError(th);
        } else {
            interfaceC42141hT5.onComplete();
        }
    }

    @Override // io.reactivex.internal.disposables.InterfaceC23504g
    /* renamed from: d */
    public void mo32598d(InterfaceC23465c interfaceC23465c) {
        C42482i24.m35337a(this.f88590e, (C23683b) interfaceC23465c, null);
    }

    @Override // io.reactivex.flowables.AbstractC23477a
    /* renamed from: y1 */
    public void mo32844y1(InterfaceC23484g<? super InterfaceC23465c> interfaceC23484g) {
        C23683b<T> c23683b;
        while (true) {
            c23683b = this.f88590e.get();
            if (c23683b != null && !c23683b.mo1769e()) {
                break;
            }
            C23683b<T> c23683b2 = new C23683b<>(this.f88590e, this.f88589d);
            if (C42482i24.m35337a(this.f88590e, c23683b, c23683b2)) {
                c23683b = c23683b2;
                break;
            }
        }
        boolean z = false;
        if (!c23683b.f88598d.get() && c23683b.f88598d.compareAndSet(false, true)) {
            z = true;
        }
        try {
            interfaceC23484g.accept(c23683b);
            if (z) {
                this.f88588c.mo23497c(c23683b);
            }
        } catch (Throwable th) {
            C23475a.m33009b(th);
            throw C24475k.m32256e(th);
        }
    }
}
