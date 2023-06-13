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
import io.reactivex.internal.queue.C24409c;
import io.reactivex.internal.util.C24467c;
import io.reactivex.plugins.C24508a;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.n */
/* loaded from: classes6.dex */
public final class C24231n<T, U extends Collection<? super T>, Open, Close> extends AbstractC24145a<T, U> {

    /* renamed from: c */
    public final Callable<U> f90370c;

    /* renamed from: d */
    public final InterfaceC23434B<? extends Open> f90371d;

    /* renamed from: e */
    public final InterfaceC23492o<? super Open, ? extends InterfaceC23434B<? extends Close>> f90372e;

    /* renamed from: io.reactivex.internal.operators.observable.n$a */
    /* loaded from: classes6.dex */
    public static final class C24232a<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements InterfaceC23436D<T>, InterfaceC23465c {
        private static final long serialVersionUID = -8466418554264089604L;

        /* renamed from: b */
        public final InterfaceC23436D<? super C> f90373b;

        /* renamed from: c */
        public final Callable<C> f90374c;

        /* renamed from: d */
        public final InterfaceC23434B<? extends Open> f90375d;

        /* renamed from: e */
        public final InterfaceC23492o<? super Open, ? extends InterfaceC23434B<? extends Close>> f90376e;

        /* renamed from: i */
        public volatile boolean f90380i;

        /* renamed from: k */
        public volatile boolean f90382k;

        /* renamed from: l */
        public long f90383l;

        /* renamed from: j */
        public final C24409c<C> f90381j = new C24409c<>(Observable.bufferSize());

        /* renamed from: f */
        public final C23464b f90377f = new C23464b();

        /* renamed from: g */
        public final AtomicReference<InterfaceC23465c> f90378g = new AtomicReference<>();

        /* renamed from: m */
        public Map<Long, C> f90384m = new LinkedHashMap();

        /* renamed from: h */
        public final C24467c f90379h = new C24467c();

        /* renamed from: io.reactivex.internal.operators.observable.n$a$a */
        /* loaded from: classes6.dex */
        public static final class C24233a<Open> extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<Open>, InterfaceC23465c {
            private static final long serialVersionUID = -8498650778633225126L;

            /* renamed from: b */
            public final C24232a<?, ?, Open, ?> f90385b;

            public C24233a(C24232a<?, ?, Open, ?> c24232a) {
                this.f90385b = c24232a;
            }

            @Override // io.reactivex.disposables.InterfaceC23465c
            public void dispose() {
                EnumC23501d.m33000a(this);
            }

