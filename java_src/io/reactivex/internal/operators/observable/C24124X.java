package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.fuseable.InterfaceC23550e;
import io.reactivex.internal.fuseable.InterfaceC23554i;
import io.reactivex.internal.fuseable.InterfaceC23555j;
import io.reactivex.internal.queue.C24408b;
import io.reactivex.internal.queue.C24409c;
import io.reactivex.internal.util.C24467c;
import io.reactivex.internal.util.C24475k;
import io.reactivex.plugins.C24508a;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.X */
/* loaded from: classes6.dex */
public final class C24124X<T, U> extends AbstractC24145a<T, U> {

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends U>> f90000c;

    /* renamed from: d */
    public final boolean f90001d;

    /* renamed from: e */
    public final int f90002e;

    /* renamed from: f */
    public final int f90003f;

    /* renamed from: io.reactivex.internal.operators.observable.X$a */
    /* loaded from: classes6.dex */
    public static final class C24125a<T, U> extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<U> {
        private static final long serialVersionUID = -4606175640614850599L;

        /* renamed from: b */
        public final long f90004b;

        /* renamed from: c */
        public final C24126b<T, U> f90005c;

        /* renamed from: d */
        public volatile boolean f90006d;

        /* renamed from: e */
        public volatile InterfaceC23555j<U> f90007e;

        /* renamed from: f */
        public int f90008f;

        public C24125a(C24126b<T, U> c24126b, long j) {
            this.f90004b = j;
            this.f90005c = c24126b;
        }

