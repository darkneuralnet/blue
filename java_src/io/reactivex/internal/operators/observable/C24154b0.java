package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
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
/* renamed from: io.reactivex.internal.operators.observable.b0 */
/* loaded from: classes6.dex */
public final class C24154b0<T, R> extends AbstractC24145a<T, R> {

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> f90102c;

    /* renamed from: d */
    public final boolean f90103d;

    /* renamed from: io.reactivex.internal.operators.observable.b0$a */
    /* loaded from: classes6.dex */
    public static final class C24155a<T, R> extends AtomicInteger implements InterfaceC23436D<T>, InterfaceC23465c {
        private static final long serialVersionUID = 8600231336733376951L;

        /* renamed from: b */
        public final InterfaceC23436D<? super R> f90104b;

        /* renamed from: c */
        public final boolean f90105c;

        /* renamed from: g */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> f90109g;

        /* renamed from: i */
        public InterfaceC23465c f90111i;

        /* renamed from: j */
        public volatile boolean f90112j;

        /* renamed from: d */
        public final C23464b f90106d = new C23464b();

        /* renamed from: f */
        public final C24467c f90108f = new C24467c();

        /* renamed from: e */
        public final AtomicInteger f90107e = new AtomicInteger(1);

        /* renamed from: h */
        public final AtomicReference<C24409c<R>> f90110h = new AtomicReference<>();

        /* renamed from: io.reactivex.internal.operators.observable.b0$a$a */
        /* loaded from: classes6.dex */
        public final class C24156a extends AtomicReference<InterfaceC23465c> implements InterfaceC23445I<R>, InterfaceC23465c {
            private static final long serialVersionUID = -502562646270949838L;

            public C24156a() {
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

            @Override // io.reactivex.InterfaceC23445I
            public void onError(Throwable th) {
                C24155a.this.m32528g(this, th);
            }

            @Override // io.reactivex.InterfaceC23445I
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32995h(this, interfaceC23465c);
            }

            @Override // io.reactivex.InterfaceC23445I
            public void onSuccess(R r) {
                C24155a.this.m32527h(this, r);
            }
        }

        public C24155a(InterfaceC23436D<? super R> interfaceC23436D, InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> interfaceC23492o, boolean z) {
            this.f90104b = interfaceC23436D;
            this.f90109g = interfaceC23492o;
            this.f90105c = z;
        }

        /* renamed from: a */
        public void m32532a() {
            C24409c<R> c24409c = this.f90110h.get();
            if (c24409c != null) {
                c24409c.clear();
            }
        }

        /* renamed from: b */
        public void m32531b() {
            if (getAndIncrement() == 0) {
                m32530c();
            }
        }

        /* renamed from: c */
        public void m32530c() {
            boolean z;
            R r;
            InterfaceC23436D<? super R> interfaceC23436D = this.f90104b;
            AtomicInteger atomicInteger = this.f90107e;
            AtomicReference<C24409c<R>> atomicReference = this.f90110h;
            int i = 1;
            while (!this.f90112j) {
                if (!this.f90105c && this.f90108f.get() != null) {
                    Throwable m32275b = this.f90108f.m32275b();
                    m32532a();
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
                    Throwable m32275b2 = this.f90108f.m32275b();
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
            m32532a();
        }

        /* renamed from: d */
        public C24409c<R> m32529d() {
            C24409c<R> c24409c;
            do {
                C24409c<R> c24409c2 = this.f90110h.get();
                if (c24409c2 != null) {
                    return c24409c2;
                }
                c24409c = new C24409c<>(Observable.bufferSize());
            } while (!C42482i24.m35337a(this.f90110h, null, c24409c));
            return c24409c;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90112j = true;
            this.f90111i.dispose();
            this.f90106d.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90112j;
        }

        /* renamed from: g */
        public void m32528g(C24155a<T, R>.C24156a c24156a, Throwable th) {
            this.f90106d.mo32984b(c24156a);
            if (this.f90108f.m32276a(th)) {
                if (!this.f90105c) {
                    this.f90111i.dispose();
                    this.f90106d.dispose();
                }
                this.f90107e.decrementAndGet();
                m32531b();
                return;
            }
            C24508a.m31988u(th);
        }

        /* renamed from: h */
        public void m32527h(C24155a<T, R>.C24156a c24156a, R r) {
            this.f90106d.mo32984b(c24156a);
            if (get() == 0) {
                boolean z = false;
                if (compareAndSet(0, 1)) {
                    this.f90104b.onNext(r);
                    if (this.f90107e.decrementAndGet() == 0) {
                        z = true;
                    }
                    C24409c<R> c24409c = this.f90110h.get();
                    if (z && (c24409c == null || c24409c.isEmpty())) {
                        Throwable m32275b = this.f90108f.m32275b();
                        if (m32275b != null) {
                            this.f90104b.onError(m32275b);
                            return;
                        } else {
                            this.f90104b.onComplete();
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    m32530c();
                }
            }
            C24409c<R> m32529d = m32529d();
            synchronized (m32529d) {
                m32529d.offer(r);
            }
            this.f90107e.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            m32530c();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90107e.decrementAndGet();
            m32531b();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90107e.decrementAndGet();
            if (this.f90108f.m32276a(th)) {
                if (!this.f90105c) {
                    this.f90106d.dispose();
                }
                m32531b();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            try {
                InterfaceC23447K interfaceC23447K = (InterfaceC23447K) C23544b.m32923e(this.f90109g.apply(t), "The mapper returned a null SingleSource");
                this.f90107e.getAndIncrement();
                C24156a c24156a = new C24156a();
                if (!this.f90112j && this.f90106d.mo32983c(c24156a)) {
                    interfaceC23447K.mo33096a(c24156a);
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f90111i.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90111i, interfaceC23465c)) {
                this.f90111i = interfaceC23465c;
                this.f90104b.onSubscribe(this);
            }
        }
    }

    public C24154b0(InterfaceC23434B<T> interfaceC23434B, InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> interfaceC23492o, boolean z) {
        super(interfaceC23434B);
        this.f90102c = interfaceC23492o;
        this.f90103d = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super R> interfaceC23436D) {
        this.f90078b.subscribe(new C24155a(interfaceC23436D, this.f90102c, this.f90103d));
    }
}
