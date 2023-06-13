package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.fuseable.InterfaceC23554i;
import io.reactivex.internal.queue.C24409c;
import io.reactivex.internal.util.C24467c;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.C0 */
/* loaded from: classes6.dex */
public final class C23978C0<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC23447K<? extends T> f89518c;

    /* renamed from: io.reactivex.internal.operators.observable.C0$a */
    /* loaded from: classes6.dex */
    public static final class C23979a<T> extends AtomicInteger implements InterfaceC23436D<T>, InterfaceC23465c {
        private static final long serialVersionUID = -4592979584110982903L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f89519b;

        /* renamed from: c */
        public final AtomicReference<InterfaceC23465c> f89520c = new AtomicReference<>();

        /* renamed from: d */
        public final C23980a<T> f89521d = new C23980a<>(this);

        /* renamed from: e */
        public final C24467c f89522e = new C24467c();

        /* renamed from: f */
        public volatile InterfaceC23554i<T> f89523f;

        /* renamed from: g */
        public T f89524g;

        /* renamed from: h */
        public volatile boolean f89525h;

        /* renamed from: i */
        public volatile boolean f89526i;

        /* renamed from: j */
        public volatile int f89527j;

        /* renamed from: io.reactivex.internal.operators.observable.C0$a$a */
        /* loaded from: classes6.dex */
        public static final class C23980a<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC23445I<T> {
            private static final long serialVersionUID = -2935427570954647017L;

            /* renamed from: b */
            public final C23979a<T> f89528b;

            public C23980a(C23979a<T> c23979a) {
                this.f89528b = c23979a;
            }

            @Override // io.reactivex.InterfaceC23445I
            public void onError(Throwable th) {
                this.f89528b.m32670d(th);
            }

            @Override // io.reactivex.InterfaceC23445I
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32995h(this, interfaceC23465c);
            }

            @Override // io.reactivex.InterfaceC23445I
            public void onSuccess(T t) {
                this.f89528b.m32669g(t);
            }
        }

        public C23979a(InterfaceC23436D<? super T> interfaceC23436D) {
            this.f89519b = interfaceC23436D;
        }

        /* renamed from: a */
        public void m32673a() {
            if (getAndIncrement() == 0) {
                m32672b();
            }
        }

        /* renamed from: b */
        public void m32672b() {
            Object obj;
            boolean z;
            InterfaceC23436D<? super T> interfaceC23436D = this.f89519b;
            int i = 1;
            while (!this.f89525h) {
                if (this.f89522e.get() != null) {
                    this.f89524g = null;
                    this.f89523f = null;
                    interfaceC23436D.onError(this.f89522e.m32275b());
                    return;
                }
                int i2 = this.f89527j;
                if (i2 == 1) {
                    this.f89524g = null;
                    this.f89527j = 2;
                    interfaceC23436D.onNext((T) this.f89524g);
                    i2 = 2;
                }
                boolean z2 = this.f89526i;
                InterfaceC23554i<T> interfaceC23554i = this.f89523f;
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
                    this.f89523f = null;
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
            this.f89524g = null;
            this.f89523f = null;
        }

        /* renamed from: c */
        public InterfaceC23554i<T> m32671c() {
            InterfaceC23554i<T> interfaceC23554i = this.f89523f;
            if (interfaceC23554i == null) {
                C24409c c24409c = new C24409c(Observable.bufferSize());
                this.f89523f = c24409c;
                return c24409c;
            }
            return interfaceC23554i;
        }

        /* renamed from: d */
        public void m32670d(Throwable th) {
            if (this.f89522e.m32276a(th)) {
                EnumC23501d.m33000a(this.f89520c);
                m32673a();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89525h = true;
            EnumC23501d.m33000a(this.f89520c);
            EnumC23501d.m33000a(this.f89521d);
            if (getAndIncrement() == 0) {
                this.f89523f = null;
                this.f89524g = null;
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(this.f89520c.get());
        }

        /* renamed from: g */
        public void m32669g(T t) {
            if (compareAndSet(0, 1)) {
                this.f89519b.onNext(t);
                this.f89527j = 2;
            } else {
                this.f89524g = t;
                this.f89527j = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m32672b();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f89526i = true;
            m32673a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f89522e.m32276a(th)) {
                EnumC23501d.m33000a(this.f89521d);
                m32673a();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (compareAndSet(0, 1)) {
                this.f89519b.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                m32671c().offer(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m32672b();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this.f89520c, interfaceC23465c);
        }
    }

    public C23978C0(Observable<T> observable, InterfaceC23447K<? extends T> interfaceC23447K) {
        super(observable);
        this.f89518c = interfaceC23447K;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        C23979a c23979a = new C23979a(interfaceC23436D);
        interfaceC23436D.onSubscribe(c23979a);
        this.f90078b.subscribe(c23979a);
        this.f89518c.mo33096a(c23979a.f89521d);
    }
}
