package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.C23505h;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.observers.AbstractC23575t;
import io.reactivex.internal.queue.C24406a;
import io.reactivex.internal.util.EnumC24479n;
import io.reactivex.observers.C24504h;
import io.reactivex.subjects.C24570i;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.observable.L1 */
/* loaded from: classes6.dex */
public final class C24049L1<T> extends AbstractC24145a<T, Observable<T>> {

    /* renamed from: c */
    public final long f89751c;

    /* renamed from: d */
    public final long f89752d;

    /* renamed from: e */
    public final TimeUnit f89753e;

    /* renamed from: f */
    public final AbstractC23437E f89754f;

    /* renamed from: g */
    public final long f89755g;

    /* renamed from: h */
    public final int f89756h;

    /* renamed from: i */
    public final boolean f89757i;

    /* renamed from: io.reactivex.internal.operators.observable.L1$a */
    /* loaded from: classes6.dex */
    public static final class C24050a<T> extends AbstractC23575t<T, Object, Observable<T>> implements InterfaceC23465c {

        /* renamed from: h */
        public final long f89758h;

        /* renamed from: i */
        public final TimeUnit f89759i;

        /* renamed from: j */
        public final AbstractC23437E f89760j;

        /* renamed from: k */
        public final int f89761k;

        /* renamed from: l */
        public final boolean f89762l;

        /* renamed from: m */
        public final long f89763m;

        /* renamed from: n */
        public final AbstractC23437E.AbstractC23440c f89764n;

        /* renamed from: o */
        public long f89765o;

        /* renamed from: p */
        public long f89766p;

        /* renamed from: q */
        public InterfaceC23465c f89767q;

        /* renamed from: r */
        public C24570i<T> f89768r;

        /* renamed from: s */
        public volatile boolean f89769s;

        /* renamed from: t */
        public final C23505h f89770t;

        /* renamed from: io.reactivex.internal.operators.observable.L1$a$a */
        /* loaded from: classes6.dex */
        public static final class RunnableC24051a implements Runnable {

            /* renamed from: b */
            public final long f89771b;

            /* renamed from: c */
            public final C24050a<?> f89772c;

            public RunnableC24051a(long j, C24050a<?> c24050a) {
                this.f89771b = j;
                this.f89772c = c24050a;
            }

            @Override // java.lang.Runnable
            public void run() {
                C24050a<?> c24050a = this.f89772c;
                if (!c24050a.f88332e) {
                    c24050a.f88331d.offer(this);
                } else {
                    c24050a.f89769s = true;
                }
                if (c24050a.m32905a()) {
                    c24050a.m32633n();
                }
            }
        }

