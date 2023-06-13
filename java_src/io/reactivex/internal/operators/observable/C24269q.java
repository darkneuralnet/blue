package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.observers.AbstractC23575t;
import io.reactivex.internal.queue.C24406a;
import io.reactivex.internal.util.C24487s;
import io.reactivex.observers.C24504h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.q */
/* loaded from: classes6.dex */
public final class C24269q<T, U extends Collection<? super T>> extends AbstractC24145a<T, U> {

    /* renamed from: c */
    public final long f90465c;

    /* renamed from: d */
    public final long f90466d;

    /* renamed from: e */
    public final TimeUnit f90467e;

    /* renamed from: f */
    public final AbstractC23437E f90468f;

    /* renamed from: g */
    public final Callable<U> f90469g;

    /* renamed from: h */
    public final int f90470h;

    /* renamed from: i */
    public final boolean f90471i;

    /* renamed from: io.reactivex.internal.operators.observable.q$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC24270a<T, U extends Collection<? super T>> extends AbstractC23575t<T, U, U> implements Runnable, InterfaceC23465c {

        /* renamed from: h */
        public final Callable<U> f90472h;

        /* renamed from: i */
        public final long f90473i;

        /* renamed from: j */
        public final TimeUnit f90474j;

        /* renamed from: k */
        public final int f90475k;

        /* renamed from: l */
        public final boolean f90476l;

        /* renamed from: m */
        public final AbstractC23437E.AbstractC23440c f90477m;

        /* renamed from: n */
        public U f90478n;

        /* renamed from: o */
        public InterfaceC23465c f90479o;

        /* renamed from: p */
        public InterfaceC23465c f90480p;

        /* renamed from: q */
        public long f90481q;

        /* renamed from: r */
        public long f90482r;

