package p000;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p000.C33747Jd1;
import p000.C49998uj1;
import p000.RunnableC48084rV0;
/* renamed from: Fd1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C32811Fd1<R> implements RunnableC48084rV0.InterfaceC27935b<R>, C49998uj1.InterfaceC29291f {

    /* renamed from: A */
    public static final C2368c f9798A = new C2368c();

    /* renamed from: b */
    public final C2370e f9799b;

    /* renamed from: c */
    public final LP5 f9800c;

    /* renamed from: d */
    public final C33747Jd1.InterfaceC4169a f9801d;

    /* renamed from: e */
    public final InterfaceC41591gY3<C32811Fd1<?>> f9802e;

    /* renamed from: f */
    public final C2368c f9803f;

    /* renamed from: g */
    public final InterfaceC33045Gd1 f9804g;

    /* renamed from: h */
    public final KC1 f9805h;

    /* renamed from: i */
    public final KC1 f9806i;

    /* renamed from: j */
    public final KC1 f9807j;

    /* renamed from: k */
    public final KC1 f9808k;

    /* renamed from: l */
    public final AtomicInteger f9809l;

    /* renamed from: m */
    public InterfaceC38133ak2 f9810m;

    /* renamed from: n */
    public boolean f9811n;

    /* renamed from: o */
    public boolean f9812o;

    /* renamed from: p */
    public boolean f9813p;

    /* renamed from: q */
    public boolean f9814q;

    /* renamed from: r */
    public VL4<?> f9815r;

    /* renamed from: s */
    public ZS0 f9816s;

    /* renamed from: t */
    public boolean f9817t;

    /* renamed from: u */
    public GlideException f9818u;

    /* renamed from: v */
    public boolean f9819v;

    /* renamed from: w */
    public C33747Jd1<?> f9820w;

    /* renamed from: x */
    public RunnableC48084rV0<R> f9821x;

    /* renamed from: y */
    public volatile boolean f9822y;

    /* renamed from: z */
    public boolean f9823z;

    /* renamed from: Fd1$a */
    /* loaded from: classes5.dex */
    public class RunnableC2366a implements Runnable {

        /* renamed from: b */
        public final ZL4 f9824b;

        public RunnableC2366a(ZL4 zl4) {
            this.f9824b = zl4;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f9824b.mo26184g()) {
                synchronized (C32811Fd1.this) {
                    if (C32811Fd1.this.f9799b.m106855b(this.f9824b)) {
                        C32811Fd1.this.m106871f(this.f9824b);
                    }
                    C32811Fd1.this.m106868i();
                }
            }
        }
    }

    /* renamed from: Fd1$b */
    /* loaded from: classes5.dex */
    public class RunnableC2367b implements Runnable {

        /* renamed from: b */
        public final ZL4 f9826b;

        public RunnableC2367b(ZL4 zl4) {
            this.f9826b = zl4;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f9826b.mo26184g()) {
                synchronized (C32811Fd1.this) {
                    if (C32811Fd1.this.f9799b.m106855b(this.f9826b)) {
                        C32811Fd1.this.f9820w.m100105c();
                        C32811Fd1.this.m106870g(this.f9826b);
                        C32811Fd1.this.m106859r(this.f9826b);
                    }
                    C32811Fd1.this.m106868i();
                }
            }
        }
    }

    /* renamed from: Fd1$c */
    /* loaded from: classes5.dex */
    public static class C2368c {
        /* renamed from: a */
        public <R> C33747Jd1<R> m106857a(VL4<R> vl4, boolean z, InterfaceC38133ak2 interfaceC38133ak2, C33747Jd1.InterfaceC4169a interfaceC4169a) {
            return new C33747Jd1<>(vl4, z, true, interfaceC38133ak2, interfaceC4169a);
        }
    }

    /* renamed from: Fd1$d */
    /* loaded from: classes5.dex */
    public static final class C2369d {

        /* renamed from: a */
        public final ZL4 f9828a;

        /* renamed from: b */
        public final Executor f9829b;

        public C2369d(ZL4 zl4, Executor executor) {
            this.f9828a = zl4;
            this.f9829b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C2369d) {
                return this.f9828a.equals(((C2369d) obj).f9828a);
            }
            return false;
        }

        public int hashCode() {
            return this.f9828a.hashCode();
        }
    }

    /* renamed from: Fd1$e */
    /* loaded from: classes5.dex */
    public static final class C2370e implements Iterable<C2369d> {

        /* renamed from: b */
        public final List<C2369d> f9830b;

        public C2370e() {
            this(new ArrayList(2));
        }

        /* renamed from: e */
        public static C2369d m106853e(ZL4 zl4) {
            return new C2369d(zl4, C33783Jh1.m100021a());
        }

        /* renamed from: a */
        public void m106856a(ZL4 zl4, Executor executor) {
            this.f9830b.add(new C2369d(zl4, executor));
        }

        /* renamed from: b */
        public boolean m106855b(ZL4 zl4) {
            return this.f9830b.contains(m106853e(zl4));
        }

        /* renamed from: c */
        public C2370e m106854c() {
            return new C2370e(new ArrayList(this.f9830b));
        }

        public void clear() {
            this.f9830b.clear();
        }

        /* renamed from: f */
        public void m106852f(ZL4 zl4) {
            this.f9830b.remove(m106853e(zl4));
        }

        public boolean isEmpty() {
            return this.f9830b.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator<C2369d> iterator() {
            return this.f9830b.iterator();
        }

        public int size() {
            return this.f9830b.size();
        }

        public C2370e(List<C2369d> list) {
            this.f9830b = list;
        }
    }

    public C32811Fd1(KC1 kc1, KC1 kc12, KC1 kc13, KC1 kc14, InterfaceC33045Gd1 interfaceC33045Gd1, C33747Jd1.InterfaceC4169a interfaceC4169a, InterfaceC41591gY3<C32811Fd1<?>> interfaceC41591gY3) {
        this(kc1, kc12, kc13, kc14, interfaceC33045Gd1, interfaceC4169a, interfaceC41591gY3, f9798A);
    }

    /* renamed from: a */
    public synchronized void m106872a(ZL4 zl4, Executor executor) {
        this.f9800c.mo96959c();
        this.f9799b.m106856a(zl4, executor);
        boolean z = true;
        if (this.f9817t) {
            m106866k(1);
            executor.execute(new RunnableC2367b(zl4));
        } else if (this.f9819v) {
            m106866k(1);
            executor.execute(new RunnableC2366a(zl4));
        } else {
            if (this.f9822y) {
                z = false;
            }
            C52865zZ3.m1114a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    @Override // p000.RunnableC48084rV0.InterfaceC27935b
    /* renamed from: b */
    public void mo15859b(GlideException glideException) {
        synchronized (this) {
            this.f9818u = glideException;
        }
        m106863n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.RunnableC48084rV0.InterfaceC27935b
    /* renamed from: c */
    public void mo15858c(VL4<R> vl4, ZS0 zs0, boolean z) {
        synchronized (this) {
            this.f9815r = vl4;
            this.f9816s = zs0;
            this.f9823z = z;
        }
        m106862o();
    }

    @Override // p000.RunnableC48084rV0.InterfaceC27935b
    /* renamed from: d */
    public void mo15857d(RunnableC48084rV0<?> runnableC48084rV0) {
        m106867j().execute(runnableC48084rV0);
    }

    @Override // p000.C49998uj1.InterfaceC29291f
    /* renamed from: e */
    public LP5 mo9828e() {
        return this.f9800c;
    }

    /* renamed from: f */
    public void m106871f(ZL4 zl4) {
        try {
            zl4.mo26187b(this.f9818u);
        } catch (Throwable th) {
            throw new J80(th);
        }
    }

    /* renamed from: g */
    public void m106870g(ZL4 zl4) {
        try {
            zl4.mo26186c(this.f9820w, this.f9816s, this.f9823z);
        } catch (Throwable th) {
            throw new J80(th);
        }
    }

    /* renamed from: h */
    public void m106869h() {
        if (m106864m()) {
            return;
        }
        this.f9822y = true;
        this.f9821x.m15880b();
        this.f9804g.mo104947b(this, this.f9810m);
    }

    /* renamed from: i */
    public void m106868i() {
        boolean z;
        C33747Jd1<?> c33747Jd1;
        synchronized (this) {
            this.f9800c.mo96959c();
            C52865zZ3.m1114a(m106864m(), "Not yet complete!");
            int decrementAndGet = this.f9809l.decrementAndGet();
            if (decrementAndGet >= 0) {
                z = true;
            } else {
                z = false;
            }
            C52865zZ3.m1114a(z, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                c33747Jd1 = this.f9820w;
                m106860q();
            } else {
                c33747Jd1 = null;
            }
        }
        if (c33747Jd1 != null) {
            c33747Jd1.m100102g();
        }
    }

    /* renamed from: j */
    public final KC1 m106867j() {
        if (this.f9812o) {
            return this.f9807j;
        }
        if (this.f9813p) {
            return this.f9808k;
        }
        return this.f9806i;
    }

    /* renamed from: k */
    public synchronized void m106866k(int i) {
        C33747Jd1<?> c33747Jd1;
        C52865zZ3.m1114a(m106864m(), "Not yet complete!");
        if (this.f9809l.getAndAdd(i) == 0 && (c33747Jd1 = this.f9820w) != null) {
            c33747Jd1.m100105c();
        }
    }

    /* renamed from: l */
    public synchronized C32811Fd1<R> m106865l(InterfaceC38133ak2 interfaceC38133ak2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f9810m = interfaceC38133ak2;
        this.f9811n = z;
        this.f9812o = z2;
        this.f9813p = z3;
        this.f9814q = z4;
        return this;
    }

    /* renamed from: m */
    public final boolean m106864m() {
        return this.f9819v || this.f9817t || this.f9822y;
    }

    /* renamed from: n */
    public void m106863n() {
        synchronized (this) {
            this.f9800c.mo96959c();
            if (this.f9822y) {
                m106860q();
            } else if (!this.f9799b.isEmpty()) {
                if (!this.f9819v) {
                    this.f9819v = true;
                    InterfaceC38133ak2 interfaceC38133ak2 = this.f9810m;
                    C2370e m106854c = this.f9799b.m106854c();
                    m106866k(m106854c.size() + 1);
                    this.f9804g.mo104946c(this, interfaceC38133ak2, null);
                    Iterator<C2369d> it = m106854c.iterator();
                    while (it.hasNext()) {
                        C2369d next = it.next();
                        next.f9829b.execute(new RunnableC2366a(next.f9828a));
                    }
                    m106868i();
                    return;
                }
                throw new IllegalStateException("Already failed once");
            } else {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
        }
    }

    /* renamed from: o */
    public void m106862o() {
        synchronized (this) {
            this.f9800c.mo96959c();
            if (this.f9822y) {
                this.f9815r.mo5712b();
                m106860q();
            } else if (!this.f9799b.isEmpty()) {
                if (!this.f9817t) {
                    this.f9820w = this.f9803f.m106857a(this.f9815r, this.f9811n, this.f9810m, this.f9801d);
                    this.f9817t = true;
                    C2370e m106854c = this.f9799b.m106854c();
                    m106866k(m106854c.size() + 1);
                    this.f9804g.mo104946c(this, this.f9810m, this.f9820w);
                    Iterator<C2369d> it = m106854c.iterator();
                    while (it.hasNext()) {
                        C2369d next = it.next();
                        next.f9829b.execute(new RunnableC2367b(next.f9828a));
                    }
                    m106868i();
                    return;
                }
                throw new IllegalStateException("Already have resource");
            } else {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
        }
    }

    /* renamed from: p */
    public boolean m106861p() {
        return this.f9814q;
    }

    /* renamed from: q */
    public final synchronized void m106860q() {
        if (this.f9810m != null) {
            this.f9799b.clear();
            this.f9810m = null;
            this.f9820w = null;
            this.f9815r = null;
            this.f9819v = false;
            this.f9822y = false;
            this.f9817t = false;
            this.f9823z = false;
            this.f9821x.m15860w(false);
            this.f9821x = null;
            this.f9818u = null;
            this.f9816s = null;
            this.f9802e.mo9829b(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: r */
    public synchronized void m106859r(ZL4 zl4) {
        boolean z;
        this.f9800c.mo96959c();
        this.f9799b.m106852f(zl4);
        if (this.f9799b.isEmpty()) {
            m106869h();
            if (!this.f9817t && !this.f9819v) {
                z = false;
                if (z && this.f9809l.get() == 0) {
                    m106860q();
                }
            }
            z = true;
            if (z) {
                m106860q();
            }
        }
    }

    /* renamed from: s */
    public synchronized void m106858s(RunnableC48084rV0<R> runnableC48084rV0) {
        KC1 m106867j;
        this.f9821x = runnableC48084rV0;
        if (runnableC48084rV0.m15882M()) {
            m106867j = this.f9805h;
        } else {
            m106867j = m106867j();
        }
        m106867j.execute(runnableC48084rV0);
    }

    public C32811Fd1(KC1 kc1, KC1 kc12, KC1 kc13, KC1 kc14, InterfaceC33045Gd1 interfaceC33045Gd1, C33747Jd1.InterfaceC4169a interfaceC4169a, InterfaceC41591gY3<C32811Fd1<?>> interfaceC41591gY3, C2368c c2368c) {
        this.f9799b = new C2370e();
        this.f9800c = LP5.m96961a();
        this.f9809l = new AtomicInteger();
        this.f9805h = kc1;
        this.f9806i = kc12;
        this.f9807j = kc13;
        this.f9808k = kc14;
        this.f9804g = interfaceC33045Gd1;
        this.f9801d = interfaceC4169a;
        this.f9802e = interfaceC41591gY3;
        this.f9803f = c2368c;
    }
}
