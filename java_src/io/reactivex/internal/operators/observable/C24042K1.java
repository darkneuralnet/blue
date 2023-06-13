package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.queue.C24406a;
import io.reactivex.internal.util.C24467c;
import io.reactivex.observers.AbstractC24500d;
import io.reactivex.plugins.C24508a;
import io.reactivex.subjects.C24570i;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.K1 */
/* loaded from: classes6.dex */
public final class C24042K1<T, B> extends AbstractC24145a<T, Observable<T>> {

    /* renamed from: c */
    public final Callable<? extends InterfaceC23434B<B>> f89722c;

    /* renamed from: d */
    public final int f89723d;

    /* renamed from: io.reactivex.internal.operators.observable.K1$a */
    /* loaded from: classes6.dex */
    public static final class C24043a<T, B> extends AbstractC24500d<B> {

        /* renamed from: c */
        public final RunnableC24044b<T, B> f89724c;

        /* renamed from: d */
        public boolean f89725d;

        public C24043a(RunnableC24044b<T, B> runnableC24044b) {
            this.f89724c = runnableC24044b;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f89725d) {
                return;
            }
            this.f89725d = true;
            this.f89724c.m32640c();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f89725d) {
                C24508a.m31988u(th);
                return;
            }
            this.f89725d = true;
            this.f89724c.m32639d(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(B b) {
            if (this.f89725d) {
                return;
            }
            this.f89725d = true;
            dispose();
            this.f89724c.m32638g(this);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.K1$b */
    /* loaded from: classes6.dex */
    public static final class RunnableC24044b<T, B> extends AtomicInteger implements InterfaceC23436D<T>, InterfaceC23465c, Runnable {

        /* renamed from: m */
        public static final C24043a<Object, Object> f89726m = new C24043a<>(null);

        /* renamed from: n */
        public static final Object f89727n = new Object();
        private static final long serialVersionUID = 2233020065421370272L;

        /* renamed from: b */
        public final InterfaceC23436D<? super Observable<T>> f89728b;

        /* renamed from: c */
        public final int f89729c;

        /* renamed from: d */
        public final AtomicReference<C24043a<T, B>> f89730d = new AtomicReference<>();

        /* renamed from: e */
        public final AtomicInteger f89731e = new AtomicInteger(1);

        /* renamed from: f */
        public final C24406a<Object> f89732f = new C24406a<>();

        /* renamed from: g */
        public final C24467c f89733g = new C24467c();

        /* renamed from: h */
        public final AtomicBoolean f89734h = new AtomicBoolean();

        /* renamed from: i */
        public final Callable<? extends InterfaceC23434B<B>> f89735i;

        /* renamed from: j */
        public InterfaceC23465c f89736j;

        /* renamed from: k */
        public volatile boolean f89737k;

        /* renamed from: l */
        public C24570i<T> f89738l;

        public RunnableC24044b(InterfaceC23436D<? super Observable<T>> interfaceC23436D, int i, Callable<? extends InterfaceC23434B<B>> callable) {
            this.f89728b = interfaceC23436D;
            this.f89729c = i;
            this.f89735i = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public void m32642a() {
            C24043a<Object, Object> c24043a = f89726m;
            InterfaceC23465c interfaceC23465c = (InterfaceC23465c) this.f89730d.getAndSet(c24043a);
            if (interfaceC23465c != null && interfaceC23465c != c24043a) {
                interfaceC23465c.dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public void m32641b() {
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC23436D<? super Observable<T>> interfaceC23436D = this.f89728b;
            C24406a<Object> c24406a = this.f89732f;
            C24467c c24467c = this.f89733g;
            int i = 1;
            while (this.f89731e.get() != 0) {
                C24570i<T> c24570i = this.f89738l;
                boolean z2 = this.f89737k;
                if (z2 && c24467c.get() != null) {
                    c24406a.clear();
                    Throwable m32275b = c24467c.m32275b();
                    if (c24570i != 0) {
                        this.f89738l = null;
                        c24570i.onError(m32275b);
                    }
                    interfaceC23436D.onError(m32275b);
                    return;
                }
                Object poll = c24406a.poll();
                if (poll == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2 && z) {
                    Throwable m32275b2 = c24467c.m32275b();
                    if (m32275b2 == null) {
                        if (c24570i != 0) {
                            this.f89738l = null;
                            c24570i.onComplete();
                        }
                        interfaceC23436D.onComplete();
                        return;
                    }
                    if (c24570i != 0) {
                        this.f89738l = null;
                        c24570i.onError(m32275b2);
                    }
                    interfaceC23436D.onError(m32275b2);
                    return;
                } else if (z) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (poll != f89727n) {
                    c24570i.onNext(poll);
                } else {
                    if (c24570i != 0) {
                        this.f89738l = null;
                        c24570i.onComplete();
                    }
                    if (!this.f89734h.get()) {
                        C24570i<T> m31875g = C24570i.m31875g(this.f89729c, this);
                        this.f89738l = m31875g;
                        this.f89731e.getAndIncrement();
                        try {
                            InterfaceC23434B interfaceC23434B = (InterfaceC23434B) C23544b.m32923e(this.f89735i.call(), "The other Callable returned a null ObservableSource");
                            C24043a c24043a = new C24043a(this);
                            if (C42482i24.m35337a(this.f89730d, null, c24043a)) {
                                interfaceC23434B.subscribe(c24043a);
                                interfaceC23436D.onNext(m31875g);
                            }
                        } catch (Throwable th) {
                            C23475a.m33009b(th);
                            c24467c.m32276a(th);
                            this.f89737k = true;
                        }
                    }
                }
            }
            c24406a.clear();
            this.f89738l = null;
        }

        /* renamed from: c */
        public void m32640c() {
            this.f89736j.dispose();
            this.f89737k = true;
            m32641b();
        }

        /* renamed from: d */
        public void m32639d(Throwable th) {
            this.f89736j.dispose();
            if (this.f89733g.m32276a(th)) {
                this.f89737k = true;
                m32641b();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (this.f89734h.compareAndSet(false, true)) {
                m32642a();
                if (this.f89731e.decrementAndGet() == 0) {
                    this.f89736j.dispose();
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89734h.get();
        }

        /* renamed from: g */
        public void m32638g(C24043a<T, B> c24043a) {
            C42482i24.m35337a(this.f89730d, c24043a, null);
            this.f89732f.offer(f89727n);
            m32641b();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            m32642a();
            this.f89737k = true;
            m32641b();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            m32642a();
            if (this.f89733g.m32276a(th)) {
                this.f89737k = true;
                m32641b();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f89732f.offer(t);
            m32641b();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89736j, interfaceC23465c)) {
                this.f89736j = interfaceC23465c;
                this.f89728b.onSubscribe(this);
                this.f89732f.offer(f89727n);
                m32641b();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f89731e.decrementAndGet() == 0) {
                this.f89736j.dispose();
            }
        }
    }

    public C24042K1(InterfaceC23434B<T> interfaceC23434B, Callable<? extends InterfaceC23434B<B>> callable, int i) {
        super(interfaceC23434B);
        this.f89722c = callable;
        this.f89723d = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super Observable<T>> interfaceC23436D) {
        this.f90078b.subscribe(new RunnableC24044b(interfaceC23436D, this.f89723d, this.f89722c));
    }
}
