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
import io.reactivex.internal.util.EnumC24474j;
import io.reactivex.observers.C24504h;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.v */
/* loaded from: classes6.dex */
public final class C24305v<T, U> extends AbstractC24145a<T, U> {

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends U>> f90629c;

    /* renamed from: d */
    public final int f90630d;

    /* renamed from: e */
    public final EnumC24474j f90631e;

    /* renamed from: io.reactivex.internal.operators.observable.v$a */
    /* loaded from: classes6.dex */
    public static final class C24306a<T, R> extends AtomicInteger implements InterfaceC23436D<T>, InterfaceC23465c {
        private static final long serialVersionUID = -6951100001833242599L;

        /* renamed from: b */
        public final InterfaceC23436D<? super R> f90632b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> f90633c;

        /* renamed from: d */
        public final int f90634d;

        /* renamed from: e */
        public final C24467c f90635e = new C24467c();

        /* renamed from: f */
        public final C24307a<R> f90636f;

        /* renamed from: g */
        public final boolean f90637g;

        /* renamed from: h */
        public InterfaceC23555j<T> f90638h;

        /* renamed from: i */
        public InterfaceC23465c f90639i;

        /* renamed from: j */
        public volatile boolean f90640j;

        /* renamed from: k */
        public volatile boolean f90641k;

        /* renamed from: l */
        public volatile boolean f90642l;

        /* renamed from: m */
        public int f90643m;

        /* renamed from: io.reactivex.internal.operators.observable.v$a$a */
        /* loaded from: classes6.dex */
        public static final class C24307a<R> extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<R> {
            private static final long serialVersionUID = 2620149119579502636L;

            /* renamed from: b */
            public final InterfaceC23436D<? super R> f90644b;

            /* renamed from: c */
            public final C24306a<?, R> f90645c;

            public C24307a(InterfaceC23436D<? super R> interfaceC23436D, C24306a<?, R> c24306a) {
                this.f90644b = interfaceC23436D;
                this.f90645c = c24306a;
            }

