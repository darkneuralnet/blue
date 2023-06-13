package io.reactivex.internal.operators.mixed;

import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
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
/* renamed from: io.reactivex.internal.operators.mixed.i */
/* loaded from: classes6.dex */
public final class C23940i<T, R> extends Observable<R> {

    /* renamed from: b */
    public final Observable<T> f89393b;

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> f89394c;

    /* renamed from: d */
    public final EnumC24474j f89395d;

    /* renamed from: e */
    public final int f89396e;

    /* renamed from: io.reactivex.internal.operators.mixed.i$a */
    /* loaded from: classes6.dex */
    public static final class C23941a<T, R> extends AtomicInteger implements InterfaceC23436D<T>, InterfaceC23465c {
        private static final long serialVersionUID = -9140123220065488293L;

        /* renamed from: b */
        public final InterfaceC23436D<? super R> f89397b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> f89398c;

        /* renamed from: d */
        public final C24467c f89399d = new C24467c();

        /* renamed from: e */
        public final C23942a<R> f89400e = new C23942a<>(this);

        /* renamed from: f */
        public final InterfaceC23554i<T> f89401f;

        /* renamed from: g */
        public final EnumC24474j f89402g;

        /* renamed from: h */
        public InterfaceC23465c f89403h;

        /* renamed from: i */
        public volatile boolean f89404i;

        /* renamed from: j */
        public volatile boolean f89405j;

        /* renamed from: k */
        public R f89406k;

        /* renamed from: l */
        public volatile int f89407l;

        /* renamed from: io.reactivex.internal.operators.mixed.i$a$a */
        /* loaded from: classes6.dex */
        public static final class C23942a<R> extends AtomicReference<InterfaceC23465c> implements InterfaceC23445I<R> {
            private static final long serialVersionUID = -3051469169682093892L;

            /* renamed from: b */
            public final C23941a<?, R> f89408b;

            public C23942a(C23941a<?, R> c23941a) {
                this.f89408b = c23941a;
            }

            /* renamed from: a */
            public void m32704a() {
                EnumC23501d.m33000a(this);
            }

            @Override // io.reactivex.InterfaceC23445I
            public void onError(Throwable th) {
                this.f89408b.m32706b(th);
            }

            @Override // io.reactivex.InterfaceC23445I
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32998c(this, interfaceC23465c);
            }

            @Override // io.reactivex.InterfaceC23445I
            public void onSuccess(R r) {
                this.f89408b.m32705c(r);
            }
        }

        public C23941a(InterfaceC23436D<? super R> interfaceC23436D, InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> interfaceC23492o, int i, EnumC24474j enumC24474j) {
            this.f89397b = interfaceC23436D;
            this.f89398c = interfaceC23492o;
            this.f89402g = enumC24474j;
            this.f89401f = new C24409c(i);
        }

        /* renamed from: a */
        public void m32707a() {
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC23436D<? super R> interfaceC23436D = this.f89397b;
            EnumC24474j enumC24474j = this.f89402g;
            InterfaceC23554i<T> interfaceC23554i = this.f89401f;
            C24467c c24467c = this.f89399d;
            int i = 1;
            while (true) {
                if (this.f89405j) {
                    interfaceC23554i.clear();
                    this.f89406k = null;
                } else {
                    int i2 = this.f89407l;
                    if (c24467c.get() == null || (enumC24474j != EnumC24474j.IMMEDIATE && (enumC24474j != EnumC24474j.BOUNDARY || i2 != 0))) {
                        boolean z = false;
                        if (i2 == 0) {
                            boolean z2 = this.f89404i;
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
                                    InterfaceC23447K interfaceC23447K = (InterfaceC23447K) C23544b.m32923e(this.f89398c.apply(poll), "The mapper returned a null SingleSource");
                                    this.f89407l = 1;
                                    interfaceC23447K.mo33096a(this.f89400e);
                                } catch (Throwable th) {
                                    C23475a.m33009b(th);
                                    this.f89403h.dispose();
                                    interfaceC23554i.clear();
                                    c24467c.m32276a(th);
                                    interfaceC23436D.onError(c24467c.m32275b());
                                    return;
                                }
                            }
                        } else if (i2 == 2) {
                            this.f89406k = null;
                            interfaceC23436D.onNext((R) this.f89406k);
                            this.f89407l = 0;
                        }
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
            interfaceC23554i.clear();
            this.f89406k = null;
            interfaceC23436D.onError(c24467c.m32275b());
        }

        /* renamed from: b */
        public void m32706b(Throwable th) {
            if (this.f89399d.m32276a(th)) {
                if (this.f89402g != EnumC24474j.END) {
                    this.f89403h.dispose();
                }
                this.f89407l = 0;
                m32707a();
                return;
            }
            C24508a.m31988u(th);
        }

        /* renamed from: c */
        public void m32705c(R r) {
            this.f89406k = r;
            this.f89407l = 2;
            m32707a();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89405j = true;
            this.f89403h.dispose();
            this.f89400e.m32704a();
            if (getAndIncrement() == 0) {
                this.f89401f.clear();
                this.f89406k = null;
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89405j;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f89404i = true;
            m32707a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f89399d.m32276a(th)) {
                if (this.f89402g == EnumC24474j.IMMEDIATE) {
                    this.f89400e.m32704a();
                }
                this.f89404i = true;
                m32707a();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f89401f.offer(t);
            m32707a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89403h, interfaceC23465c)) {
                this.f89403h = interfaceC23465c;
                this.f89397b.onSubscribe(this);
            }
        }
    }

    public C23940i(Observable<T> observable, InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> interfaceC23492o, EnumC24474j enumC24474j, int i) {
        this.f89393b = observable;
        this.f89394c = interfaceC23492o;
        this.f89395d = enumC24474j;
        this.f89396e = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super R> interfaceC23436D) {
        if (!C23952m.m32688c(this.f89393b, this.f89394c, interfaceC23436D)) {
            this.f89393b.subscribe(new C23941a(interfaceC23436D, this.f89394c, this.f89396e, this.f89395d));
        }
    }
}
