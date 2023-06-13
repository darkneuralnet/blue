package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.fuseable.InterfaceC23554i;
import io.reactivex.internal.queue.C24409c;
import io.reactivex.internal.util.C24467c;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.B0 */
/* loaded from: classes6.dex */
public final class C23967B0<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC24574u<? extends T> f89483c;

    /* renamed from: io.reactivex.internal.operators.observable.B0$a */
    /* loaded from: classes6.dex */
    public static final class C23968a<T> extends AtomicInteger implements InterfaceC23436D<T>, InterfaceC23465c {
        private static final long serialVersionUID = -4592979584110982903L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f89484b;

        /* renamed from: c */
        public final AtomicReference<InterfaceC23465c> f89485c = new AtomicReference<>();

        /* renamed from: d */
        public final C23969a<T> f89486d = new C23969a<>(this);

        /* renamed from: e */
        public final C24467c f89487e = new C24467c();

        /* renamed from: f */
        public volatile InterfaceC23554i<T> f89488f;

        /* renamed from: g */
        public T f89489g;

        /* renamed from: h */
        public volatile boolean f89490h;

        /* renamed from: i */
        public volatile boolean f89491i;

        /* renamed from: j */
        public volatile int f89492j;

        /* renamed from: io.reactivex.internal.operators.observable.B0$a$a */
        /* loaded from: classes6.dex */
        public static final class C23969a<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC24541s<T> {
            private static final long serialVersionUID = -2935427570954647017L;

            /* renamed from: b */
            public final C23968a<T> f89493b;

            public C23969a(C23968a<T> c23968a) {
                this.f89493b = c23968a;
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onComplete() {
                this.f89493b.m32679d();
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onError(Throwable th) {
                this.f89493b.m32678g(th);
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32995h(this, interfaceC23465c);
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onSuccess(T t) {
                this.f89493b.m32677h(t);
            }
        }

        public C23968a(InterfaceC23436D<? super T> interfaceC23436D) {
            this.f89484b = interfaceC23436D;
        }

        /* renamed from: a */
        public void m32682a() {
            if (getAndIncrement() == 0) {
                m32681b();
            }
        }

        /* renamed from: b */
        public void m32681b() {
            Object obj;
            boolean z;
            InterfaceC23436D<? super T> interfaceC23436D = this.f89484b;
            int i = 1;
            while (!this.f89490h) {
                if (this.f89487e.get() != null) {
                    this.f89489g = null;
                    this.f89488f = null;
                    interfaceC23436D.onError(this.f89487e.m32275b());
                    return;
                }
                int i2 = this.f89492j;
                if (i2 == 1) {
                    this.f89489g = null;
                    this.f89492j = 2;
                    interfaceC23436D.onNext((T) this.f89489g);
                    i2 = 2;
                }
                boolean z2 = this.f89491i;
                InterfaceC23554i<T> interfaceC23554i = this.f89488f;
                if (interfaceC23554i != null) {
                    obj = (T) interfaceC23554i.poll();
                } else {
                    obj = (Object) null;
                }
                if (obj == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2 && z && i2 == 2) {
                    this.f89488f = null;
                    interfaceC23436D.onComplete();
                    return;
                } else if (z) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    interfaceC23436D.onNext(obj);
                }
            }
            this.f89489g = null;
            this.f89488f = null;
        }

        /* renamed from: c */
        public InterfaceC23554i<T> m32680c() {
            InterfaceC23554i<T> interfaceC23554i = this.f89488f;
            if (interfaceC23554i == null) {
                C24409c c24409c = new C24409c(Observable.bufferSize());
                this.f89488f = c24409c;
                return c24409c;
            }
            return interfaceC23554i;
        }

        /* renamed from: d */
        public void m32679d() {
            this.f89492j = 2;
            m32682a();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89490h = true;
            EnumC23501d.m33000a(this.f89485c);
            EnumC23501d.m33000a(this.f89486d);
            if (getAndIncrement() == 0) {
                this.f89488f = null;
                this.f89489g = null;
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(this.f89485c.get());
        }

        /* renamed from: g */
        public void m32678g(Throwable th) {
            if (this.f89487e.m32276a(th)) {
                EnumC23501d.m33000a(this.f89485c);
                m32682a();
                return;
            }
            C24508a.m31988u(th);
        }

        /* renamed from: h */
        public void m32677h(T t) {
            if (compareAndSet(0, 1)) {
                this.f89484b.onNext(t);
                this.f89492j = 2;
            } else {
                this.f89489g = t;
                this.f89492j = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m32681b();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f89491i = true;
            m32682a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f89487e.m32276a(th)) {
                EnumC23501d.m33000a(this.f89486d);
                m32682a();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (compareAndSet(0, 1)) {
                this.f89484b.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                m32680c().offer(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m32681b();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this.f89485c, interfaceC23465c);
        }
    }

    public C23967B0(Observable<T> observable, InterfaceC24574u<? extends T> interfaceC24574u) {
        super(observable);
        this.f89483c = interfaceC24574u;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        C23968a c23968a = new C23968a(interfaceC23436D);
        interfaceC23436D.onSubscribe(c23968a);
        this.f90078b.subscribe(c23968a);
        this.f89483c.mo31865a(c23968a.f89486d);
    }
}
