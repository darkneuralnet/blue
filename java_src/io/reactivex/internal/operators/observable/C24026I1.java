package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.queue.C24406a;
import io.reactivex.internal.util.C24467c;
import io.reactivex.observers.AbstractC24500d;
import io.reactivex.plugins.C24508a;
import io.reactivex.subjects.C24570i;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.I1 */
/* loaded from: classes6.dex */
public final class C24026I1<T, B> extends AbstractC24145a<T, Observable<T>> {

    /* renamed from: c */
    public final InterfaceC23434B<B> f89678c;

    /* renamed from: d */
    public final int f89679d;

    /* renamed from: io.reactivex.internal.operators.observable.I1$a */
    /* loaded from: classes6.dex */
    public static final class C24027a<T, B> extends AbstractC24500d<B> {

        /* renamed from: c */
        public final RunnableC24028b<T, B> f89680c;

        /* renamed from: d */
        public boolean f89681d;

        public C24027a(RunnableC24028b<T, B> runnableC24028b) {
            this.f89680c = runnableC24028b;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f89681d) {
                return;
            }
            this.f89681d = true;
            this.f89680c.m32651b();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f89681d) {
                C24508a.m31988u(th);
                return;
            }
            this.f89681d = true;
            this.f89680c.m32650c(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(B b) {
            if (this.f89681d) {
                return;
            }
            this.f89680c.m32649d();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.I1$b */
    /* loaded from: classes6.dex */
    public static final class RunnableC24028b<T, B> extends AtomicInteger implements InterfaceC23436D<T>, InterfaceC23465c, Runnable {

        /* renamed from: l */
        public static final Object f89682l = new Object();
        private static final long serialVersionUID = 2233020065421370272L;

        /* renamed from: b */
        public final InterfaceC23436D<? super Observable<T>> f89683b;

        /* renamed from: c */
        public final int f89684c;

        /* renamed from: d */
        public final C24027a<T, B> f89685d = new C24027a<>(this);

        /* renamed from: e */
        public final AtomicReference<InterfaceC23465c> f89686e = new AtomicReference<>();

        /* renamed from: f */
        public final AtomicInteger f89687f = new AtomicInteger(1);

        /* renamed from: g */
        public final C24406a<Object> f89688g = new C24406a<>();

        /* renamed from: h */
        public final C24467c f89689h = new C24467c();

        /* renamed from: i */
        public final AtomicBoolean f89690i = new AtomicBoolean();

        /* renamed from: j */
        public volatile boolean f89691j;

        /* renamed from: k */
        public C24570i<T> f89692k;

        public RunnableC24028b(InterfaceC23436D<? super Observable<T>> interfaceC23436D, int i) {
            this.f89683b = interfaceC23436D;
            this.f89684c = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public void m32652a() {
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC23436D<? super Observable<T>> interfaceC23436D = this.f89683b;
            C24406a<Object> c24406a = this.f89688g;
            C24467c c24467c = this.f89689h;
            int i = 1;
            while (this.f89687f.get() != 0) {
                C24570i<T> c24570i = this.f89692k;
                boolean z2 = this.f89691j;
                if (z2 && c24467c.get() != null) {
                    c24406a.clear();
                    Throwable m32275b = c24467c.m32275b();
                    if (c24570i != 0) {
                        this.f89692k = null;
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
                            this.f89692k = null;
                            c24570i.onComplete();
                        }
                        interfaceC23436D.onComplete();
                        return;
                    }
                    if (c24570i != 0) {
                        this.f89692k = null;
                        c24570i.onError(m32275b2);
                    }
                    interfaceC23436D.onError(m32275b2);
                    return;
                } else if (z) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (poll != f89682l) {
                    c24570i.onNext(poll);
                } else {
                    if (c24570i != 0) {
                        this.f89692k = null;
                        c24570i.onComplete();
                    }
                    if (!this.f89690i.get()) {
                        C24570i<T> m31875g = C24570i.m31875g(this.f89684c, this);
                        this.f89692k = m31875g;
                        this.f89687f.getAndIncrement();
                        interfaceC23436D.onNext(m31875g);
                    }
                }
            }
            c24406a.clear();
            this.f89692k = null;
        }

        /* renamed from: b */
        public void m32651b() {
            EnumC23501d.m33000a(this.f89686e);
            this.f89691j = true;
            m32652a();
        }

        /* renamed from: c */
        public void m32650c(Throwable th) {
            EnumC23501d.m33000a(this.f89686e);
            if (this.f89689h.m32276a(th)) {
                this.f89691j = true;
                m32652a();
                return;
            }
            C24508a.m31988u(th);
        }

        /* renamed from: d */
        public void m32649d() {
            this.f89688g.offer(f89682l);
            m32652a();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (this.f89690i.compareAndSet(false, true)) {
                this.f89685d.dispose();
                if (this.f89687f.decrementAndGet() == 0) {
                    EnumC23501d.m33000a(this.f89686e);
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89690i.get();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f89685d.dispose();
            this.f89691j = true;
            m32652a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f89685d.dispose();
            if (this.f89689h.m32276a(th)) {
                this.f89691j = true;
                m32652a();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f89688g.offer(t);
            m32652a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32995h(this.f89686e, interfaceC23465c)) {
                m32649d();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f89687f.decrementAndGet() == 0) {
                EnumC23501d.m33000a(this.f89686e);
            }
        }
    }

    public C24026I1(InterfaceC23434B<T> interfaceC23434B, InterfaceC23434B<B> interfaceC23434B2, int i) {
        super(interfaceC23434B);
        this.f89678c = interfaceC23434B2;
        this.f89679d = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super Observable<T>> interfaceC23436D) {
        RunnableC24028b runnableC24028b = new RunnableC24028b(interfaceC23436D, this.f89679d);
        interfaceC23436D.onSubscribe(runnableC24028b);
        this.f89678c.subscribe(runnableC24028b.f89685d);
        this.f90078b.subscribe(runnableC24028b);
    }
}