        /* renamed from: a */
        public void m32570a() {
            EnumC23501d.m33000a(this);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90006d = true;
            this.f90005c.m32566d();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f90005c.f90018i.m32276a(th)) {
                C24126b<T, U> c24126b = this.f90005c;
                if (!c24126b.f90013d) {
                    c24126b.m32567c();
                }
                this.f90006d = true;
                this.f90005c.m32566d();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(U u) {
            if (this.f90008f == 0) {
                this.f90005c.m32561k(u, this);
            } else {
                this.f90005c.m32566d();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32995h(this, interfaceC23465c) && (interfaceC23465c instanceof InterfaceC23550e)) {
                InterfaceC23550e interfaceC23550e = (InterfaceC23550e) interfaceC23465c;
                int mo31868b = interfaceC23550e.mo31868b(7);
                if (mo31868b == 1) {
                    this.f90008f = mo31868b;
                    this.f90007e = interfaceC23550e;
                    this.f90006d = true;
                    this.f90005c.m32566d();
                } else if (mo31868b == 2) {
                    this.f90008f = mo31868b;
                    this.f90007e = interfaceC23550e;
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.X$b */
    /* loaded from: classes6.dex */
    public static final class C24126b<T, U> extends AtomicInteger implements InterfaceC23465c, InterfaceC23436D<T> {

        /* renamed from: r */
        public static final C24125a<?, ?>[] f90009r = new C24125a[0];

        /* renamed from: s */
        public static final C24125a<?, ?>[] f90010s = new C24125a[0];
        private static final long serialVersionUID = -2117620485640801370L;

        /* renamed from: b */
        public final InterfaceC23436D<? super U> f90011b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends U>> f90012c;

        /* renamed from: d */
        public final boolean f90013d;

        /* renamed from: e */
        public final int f90014e;

        /* renamed from: f */
        public final int f90015f;

        /* renamed from: g */
        public volatile InterfaceC23554i<U> f90016g;

        /* renamed from: h */
        public volatile boolean f90017h;

        /* renamed from: i */
        public final C24467c f90018i = new C24467c();

        /* renamed from: j */
        public volatile boolean f90019j;

        /* renamed from: k */
        public final AtomicReference<C24125a<?, ?>[]> f90020k;

        /* renamed from: l */
        public InterfaceC23465c f90021l;

        /* renamed from: m */
        public long f90022m;

        /* renamed from: n */
        public long f90023n;

        /* renamed from: o */
        public int f90024o;

        /* renamed from: p */
        public Queue<InterfaceC23434B<? extends U>> f90025p;

        /* renamed from: q */
        public int f90026q;

        public C24126b(InterfaceC23436D<? super U> interfaceC23436D, InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends U>> interfaceC23492o, boolean z, int i, int i2) {
            this.f90011b = interfaceC23436D;
            this.f90012c = interfaceC23492o;
            this.f90013d = z;
            this.f90014e = i;
            this.f90015f = i2;
            if (i != Integer.MAX_VALUE) {
                this.f90025p = new ArrayDeque(i);
            }
            this.f90020k = new AtomicReference<>(f90009r);
        }

        /* renamed from: a */
        public boolean m32569a(C24125a<T, U> c24125a) {
            C24125a<?, ?>[] c24125aArr;
            C24125a[] c24125aArr2;
            do {
                c24125aArr = this.f90020k.get();
                if (c24125aArr == f90010s) {
                    c24125a.m32570a();
                    return false;
                }
                int length = c24125aArr.length;
                c24125aArr2 = new C24125a[length + 1];
                System.arraycopy(c24125aArr, 0, c24125aArr2, 0, length);
                c24125aArr2[length] = c24125a;
            } while (!C42482i24.m35337a(this.f90020k, c24125aArr, c24125aArr2));
            return true;
        }

        /* renamed from: b */
        public boolean m32568b() {
            if (this.f90019j) {
                return true;
            }
            Throwable th = this.f90018i.get();
            if (!this.f90013d && th != null) {
                m32567c();
                Throwable m32275b = this.f90018i.m32275b();
                if (m32275b != C24475k.f91077a) {
                    this.f90011b.onError(m32275b);
                }
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public boolean m32567c() {
            C24125a<?, ?>[] andSet;
            this.f90021l.dispose();
            C24125a<?, ?>[] c24125aArr = this.f90020k.get();
            C24125a<?, ?>[] c24125aArr2 = f90010s;
            if (c24125aArr == c24125aArr2 || (andSet = this.f90020k.getAndSet(c24125aArr2)) == c24125aArr2) {
                return false;
            }
            for (C24125a<?, ?> c24125a : andSet) {
                c24125a.m32570a();
            }
            return true;
        }

        /* renamed from: d */
        public void m32566d() {
            if (getAndIncrement() == 0) {
                m32565g();
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            Throwable m32275b;
            if (!this.f90019j) {
                this.f90019j = true;
                if (m32567c() && (m32275b = this.f90018i.m32275b()) != null && m32275b != C24475k.f91077a) {
                    C24508a.m31988u(m32275b);
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90019j;
        }

        /* renamed from: g */
        public void m32565g() {
            int i;
            InterfaceC23436D<? super U> interfaceC23436D = this.f90011b;
            int i2 = 1;
            while (!m32568b()) {
                InterfaceC23554i<U> interfaceC23554i = this.f90016g;
                int i3 = 0;
                if (interfaceC23554i != null) {
                    while (!m32568b()) {
                        Object obj = (U) interfaceC23554i.poll();
                        if (obj != null) {
                            interfaceC23436D.onNext(obj);
                            i3++;
                        }
                    }
                    return;
                }
                if (i3 != 0) {
                    if (this.f90014e != Integer.MAX_VALUE) {
                        m32562j(i3);
                    }
                } else {
                    boolean z = this.f90017h;
                    InterfaceC23554i<U> interfaceC23554i2 = this.f90016g;
                    C24125a<?, ?>[] c24125aArr = this.f90020k.get();
                    int length = c24125aArr.length;
                    if (this.f90014e != Integer.MAX_VALUE) {
                        synchronized (this) {
                            i = this.f90025p.size();
                        }
                    } else {
                        i = 0;
                    }
                    if (z && ((interfaceC23554i2 == null || interfaceC23554i2.isEmpty()) && length == 0 && i == 0)) {
                        Throwable m32275b = this.f90018i.m32275b();
                        if (m32275b != C24475k.f91077a) {
                            if (m32275b == null) {
                                interfaceC23436D.onComplete();
                                return;
                            } else {
                                interfaceC23436D.onError(m32275b);
                                return;
                            }
                        }
                        return;
                    }
                    if (length != 0) {
                        long j = this.f90023n;
                        int i4 = this.f90024o;
                        if (length <= i4 || c24125aArr[i4].f90004b != j) {
                            if (length <= i4) {
                                i4 = 0;
                            }
                            for (int i5 = 0; i5 < length && c24125aArr[i4].f90004b != j; i5++) {
                                i4++;
                                if (i4 == length) {
                                    i4 = 0;
                                }
                            }
                            this.f90024o = i4;
                            this.f90023n = c24125aArr[i4].f90004b;
                        }
                        for (int i6 = 0; i6 < length; i6++) {
                            if (m32568b()) {
                                return;
                            }
                            C24125a<T, U> c24125a = c24125aArr[i4];
                            InterfaceC23555j<U> interfaceC23555j = c24125a.f90007e;
                            if (interfaceC23555j != null) {
                                while (true) {
                                    try {
                                        Object obj2 = (U) interfaceC23555j.poll();
                                        if (obj2 == null) {
                                            break;
                                        }
                                        interfaceC23436D.onNext(obj2);
                                        if (m32568b()) {
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        C23475a.m33009b(th);
                                        c24125a.m32570a();
                                        this.f90018i.m32276a(th);
                                        if (m32568b()) {
                                            return;
                                        }
                                        m32564h(c24125a);
                                        i3++;
                                        i4++;
                                        if (i4 != length) {
                                        }
                                    }
                                }
                            }
                            boolean z2 = c24125a.f90006d;
                            InterfaceC23555j<U> interfaceC23555j2 = c24125a.f90007e;
                            if (z2 && (interfaceC23555j2 == null || interfaceC23555j2.isEmpty())) {
                                m32564h(c24125a);
                                if (m32568b()) {
                                    return;
                                }
                                i3++;
                            }
                            i4++;
                            if (i4 != length) {
                            }
                            i4 = 0;
                        }
                        this.f90024o = i4;
                        this.f90023n = c24125aArr[i4].f90004b;
                    }
                    if (i3 != 0) {
                        if (this.f90014e != Integer.MAX_VALUE) {
                            m32562j(i3);
                        }
                    } else {
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    }
                }
            }
        }

        /* renamed from: h */
        public void m32564h(C24125a<T, U> c24125a) {
            C24125a<?, ?>[] c24125aArr;
            C24125a<?, ?>[] c24125aArr2;
            do {
                c24125aArr = this.f90020k.get();
                int length = c24125aArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (c24125aArr[i] == c24125a) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    c24125aArr2 = f90009r;
                } else {
                    C24125a<?, ?>[] c24125aArr3 = new C24125a[length - 1];
                    System.arraycopy(c24125aArr, 0, c24125aArr3, 0, i);
                    System.arraycopy(c24125aArr, i + 1, c24125aArr3, i, (length - i) - 1);
                    c24125aArr2 = c24125aArr3;
                }
            } while (!C42482i24.m35337a(this.f90020k, c24125aArr, c24125aArr2));
        }

        /* renamed from: i */
        public void m32563i(InterfaceC23434B<? extends U> interfaceC23434B) {
            boolean z;
            while (interfaceC23434B instanceof Callable) {
                if (m32560l((Callable) interfaceC23434B) && this.f90014e != Integer.MAX_VALUE) {
                    synchronized (this) {
                        interfaceC23434B = this.f90025p.poll();
                        if (interfaceC23434B == null) {
                            z = true;
                            this.f90026q--;
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        m32566d();
                        return;
                    }
                } else {
                    return;
                }
            }
            long j = this.f90022m;
            this.f90022m = 1 + j;
            C24125a<T, U> c24125a = new C24125a<>(this, j);
            if (m32569a(c24125a)) {
                interfaceC23434B.subscribe(c24125a);
            }
        }

        /* renamed from: j */
        public void m32562j(int i) {
            while (true) {
                int i2 = i - 1;
                if (i != 0) {
                    synchronized (this) {
                        InterfaceC23434B<? extends U> poll = this.f90025p.poll();
                        if (poll == null) {
                            this.f90026q--;
                        } else {
                            m32563i(poll);
                        }
                    }
                    i = i2;
                } else {
                    return;
                }
            }
        }

        /* renamed from: k */
        public void m32561k(U u, C24125a<T, U> c24125a) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f90011b.onNext(u);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                InterfaceC23555j interfaceC23555j = c24125a.f90007e;
                if (interfaceC23555j == null) {
                    interfaceC23555j = new C24409c(this.f90015f);
                    c24125a.f90007e = interfaceC23555j;
                }
                interfaceC23555j.offer(u);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m32565g();
        }

        /* renamed from: l */
        public boolean m32560l(Callable<? extends U> callable) {
            try {
                U call = callable.call();
                if (call == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.f90011b.onNext(call);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    InterfaceC23554i<U> interfaceC23554i = this.f90016g;
                    if (interfaceC23554i == null) {
                        if (this.f90014e == Integer.MAX_VALUE) {
                            interfaceC23554i = new C24409c<>(this.f90015f);
                        } else {
                            interfaceC23554i = new C24408b<>(this.f90014e);
                        }
                        this.f90016g = interfaceC23554i;
                    }
                    if (!interfaceC23554i.offer(call)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    } else if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                m32565g();
                return true;
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f90018i.m32276a(th);
                m32566d();
                return true;
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f90017h) {
                return;
            }
            this.f90017h = true;
            m32566d();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f90017h) {
                C24508a.m31988u(th);
            } else if (this.f90018i.m32276a(th)) {
                this.f90017h = true;
                m32566d();
            } else {
                C24508a.m31988u(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f90017h) {
                return;
            }
            try {
                InterfaceC23434B<? extends U> interfaceC23434B = (InterfaceC23434B) C23544b.m32923e(this.f90012c.apply(t), "The mapper returned a null ObservableSource");
                if (this.f90014e != Integer.MAX_VALUE) {
                    synchronized (this) {
                        int i = this.f90026q;
                        if (i == this.f90014e) {
                            this.f90025p.offer(interfaceC23434B);
                            return;
                        }
                        this.f90026q = i + 1;
                    }
                }
                m32563i(interfaceC23434B);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f90021l.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90021l, interfaceC23465c)) {
                this.f90021l = interfaceC23465c;
                this.f90011b.onSubscribe(this);
            }
        }
    }

    public C24124X(InterfaceC23434B<T> interfaceC23434B, InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends U>> interfaceC23492o, boolean z, int i, int i2) {
        super(interfaceC23434B);
        this.f90000c = interfaceC23492o;
        this.f90001d = z;
        this.f90002e = i;
        this.f90003f = i2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super U> interfaceC23436D) {
        if (C24149a1.m32534b(this.f90078b, interfaceC23436D, this.f90000c)) {
            return;
        }
        this.f90078b.subscribe(new C24126b(interfaceC23436D, this.f90000c, this.f90001d, this.f90002e, this.f90003f));
    }
}