            /* renamed from: a */
            public void m32414a() {
                EnumC23501d.m33000a(this);
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onComplete() {
                C24306a<?, R> c24306a = this.f90645c;
                c24306a.f90640j = false;
                c24306a.m32415a();
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onError(Throwable th) {
                C24306a<?, R> c24306a = this.f90645c;
                if (c24306a.f90635e.m32276a(th)) {
                    if (!c24306a.f90637g) {
                        c24306a.f90639i.dispose();
                    }
                    c24306a.f90640j = false;
                    c24306a.m32415a();
                    return;
                }
                C24508a.m31988u(th);
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onNext(R r) {
                this.f90644b.onNext(r);
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32998c(this, interfaceC23465c);
            }
        }

        public C24306a(InterfaceC23436D<? super R> interfaceC23436D, InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o, int i, boolean z) {
            this.f90632b = interfaceC23436D;
            this.f90633c = interfaceC23492o;
            this.f90634d = i;
            this.f90637g = z;
            this.f90636f = new C24307a<>(interfaceC23436D, this);
        }

        /* renamed from: a */
        public void m32415a() {
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC23436D<? super R> interfaceC23436D = this.f90632b;
            InterfaceC23555j<T> interfaceC23555j = this.f90638h;
            C24467c c24467c = this.f90635e;
            while (true) {
                if (!this.f90640j) {
                    if (this.f90642l) {
                        interfaceC23555j.clear();
                        return;
                    } else if (!this.f90637g && c24467c.get() != null) {
                        interfaceC23555j.clear();
                        this.f90642l = true;
                        interfaceC23436D.onError(c24467c.m32275b());
                        return;
                    } else {
                        boolean z2 = this.f90641k;
                        try {
                            T poll = interfaceC23555j.poll();
                            if (poll == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z2 && z) {
                                this.f90642l = true;
                                Throwable m32275b = c24467c.m32275b();
                                if (m32275b != null) {
                                    interfaceC23436D.onError(m32275b);
                                    return;
                                } else {
                                    interfaceC23436D.onComplete();
                                    return;
                                }
                            } else if (!z) {
                                try {
                                    InterfaceC23434B interfaceC23434B = (InterfaceC23434B) C23544b.m32923e(this.f90633c.apply(poll), "The mapper returned a null ObservableSource");
                                    if (interfaceC23434B instanceof Callable) {
                                        try {
                                            Object obj = (Object) ((Callable) interfaceC23434B).call();
                                            if (obj != 0 && !this.f90642l) {
                                                interfaceC23436D.onNext(obj);
                                            }
                                        } catch (Throwable th) {
                                            C23475a.m33009b(th);
                                            c24467c.m32276a(th);
                                        }
                                    } else {
                                        this.f90640j = true;
                                        interfaceC23434B.subscribe(this.f90636f);
                                    }
                                } catch (Throwable th2) {
                                    C23475a.m33009b(th2);
                                    this.f90642l = true;
                                    this.f90639i.dispose();
                                    interfaceC23555j.clear();
                                    c24467c.m32276a(th2);
                                    interfaceC23436D.onError(c24467c.m32275b());
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            C23475a.m33009b(th3);
                            this.f90642l = true;
                            this.f90639i.dispose();
                            c24467c.m32276a(th3);
                            interfaceC23436D.onError(c24467c.m32275b());
                            return;
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90642l = true;
            this.f90639i.dispose();
            this.f90636f.m32414a();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90642l;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90641k = true;
            m32415a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f90635e.m32276a(th)) {
                this.f90641k = true;
                m32415a();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f90643m == 0) {
                this.f90638h.offer(t);
            }
            m32415a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90639i, interfaceC23465c)) {
                this.f90639i = interfaceC23465c;
                if (interfaceC23465c instanceof InterfaceC23550e) {
                    InterfaceC23550e interfaceC23550e = (InterfaceC23550e) interfaceC23465c;
                    int mo31868b = interfaceC23550e.mo31868b(3);
                    if (mo31868b == 1) {
                        this.f90643m = mo31868b;
                        this.f90638h = interfaceC23550e;
                        this.f90641k = true;
                        this.f90632b.onSubscribe(this);
                        m32415a();
                        return;
                    } else if (mo31868b == 2) {
                        this.f90643m = mo31868b;
                        this.f90638h = interfaceC23550e;
                        this.f90632b.onSubscribe(this);
                        return;
                    }
                }
                this.f90638h = new C24409c(this.f90634d);
                this.f90632b.onSubscribe(this);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.v$b */
    /* loaded from: classes6.dex */
    public static final class C24308b<T, U> extends AtomicInteger implements InterfaceC23436D<T>, InterfaceC23465c {
        private static final long serialVersionUID = 8828587559905699186L;

        /* renamed from: b */
        public final InterfaceC23436D<? super U> f90646b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends U>> f90647c;

        /* renamed from: d */
        public final C24309a<U> f90648d;

        /* renamed from: e */
        public final int f90649e;

        /* renamed from: f */
        public InterfaceC23555j<T> f90650f;

        /* renamed from: g */
        public InterfaceC23465c f90651g;

        /* renamed from: h */
        public volatile boolean f90652h;

        /* renamed from: i */
        public volatile boolean f90653i;

        /* renamed from: j */
        public volatile boolean f90654j;

        /* renamed from: k */
        public int f90655k;

        /* renamed from: io.reactivex.internal.operators.observable.v$b$a */
        /* loaded from: classes6.dex */
        public static final class C24309a<U> extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<U> {
            private static final long serialVersionUID = -7449079488798789337L;

            /* renamed from: b */
            public final InterfaceC23436D<? super U> f90656b;

            /* renamed from: c */
            public final C24308b<?, ?> f90657c;

            public C24309a(InterfaceC23436D<? super U> interfaceC23436D, C24308b<?, ?> c24308b) {
                this.f90656b = interfaceC23436D;
                this.f90657c = c24308b;
            }

            /* renamed from: a */
            public void m32411a() {
                EnumC23501d.m33000a(this);
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onComplete() {
                this.f90657c.m32412b();
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onError(Throwable th) {
                this.f90657c.dispose();
                this.f90656b.onError(th);
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onNext(U u) {
                this.f90656b.onNext(u);
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32998c(this, interfaceC23465c);
            }
        }

        public C24308b(InterfaceC23436D<? super U> interfaceC23436D, InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends U>> interfaceC23492o, int i) {
            this.f90646b = interfaceC23436D;
            this.f90647c = interfaceC23492o;
            this.f90649e = i;
            this.f90648d = new C24309a<>(interfaceC23436D, this);
        }

        /* renamed from: a */
        public void m32413a() {
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.f90653i) {
                if (!this.f90652h) {
                    boolean z2 = this.f90654j;
                    try {
                        T poll = this.f90650f.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z2 && z) {
                            this.f90653i = true;
                            this.f90646b.onComplete();
                            return;
                        } else if (!z) {
                            try {
                                InterfaceC23434B interfaceC23434B = (InterfaceC23434B) C23544b.m32923e(this.f90647c.apply(poll), "The mapper returned a null ObservableSource");
                                this.f90652h = true;
                                interfaceC23434B.subscribe(this.f90648d);
                            } catch (Throwable th) {
                                C23475a.m33009b(th);
                                dispose();
                                this.f90650f.clear();
                                this.f90646b.onError(th);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        C23475a.m33009b(th2);
                        dispose();
                        this.f90650f.clear();
                        this.f90646b.onError(th2);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f90650f.clear();
        }

        /* renamed from: b */
        public void m32412b() {
            this.f90652h = false;
            m32413a();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90653i = true;
            this.f90648d.m32411a();
            this.f90651g.dispose();
            if (getAndIncrement() == 0) {
                this.f90650f.clear();
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90653i;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f90654j) {
                return;
            }
            this.f90654j = true;
            m32413a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f90654j) {
                C24508a.m31988u(th);
                return;
            }
            this.f90654j = true;
            dispose();
            this.f90646b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f90654j) {
                return;
            }
            if (this.f90655k == 0) {
                this.f90650f.offer(t);
            }
            m32413a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90651g, interfaceC23465c)) {
                this.f90651g = interfaceC23465c;
                if (interfaceC23465c instanceof InterfaceC23550e) {
                    InterfaceC23550e interfaceC23550e = (InterfaceC23550e) interfaceC23465c;
                    int mo31868b = interfaceC23550e.mo31868b(3);
                    if (mo31868b == 1) {
                        this.f90655k = mo31868b;
                        this.f90650f = interfaceC23550e;
                        this.f90654j = true;
                        this.f90646b.onSubscribe(this);
                        m32413a();
                        return;
                    } else if (mo31868b == 2) {
                        this.f90655k = mo31868b;
                        this.f90650f = interfaceC23550e;
                        this.f90646b.onSubscribe(this);
                        return;
                    }
                }
                this.f90650f = new C24409c(this.f90649e);
                this.f90646b.onSubscribe(this);
            }
        }
    }

    public C24305v(InterfaceC23434B<T> interfaceC23434B, InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends U>> interfaceC23492o, int i, EnumC24474j enumC24474j) {
        super(interfaceC23434B);
        this.f90629c = interfaceC23492o;
        this.f90631e = enumC24474j;
        this.f90630d = Math.max(8, i);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super U> interfaceC23436D) {
        boolean z;
        if (C24149a1.m32534b(this.f90078b, interfaceC23436D, this.f90629c)) {
            return;
        }
        if (this.f90631e == EnumC24474j.IMMEDIATE) {
            this.f90078b.subscribe(new C24308b(new C24504h(interfaceC23436D), this.f90629c, this.f90630d));
            return;
        }
        InterfaceC23434B<T> interfaceC23434B = this.f90078b;
        InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends U>> interfaceC23492o = this.f90629c;
        int i = this.f90630d;
        if (this.f90631e == EnumC24474j.END) {
            z = true;
        } else {
            z = false;
        }
        interfaceC23434B.subscribe(new C24306a(interfaceC23436D, interfaceC23492o, i, z));
    }
}
