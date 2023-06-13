package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.C23464b;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.observers.AbstractC23575t;
import io.reactivex.internal.queue.C24406a;
import io.reactivex.internal.util.EnumC24479n;
import io.reactivex.observers.AbstractC24500d;
import io.reactivex.observers.C24504h;
import io.reactivex.plugins.C24508a;
import io.reactivex.subjects.C24570i;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.J1 */
/* loaded from: classes6.dex */
public final class C24032J1<T, B, V> extends AbstractC24145a<T, Observable<T>> {

    /* renamed from: c */
    public final InterfaceC23434B<B> f89695c;

    /* renamed from: d */
    public final InterfaceC23492o<? super B, ? extends InterfaceC23434B<V>> f89696d;

    /* renamed from: e */
    public final int f89697e;

    /* renamed from: io.reactivex.internal.operators.observable.J1$a */
    /* loaded from: classes6.dex */
    public static final class C24033a<T, V> extends AbstractC24500d<V> {

        /* renamed from: c */
        public final C24035c<T, ?, V> f89698c;

        /* renamed from: d */
        public final C24570i<T> f89699d;

        /* renamed from: e */
        public boolean f89700e;

        public C24033a(C24035c<T, ?, V> c24035c, C24570i<T> c24570i) {
            this.f89698c = c24035c;
            this.f89699d = c24570i;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f89700e) {
                return;
            }
            this.f89700e = true;
            this.f89698c.m32647k(this);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f89700e) {
                C24508a.m31988u(th);
                return;
            }
            this.f89700e = true;
            this.f89698c.m32644n(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(V v) {
            dispose();
            onComplete();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.J1$b */
    /* loaded from: classes6.dex */
    public static final class C24034b<T, B> extends AbstractC24500d<B> {

        /* renamed from: c */
        public final C24035c<T, B, ?> f89701c;

        public C24034b(C24035c<T, B, ?> c24035c) {
            this.f89701c = c24035c;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f89701c.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f89701c.m32644n(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(B b) {
            this.f89701c.m32643o(b);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.J1$c */
    /* loaded from: classes6.dex */
    public static final class C24035c<T, B, V> extends AbstractC23575t<T, Object, Observable<T>> implements InterfaceC23465c {

        /* renamed from: h */
        public final InterfaceC23434B<B> f89702h;

        /* renamed from: i */
        public final InterfaceC23492o<? super B, ? extends InterfaceC23434B<V>> f89703i;

        /* renamed from: j */
        public final int f89704j;

        /* renamed from: k */
        public final C23464b f89705k;

        /* renamed from: l */
        public InterfaceC23465c f89706l;

        /* renamed from: m */
        public final AtomicReference<InterfaceC23465c> f89707m;

        /* renamed from: n */
        public final List<C24570i<T>> f89708n;

        /* renamed from: o */
        public final AtomicLong f89709o;

        /* renamed from: p */
        public final AtomicBoolean f89710p;

        public C24035c(InterfaceC23436D<? super Observable<T>> interfaceC23436D, InterfaceC23434B<B> interfaceC23434B, InterfaceC23492o<? super B, ? extends InterfaceC23434B<V>> interfaceC23492o, int i) {
            super(interfaceC23436D, new C24406a());
            this.f89707m = new AtomicReference<>();
            AtomicLong atomicLong = new AtomicLong();
            this.f89709o = atomicLong;
            this.f89710p = new AtomicBoolean();
            this.f89702h = interfaceC23434B;
            this.f89703i = interfaceC23492o;
            this.f89704j = i;
            this.f89705k = new C23464b();
            this.f89708n = new ArrayList();
            atomicLong.lazySet(1L);
        }

        @Override // io.reactivex.internal.observers.AbstractC23575t, io.reactivex.internal.util.InterfaceC24483o
        /* renamed from: d */
        public void mo32232d(InterfaceC23436D<? super Observable<T>> interfaceC23436D, Object obj) {
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (this.f89710p.compareAndSet(false, true)) {
                EnumC23501d.m33000a(this.f89707m);
                if (this.f89709o.decrementAndGet() == 0) {
                    this.f89706l.dispose();
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89710p.get();
        }

        /* renamed from: k */
        public void m32647k(C24033a<T, V> c24033a) {
            this.f89705k.mo32984b(c24033a);
            this.f88331d.offer(new C24036d(c24033a.f89699d, null));
            if (m32905a()) {
                m32645m();
            }
        }

        /* renamed from: l */
        public void m32646l() {
            this.f89705k.dispose();
            EnumC23501d.m33000a(this.f89707m);
        }

        /* renamed from: m */
        public void m32645m() {
            boolean z;
            C24406a c24406a = (C24406a) this.f88331d;
            InterfaceC23436D<? super V> interfaceC23436D = this.f88330c;
            List<C24570i<T>> list = this.f89708n;
            int i = 1;
            while (true) {
                boolean z2 = this.f88333f;
                Object poll = c24406a.poll();
                if (poll == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2 && z) {
                    m32646l();
                    Throwable th = this.f88334g;
                    if (th != null) {
                        for (C24570i<T> c24570i : list) {
                            c24570i.onError(th);
                        }
                    } else {
                        for (C24570i<T> c24570i2 : list) {
                            c24570i2.onComplete();
                        }
                    }
                    list.clear();
                    return;
                } else if (z) {
                    i = mo32234b(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (poll instanceof C24036d) {
                    C24036d c24036d = (C24036d) poll;
                    C24570i<T> c24570i3 = c24036d.f89711a;
                    if (c24570i3 != null) {
                        if (list.remove(c24570i3)) {
                            c24036d.f89711a.onComplete();
                            if (this.f89709o.decrementAndGet() == 0) {
                                m32646l();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.f89710p.get()) {
                        C24570i<T> m31876e = C24570i.m31876e(this.f89704j);
                        list.add(m31876e);
                        interfaceC23436D.onNext(m31876e);
                        try {
                            InterfaceC23434B interfaceC23434B = (InterfaceC23434B) C23544b.m32923e(this.f89703i.apply((B) c24036d.f89712b), "The ObservableSource supplied is null");
                            C24033a c24033a = new C24033a(this, m31876e);
                            if (this.f89705k.mo32983c(c24033a)) {
                                this.f89709o.getAndIncrement();
                                interfaceC23434B.subscribe(c24033a);
                            }
                        } catch (Throwable th2) {
                            C23475a.m33009b(th2);
                            this.f89710p.set(true);
                            interfaceC23436D.onError(th2);
                        }
                    }
                } else {
                    for (C24570i<T> c24570i4 : list) {
                        c24570i4.onNext((T) EnumC24479n.m32239i(poll));
                    }
                }
            }
        }

        /* renamed from: n */
        public void m32644n(Throwable th) {
            this.f89706l.dispose();
            this.f89705k.dispose();
            onError(th);
        }

        /* renamed from: o */
        public void m32643o(B b) {
            this.f88331d.offer(new C24036d(null, b));
            if (m32905a()) {
                m32645m();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f88333f) {
                return;
            }
            this.f88333f = true;
            if (m32905a()) {
                m32645m();
            }
            if (this.f89709o.decrementAndGet() == 0) {
                this.f89705k.dispose();
            }
            this.f88330c.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f88333f) {
                C24508a.m31988u(th);
                return;
            }
            this.f88334g = th;
            this.f88333f = true;
            if (m32905a()) {
                m32645m();
            }
            if (this.f89709o.decrementAndGet() == 0) {
                this.f89705k.dispose();
            }
            this.f88330c.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (m32904g()) {
                for (C24570i<T> c24570i : this.f89708n) {
                    c24570i.onNext(t);
                }
                if (mo32234b(-1) == 0) {
                    return;
                }
            } else {
                this.f88331d.offer(EnumC24479n.m32236l(t));
                if (!m32905a()) {
                    return;
                }
            }
            m32645m();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89706l, interfaceC23465c)) {
                this.f89706l = interfaceC23465c;
                this.f88330c.onSubscribe(this);
                if (this.f89710p.get()) {
                    return;
                }
                C24034b c24034b = new C24034b(this);
                if (C42482i24.m35337a(this.f89707m, null, c24034b)) {
                    this.f89702h.subscribe(c24034b);
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.J1$d */
    /* loaded from: classes6.dex */
    public static final class C24036d<T, B> {

        /* renamed from: a */
        public final C24570i<T> f89711a;

        /* renamed from: b */
        public final B f89712b;

        public C24036d(C24570i<T> c24570i, B b) {
            this.f89711a = c24570i;
            this.f89712b = b;
        }
    }

    public C24032J1(InterfaceC23434B<T> interfaceC23434B, InterfaceC23434B<B> interfaceC23434B2, InterfaceC23492o<? super B, ? extends InterfaceC23434B<V>> interfaceC23492o, int i) {
        super(interfaceC23434B);
        this.f89695c = interfaceC23434B2;
        this.f89696d = interfaceC23492o;
        this.f89697e = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super Observable<T>> interfaceC23436D) {
        this.f90078b.subscribe(new C24035c(new C24504h(interfaceC23436D), this.f89695c, this.f89696d, this.f89697e));
    }
}
