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
import io.reactivex.internal.util.C24467c;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.mixed.l */
/* loaded from: classes6.dex */
public final class C23949l<T, R> extends Observable<R> {

    /* renamed from: b */
    public final Observable<T> f89435b;

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> f89436c;

    /* renamed from: d */
    public final boolean f89437d;

    /* renamed from: io.reactivex.internal.operators.mixed.l$a */
    /* loaded from: classes6.dex */
    public static final class C23950a<T, R> extends AtomicInteger implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: j */
        public static final C23951a<Object> f89438j = new C23951a<>(null);
        private static final long serialVersionUID = -5402190102429853762L;

        /* renamed from: b */
        public final InterfaceC23436D<? super R> f89439b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> f89440c;

        /* renamed from: d */
        public final boolean f89441d;

        /* renamed from: e */
        public final C24467c f89442e = new C24467c();

        /* renamed from: f */
        public final AtomicReference<C23951a<R>> f89443f = new AtomicReference<>();

        /* renamed from: g */
        public InterfaceC23465c f89444g;

        /* renamed from: h */
        public volatile boolean f89445h;

        /* renamed from: i */
        public volatile boolean f89446i;

        /* renamed from: io.reactivex.internal.operators.mixed.l$a$a */
        /* loaded from: classes6.dex */
        public static final class C23951a<R> extends AtomicReference<InterfaceC23465c> implements InterfaceC23445I<R> {
            private static final long serialVersionUID = 8042919737683345351L;

            /* renamed from: b */
            public final C23950a<?, R> f89447b;

            /* renamed from: c */
            public volatile R f89448c;

            public C23951a(C23950a<?, R> c23950a) {
                this.f89447b = c23950a;
            }

            /* renamed from: a */
            public void m32691a() {
                EnumC23501d.m33000a(this);
            }

            @Override // io.reactivex.InterfaceC23445I
            public void onError(Throwable th) {
                this.f89447b.m32692c(this, th);
            }

            @Override // io.reactivex.InterfaceC23445I
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32995h(this, interfaceC23465c);
            }

            @Override // io.reactivex.InterfaceC23445I
            public void onSuccess(R r) {
                this.f89448c = r;
                this.f89447b.m32693b();
            }
        }

        public C23950a(InterfaceC23436D<? super R> interfaceC23436D, InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> interfaceC23492o, boolean z) {
            this.f89439b = interfaceC23436D;
            this.f89440c = interfaceC23492o;
            this.f89441d = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public void m32694a() {
            C23951a<Object> c23951a = f89438j;
            C23951a<Object> c23951a2 = (C23951a) this.f89443f.getAndSet(c23951a);
            if (c23951a2 != null && c23951a2 != c23951a) {
                c23951a2.m32691a();
            }
        }

        /* renamed from: b */
        public void m32693b() {
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC23436D<? super R> interfaceC23436D = this.f89439b;
            C24467c c24467c = this.f89442e;
            AtomicReference<C23951a<R>> atomicReference = this.f89443f;
            int i = 1;
            while (!this.f89446i) {
                if (c24467c.get() != null && !this.f89441d) {
                    interfaceC23436D.onError(c24467c.m32275b());
                    return;
                }
                boolean z2 = this.f89445h;
                C23951a<R> c23951a = atomicReference.get();
                if (c23951a == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2 && z) {
                    Throwable m32275b = c24467c.m32275b();
                    if (m32275b != null) {
                        interfaceC23436D.onError(m32275b);
                        return;
                    } else {
                        interfaceC23436D.onComplete();
                        return;
                    }
                } else if (!z && c23951a.f89448c != null) {
                    C42482i24.m35337a(atomicReference, c23951a, null);
                    interfaceC23436D.onNext((R) c23951a.f89448c);
                } else {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        /* renamed from: c */
        public void m32692c(C23951a<R> c23951a, Throwable th) {
            if (C42482i24.m35337a(this.f89443f, c23951a, null) && this.f89442e.m32276a(th)) {
                if (!this.f89441d) {
                    this.f89444g.dispose();
                    m32694a();
                }
                m32693b();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89446i = true;
            this.f89444g.dispose();
            m32694a();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89446i;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f89445h = true;
            m32693b();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f89442e.m32276a(th)) {
                if (!this.f89441d) {
                    m32694a();
                }
                this.f89445h = true;
                m32693b();
                return;
            }
            C24508a.m31988u(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            C23951a<R> c23951a;
            C23951a<R> c23951a2 = this.f89443f.get();
            if (c23951a2 != null) {
                c23951a2.m32691a();
            }
            try {
                InterfaceC23447K interfaceC23447K = (InterfaceC23447K) C23544b.m32923e(this.f89440c.apply(t), "The mapper returned a null SingleSource");
                C23951a c23951a3 = new C23951a(this);
                do {
                    c23951a = this.f89443f.get();
                    if (c23951a == f89438j) {
                        return;
                    }
                } while (!C42482i24.m35337a(this.f89443f, c23951a, c23951a3));
                interfaceC23447K.mo33096a(c23951a3);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f89444g.dispose();
                this.f89443f.getAndSet(f89438j);
                onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89444g, interfaceC23465c)) {
                this.f89444g = interfaceC23465c;
                this.f89439b.onSubscribe(this);
            }
        }
    }

    public C23949l(Observable<T> observable, InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> interfaceC23492o, boolean z) {
        this.f89435b = observable;
        this.f89436c = interfaceC23492o;
        this.f89437d = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super R> interfaceC23436D) {
        if (!C23952m.m32688c(this.f89435b, this.f89436c, interfaceC23436D)) {
            this.f89435b.subscribe(new C23950a(interfaceC23436D, this.f89436c, this.f89437d));
        }
    }
}