            @Override // io.reactivex.disposables.InterfaceC23465c
            /* renamed from: e */
            public boolean mo1769e() {
                return get() == EnumC23501d.DISPOSED;
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onComplete() {
                lazySet(EnumC23501d.DISPOSED);
                this.f90385b.m32485g(this);
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onError(Throwable th) {
                lazySet(EnumC23501d.DISPOSED);
                this.f90385b.m32489a(this, th);
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onNext(Open open) {
                this.f90385b.m32486d(open);
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32995h(this, interfaceC23465c);
            }
        }

        public C24232a(InterfaceC23436D<? super C> interfaceC23436D, InterfaceC23434B<? extends Open> interfaceC23434B, InterfaceC23492o<? super Open, ? extends InterfaceC23434B<? extends Close>> interfaceC23492o, Callable<C> callable) {
            this.f90373b = interfaceC23436D;
            this.f90374c = callable;
            this.f90375d = interfaceC23434B;
            this.f90376e = interfaceC23492o;
        }

        /* renamed from: a */
        public void m32489a(InterfaceC23465c interfaceC23465c, Throwable th) {
            EnumC23501d.m33000a(this.f90378g);
            this.f90377f.mo32984b(interfaceC23465c);
            onError(th);
        }

        /* renamed from: b */
        public void m32488b(C24234b<T, C> c24234b, long j) {
            boolean z;
            this.f90377f.mo32984b(c24234b);
            if (this.f90377f.m33024h() == 0) {
                EnumC23501d.m33000a(this.f90378g);
                z = true;
            } else {
                z = false;
            }
            synchronized (this) {
                Map<Long, C> map = this.f90384m;
                if (map == null) {
                    return;
                }
                this.f90381j.offer(map.remove(Long.valueOf(j)));
                if (z) {
                    this.f90380i = true;
                }
                m32487c();
            }
        }

        /* renamed from: c */
        public void m32487c() {
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC23436D<? super C> interfaceC23436D = this.f90373b;
            C24409c<C> c24409c = this.f90381j;
            int i = 1;
            while (!this.f90382k) {
                boolean z2 = this.f90380i;
                if (z2 && this.f90379h.get() != null) {
                    c24409c.clear();
                    interfaceC23436D.onError(this.f90379h.m32275b());
                    return;
                }
                C poll = c24409c.poll();
                if (poll == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2 && z) {
                    interfaceC23436D.onComplete();
                    return;
                } else if (z) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    interfaceC23436D.onNext(poll);
                }
            }
            c24409c.clear();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        public void m32486d(Open open) {
            try {
                Collection collection = (Collection) C23544b.m32923e(this.f90374c.call(), "The bufferSupplier returned a null Collection");
                InterfaceC23434B interfaceC23434B = (InterfaceC23434B) C23544b.m32923e(this.f90376e.apply(open), "The bufferClose returned a null ObservableSource");
                long j = this.f90383l;
                this.f90383l = 1 + j;
                synchronized (this) {
                    Map<Long, C> map = this.f90384m;
                    if (map == 0) {
                        return;
                    }
                    map.put(Long.valueOf(j), collection);
                    C24234b c24234b = new C24234b(this, j);
                    this.f90377f.mo32983c(c24234b);
                    interfaceC23434B.subscribe(c24234b);
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                EnumC23501d.m33000a(this.f90378g);
                onError(th);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (EnumC23501d.m33000a(this.f90378g)) {
                this.f90382k = true;
                this.f90377f.dispose();
                synchronized (this) {
                    this.f90384m = null;
                }
                if (getAndIncrement() != 0) {
                    this.f90381j.clear();
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(this.f90378g.get());
        }

        /* renamed from: g */
        public void m32485g(C24233a<Open> c24233a) {
            this.f90377f.mo32984b(c24233a);
            if (this.f90377f.m33024h() == 0) {
                EnumC23501d.m33000a(this.f90378g);
                this.f90380i = true;
                m32487c();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90377f.dispose();
            synchronized (this) {
                Map<Long, C> map = this.f90384m;
                if (map == null) {
                    return;
                }
                for (C c : map.values()) {
                    this.f90381j.offer(c);
                }
                this.f90384m = null;
                this.f90380i = true;
                m32487c();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f90379h.m32276a(th)) {
                this.f90377f.dispose();
                synchronized (this) {
                    this.f90384m = null;
                }
                this.f90380i = true;
                m32487c();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            synchronized (this) {
                Map<Long, C> map = this.f90384m;
                if (map == null) {
                    return;
                }
                for (C c : map.values()) {
                    c.add(t);
                }
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32995h(this.f90378g, interfaceC23465c)) {
                C24233a c24233a = new C24233a(this);
                this.f90377f.mo32983c(c24233a);
                this.f90375d.subscribe(c24233a);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.n$b */
    /* loaded from: classes6.dex */
    public static final class C24234b<T, C extends Collection<? super T>> extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<Object>, InterfaceC23465c {
        private static final long serialVersionUID = -8498650778633225126L;

        /* renamed from: b */
        public final C24232a<T, C, ?, ?> f90386b;

        /* renamed from: c */
        public final long f90387c;

        public C24234b(C24232a<T, C, ?, ?> c24232a, long j) {
            this.f90386b = c24232a;
            this.f90387c = j;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return get() == EnumC23501d.DISPOSED;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            InterfaceC23465c interfaceC23465c = get();
            EnumC23501d enumC23501d = EnumC23501d.DISPOSED;
            if (interfaceC23465c != enumC23501d) {
                lazySet(enumC23501d);
                this.f90386b.m32488b(this, this.f90387c);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            InterfaceC23465c interfaceC23465c = get();
            EnumC23501d enumC23501d = EnumC23501d.DISPOSED;
            if (interfaceC23465c != enumC23501d) {
                lazySet(enumC23501d);
                this.f90386b.m32489a(this, th);
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(Object obj) {
            InterfaceC23465c interfaceC23465c = get();
            EnumC23501d enumC23501d = EnumC23501d.DISPOSED;
            if (interfaceC23465c != enumC23501d) {
                lazySet(enumC23501d);
                interfaceC23465c.dispose();
                this.f90386b.m32488b(this, this.f90387c);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this, interfaceC23465c);
        }
    }

    public C24231n(InterfaceC23434B<T> interfaceC23434B, InterfaceC23434B<? extends Open> interfaceC23434B2, InterfaceC23492o<? super Open, ? extends InterfaceC23434B<? extends Close>> interfaceC23492o, Callable<U> callable) {
        super(interfaceC23434B);
        this.f90371d = interfaceC23434B2;
        this.f90372e = interfaceC23492o;
        this.f90370c = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super U> interfaceC23436D) {
        C24232a c24232a = new C24232a(interfaceC23436D, this.f90371d, this.f90372e, this.f90370c);
        interfaceC23436D.onSubscribe(c24232a);
        this.f90078b.subscribe(c24232a);
    }
}
