package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.disposables.C23464b;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.queue.C24409c;
import io.reactivex.internal.util.C24467c;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.a0 */
/* loaded from: classes6.dex */
public final class C24146a0<T, R> extends AbstractC24145a<T, R> {

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> f90079c;

    /* renamed from: d */
    public final boolean f90080d;

    /* renamed from: io.reactivex.internal.operators.observable.a0$a */
    /* loaded from: classes6.dex */
    public static final class C24147a<T, R> extends AtomicInteger implements InterfaceC23436D<T>, InterfaceC23465c {
        private static final long serialVersionUID = 8600231336733376951L;

        /* renamed from: b */
        public final InterfaceC23436D<? super R> f90081b;

        /* renamed from: c */
        public final boolean f90082c;

        /* renamed from: g */
        public final InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> f90086g;

        /* renamed from: i */
        public InterfaceC23465c f90088i;

        /* renamed from: j */
        public volatile boolean f90089j;

        /* renamed from: d */
        public final C23464b f90083d = new C23464b();

        /* renamed from: f */
        public final C24467c f90085f = new C24467c();

        /* renamed from: e */
        public final AtomicInteger f90084e = new AtomicInteger(1);

        /* renamed from: h */
        public final AtomicReference<C24409c<R>> f90087h = new AtomicReference<>();

        /* renamed from: io.reactivex.internal.operators.observable.a0$a$a */
        /* loaded from: classes6.dex */
        public final class C24148a extends AtomicReference<InterfaceC23465c> implements InterfaceC24541s<R>, InterfaceC23465c {
            private static final long serialVersionUID = -502562646270949838L;

            public C24148a() {
            }

            @Override // io.reactivex.disposables.InterfaceC23465c
            public void dispose() {
                EnumC23501d.m33000a(this);
            }

