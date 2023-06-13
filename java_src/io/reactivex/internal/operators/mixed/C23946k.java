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
import io.reactivex.internal.util.C24467c;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.mixed.k */
/* loaded from: classes6.dex */
public final class C23946k<T, R> extends Observable<R> {

    /* renamed from: b */
    public final Observable<T> f89421b;

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> f89422c;

    /* renamed from: d */
    public final boolean f89423d;

    /* renamed from: io.reactivex.internal.operators.mixed.k$a */
    /* loaded from: classes6.dex */
    public static final class C23947a<T, R> extends AtomicInteger implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: j */
        public static final C23948a<Object> f89424j = new C23948a<>(null);
        private static final long serialVersionUID = -5402190102429853762L;

        /* renamed from: b */
        public final InterfaceC23436D<? super R> f89425b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> f89426c;

        /* renamed from: d */
        public final boolean f89427d;

        /* renamed from: e */
        public final C24467c f89428e = new C24467c();

        /* renamed from: f */
        public final AtomicReference<C23948a<R>> f89429f = new AtomicReference<>();

        /* renamed from: g */
        public InterfaceC23465c f89430g;

        /* renamed from: h */
        public volatile boolean f89431h;

        /* renamed from: i */
        public volatile boolean f89432i;

        /* renamed from: io.reactivex.internal.operators.mixed.k$a$a */
        /* loaded from: classes6.dex */
        public static final class C23948a<R> extends AtomicReference<InterfaceC23465c> implements InterfaceC24541s<R> {
            private static final long serialVersionUID = 8042919737683345351L;

            /* renamed from: b */
            public final C23947a<?, R> f89433b;

            /* renamed from: c */
            public volatile R f89434c;

            public C23948a(C23947a<?, R> c23947a) {
                this.f89433b = c23947a;
            }

            /* renamed from: a */
            public void m32695a() {
                EnumC23501d.m33000a(this);
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onComplete() {
                this.f89433b.m32697c(this);
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onError(Throwable th) {
                this.f89433b.m32696d(this, th);
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32995h(this, interfaceC23465c);
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onSuccess(R r) {
                this.f89434c = r;
                this.f89433b.m32698b();
            }
        }

        public C23947a(InterfaceC23436D<? super R> interfaceC23436D, InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o, boolean z) {
            this.f89425b = interfaceC23436D;
            this.f89426c = interfaceC23492o;
            this.f89427d = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public void m32699a() {
            C23948a<Object> c23948a = f89424j;
            C23948a<Object> c23948a2 = (C23948a) this.f89429f.getAndSet(c23948a);
            if (c23948a2 != null && c23948a2 != c23948a) {
                c23948a2.m32695a();
            }
        }

        /* renamed from: b */
        public void m32698b() {
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC23436D<? super R> interfaceC23436D = this.f89425b;
            C24467c c24467c = this.f89428e;
            AtomicReference<C23948a<R>> atomicReference = this.f89429f;
            int i = 1;
            while (!this.f89432i) {
                if (c24467c.get() != null && !this.f89427d) {
                    interfaceC23436D.onError(c24467c.m32275b());
                    return;
                }
                boolean z2 = this.f89431h;
                C23948a<R> c23948a = atomicReference.get();
                if (c23948a == null) {
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
                } else if (!z && c23948a.f89434c != null) {
                    C42482i24.m35337a(atomicReference, c23948a, null);
                    interfaceC23436D.onNext((R) c23948a.f89434c);
                } else {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        /* renamed from: c */
        public void m32697c(C23948a<R> c23948a) {
            if (C42482i24.m35337a(this.f89429f, c23948a, null)) {
                m32698b();
            }
        }

        /* renamed from: d */
        public void m32696d(C23948a<R> c23948a, Throwable th) {
            if (C42482i24.m35337a(this.f89429f, c23948a, null) && this.f89428e.m32276a(th)) {
                if (!this.f89427d) {
                    this.f89430g.dispose();
                    m32699a();
                }
                m32698b();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89432i = true;
            this.f89430g.dispose();
            m32699a();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89432i;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f89431h = true;
            m32698b();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f89428e.m32276a(th)) {
                if (!this.f89427d) {
                    m32699a();
                }
                this.f89431h = true;
                m32698b();
                return;
            }
            C24508a.m31988u(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            C23948a<R> c23948a;
            C23948a<R> c23948a2 = this.f89429f.get();
            if (c23948a2 != null) {
                c23948a2.m32695a();
            }
            try {
                InterfaceC24574u interfaceC24574u = (InterfaceC24574u) C23544b.m32923e(this.f89426c.apply(t), "The mapper returned a null MaybeSource");
                C23948a c23948a3 = new C23948a(this);
                do {
                    c23948a = this.f89429f.get();
                    if (c23948a == f89424j) {
                        return;
                    }
                } while (!C42482i24.m35337a(this.f89429f, c23948a, c23948a3));
                interfaceC24574u.mo31865a(c23948a3);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f89430g.dispose();
                this.f89429f.getAndSet(f89424j);
                onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89430g, interfaceC23465c)) {
                this.f89430g = interfaceC23465c;
                this.f89425b.onSubscribe(this);
            }
        }
    }

    public C23946k(Observable<T> observable, InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o, boolean z) {
        this.f89421b = observable;
        this.f89422c = interfaceC23492o;
        this.f89423d = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super R> interfaceC23436D) {
        if (!C23952m.m32689b(this.f89421b, this.f89422c, interfaceC23436D)) {
            this.f89421b.subscribe(new C23947a(interfaceC23436D, this.f89422c, this.f89423d));
        }
    }
}
