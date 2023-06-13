package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.queue.C24409c;
import io.reactivex.internal.util.C24467c;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.u */
/* loaded from: classes6.dex */
public final class C24297u<T, R> extends Observable<R> {

    /* renamed from: b */
    public final InterfaceC23434B<? extends T>[] f90601b;

    /* renamed from: c */
    public final Iterable<? extends InterfaceC23434B<? extends T>> f90602c;

    /* renamed from: d */
    public final InterfaceC23492o<? super Object[], ? extends R> f90603d;

    /* renamed from: e */
    public final int f90604e;

    /* renamed from: f */
    public final boolean f90605f;

    /* renamed from: io.reactivex.internal.operators.observable.u$a */
    /* loaded from: classes6.dex */
    public static final class C24298a<T, R> extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<T> {
        private static final long serialVersionUID = -4823716997131257941L;

        /* renamed from: b */
        public final C24299b<T, R> f90606b;

        /* renamed from: c */
        public final int f90607c;

        public C24298a(C24299b<T, R> c24299b, int i) {
            this.f90606b = c24299b;
            this.f90607c = i;
        }

        /* renamed from: a */
        public void m32425a() {
            EnumC23501d.m33000a(this);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90606b.m32421d(this.f90607c);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90606b.m32420g(this.f90607c, th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f90606b.m32419h(this.f90607c, t);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this, interfaceC23465c);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.u$b */
    /* loaded from: classes6.dex */
    public static final class C24299b<T, R> extends AtomicInteger implements InterfaceC23465c {
        private static final long serialVersionUID = 8567835998786448817L;

        /* renamed from: b */
        public final InterfaceC23436D<? super R> f90608b;

        /* renamed from: c */
        public final InterfaceC23492o<? super Object[], ? extends R> f90609c;

        /* renamed from: d */
        public final C24298a<T, R>[] f90610d;

        /* renamed from: e */
        public Object[] f90611e;

        /* renamed from: f */
        public final C24409c<Object[]> f90612f;

        /* renamed from: g */
        public final boolean f90613g;

        /* renamed from: h */
        public volatile boolean f90614h;

        /* renamed from: i */
        public volatile boolean f90615i;

        /* renamed from: j */
        public final C24467c f90616j = new C24467c();

        /* renamed from: k */
        public int f90617k;

        /* renamed from: l */
        public int f90618l;

        public C24299b(InterfaceC23436D<? super R> interfaceC23436D, InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o, int i, int i2, boolean z) {
            this.f90608b = interfaceC23436D;
            this.f90609c = interfaceC23492o;
            this.f90613g = z;
            this.f90611e = new Object[i];
            C24298a<T, R>[] c24298aArr = new C24298a[i];
            for (int i3 = 0; i3 < i; i3++) {
                c24298aArr[i3] = new C24298a<>(this, i3);
            }
            this.f90610d = c24298aArr;
            this.f90612f = new C24409c<>(i2);
        }

        /* renamed from: a */
        public void m32424a() {
            for (C24298a<T, R> c24298a : this.f90610d) {
                c24298a.m32425a();
            }
        }

        /* renamed from: b */
        public void m32423b(C24409c<?> c24409c) {
            synchronized (this) {
                this.f90611e = null;
            }
            c24409c.clear();
        }

        /* renamed from: c */
        public void m32422c() {
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            C24409c<Object[]> c24409c = this.f90612f;
            InterfaceC23436D<? super R> interfaceC23436D = this.f90608b;
            boolean z2 = this.f90613g;
            int i = 1;
            while (!this.f90614h) {
                if (!z2 && this.f90616j.get() != null) {
                    m32424a();
                    m32423b(c24409c);
                    interfaceC23436D.onError(this.f90616j.m32275b());
                    return;
                }
                boolean z3 = this.f90615i;
                Object[] poll = c24409c.poll();
                if (poll == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z3 && z) {
                    m32423b(c24409c);
                    Throwable m32275b = this.f90616j.m32275b();
                    if (m32275b == null) {
                        interfaceC23436D.onComplete();
                        return;
                    } else {
                        interfaceC23436D.onError(m32275b);
                        return;
                    }
                } else if (z) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    try {
                        interfaceC23436D.onNext((Object) C23544b.m32923e(this.f90609c.apply(poll), "The combiner returned a null value"));
                    } catch (Throwable th) {
                        C23475a.m33009b(th);
                        this.f90616j.m32276a(th);
                        m32424a();
                        m32423b(c24409c);
                        interfaceC23436D.onError(this.f90616j.m32275b());
                        return;
                    }
                }
            }
            m32423b(c24409c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0017, code lost:
            if (r2 == r0.length) goto L19;
         */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void m32421d(int i) {
            boolean z;
            synchronized (this) {
                Object[] objArr = this.f90611e;
                if (objArr == null) {
                    return;
                }
                if (objArr[i] == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    int i2 = this.f90618l + 1;
                    this.f90618l = i2;
                }
                this.f90615i = true;
                if (z) {
                    m32424a();
                }
                m32422c();
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (!this.f90614h) {
                this.f90614h = true;
                m32424a();
                if (getAndIncrement() == 0) {
                    m32423b(this.f90612f);
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90614h;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
            if (r1 == r4.length) goto L20;
         */
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void m32420g(int i, Throwable th) {
            boolean z;
            if (this.f90616j.m32276a(th)) {
                boolean z2 = true;
                if (this.f90613g) {
                    synchronized (this) {
                        Object[] objArr = this.f90611e;
                        if (objArr == null) {
                            return;
                        }
                        if (objArr[i] == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            int i2 = this.f90618l + 1;
                            this.f90618l = i2;
                        }
                        this.f90615i = true;
                        z2 = z;
                    }
                }
                if (z2) {
                    m32424a();
                }
                m32422c();
                return;
            }
            C24508a.m31988u(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: h */
        public void m32419h(int i, T t) {
            boolean z;
            synchronized (this) {
                Object[] objArr = this.f90611e;
                if (objArr == null) {
                    return;
                }
                Object obj = objArr[i];
                int i2 = this.f90617k;
                if (obj == null) {
                    i2++;
                    this.f90617k = i2;
                }
                objArr[i] = t;
                if (i2 == objArr.length) {
                    this.f90612f.offer(objArr.clone());
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    m32422c();
                }
            }
        }

        /* renamed from: i */
        public void m32418i(InterfaceC23434B<? extends T>[] interfaceC23434BArr) {
            C24298a<T, R>[] c24298aArr = this.f90610d;
            int length = c24298aArr.length;
            this.f90608b.onSubscribe(this);
            for (int i = 0; i < length && !this.f90615i && !this.f90614h; i++) {
                interfaceC23434BArr[i].subscribe(c24298aArr[i]);
            }
        }
    }

    public C24297u(InterfaceC23434B<? extends T>[] interfaceC23434BArr, Iterable<? extends InterfaceC23434B<? extends T>> iterable, InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o, int i, boolean z) {
        this.f90601b = interfaceC23434BArr;
        this.f90602c = iterable;
        this.f90603d = interfaceC23492o;
        this.f90604e = i;
        this.f90605f = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super R> interfaceC23436D) {
        int length;
        InterfaceC23434B<? extends T>[] interfaceC23434BArr = this.f90601b;
        if (interfaceC23434BArr == null) {
            interfaceC23434BArr = new InterfaceC23434B[8];
            length = 0;
            for (InterfaceC23434B<? extends T> interfaceC23434B : this.f90602c) {
                if (length == interfaceC23434BArr.length) {
                    InterfaceC23434B<? extends T>[] interfaceC23434BArr2 = new InterfaceC23434B[(length >> 2) + length];
                    System.arraycopy(interfaceC23434BArr, 0, interfaceC23434BArr2, 0, length);
                    interfaceC23434BArr = interfaceC23434BArr2;
                }
                interfaceC23434BArr[length] = interfaceC23434B;
                length++;
            }
        } else {
            length = interfaceC23434BArr.length;
        }
        int i = length;
        if (i == 0) {
            EnumC23502e.m32990d(interfaceC23436D);
        } else {
            new C24299b(interfaceC23436D, this.f90603d, i, this.f90604e, this.f90605f).m32418i(interfaceC23434BArr);
        }
    }
}