            @Override // io.reactivex.disposables.InterfaceC23465c
            /* renamed from: e */
            public boolean mo1769e() {
                return EnumC23501d.m32999b(get());
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onComplete() {
                C24147a.this.m32538g(this);
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onError(Throwable th) {
                C24147a.this.m32537h(this, th);
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32995h(this, interfaceC23465c);
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onSuccess(R r) {
                C24147a.this.m32536i(this, r);
            }
        }

        public C24147a(InterfaceC23436D<? super R> interfaceC23436D, InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o, boolean z) {
            this.f90081b = interfaceC23436D;
            this.f90086g = interfaceC23492o;
            this.f90082c = z;
        }

        /* renamed from: a */
        public void m32542a() {
            C24409c<R> c24409c = this.f90087h.get();
            if (c24409c != null) {
                c24409c.clear();
            }
        }

        /* renamed from: b */
        public void m32541b() {
            if (getAndIncrement() == 0) {
                m32540c();
            }
        }

        /* renamed from: c */
        public void m32540c() {
            boolean z;
            R r;
            InterfaceC23436D<? super R> interfaceC23436D = this.f90081b;
            AtomicInteger atomicInteger = this.f90084e;
            AtomicReference<C24409c<R>> atomicReference = this.f90087h;
            int i = 1;
            while (!this.f90089j) {
                if (!this.f90082c && this.f90085f.get() != null) {
                    Throwable m32275b = this.f90085f.m32275b();
                    m32542a();
                    interfaceC23436D.onError(m32275b);
                    return;
                }
                boolean z2 = false;
                if (atomicInteger.get() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                C24409c<R> c24409c = atomicReference.get();
                if (c24409c != null) {
                    r = c24409c.poll();
                } else {
                    r = (Object) null;
                }
                if (r == null) {
                    z2 = true;
                }
                if (z && z2) {
                    Throwable m32275b2 = this.f90085f.m32275b();
                    if (m32275b2 != null) {
                        interfaceC23436D.onError(m32275b2);
                        return;
                    } else {
                        interfaceC23436D.onComplete();
                        return;
                    }
                } else if (z2) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    interfaceC23436D.onNext(r);
                }
            }
            m32542a();
        }

        /* renamed from: d */
        public C24409c<R> m32539d() {
            C24409c<R> c24409c;
            do {
                C24409c<R> c24409c2 = this.f90087h.get();
                if (c24409c2 != null) {
                    return c24409c2;
                }
                c24409c = new C24409c<>(Observable.bufferSize());
            } while (!C42482i24.m35337a(this.f90087h, null, c24409c));
            return c24409c;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90089j = true;
            this.f90088i.dispose();
            this.f90083d.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90089j;
        }

        /* renamed from: g */
        public void m32538g(C24147a<T, R>.C24148a c24148a) {
            this.f90083d.mo32984b(c24148a);
            if (get() == 0) {
                boolean z = false;
                if (compareAndSet(0, 1)) {
                    if (this.f90084e.decrementAndGet() == 0) {
                        z = true;
                    }
                    C24409c<R> c24409c = this.f90087h.get();
                    if (z && (c24409c == null || c24409c.isEmpty())) {
                        Throwable m32275b = this.f90085f.m32275b();
                        if (m32275b != null) {
                            this.f90081b.onError(m32275b);
                            return;
                        } else {
                            this.f90081b.onComplete();
                            return;
                        }
                    } else if (decrementAndGet() == 0) {
                        return;
                    } else {
                        m32540c();
                        return;
                    }
                }
            }
            this.f90084e.decrementAndGet();
            m32541b();
        }

        /* renamed from: h */
        public void m32537h(C24147a<T, R>.C24148a c24148a, Throwable th) {
            this.f90083d.mo32984b(c24148a);
            if (this.f90085f.m32276a(th)) {
                if (!this.f90082c) {
                    this.f90088i.dispose();
                    this.f90083d.dispose();
                }
                this.f90084e.decrementAndGet();
                m32541b();
                return;
            }
            C24508a.m31988u(th);
        }

        /* renamed from: i */
        public void m32536i(C24147a<T, R>.C24148a c24148a, R r) {
            this.f90083d.mo32984b(c24148a);
            if (get() == 0) {
                boolean z = false;
                if (compareAndSet(0, 1)) {
                    this.f90081b.onNext(r);
                    if (this.f90084e.decrementAndGet() == 0) {
                        z = true;
                    }
                    C24409c<R> c24409c = this.f90087h.get();
                    if (z && (c24409c == null || c24409c.isEmpty())) {
                        Throwable m32275b = this.f90085f.m32275b();
                        if (m32275b != null) {
                            this.f90081b.onError(m32275b);
                            return;
                        } else {
                            this.f90081b.onComplete();
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    m32540c();
                }
            }
            C24409c<R> m32539d = m32539d();
            synchronized (m32539d) {
                m32539d.offer(r);
            }
            this.f90084e.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            m32540c();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90084e.decrementAndGet();
            m32541b();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90084e.decrementAndGet();
            if (this.f90085f.m32276a(th)) {
                if (!this.f90082c) {
                    this.f90083d.dispose();
                }
                m32541b();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            try {
                InterfaceC24574u interfaceC24574u = (InterfaceC24574u) C23544b.m32923e(this.f90086g.apply(t), "The mapper returned a null MaybeSource");
                this.f90084e.getAndIncrement();
                C24148a c24148a = new C24148a();
                if (!this.f90089j && this.f90083d.mo32983c(c24148a)) {
                    interfaceC24574u.mo31865a(c24148a);
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f90088i.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90088i, interfaceC23465c)) {
                this.f90088i = interfaceC23465c;
                this.f90081b.onSubscribe(this);
            }
        }
    }

    public C24146a0(InterfaceC23434B<T> interfaceC23434B, InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o, boolean z) {
        super(interfaceC23434B);
        this.f90079c = interfaceC23492o;
        this.f90080d = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super R> interfaceC23436D) {
        this.f90078b.subscribe(new C24147a(interfaceC23436D, this.f90079c, this.f90080d));
    }
}