        public RunnableC24270a(InterfaceC23436D<? super U> interfaceC23436D, Callable<U> callable, long j, TimeUnit timeUnit, int i, boolean z, AbstractC23437E.AbstractC23440c abstractC23440c) {
            super(interfaceC23436D, new C24406a());
            this.f90472h = callable;
            this.f90473i = j;
            this.f90474j = timeUnit;
            this.f90475k = i;
            this.f90476l = z;
            this.f90477m = abstractC23440c;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (!this.f88332e) {
                this.f88332e = true;
                this.f90480p.dispose();
                this.f90477m.dispose();
                synchronized (this) {
                    this.f90478n = null;
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f88332e;
        }

        @Override // io.reactivex.internal.observers.AbstractC23575t, io.reactivex.internal.util.InterfaceC24483o
        /* renamed from: k */
        public void mo32232d(InterfaceC23436D<? super U> interfaceC23436D, U u) {
            interfaceC23436D.onNext(u);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            U u;
            this.f90477m.dispose();
            synchronized (this) {
                u = this.f90478n;
                this.f90478n = null;
            }
            if (u != null) {
                this.f88331d.offer(u);
                this.f88333f = true;
                if (m32905a()) {
                    C24487s.m32213d(this.f88331d, this.f88330c, false, this, this);
                }
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            synchronized (this) {
                this.f90478n = null;
            }
            this.f88330c.onError(th);
            this.f90477m.dispose();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            synchronized (this) {
                U u = this.f90478n;
                if (u == null) {
                    return;
                }
                u.add(t);
                if (u.size() < this.f90475k) {
                    return;
                }
                this.f90478n = null;
                this.f90481q++;
                if (this.f90476l) {
                    this.f90479o.dispose();
                }
                m32902i(u, false, this);
                try {
                    U u2 = (U) C23544b.m32923e(this.f90472h.call(), "The buffer supplied is null");
                    synchronized (this) {
                        this.f90478n = u2;
                        this.f90482r++;
                    }
                    if (this.f90476l) {
                        AbstractC23437E.AbstractC23440c abstractC23440c = this.f90477m;
                        long j = this.f90473i;
                        this.f90479o = abstractC23440c.m33166d(this, j, j, this.f90474j);
                    }
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    this.f88330c.onError(th);
                    dispose();
                }
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90480p, interfaceC23465c)) {
                this.f90480p = interfaceC23465c;
                try {
                    this.f90478n = (U) C23544b.m32923e(this.f90472h.call(), "The buffer supplied is null");
                    this.f88330c.onSubscribe(this);
                    AbstractC23437E.AbstractC23440c abstractC23440c = this.f90477m;
                    long j = this.f90473i;
                    this.f90479o = abstractC23440c.m33166d(this, j, j, this.f90474j);
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    interfaceC23465c.dispose();
                    EnumC23502e.m32987i(th, this.f88330c);
                    this.f90477m.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u = (U) C23544b.m32923e(this.f90472h.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    U u2 = this.f90478n;
                    if (u2 != null && this.f90481q == this.f90482r) {
                        this.f90478n = u;
                        m32902i(u2, false, this);
                    }
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                dispose();
                this.f88330c.onError(th);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.q$b */
    /* loaded from: classes6.dex */
    public static final class RunnableC24271b<T, U extends Collection<? super T>> extends AbstractC23575t<T, U, U> implements Runnable, InterfaceC23465c {

        /* renamed from: h */
        public final Callable<U> f90483h;

        /* renamed from: i */
        public final long f90484i;

        /* renamed from: j */
        public final TimeUnit f90485j;

        /* renamed from: k */
        public final AbstractC23437E f90486k;

        /* renamed from: l */
        public InterfaceC23465c f90487l;

        /* renamed from: m */
        public U f90488m;

        /* renamed from: n */
        public final AtomicReference<InterfaceC23465c> f90489n;

        public RunnableC24271b(InterfaceC23436D<? super U> interfaceC23436D, Callable<U> callable, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
            super(interfaceC23436D, new C24406a());
            this.f90489n = new AtomicReference<>();
            this.f90483h = callable;
            this.f90484i = j;
            this.f90485j = timeUnit;
            this.f90486k = abstractC23437E;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this.f90489n);
            this.f90487l.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90489n.get() == EnumC23501d.DISPOSED;
        }

        @Override // io.reactivex.internal.observers.AbstractC23575t, io.reactivex.internal.util.InterfaceC24483o
        /* renamed from: k */
        public void mo32232d(InterfaceC23436D<? super U> interfaceC23436D, U u) {
            this.f88330c.onNext(u);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            U u;
            synchronized (this) {
                u = this.f90488m;
                this.f90488m = null;
            }
            if (u != null) {
                this.f88331d.offer(u);
                this.f88333f = true;
                if (m32905a()) {
                    C24487s.m32213d(this.f88331d, this.f88330c, false, null, this);
                }
            }
            EnumC23501d.m33000a(this.f90489n);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            synchronized (this) {
                this.f90488m = null;
            }
            this.f88330c.onError(th);
            EnumC23501d.m33000a(this.f90489n);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            synchronized (this) {
                U u = this.f90488m;
                if (u == null) {
                    return;
                }
                u.add(t);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90487l, interfaceC23465c)) {
                this.f90487l = interfaceC23465c;
                try {
                    this.f90488m = (U) C23544b.m32923e(this.f90483h.call(), "The buffer supplied is null");
                    this.f88330c.onSubscribe(this);
                    if (!this.f88332e) {
                        AbstractC23437E abstractC23437E = this.f90486k;
                        long j = this.f90484i;
                        InterfaceC23465c mo32326f = abstractC23437E.mo32326f(this, j, j, this.f90485j);
                        if (!C42482i24.m35337a(this.f90489n, null, mo32326f)) {
                            mo32326f.dispose();
                        }
                    }
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    dispose();
                    EnumC23502e.m32987i(th, this.f88330c);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            U u;
            try {
                U u2 = (U) C23544b.m32923e(this.f90483h.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    u = this.f90488m;
                    if (u != null) {
                        this.f90488m = u2;
                    }
                }
                if (u == null) {
                    EnumC23501d.m33000a(this.f90489n);
                } else {
                    m32903h(u, false, this);
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f88330c.onError(th);
                dispose();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.q$c */
    /* loaded from: classes6.dex */
    public static final class RunnableC24272c<T, U extends Collection<? super T>> extends AbstractC23575t<T, U, U> implements Runnable, InterfaceC23465c {

        /* renamed from: h */
        public final Callable<U> f90490h;

        /* renamed from: i */
        public final long f90491i;

        /* renamed from: j */
        public final long f90492j;

        /* renamed from: k */
        public final TimeUnit f90493k;

        /* renamed from: l */
        public final AbstractC23437E.AbstractC23440c f90494l;

        /* renamed from: m */
        public final List<U> f90495m;

        /* renamed from: n */
        public InterfaceC23465c f90496n;

        /* renamed from: io.reactivex.internal.operators.observable.q$c$a */
        /* loaded from: classes6.dex */
        public final class RunnableC24273a implements Runnable {

            /* renamed from: b */
            public final U f90497b;

            public RunnableC24273a(U u) {
                this.f90497b = u;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (RunnableC24272c.this) {
                    RunnableC24272c.this.f90495m.remove(this.f90497b);
                }
                RunnableC24272c runnableC24272c = RunnableC24272c.this;
                runnableC24272c.m32902i(this.f90497b, false, runnableC24272c.f90494l);
            }
        }

        /* renamed from: io.reactivex.internal.operators.observable.q$c$b */
        /* loaded from: classes6.dex */
        public final class RunnableC24274b implements Runnable {

            /* renamed from: b */
            public final U f90499b;

            public RunnableC24274b(U u) {
                this.f90499b = u;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (RunnableC24272c.this) {
                    RunnableC24272c.this.f90495m.remove(this.f90499b);
                }
                RunnableC24272c runnableC24272c = RunnableC24272c.this;
                runnableC24272c.m32902i(this.f90499b, false, runnableC24272c.f90494l);
            }
        }

        public RunnableC24272c(InterfaceC23436D<? super U> interfaceC23436D, Callable<U> callable, long j, long j2, TimeUnit timeUnit, AbstractC23437E.AbstractC23440c abstractC23440c) {
            super(interfaceC23436D, new C24406a());
            this.f90490h = callable;
            this.f90491i = j;
            this.f90492j = j2;
            this.f90493k = timeUnit;
            this.f90494l = abstractC23440c;
            this.f90495m = new LinkedList();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (!this.f88332e) {
                this.f88332e = true;
                m32443n();
                this.f90496n.dispose();
                this.f90494l.dispose();
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f88332e;
        }

        @Override // io.reactivex.internal.observers.AbstractC23575t, io.reactivex.internal.util.InterfaceC24483o
        /* renamed from: k */
        public void mo32232d(InterfaceC23436D<? super U> interfaceC23436D, U u) {
            interfaceC23436D.onNext(u);
        }

        /* renamed from: n */
        public void m32443n() {
            synchronized (this) {
                this.f90495m.clear();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            ArrayList<Collection> arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f90495m);
                this.f90495m.clear();
            }
            for (Collection collection : arrayList) {
                this.f88331d.offer(collection);
            }
            this.f88333f = true;
            if (m32905a()) {
                C24487s.m32213d(this.f88331d, this.f88330c, false, this.f90494l, this);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f88333f = true;
            m32443n();
            this.f88330c.onError(th);
            this.f90494l.dispose();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            synchronized (this) {
                for (U u : this.f90495m) {
                    u.add(t);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90496n, interfaceC23465c)) {
                this.f90496n = interfaceC23465c;
                try {
                    Collection collection = (Collection) C23544b.m32923e(this.f90490h.call(), "The buffer supplied is null");
                    this.f90495m.add(collection);
                    this.f88330c.onSubscribe(this);
                    AbstractC23437E.AbstractC23440c abstractC23440c = this.f90494l;
                    long j = this.f90492j;
                    abstractC23440c.m33166d(this, j, j, this.f90493k);
                    this.f90494l.mo32319c(new RunnableC24274b(collection), this.f90491i, this.f90493k);
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    interfaceC23465c.dispose();
                    EnumC23502e.m32987i(th, this.f88330c);
                    this.f90494l.dispose();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            if (this.f88332e) {
                return;
            }
            try {
                Collection collection = (Collection) C23544b.m32923e(this.f90490h.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    if (this.f88332e) {
                        return;
                    }
                    this.f90495m.add(collection);
                    this.f90494l.mo32319c(new RunnableC24273a(collection), this.f90491i, this.f90493k);
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f88330c.onError(th);
                dispose();
            }
        }
    }

    public C24269q(InterfaceC23434B<T> interfaceC23434B, long j, long j2, TimeUnit timeUnit, AbstractC23437E abstractC23437E, Callable<U> callable, int i, boolean z) {
        super(interfaceC23434B);
        this.f90465c = j;
        this.f90466d = j2;
        this.f90467e = timeUnit;
        this.f90468f = abstractC23437E;
        this.f90469g = callable;
        this.f90470h = i;
        this.f90471i = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super U> interfaceC23436D) {
        if (this.f90465c == this.f90466d && this.f90470h == Integer.MAX_VALUE) {
            this.f90078b.subscribe(new RunnableC24271b(new C24504h(interfaceC23436D), this.f90469g, this.f90465c, this.f90467e, this.f90468f));
            return;
        }
        AbstractC23437E.AbstractC23440c mo8041b = this.f90468f.mo8041b();
        if (this.f90465c == this.f90466d) {
            this.f90078b.subscribe(new RunnableC24270a(new C24504h(interfaceC23436D), this.f90469g, this.f90465c, this.f90467e, this.f90470h, this.f90471i, mo8041b));
        } else {
            this.f90078b.subscribe(new RunnableC24272c(new C24504h(interfaceC23436D), this.f90469g, this.f90465c, this.f90466d, this.f90467e, mo8041b));
        }
    }
}
