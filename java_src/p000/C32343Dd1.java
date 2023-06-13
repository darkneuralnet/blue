package p000;

import android.util.Log;
import com.bumptech.glide.C17104c;
import java.util.Map;
import java.util.concurrent.Executor;
import p000.C33747Jd1;
import p000.C49998uj1;
import p000.InterfaceC52578z41;
import p000.OP2;
import p000.RunnableC48084rV0;
/* renamed from: Dd1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C32343Dd1 implements InterfaceC33045Gd1, OP2.InterfaceC5987a, C33747Jd1.InterfaceC4169a {

    /* renamed from: i */
    public static final boolean f6077i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    public final C36358Uh2 f6078a;

    /* renamed from: b */
    public final C33513Id1 f6079b;

    /* renamed from: c */
    public final OP2 f6080c;

    /* renamed from: d */
    public final C1571b f6081d;

    /* renamed from: e */
    public final C46821pM4 f6082e;

    /* renamed from: f */
    public final C1573c f6083f;

    /* renamed from: g */
    public final C1569a f6084g;

    /* renamed from: h */
    public final C5151M2 f6085h;

    /* renamed from: Dd1$a */
    /* loaded from: classes5.dex */
    public static class C1569a {

        /* renamed from: a */
        public final RunnableC48084rV0.InterfaceC27938e f6086a;

        /* renamed from: b */
        public final InterfaceC41591gY3<RunnableC48084rV0<?>> f6087b = C49998uj1.m9835d(150, new C1570a());

        /* renamed from: c */
        public int f6088c;

        /* renamed from: Dd1$a$a */
        /* loaded from: classes5.dex */
        public class C1570a implements C49998uj1.InterfaceC29289d<RunnableC48084rV0<?>> {
            public C1570a() {
            }

            @Override // p000.C49998uj1.InterfaceC29289d
            /* renamed from: a */
            public RunnableC48084rV0<?> create() {
                C1569a c1569a = C1569a.this;
                return new RunnableC48084rV0<>(c1569a.f6086a, c1569a.f6087b);
            }
        }

        public C1569a(RunnableC48084rV0.InterfaceC27938e interfaceC27938e) {
            this.f6086a = interfaceC27938e;
        }

        /* renamed from: a */
        public <R> RunnableC48084rV0<R> m110083a(C17104c c17104c, Object obj, C33279Hd1 c33279Hd1, InterfaceC38133ak2 interfaceC38133ak2, int i, int i2, Class<?> cls, Class<R> cls2, P24 p24, B41 b41, Map<Class<?>, InterfaceC47891r96<?>> map, boolean z, boolean z2, boolean z3, C48964sy3 c48964sy3, RunnableC48084rV0.InterfaceC27935b<R> interfaceC27935b) {
            RunnableC48084rV0 runnableC48084rV0 = (RunnableC48084rV0) C52865zZ3.m1111d(this.f6087b.mo9830a());
            int i3 = this.f6088c;
            this.f6088c = i3 + 1;
            return runnableC48084rV0.m15869n(c17104c, obj, c33279Hd1, interfaceC38133ak2, i, i2, cls, cls2, p24, b41, map, z, z2, z3, c48964sy3, interfaceC27935b, i3);
        }
    }

    /* renamed from: Dd1$b */
    /* loaded from: classes5.dex */
    public static class C1571b {

        /* renamed from: a */
        public final KC1 f6090a;

        /* renamed from: b */
        public final KC1 f6091b;

        /* renamed from: c */
        public final KC1 f6092c;

        /* renamed from: d */
        public final KC1 f6093d;

        /* renamed from: e */
        public final InterfaceC33045Gd1 f6094e;

        /* renamed from: f */
        public final C33747Jd1.InterfaceC4169a f6095f;

        /* renamed from: g */
        public final InterfaceC41591gY3<C32811Fd1<?>> f6096g = C49998uj1.m9835d(150, new C1572a());

        /* renamed from: Dd1$b$a */
        /* loaded from: classes5.dex */
        public class C1572a implements C49998uj1.InterfaceC29289d<C32811Fd1<?>> {
            public C1572a() {
            }

            @Override // p000.C49998uj1.InterfaceC29289d
            /* renamed from: a */
            public C32811Fd1<?> create() {
                C1571b c1571b = C1571b.this;
                return new C32811Fd1<>(c1571b.f6090a, c1571b.f6091b, c1571b.f6092c, c1571b.f6093d, c1571b.f6094e, c1571b.f6095f, c1571b.f6096g);
            }
        }

        public C1571b(KC1 kc1, KC1 kc12, KC1 kc13, KC1 kc14, InterfaceC33045Gd1 interfaceC33045Gd1, C33747Jd1.InterfaceC4169a interfaceC4169a) {
            this.f6090a = kc1;
            this.f6091b = kc12;
            this.f6092c = kc13;
            this.f6093d = kc14;
            this.f6094e = interfaceC33045Gd1;
            this.f6095f = interfaceC4169a;
        }

        /* renamed from: a */
        public <R> C32811Fd1<R> m110081a(InterfaceC38133ak2 interfaceC38133ak2, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((C32811Fd1) C52865zZ3.m1111d(this.f6096g.mo9830a())).m106865l(interfaceC38133ak2, z, z2, z3, z4);
        }
    }

    /* renamed from: Dd1$c */
    /* loaded from: classes5.dex */
    public static class C1573c implements RunnableC48084rV0.InterfaceC27938e {

        /* renamed from: a */
        public final InterfaceC52578z41.InterfaceC30901a f6098a;

        /* renamed from: b */
        public volatile InterfaceC52578z41 f6099b;

        public C1573c(InterfaceC52578z41.InterfaceC30901a interfaceC30901a) {
            this.f6098a = interfaceC30901a;
        }

        @Override // p000.RunnableC48084rV0.InterfaceC27938e
        /* renamed from: a */
        public InterfaceC52578z41 mo15852a() {
            if (this.f6099b == null) {
                synchronized (this) {
                    if (this.f6099b == null) {
                        this.f6099b = this.f6098a.build();
                    }
                    if (this.f6099b == null) {
                        this.f6099b = new A41();
                    }
                }
            }
            return this.f6099b;
        }
    }

    /* renamed from: Dd1$d */
    /* loaded from: classes5.dex */
    public class C1574d {

        /* renamed from: a */
        public final C32811Fd1<?> f6100a;

        /* renamed from: b */
        public final ZL4 f6101b;

        public C1574d(ZL4 zl4, C32811Fd1<?> c32811Fd1) {
            this.f6101b = zl4;
            this.f6100a = c32811Fd1;
        }

        /* renamed from: a */
        public void m110079a() {
            synchronized (C32343Dd1.this) {
                this.f6100a.m106859r(this.f6101b);
            }
        }
    }

    public C32343Dd1(OP2 op2, InterfaceC52578z41.InterfaceC30901a interfaceC30901a, KC1 kc1, KC1 kc12, KC1 kc13, KC1 kc14, boolean z) {
        this(op2, interfaceC30901a, kc1, kc12, kc13, kc14, null, null, null, null, null, null, z);
    }

    /* renamed from: j */
    public static void m110086j(String str, long j, InterfaceC38133ak2 interfaceC38133ak2) {
        Log.v("Engine", str + " in " + C49546tx2.m11169a(j) + "ms, key: " + interfaceC38133ak2);
    }

    @Override // p000.C33747Jd1.InterfaceC4169a
    /* renamed from: a */
    public void mo100101a(InterfaceC38133ak2 interfaceC38133ak2, C33747Jd1<?> c33747Jd1) {
        this.f6085h.m96002d(interfaceC38133ak2);
        if (c33747Jd1.m100103f()) {
            this.f6080c.mo3793e(interfaceC38133ak2, c33747Jd1);
        } else {
            this.f6082e.m19422a(c33747Jd1, false);
        }
    }

    @Override // p000.InterfaceC33045Gd1
    /* renamed from: b */
    public synchronized void mo104947b(C32811Fd1<?> c32811Fd1, InterfaceC38133ak2 interfaceC38133ak2) {
        this.f6078a.m81142d(interfaceC38133ak2, c32811Fd1);
    }

    @Override // p000.InterfaceC33045Gd1
    /* renamed from: c */
    public synchronized void mo104946c(C32811Fd1<?> c32811Fd1, InterfaceC38133ak2 interfaceC38133ak2, C33747Jd1<?> c33747Jd1) {
        if (c33747Jd1 != null) {
            if (c33747Jd1.m100103f()) {
                this.f6085h.m96005a(interfaceC38133ak2, c33747Jd1);
            }
        }
        this.f6078a.m81142d(interfaceC38133ak2, c32811Fd1);
    }

    @Override // p000.OP2.InterfaceC5987a
    /* renamed from: d */
    public void mo92348d(VL4<?> vl4) {
        this.f6082e.m19422a(vl4, true);
    }

    /* renamed from: e */
    public final C33747Jd1<?> m110091e(InterfaceC38133ak2 interfaceC38133ak2) {
        VL4<?> mo3794d = this.f6080c.mo3794d(interfaceC38133ak2);
        if (mo3794d == null) {
            return null;
        }
        if (mo3794d instanceof C33747Jd1) {
            return (C33747Jd1) mo3794d;
        }
        return new C33747Jd1<>(mo3794d, true, true, interfaceC38133ak2, this);
    }

    /* renamed from: f */
    public <R> C1574d m110090f(C17104c c17104c, Object obj, InterfaceC38133ak2 interfaceC38133ak2, int i, int i2, Class<?> cls, Class<R> cls2, P24 p24, B41 b41, Map<Class<?>, InterfaceC47891r96<?>> map, boolean z, boolean z2, C48964sy3 c48964sy3, boolean z3, boolean z4, boolean z5, boolean z6, ZL4 zl4, Executor executor) {
        long m11168b = f6077i ? C49546tx2.m11168b() : 0L;
        C33279Hd1 m101877a = this.f6079b.m101877a(obj, interfaceC38133ak2, i, i2, map, cls, cls2, c48964sy3);
        synchronized (this) {
            C33747Jd1<?> m110087i = m110087i(m101877a, z3, m11168b);
            if (m110087i == null) {
                return m110084l(c17104c, obj, interfaceC38133ak2, i, i2, cls, cls2, p24, b41, map, z, z2, c48964sy3, z3, z4, z5, z6, zl4, executor, m101877a, m11168b);
            }
            zl4.mo26186c(m110087i, ZS0.MEMORY_CACHE, false);
            return null;
        }
    }

    /* renamed from: g */
    public final C33747Jd1<?> m110089g(InterfaceC38133ak2 interfaceC38133ak2) {
        C33747Jd1<?> m96001e = this.f6085h.m96001e(interfaceC38133ak2);
        if (m96001e != null) {
            m96001e.m100105c();
        }
        return m96001e;
    }

    /* renamed from: h */
    public final C33747Jd1<?> m110088h(InterfaceC38133ak2 interfaceC38133ak2) {
        C33747Jd1<?> m110091e = m110091e(interfaceC38133ak2);
        if (m110091e != null) {
            m110091e.m100105c();
            this.f6085h.m96005a(interfaceC38133ak2, m110091e);
        }
        return m110091e;
    }

    /* renamed from: i */
    public final C33747Jd1<?> m110087i(C33279Hd1 c33279Hd1, boolean z, long j) {
        if (!z) {
            return null;
        }
        C33747Jd1<?> m110089g = m110089g(c33279Hd1);
        if (m110089g != null) {
            if (f6077i) {
                m110086j("Loaded resource from active resources", j, c33279Hd1);
            }
            return m110089g;
        }
        C33747Jd1<?> m110088h = m110088h(c33279Hd1);
        if (m110088h == null) {
            return null;
        }
        if (f6077i) {
            m110086j("Loaded resource from cache", j, c33279Hd1);
        }
        return m110088h;
    }

    /* renamed from: k */
    public void m110085k(VL4<?> vl4) {
        if (vl4 instanceof C33747Jd1) {
            ((C33747Jd1) vl4).m100102g();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    /* renamed from: l */
    public final <R> C1574d m110084l(C17104c c17104c, Object obj, InterfaceC38133ak2 interfaceC38133ak2, int i, int i2, Class<?> cls, Class<R> cls2, P24 p24, B41 b41, Map<Class<?>, InterfaceC47891r96<?>> map, boolean z, boolean z2, C48964sy3 c48964sy3, boolean z3, boolean z4, boolean z5, boolean z6, ZL4 zl4, Executor executor, C33279Hd1 c33279Hd1, long j) {
        C32811Fd1<?> m81145a = this.f6078a.m81145a(c33279Hd1, z6);
        if (m81145a != null) {
            m81145a.m106872a(zl4, executor);
            if (f6077i) {
                m110086j("Added to existing load", j, c33279Hd1);
            }
            return new C1574d(zl4, m81145a);
        }
        C32811Fd1<R> m110081a = this.f6081d.m110081a(c33279Hd1, z3, z4, z5, z6);
        RunnableC48084rV0<R> m110083a = this.f6084g.m110083a(c17104c, obj, c33279Hd1, interfaceC38133ak2, i, i2, cls, cls2, p24, b41, map, z, z2, z6, c48964sy3, m110081a);
        this.f6078a.m81143c(c33279Hd1, m110081a);
        m110081a.m106872a(zl4, executor);
        m110081a.m106858s(m110083a);
        if (f6077i) {
            m110086j("Started new load", j, c33279Hd1);
        }
        return new C1574d(zl4, m110081a);
    }

    public C32343Dd1(OP2 op2, InterfaceC52578z41.InterfaceC30901a interfaceC30901a, KC1 kc1, KC1 kc12, KC1 kc13, KC1 kc14, C36358Uh2 c36358Uh2, C33513Id1 c33513Id1, C5151M2 c5151m2, C1571b c1571b, C1569a c1569a, C46821pM4 c46821pM4, boolean z) {
        this.f6080c = op2;
        C1573c c1573c = new C1573c(interfaceC30901a);
        this.f6083f = c1573c;
        C5151M2 c5151m22 = c5151m2 == null ? new C5151M2(z) : c5151m2;
        this.f6085h = c5151m22;
        c5151m22.m96000f(this);
        this.f6079b = c33513Id1 == null ? new C33513Id1() : c33513Id1;
        this.f6078a = c36358Uh2 == null ? new C36358Uh2() : c36358Uh2;
        this.f6081d = c1571b == null ? new C1571b(kc1, kc12, kc13, kc14, this, this) : c1571b;
        this.f6084g = c1569a == null ? new C1569a(c1573c) : c1569a;
        this.f6082e = c46821pM4 == null ? new C46821pM4() : c46821pM4;
        op2.mo3795c(this);
    }
}
