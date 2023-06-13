package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.queue.C24409c;
import io.reactivex.observables.AbstractC24496b;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.k0 */
/* loaded from: classes6.dex */
public final class C24209k0<T, K, V> extends AbstractC24145a<T, AbstractC24496b<K, V>> {

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends K> f90272c;

    /* renamed from: d */
    public final InterfaceC23492o<? super T, ? extends V> f90273d;

    /* renamed from: e */
    public final int f90274e;

    /* renamed from: f */
    public final boolean f90275f;

    /* renamed from: io.reactivex.internal.operators.observable.k0$a */
    /* loaded from: classes6.dex */
    public static final class C24210a<T, K, V> extends AtomicInteger implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: j */
        public static final Object f90276j = new Object();
        private static final long serialVersionUID = -3688291656102519502L;

        /* renamed from: b */
        public final InterfaceC23436D<? super AbstractC24496b<K, V>> f90277b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends K> f90278c;

        /* renamed from: d */
        public final InterfaceC23492o<? super T, ? extends V> f90279d;

        /* renamed from: e */
        public final int f90280e;

        /* renamed from: f */
        public final boolean f90281f;

        /* renamed from: h */
        public InterfaceC23465c f90283h;

        /* renamed from: i */
        public final AtomicBoolean f90284i = new AtomicBoolean();

        /* renamed from: g */
        public final Map<Object, C24211b<K, V>> f90282g = new ConcurrentHashMap();

        public C24210a(InterfaceC23436D<? super AbstractC24496b<K, V>> interfaceC23436D, InterfaceC23492o<? super T, ? extends K> interfaceC23492o, InterfaceC23492o<? super T, ? extends V> interfaceC23492o2, int i, boolean z) {
            this.f90277b = interfaceC23436D;
            this.f90278c = interfaceC23492o;
            this.f90279d = interfaceC23492o2;
            this.f90280e = i;
            this.f90281f = z;
            lazySet(1);
        }

