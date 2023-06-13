package io.reactivex.internal.operators.mixed;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.fuseable.InterfaceC23554i;
import io.reactivex.internal.queue.C24408b;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24467c;
import io.reactivex.internal.util.C24468d;
import io.reactivex.internal.util.EnumC24474j;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.mixed.c */
/* loaded from: classes6.dex */
public final class C23923c<T, R> extends AbstractC24490k<R> {

    /* renamed from: c */
    public final AbstractC24490k<T> f89309c;

    /* renamed from: d */
    public final InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> f89310d;

    /* renamed from: e */
    public final EnumC24474j f89311e;

    /* renamed from: f */
    public final int f89312f;

    /* renamed from: io.reactivex.internal.operators.mixed.c$a */
    /* loaded from: classes6.dex */
    public static final class C23924a<T, R> extends AtomicInteger implements InterfaceC24494o<T>, InterfaceC46292oT5 {
        private static final long serialVersionUID = -9140123220065488293L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super R> f89313b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> f89314c;

        /* renamed from: d */
        public final int f89315d;

        /* renamed from: e */
        public final AtomicLong f89316e = new AtomicLong();

        /* renamed from: f */
        public final C24467c f89317f = new C24467c();

        /* renamed from: g */
        public final C23925a<R> f89318g = new C23925a<>(this);

        /* renamed from: h */
        public final InterfaceC23554i<T> f89319h;

        /* renamed from: i */
        public final EnumC24474j f89320i;

        /* renamed from: j */
        public InterfaceC46292oT5 f89321j;

        /* renamed from: k */
        public volatile boolean f89322k;

        /* renamed from: l */
        public volatile boolean f89323l;

        /* renamed from: m */
        public long f89324m;

        /* renamed from: n */
        public int f89325n;

        /* renamed from: o */
        public R f89326o;

        /* renamed from: p */
        public volatile int f89327p;

        /* renamed from: io.reactivex.internal.operators.mixed.c$a$a */
        /* loaded from: classes6.dex */
        public static final class C23925a<R> extends AtomicReference<InterfaceC23465c> implements InterfaceC24541s<R> {
            private static final long serialVersionUID = -3051469169682093892L;

            /* renamed from: b */
            public final C23924a<?, R> f89328b;

            public C23925a(C23924a<?, R> c23924a) {
                this.f89328b = c23924a;
            }

            /* renamed from: a */
            public void m32725a() {
                EnumC23501d.m33000a(this);
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onComplete() {
                this.f89328b.m32728c();
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onError(Throwable th) {
                this.f89328b.m32727d(th);
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32998c(this, interfaceC23465c);
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onSuccess(R r) {
                this.f89328b.m32726e(r);
            }
        }

        public C23924a(InterfaceC42141hT5<? super R> interfaceC42141hT5, InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o, int i, EnumC24474j enumC24474j) {
            this.f89313b = interfaceC42141hT5;
            this.f89314c = interfaceC23492o;
            this.f89315d = i;
            this.f89320i = enumC24474j;
            this.f89319h = new C24408b(i);
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f89321j, interfaceC46292oT5)) {
                this.f89321j = interfaceC46292oT5;
                this.f89313b.mo31867a(this);
                interfaceC46292oT5.mo21023o(this.f89315d);
            }
        }

        /* renamed from: b */
        public void m32729b() {
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC42141hT5<? super R> interfaceC42141hT5 = this.f89313b;
            EnumC24474j enumC24474j = this.f89320i;
            InterfaceC23554i<T> interfaceC23554i = this.f89319h;
            C24467c c24467c = this.f89317f;
            AtomicLong atomicLong = this.f89316e;
            int i = this.f89315d;
            int i2 = i - (i >> 1);
            int i3 = 1;
            while (true) {
                if (this.f89323l) {
                    interfaceC23554i.clear();
                    this.f89326o = null;
                } else {
                    int i4 = this.f89327p;
                    if (c24467c.get() == null || (enumC24474j != EnumC24474j.IMMEDIATE && (enumC24474j != EnumC24474j.BOUNDARY || i4 != 0))) {
                        if (i4 == 0) {
                            boolean z2 = this.f89322k;
                            T poll = interfaceC23554i.poll();
                            if (poll == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z2 && z) {
                                Throwable m32275b = c24467c.m32275b();
                                if (m32275b == null) {
                                    interfaceC42141hT5.onComplete();
                                    return;
                                } else {
                                    interfaceC42141hT5.onError(m32275b);
                                    return;
                                }
                            } else if (!z) {
                                int i5 = this.f89325n + 1;
                                if (i5 == i2) {
                                    this.f89325n = 0;
                                    this.f89321j.mo21023o(i2);
                                } else {
                                    this.f89325n = i5;
                                }
                                try {
                                    InterfaceC24574u interfaceC24574u = (InterfaceC24574u) C23544b.m32923e(this.f89314c.apply(poll), "The mapper returned a null MaybeSource");
                                    this.f89327p = 1;
                                    interfaceC24574u.mo31865a(this.f89318g);
                                } catch (Throwable th) {
                                    C23475a.m33009b(th);
                                    this.f89321j.cancel();
                                    interfaceC23554i.clear();
                                    c24467c.m32276a(th);
                                    interfaceC42141hT5.onError(c24467c.m32275b());
                                    return;
                                }
                            }
                        } else if (i4 == 2) {
                            long j = this.f89324m;
                            if (j != atomicLong.get()) {
                                this.f89326o = null;
                                interfaceC42141hT5.onNext((R) this.f89326o);
                                this.f89324m = j + 1;
                                this.f89327p = 0;
                            }
                        }
                    }
                }
                i3 = addAndGet(-i3);
                if (i3 == 0) {
                    return;
                }
            }
            interfaceC23554i.clear();
            this.f89326o = null;
            interfaceC42141hT5.onError(c24467c.m32275b());
        }

        /* renamed from: c */
        public void m32728c() {
            this.f89327p = 0;
            m32729b();
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            this.f89323l = true;
            this.f89321j.cancel();
            this.f89318g.m32725a();
            if (getAndIncrement() == 0) {
                this.f89319h.clear();
                this.f89326o = null;
            }
        }

        /* renamed from: d */
        public void m32727d(Throwable th) {
            if (this.f89317f.m32276a(th)) {
                if (this.f89320i != EnumC24474j.END) {
                    this.f89321j.cancel();
                }
                this.f89327p = 0;
                m32729b();
                return;
            }
            C24508a.m31988u(th);
        }

        /* renamed from: e */
        public void m32726e(R r) {
            this.f89326o = r;
            this.f89327p = 2;
            m32729b();
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            C24468d.m32274a(this.f89316e, j);
            m32729b();
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f89322k = true;
            m32729b();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (this.f89317f.m32276a(th)) {
                if (this.f89320i == EnumC24474j.IMMEDIATE) {
                    this.f89318g.m32725a();
                }
                this.f89322k = true;
                m32729b();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            if (!this.f89319h.offer(t)) {
                this.f89321j.cancel();
                onError(new MissingBackpressureException("queue full?!"));
                return;
            }
            m32729b();
        }
    }

    public C23923c(AbstractC24490k<T> abstractC24490k, InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o, EnumC24474j enumC24474j, int i) {
        this.f89309c = abstractC24490k;
        this.f89310d = interfaceC23492o;
        this.f89311e = enumC24474j;
        this.f89312f = i;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super R> interfaceC42141hT5) {
        this.f89309c.m32166W0(new C23924a(interfaceC42141hT5, this.f89310d, this.f89312f, this.f89311e));
    }
}