        public C24050a(InterfaceC23436D<? super Observable<T>> interfaceC23436D, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, int i, long j2, boolean z) {
            super(interfaceC23436D, new C24406a());
            this.f89770t = new C23505h();
            this.f89758h = j;
            this.f89759i = timeUnit;
            this.f89760j = abstractC23437E;
            this.f89761k = i;
            this.f89763m = j2;
            this.f89762l = z;
            if (z) {
                this.f89764n = abstractC23437E.mo8041b();
            } else {
                this.f89764n = null;
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f88332e = true;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f88332e;
        }

        /* renamed from: m */
        public void m32634m() {
            EnumC23501d.m33000a(this.f89770t);
            AbstractC23437E.AbstractC23440c abstractC23440c = this.f89764n;
            if (abstractC23440c != null) {
                abstractC23440c.dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: n */
        public void m32633n() {
            boolean z;
            C24406a c24406a = (C24406a) this.f88331d;
            InterfaceC23436D<? super V> interfaceC23436D = this.f88330c;
            C24570i<T> c24570i = this.f89768r;
            int i = 1;
            while (!this.f89769s) {
                boolean z2 = this.f88333f;
                Object poll = c24406a.poll();
                if (poll == null) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z3 = poll instanceof RunnableC24051a;
                if (z2 && (z || z3)) {
                    this.f89768r = null;
                    c24406a.clear();
                    Throwable th = this.f88334g;
                    if (th != null) {
                        c24570i.onError(th);
                    } else {
                        c24570i.onComplete();
                    }
                    m32634m();
                    return;
                } else if (z) {
                    i = mo32234b(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (z3) {
                    RunnableC24051a runnableC24051a = (RunnableC24051a) poll;
                    if (!this.f89762l || this.f89766p == runnableC24051a.f89771b) {
                        c24570i.onComplete();
                        this.f89765o = 0L;
                        c24570i = (C24570i<T>) C24570i.m31876e(this.f89761k);
                        this.f89768r = c24570i;
                        interfaceC23436D.onNext(c24570i);
                    }
                } else {
                    c24570i.onNext(EnumC24479n.m32239i(poll));
                    long j = this.f89765o + 1;
                    if (j >= this.f89763m) {
                        this.f89766p++;
                        this.f89765o = 0L;
                        c24570i.onComplete();
                        c24570i = (C24570i<T>) C24570i.m31876e(this.f89761k);
                        this.f89768r = c24570i;
                        this.f88330c.onNext(c24570i);
                        if (this.f89762l) {
                            InterfaceC23465c interfaceC23465c = this.f89770t.get();
                            interfaceC23465c.dispose();
                            AbstractC23437E.AbstractC23440c abstractC23440c = this.f89764n;
                            RunnableC24051a runnableC24051a2 = new RunnableC24051a(this.f89766p, this);
                            long j2 = this.f89758h;
                            InterfaceC23465c m33166d = abstractC23440c.m33166d(runnableC24051a2, j2, j2, this.f89759i);
                            if (!this.f89770t.compareAndSet(interfaceC23465c, m33166d)) {
                                m33166d.dispose();
                            }
                        }
                    } else {
                        this.f89765o = j;
                    }
                }
            }
            this.f89767q.dispose();
            c24406a.clear();
            m32634m();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f88333f = true;
            if (m32905a()) {
                m32633n();
            }
            this.f88330c.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f88334g = th;
            this.f88333f = true;
            if (m32905a()) {
                m32633n();
            }
            this.f88330c.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f89769s) {
                return;
            }
            if (m32904g()) {
                C24570i<T> c24570i = this.f89768r;
                c24570i.onNext(t);
                long j = this.f89765o + 1;
                if (j >= this.f89763m) {
                    this.f89766p++;
                    this.f89765o = 0L;
                    c24570i.onComplete();
                    C24570i<T> m31876e = C24570i.m31876e(this.f89761k);
                    this.f89768r = m31876e;
                    this.f88330c.onNext(m31876e);
                    if (this.f89762l) {
                        this.f89770t.get().dispose();
                        AbstractC23437E.AbstractC23440c abstractC23440c = this.f89764n;
                        RunnableC24051a runnableC24051a = new RunnableC24051a(this.f89766p, this);
                        long j2 = this.f89758h;
                        EnumC23501d.m32998c(this.f89770t, abstractC23440c.m33166d(runnableC24051a, j2, j2, this.f89759i));
                    }
                } else {
                    this.f89765o = j;
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
            m32633n();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            InterfaceC23465c mo32326f;
            if (EnumC23501d.m32993j(this.f89767q, interfaceC23465c)) {
                this.f89767q = interfaceC23465c;
                InterfaceC23436D<? super V> interfaceC23436D = this.f88330c;
                interfaceC23436D.onSubscribe(this);
                if (this.f88332e) {
                    return;
                }
                C24570i<T> m31876e = C24570i.m31876e(this.f89761k);
                this.f89768r = m31876e;
                interfaceC23436D.onNext(m31876e);
                RunnableC24051a runnableC24051a = new RunnableC24051a(this.f89766p, this);
                if (this.f89762l) {
                    AbstractC23437E.AbstractC23440c abstractC23440c = this.f89764n;
                    long j = this.f89758h;
                    mo32326f = abstractC23440c.m33166d(runnableC24051a, j, j, this.f89759i);
                } else {
                    AbstractC23437E abstractC23437E = this.f89760j;
                    long j2 = this.f89758h;
                    mo32326f = abstractC23437E.mo32326f(runnableC24051a, j2, j2, this.f89759i);
                }
                this.f89770t.m32981a(mo32326f);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.L1$b */
    /* loaded from: classes6.dex */
    public static final class RunnableC24052b<T> extends AbstractC23575t<T, Object, Observable<T>> implements InterfaceC23465c, Runnable {

        /* renamed from: p */
        public static final Object f89773p = new Object();

        /* renamed from: h */
        public final long f89774h;

        /* renamed from: i */
        public final TimeUnit f89775i;

        /* renamed from: j */
        public final AbstractC23437E f89776j;

        /* renamed from: k */
        public final int f89777k;

        /* renamed from: l */
        public InterfaceC23465c f89778l;

        /* renamed from: m */
        public C24570i<T> f89779m;

        /* renamed from: n */
        public final C23505h f89780n;

        /* renamed from: o */
        public volatile boolean f89781o;

        public RunnableC24052b(InterfaceC23436D<? super Observable<T>> interfaceC23436D, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, int i) {
            super(interfaceC23436D, new C24406a());
            this.f89780n = new C23505h();
            this.f89774h = j;
            this.f89775i = timeUnit;
            this.f89776j = abstractC23437E;
            this.f89777k = i;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f88332e = true;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f88332e;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
            r2.onError(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
            r2.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
            r7.f89780n.dispose();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
            r7.f89779m = null;
            r0.clear();
            r0 = r7.f88334g;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
            if (r0 == null) goto L14;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void m32632k() {
            C24406a c24406a = (C24406a) this.f88331d;
            InterfaceC23436D<? super V> interfaceC23436D = this.f88330c;
            C24570i<T> c24570i = this.f89779m;
            int i = 1;
            while (true) {
                boolean z = this.f89781o;
                boolean z2 = this.f88333f;
                Object poll = c24406a.poll();
                if (!z2 || (poll != null && poll != f89773p)) {
                    if (poll == null) {
                        i = mo32234b(-i);
                        if (i == 0) {
                            return;
                        }
                    } else if (poll == f89773p) {
                        c24570i.onComplete();
                        if (!z) {
                            c24570i = (C24570i<T>) C24570i.m31876e(this.f89777k);
                            this.f89779m = c24570i;
                            interfaceC23436D.onNext(c24570i);
                        } else {
                            this.f89778l.dispose();
                        }
                    } else {
                        c24570i.onNext(EnumC24479n.m32239i(poll));
                    }
                }
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f88333f = true;
            if (m32905a()) {
                m32632k();
            }
            this.f88330c.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f88334g = th;
            this.f88333f = true;
            if (m32905a()) {
                m32632k();
            }
            this.f88330c.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f89781o) {
                return;
            }
            if (m32904g()) {
                this.f89779m.onNext(t);
                if (mo32234b(-1) == 0) {
                    return;
                }
            } else {
                this.f88331d.offer(EnumC24479n.m32236l(t));
                if (!m32905a()) {
                    return;
                }
            }
            m32632k();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89778l, interfaceC23465c)) {
                this.f89778l = interfaceC23465c;
                this.f89779m = C24570i.m31876e(this.f89777k);
                InterfaceC23436D<? super V> interfaceC23436D = this.f88330c;
                interfaceC23436D.onSubscribe(this);
                interfaceC23436D.onNext(this.f89779m);
                if (!this.f88332e) {
                    AbstractC23437E abstractC23437E = this.f89776j;
                    long j = this.f89774h;
                    this.f89780n.m32981a(abstractC23437E.mo32326f(this, j, j, this.f89775i));
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f88332e) {
                this.f89781o = true;
            }
            this.f88331d.offer(f89773p);
            if (m32905a()) {
                m32632k();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.L1$c */
    /* loaded from: classes6.dex */
    public static final class RunnableC24053c<T> extends AbstractC23575t<T, Object, Observable<T>> implements InterfaceC23465c, Runnable {

        /* renamed from: h */
        public final long f89782h;

        /* renamed from: i */
        public final long f89783i;

        /* renamed from: j */
        public final TimeUnit f89784j;

        /* renamed from: k */
        public final AbstractC23437E.AbstractC23440c f89785k;

        /* renamed from: l */
        public final int f89786l;

        /* renamed from: m */
        public final List<C24570i<T>> f89787m;

        /* renamed from: n */
        public InterfaceC23465c f89788n;

        /* renamed from: o */
        public volatile boolean f89789o;

        /* renamed from: io.reactivex.internal.operators.observable.L1$c$a */
        /* loaded from: classes6.dex */
        public final class RunnableC24054a implements Runnable {

            /* renamed from: b */
            public final C24570i<T> f89790b;

            public RunnableC24054a(C24570i<T> c24570i) {
                this.f89790b = c24570i;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC24053c.this.m32631k(this.f89790b);
            }
        }

        /* renamed from: io.reactivex.internal.operators.observable.L1$c$b */
        /* loaded from: classes6.dex */
        public static final class C24055b<T> {

            /* renamed from: a */
            public final C24570i<T> f89792a;

            /* renamed from: b */
            public final boolean f89793b;

            public C24055b(C24570i<T> c24570i, boolean z) {
                this.f89792a = c24570i;
                this.f89793b = z;
            }
        }

        public RunnableC24053c(InterfaceC23436D<? super Observable<T>> interfaceC23436D, long j, long j2, TimeUnit timeUnit, AbstractC23437E.AbstractC23440c abstractC23440c, int i) {
            super(interfaceC23436D, new C24406a());
            this.f89782h = j;
            this.f89783i = j2;
            this.f89784j = timeUnit;
            this.f89785k = abstractC23440c;
            this.f89786l = i;
            this.f89787m = new LinkedList();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f88332e = true;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f88332e;
        }

        /* renamed from: k */
        public void m32631k(C24570i<T> c24570i) {
            this.f88331d.offer(new C24055b(c24570i, false));
            if (m32905a()) {
                m32630l();
            }
        }

        /* renamed from: l */
        public void m32630l() {
            boolean z;
            C24406a c24406a = (C24406a) this.f88331d;
            InterfaceC23436D<? super V> interfaceC23436D = this.f88330c;
            List<C24570i<T>> list = this.f89787m;
            int i = 1;
            while (!this.f89789o) {
                boolean z2 = this.f88333f;
                T t = (T) c24406a.poll();
                if (t == null) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z3 = t instanceof C24055b;
                if (z2 && (z || z3)) {
                    c24406a.clear();
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
                    this.f89785k.dispose();
                    return;
                } else if (z) {
                    i = mo32234b(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (z3) {
                    C24055b c24055b = (C24055b) t;
                    if (c24055b.f89793b) {
                        if (!this.f88332e) {
                            C24570i<T> m31876e = C24570i.m31876e(this.f89786l);
                            list.add(m31876e);
                            interfaceC23436D.onNext(m31876e);
                            this.f89785k.mo32319c(new RunnableC24054a(m31876e), this.f89782h, this.f89784j);
                        }
                    } else {
                        list.remove(c24055b.f89792a);
                        c24055b.f89792a.onComplete();
                        if (list.isEmpty() && this.f88332e) {
                            this.f89789o = true;
                        }
                    }
                } else {
                    for (C24570i<T> c24570i3 : list) {
                        c24570i3.onNext(t);
                    }
                }
            }
            this.f89788n.dispose();
            c24406a.clear();
            list.clear();
            this.f89785k.dispose();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f88333f = true;
            if (m32905a()) {
                m32630l();
            }
            this.f88330c.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f88334g = th;
            this.f88333f = true;
            if (m32905a()) {
                m32630l();
            }
            this.f88330c.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (m32904g()) {
                for (C24570i<T> c24570i : this.f89787m) {
                    c24570i.onNext(t);
                }
                if (mo32234b(-1) == 0) {
                    return;
                }
            } else {
                this.f88331d.offer(t);
                if (!m32905a()) {
                    return;
                }
            }
            m32630l();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89788n, interfaceC23465c)) {
                this.f89788n = interfaceC23465c;
                this.f88330c.onSubscribe(this);
                if (this.f88332e) {
                    return;
                }
                C24570i<T> m31876e = C24570i.m31876e(this.f89786l);
                this.f89787m.add(m31876e);
                this.f88330c.onNext(m31876e);
                this.f89785k.mo32319c(new RunnableC24054a(m31876e), this.f89782h, this.f89784j);
                AbstractC23437E.AbstractC23440c abstractC23440c = this.f89785k;
                long j = this.f89783i;
                abstractC23440c.m33166d(this, j, j, this.f89784j);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            C24055b c24055b = new C24055b(C24570i.m31876e(this.f89786l), true);
            if (!this.f88332e) {
                this.f88331d.offer(c24055b);
            }
            if (m32905a()) {
                m32630l();
            }
        }
    }

    public C24049L1(InterfaceC23434B<T> interfaceC23434B, long j, long j2, TimeUnit timeUnit, AbstractC23437E abstractC23437E, long j3, int i, boolean z) {
        super(interfaceC23434B);
        this.f89751c = j;
        this.f89752d = j2;
        this.f89753e = timeUnit;
        this.f89754f = abstractC23437E;
        this.f89755g = j3;
        this.f89756h = i;
        this.f89757i = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super Observable<T>> interfaceC23436D) {
        C24504h c24504h = new C24504h(interfaceC23436D);
        long j = this.f89751c;
        long j2 = this.f89752d;
        if (j == j2) {
            long j3 = this.f89755g;
            if (j3 == LongCompanionObject.MAX_VALUE) {
                this.f90078b.subscribe(new RunnableC24052b(c24504h, this.f89751c, this.f89753e, this.f89754f, this.f89756h));
                return;
            } else {
                this.f90078b.subscribe(new C24050a(c24504h, j, this.f89753e, this.f89754f, this.f89756h, j3, this.f89757i));
                return;
            }
        }
        this.f90078b.subscribe(new RunnableC24053c(c24504h, j, j2, this.f89753e, this.f89754f.mo8041b(), this.f89756h));
    }
}