        /* renamed from: a */
        public void m32505a(K k) {
            if (k == null) {
                k = (K) f90276j;
            }
            this.f90282g.remove(k);
            if (decrementAndGet() == 0) {
                this.f90283h.dispose();
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (this.f90284i.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.f90283h.dispose();
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90284i.get();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            ArrayList<C24211b> arrayList = new ArrayList(this.f90282g.values());
            this.f90282g.clear();
            for (C24211b c24211b : arrayList) {
                c24211b.onComplete();
            }
            this.f90277b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            ArrayList<C24211b> arrayList = new ArrayList(this.f90282g.values());
            this.f90282g.clear();
            for (C24211b c24211b : arrayList) {
                c24211b.onError(th);
            }
            this.f90277b.onError(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            Object obj;
            try {
                K apply = this.f90278c.apply(t);
                if (apply != null) {
                    obj = apply;
                } else {
                    obj = f90276j;
                }
                C24211b<K, V> c24211b = this.f90282g.get(obj);
                if (c24211b == null) {
                    if (this.f90284i.get()) {
                        return;
                    }
                    c24211b = C24211b.m32504a(apply, this.f90280e, this, this.f90281f);
                    this.f90282g.put(obj, c24211b);
                    getAndIncrement();
                    this.f90277b.onNext(c24211b);
                }
                try {
                    c24211b.onNext(C23544b.m32923e(this.f90279d.apply(t), "The value supplied is null"));
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    this.f90283h.dispose();
                    onError(th);
                }
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                this.f90283h.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90283h, interfaceC23465c)) {
                this.f90283h = interfaceC23465c;
                this.f90277b.onSubscribe(this);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.k0$b */
    /* loaded from: classes6.dex */
    public static final class C24211b<K, T> extends AbstractC24496b<K, T> {

        /* renamed from: c */
        public final C24212c<T, K> f90285c;

        public C24211b(K k, C24212c<T, K> c24212c) {
            super(k);
            this.f90285c = c24212c;
        }

        /* renamed from: a */
        public static <T, K> C24211b<K, T> m32504a(K k, int i, C24210a<?, K, T> c24210a, boolean z) {
            return new C24211b<>(k, new C24212c(i, c24210a, k, z));
        }

        public void onComplete() {
            this.f90285c.m32501c();
        }

        public void onError(Throwable th) {
            this.f90285c.m32500d(th);
        }

        public void onNext(T t) {
            this.f90285c.m32499g(t);
        }

        @Override // io.reactivex.Observable
        public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
            this.f90285c.subscribe(interfaceC23436D);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.k0$c */
    /* loaded from: classes6.dex */
    public static final class C24212c<T, K> extends AtomicInteger implements InterfaceC23465c, InterfaceC23434B<T> {
        private static final long serialVersionUID = -3852313036005250360L;

        /* renamed from: b */
        public final K f90286b;

        /* renamed from: c */
        public final C24409c<T> f90287c;

        /* renamed from: d */
        public final C24210a<?, K, T> f90288d;

        /* renamed from: e */
        public final boolean f90289e;

        /* renamed from: f */
        public volatile boolean f90290f;

        /* renamed from: g */
        public Throwable f90291g;

        /* renamed from: h */
        public final AtomicBoolean f90292h = new AtomicBoolean();

        /* renamed from: i */
        public final AtomicBoolean f90293i = new AtomicBoolean();

        /* renamed from: j */
        public final AtomicReference<InterfaceC23436D<? super T>> f90294j = new AtomicReference<>();

        public C24212c(int i, C24210a<?, K, T> c24210a, K k, boolean z) {
            this.f90287c = new C24409c<>(i);
            this.f90288d = c24210a;
            this.f90286b = k;
            this.f90289e = z;
        }

        /* renamed from: a */
        public boolean m32503a(boolean z, boolean z2, InterfaceC23436D<? super T> interfaceC23436D, boolean z3) {
            if (this.f90292h.get()) {
                this.f90287c.clear();
                this.f90288d.m32505a(this.f90286b);
                this.f90294j.lazySet(null);
                return true;
            } else if (z) {
                if (z3) {
                    if (z2) {
                        Throwable th = this.f90291g;
                        this.f90294j.lazySet(null);
                        if (th != null) {
                            interfaceC23436D.onError(th);
                        } else {
                            interfaceC23436D.onComplete();
                        }
                        return true;
                    }
                    return false;
                }
                Throwable th2 = this.f90291g;
                if (th2 != null) {
                    this.f90287c.clear();
                    this.f90294j.lazySet(null);
                    interfaceC23436D.onError(th2);
                    return true;
                } else if (z2) {
                    this.f90294j.lazySet(null);
                    interfaceC23436D.onComplete();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        /* renamed from: b */
        public void m32502b() {
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            C24409c<T> c24409c = this.f90287c;
            boolean z2 = this.f90289e;
            InterfaceC23436D<? super T> interfaceC23436D = this.f90294j.get();
            int i = 1;
            while (true) {
                if (interfaceC23436D != null) {
                    while (true) {
                        boolean z3 = this.f90290f;
                        Object obj = (T) c24409c.poll();
                        if (obj == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (m32503a(z3, z, interfaceC23436D, z2)) {
                            return;
                        }
                        if (z) {
                            break;
                        }
                        interfaceC23436D.onNext(obj);
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
                if (interfaceC23436D == null) {
                    interfaceC23436D = this.f90294j.get();
                }
            }
        }

        /* renamed from: c */
        public void m32501c() {
            this.f90290f = true;
            m32502b();
        }

        /* renamed from: d */
        public void m32500d(Throwable th) {
            this.f90291g = th;
            this.f90290f = true;
            m32502b();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (this.f90292h.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.f90294j.lazySet(null);
                this.f90288d.m32505a(this.f90286b);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90292h.get();
        }

        /* renamed from: g */
        public void m32499g(T t) {
            this.f90287c.offer(t);
            m32502b();
        }

        @Override // io.reactivex.InterfaceC23434B
        public void subscribe(InterfaceC23436D<? super T> interfaceC23436D) {
            if (this.f90293i.compareAndSet(false, true)) {
                interfaceC23436D.onSubscribe(this);
                this.f90294j.lazySet(interfaceC23436D);
                if (this.f90292h.get()) {
                    this.f90294j.lazySet(null);
                    return;
                } else {
                    m32502b();
                    return;
                }
            }
            EnumC23502e.m32987i(new IllegalStateException("Only one Observer allowed!"), interfaceC23436D);
        }
    }

    public C24209k0(InterfaceC23434B<T> interfaceC23434B, InterfaceC23492o<? super T, ? extends K> interfaceC23492o, InterfaceC23492o<? super T, ? extends V> interfaceC23492o2, int i, boolean z) {
        super(interfaceC23434B);
        this.f90272c = interfaceC23492o;
        this.f90273d = interfaceC23492o2;
        this.f90274e = i;
        this.f90275f = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super AbstractC24496b<K, V>> interfaceC23436D) {
        this.f90078b.subscribe(new C24210a(interfaceC23436D, this.f90272c, this.f90273d, this.f90274e, this.f90275f));
    }
}
