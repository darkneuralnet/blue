package io.reactivex.internal.operators.mixed;

import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.fuseable.InterfaceC23554i;
import io.reactivex.internal.queue.C24409c;
import io.reactivex.internal.util.C24467c;
import io.reactivex.internal.util.EnumC24474j;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.mixed.h */
/* loaded from: classes6.dex */
public final class C23937h<T, R> extends Observable<R> {

    /* renamed from: b */
    public final Observable<T> f89377b;

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> f89378c;

    /* renamed from: d */
    public final EnumC24474j f89379d;

    /* renamed from: e */
    public final int f89380e;

    /* renamed from: io.reactivex.internal.operators.mixed.h$a */
    /* loaded from: classes6.dex */
    public static final class C23938a<T, R> extends AtomicInteger implements InterfaceC23436D<T>, InterfaceC23465c {
        private static final long serialVersionUID = -9140123220065488293L;

        /* renamed from: b */
        public final InterfaceC23436D<? super R> f89381b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> f89382c;

        /* renamed from: d */
        public final C24467c f89383d = new C24467c();

        /* renamed from: e */
        public final C23939a<R> f89384e = new C23939a<>(this);

        /* renamed from: f */
        public final InterfaceC23554i<T> f89385f;

        /* renamed from: g */
        public final EnumC24474j f89386g;

        /* renamed from: h */
        public InterfaceC23465c f89387h;

        /* renamed from: i */
        public volatile boolean f89388i;

        /* renamed from: j */
        public volatile boolean f89389j;

        /* renamed from: k */
        public R f89390k;

        /* renamed from: l */
        public volatile int f89391l;

        /* renamed from: io.reactivex.internal.operators.mixed.h$a$a */
        /* loaded from: classes6.dex */
        public static final class C23939a<R> extends AtomicReference<InterfaceC23465c> implements InterfaceC24541s<R> {
            private static final long serialVersionUID = -3051469169682093892L;

            /* renamed from: b */
            public final C23938a<?, R> f89392b;

            public C23939a(C23938a<?, R> c23938a) {
                this.f89392b = c23938a;
            }

            /* renamed from: a */
            public void m32708a() {
                EnumC23501d.m33000a(this);
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onComplete() {
                this.f89392b.m32711b();
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onError(Throwable th) {
                this.f89392b.m32710c(th);
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32998c(this, interfaceC23465c);
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onSuccess(R r) {
                this.f89392b.m32709d(r);
            }
        }

        public C23938a(InterfaceC23436D<? super R> interfaceC23436D, InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o, int i, EnumC24474j enumC24474j) {
            this.f89381b = interfaceC23436D;
            this.f89382c = interfaceC23492o;
            this.f89386g = enumC24474j;
            this.f89385f = new C24409c(i);
        }

        /* renamed from: a */
        public void m32712a() {
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC23436D<? super R> interfaceC23436D = this.f89381b;
            EnumC24474j enumC24474j = this.f89386g;
            InterfaceC23554i<T> interfaceC23554i = this.f89385f;
            C24467c c24467c = this.f89383d;
            int i = 1;
            while (true) {
                if (this.f89389j) {
                    interfaceC23554i.clear();
                    this.f89390k = null;
                } else {
                    int i2 = this.f89391l;
                    if (c24467c.get() == null || (enumC24474j != EnumC24474j.IMMEDIATE && (enumC24474j != EnumC24474j.BOUNDARY || i2 != 0))) {
                        boolean z = false;
                        if (i2 == 0) {
                            boolean z2 = this.f89388i;
                            T poll = interfaceC23554i.poll();
                            if (poll == null) {
                                z = true;
                            }
                            if (z2 && z) {
                                Throwable m32275b = c24467c.m32275b();
                                if (m32275b == null) {
                                    interfaceC23436D.onComplete();
                                    return;
                                } else {
                                    interfaceC23436D.onError(m32275b);
                                    return;
                                }
                            } else if (!z) {
                                try {
                                    InterfaceC24574u interfaceC24574u = (InterfaceC24574u) C23544b.m32923e(this.f89382c.apply(poll), "The mapper returned a null MaybeSource");
                                    this.f89391l = 1;
                                    interfaceC24574u.mo31865a(this.f89384e);
                                } catch (Throwable th) {
                                    C23475a.m33009b(th);
                                    this.f89387h.dispose();
                                    interfaceC23554i.clear();
                                    c24467c.m32276a(th);
                                    interfaceC23436D.onError(c24467c.m32275b());
                                    return;
                                }
                            }
                        } else if (i2 == 2) {
                            this.f89390k = null;
                            interfaceC23436D.onNext((R) this.f89390k);
                            this.f89391l = 0;
                        }
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
            interfaceC23554i.clear();
            this.f89390k = null;
            interfaceC23436D.onError(c24467c.m32275b());
        }

        /* renamed from: b */
        public void m32711b() {
            this.f89391l = 0;
            m32712a();
        }

        /* renamed from: c */
        public void m32710c(Throwable th) {
            if (this.f89383d.m32276a(th)) {
                if (this.f89386g != EnumC24474j.END) {
                    this.f89387h.dispose();
                }
                this.f89391l = 0;
                m32712a();
                return;
            }
            C24508a.m31988u(th);
        }

        /* renamed from: d */
        public void m32709d(R r) {
            this.f89390k = r;
            this.f89391l = 2;
            m32712a();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89389j = true;
            this.f89387h.dispose();
            this.f89384e.m32708a();
            if (getAndIncrement() == 0) {
                this.f89385f.clear();
                this.f89390k = null;
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89389j;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f89388i = true;
            m32712a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f89383d.m32276a(th)) {
                if (this.f89386g == EnumC24474j.IMMEDIATE) {
                    this.f89384e.m32708a();
                }
                this.f89388i = true;
                m32712a();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f89385f.offer(t);
            m32712a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89387h, interfaceC23465c)) {
                this.f89387h = interfaceC23465c;
                this.f89381b.onSubscribe(this);
            }
        }
    }

    public C23937h(Observable<T> observable, InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o, EnumC24474j enumC24474j, int i) {
        this.f89377b = observable;
        this.f89378c = interfaceC23492o;
        this.f89379d = enumC24474j;
        this.f89380e = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super R> interfaceC23436D) {
        if (!C23952m.m32689b(this.f89377b, this.f89378c, interfaceC23436D)) {
            this.f89377b.subscribe(new C23938a(interfaceC23436D, this.f89378c, this.f89380e, this.f89379d));
        }
    }
}
