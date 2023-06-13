package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.fuseable.InterfaceC23550e;
import io.reactivex.internal.fuseable.InterfaceC23555j;
import io.reactivex.internal.queue.C24409c;
import io.reactivex.internal.util.C24467c;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.p1 */
/* loaded from: classes6.dex */
public final class C24266p1<T, R> extends AbstractC24145a<T, R> {

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> f90446c;

    /* renamed from: d */
    public final int f90447d;

    /* renamed from: e */
    public final boolean f90448e;

    /* renamed from: io.reactivex.internal.operators.observable.p1$a */
    /* loaded from: classes6.dex */
    public static final class C24267a<T, R> extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<R> {
        private static final long serialVersionUID = 3837284832786408377L;

        /* renamed from: b */
        public final C24268b<T, R> f90449b;

        /* renamed from: c */
        public final long f90450c;

        /* renamed from: d */
        public final int f90451d;

        /* renamed from: e */
        public volatile InterfaceC23555j<R> f90452e;

        /* renamed from: f */
        public volatile boolean f90453f;

        public C24267a(C24268b<T, R> c24268b, long j, int i) {
            this.f90449b = c24268b;
            this.f90450c = j;
            this.f90451d = i;
        }

        /* renamed from: a */
        public void m32452a() {
            EnumC23501d.m33000a(this);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f90450c == this.f90449b.f90464k) {
                this.f90453f = true;
                this.f90449b.m32450b();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90449b.m32449c(this, th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(R r) {
            if (this.f90450c == this.f90449b.f90464k) {
                if (r != null) {
                    this.f90452e.offer(r);
                }
                this.f90449b.m32450b();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32995h(this, interfaceC23465c)) {
                if (interfaceC23465c instanceof InterfaceC23550e) {
                    InterfaceC23550e interfaceC23550e = (InterfaceC23550e) interfaceC23465c;
                    int mo31868b = interfaceC23550e.mo31868b(7);
                    if (mo31868b == 1) {
                        this.f90452e = interfaceC23550e;
                        this.f90453f = true;
                        this.f90449b.m32450b();
                        return;
                    } else if (mo31868b == 2) {
                        this.f90452e = interfaceC23550e;
                        return;
                    }
                }
                this.f90452e = new C24409c(this.f90451d);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.p1$b */
    /* loaded from: classes6.dex */
    public static final class C24268b<T, R> extends AtomicInteger implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: l */
        public static final C24267a<Object, Object> f90454l;
        private static final long serialVersionUID = -3491074160481096299L;

        /* renamed from: b */
        public final InterfaceC23436D<? super R> f90455b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> f90456c;

        /* renamed from: d */
        public final int f90457d;

        /* renamed from: e */
        public final boolean f90458e;

        /* renamed from: g */
        public volatile boolean f90460g;

        /* renamed from: h */
        public volatile boolean f90461h;

        /* renamed from: i */
        public InterfaceC23465c f90462i;

        /* renamed from: k */
        public volatile long f90464k;

        /* renamed from: j */
        public final AtomicReference<C24267a<T, R>> f90463j = new AtomicReference<>();

        /* renamed from: f */
        public final C24467c f90459f = new C24467c();

        static {
            C24267a<Object, Object> c24267a = new C24267a<>(null, -1L, 1);
            f90454l = c24267a;
            c24267a.m32452a();
        }

        public C24268b(InterfaceC23436D<? super R> interfaceC23436D, InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o, int i, boolean z) {
            this.f90455b = interfaceC23436D;
            this.f90456c = interfaceC23492o;
            this.f90457d = i;
            this.f90458e = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public void m32451a() {
            C24267a<Object, Object> c24267a;
            C24267a<T, R> c24267a2 = this.f90463j.get();
            C24267a<Object, Object> c24267a3 = f90454l;
            if (c24267a2 != c24267a3 && (c24267a = (C24267a) this.f90463j.getAndSet(c24267a3)) != c24267a3 && c24267a != null) {
                c24267a.m32452a();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x000f A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x00e9 A[SYNTHETIC] */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void m32450b() {
            InterfaceC23555j<R> interfaceC23555j;
            R r;
            boolean z;
            boolean z2;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC23436D<? super R> interfaceC23436D = this.f90455b;
            AtomicReference<C24267a<T, R>> atomicReference = this.f90463j;
            boolean z3 = this.f90458e;
            int i = 1;
            while (!this.f90461h) {
                if (this.f90460g) {
                    if (atomicReference.get() == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z3) {
                        if (z2) {
                            Throwable th = this.f90459f.get();
                            if (th != null) {
                                interfaceC23436D.onError(th);
                                return;
                            } else {
                                interfaceC23436D.onComplete();
                                return;
                            }
                        }
                    } else if (this.f90459f.get() != null) {
                        interfaceC23436D.onError(this.f90459f.m32275b());
                        return;
                    } else if (z2) {
                        interfaceC23436D.onComplete();
                        return;
                    }
                }
                C24267a<T, R> c24267a = atomicReference.get();
                if (c24267a != null && (interfaceC23555j = c24267a.f90452e) != null) {
                    if (c24267a.f90453f) {
                        boolean isEmpty = interfaceC23555j.isEmpty();
                        if (z3) {
                            if (isEmpty) {
                                C42482i24.m35337a(atomicReference, c24267a, null);
                            }
                        } else if (this.f90459f.get() != null) {
                            interfaceC23436D.onError(this.f90459f.m32275b());
                            return;
                        } else if (isEmpty) {
                            C42482i24.m35337a(atomicReference, c24267a, null);
                        }
                    }
                    boolean z4 = false;
                    while (!this.f90461h) {
                        if (c24267a == atomicReference.get()) {
                            if (!z3 && this.f90459f.get() != null) {
                                interfaceC23436D.onError(this.f90459f.m32275b());
                                return;
                            }
                            boolean z5 = c24267a.f90453f;
                            try {
                                r = interfaceC23555j.poll();
                            } catch (Throwable th2) {
                                C23475a.m33009b(th2);
                                this.f90459f.m32276a(th2);
                                C42482i24.m35337a(atomicReference, c24267a, null);
                                if (!z3) {
                                    m32451a();
                                    this.f90462i.dispose();
                                    this.f90460g = true;
                                } else {
                                    c24267a.m32452a();
                                }
                                z4 = true;
                                r = (Object) null;
                            }
                            if (r == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z5 && z) {
                                C42482i24.m35337a(atomicReference, c24267a, null);
                            } else if (z) {
                                if (!z4) {
                                    continue;
                                }
                            } else {
                                interfaceC23436D.onNext(r);
                            }
                        }
                        z4 = true;
                        if (!z4) {
                        }
                    }
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        /* renamed from: c */
        public void m32449c(C24267a<T, R> c24267a, Throwable th) {
            if (c24267a.f90450c == this.f90464k && this.f90459f.m32276a(th)) {
                if (!this.f90458e) {
                    this.f90462i.dispose();
                    this.f90460g = true;
                }
                c24267a.f90453f = true;
                m32450b();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (!this.f90461h) {
                this.f90461h = true;
                this.f90462i.dispose();
                m32451a();
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90461h;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (!this.f90460g) {
                this.f90460g = true;
                m32450b();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (!this.f90460g && this.f90459f.m32276a(th)) {
                if (!this.f90458e) {
                    m32451a();
                }
                this.f90460g = true;
                m32450b();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            C24267a<T, R> c24267a;
            long j = this.f90464k + 1;
            this.f90464k = j;
            C24267a<T, R> c24267a2 = this.f90463j.get();
            if (c24267a2 != null) {
                c24267a2.m32452a();
            }
            try {
                InterfaceC23434B interfaceC23434B = (InterfaceC23434B) C23544b.m32923e(this.f90456c.apply(t), "The ObservableSource returned is null");
                C24267a c24267a3 = new C24267a(this, j, this.f90457d);
                do {
                    c24267a = this.f90463j.get();
                    if (c24267a == f90454l) {
                        return;
                    }
                } while (!C42482i24.m35337a(this.f90463j, c24267a, c24267a3));
                interfaceC23434B.subscribe(c24267a3);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f90462i.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90462i, interfaceC23465c)) {
                this.f90462i = interfaceC23465c;
                this.f90455b.onSubscribe(this);
            }
        }
    }

    public C24266p1(InterfaceC23434B<T> interfaceC23434B, InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o, int i, boolean z) {
        super(interfaceC23434B);
        this.f90446c = interfaceC23492o;
        this.f90447d = i;
        this.f90448e = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super R> interfaceC23436D) {
        if (C24149a1.m32534b(this.f90078b, interfaceC23436D, this.f90446c)) {
            return;
        }
        this.f90078b.subscribe(new C24268b(interfaceC23436D, this.f90446c, this.f90447d, this.f90448e));
    }
}
