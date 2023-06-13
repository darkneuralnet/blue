package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
/* renamed from: androidx.recyclerview.widget.x */
/* loaded from: classes.dex */
public class C11959x {

    /* renamed from: a */
    public final NA5<RecyclerView.AbstractC11834D, C11960a> f55601a = new NA5<>();

    /* renamed from: b */
    public final C46602oz2<RecyclerView.AbstractC11834D> f55602b = new C46602oz2<>();

    /* renamed from: androidx.recyclerview.widget.x$a */
    /* loaded from: classes.dex */
    public static class C11960a {

        /* renamed from: d */
        public static InterfaceC41591gY3<C11960a> f55603d = new C42777iY3(20);

        /* renamed from: a */
        public int f55604a;

        /* renamed from: b */
        public RecyclerView.AbstractC11849m.C11852c f55605b;

        /* renamed from: c */
        public RecyclerView.AbstractC11849m.C11852c f55606c;

        private C11960a() {
        }

        /* renamed from: a */
        public static void m66094a() {
            do {
            } while (f55603d.mo9830a() != null);
        }

        /* renamed from: b */
        public static C11960a m66093b() {
            C11960a mo9830a = f55603d.mo9830a();
            if (mo9830a == null) {
                return new C11960a();
            }
            return mo9830a;
        }

        /* renamed from: c */
        public static void m66092c(C11960a c11960a) {
            c11960a.f55604a = 0;
            c11960a.f55605b = null;
            c11960a.f55606c = null;
            f55603d.mo9829b(c11960a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.x$b */
    /* loaded from: classes.dex */
    public interface InterfaceC11961b {
        /* renamed from: a */
        void mo66091a(RecyclerView.AbstractC11834D abstractC11834D, RecyclerView.AbstractC11849m.C11852c c11852c, RecyclerView.AbstractC11849m.C11852c c11852c2);

        /* renamed from: b */
        void mo66090b(RecyclerView.AbstractC11834D abstractC11834D);

        /* renamed from: c */
        void mo66089c(RecyclerView.AbstractC11834D abstractC11834D, RecyclerView.AbstractC11849m.C11852c c11852c, RecyclerView.AbstractC11849m.C11852c c11852c2);

        /* renamed from: d */
        void mo66088d(RecyclerView.AbstractC11834D abstractC11834D, RecyclerView.AbstractC11849m.C11852c c11852c, RecyclerView.AbstractC11849m.C11852c c11852c2);
    }

    /* renamed from: a */
    public void m66111a(RecyclerView.AbstractC11834D abstractC11834D, RecyclerView.AbstractC11849m.C11852c c11852c) {
        C11960a c11960a = this.f55601a.get(abstractC11834D);
        if (c11960a == null) {
            c11960a = C11960a.m66093b();
            this.f55601a.put(abstractC11834D, c11960a);
        }
        c11960a.f55604a |= 2;
        c11960a.f55605b = c11852c;
    }

    /* renamed from: b */
    public void m66110b(RecyclerView.AbstractC11834D abstractC11834D) {
        C11960a c11960a = this.f55601a.get(abstractC11834D);
        if (c11960a == null) {
            c11960a = C11960a.m66093b();
            this.f55601a.put(abstractC11834D, c11960a);
        }
        c11960a.f55604a |= 1;
    }

    /* renamed from: c */
    public void m66109c(long j, RecyclerView.AbstractC11834D abstractC11834D) {
        this.f55602b.m20191n(j, abstractC11834D);
    }

    /* renamed from: d */
    public void m66108d(RecyclerView.AbstractC11834D abstractC11834D, RecyclerView.AbstractC11849m.C11852c c11852c) {
        C11960a c11960a = this.f55601a.get(abstractC11834D);
        if (c11960a == null) {
            c11960a = C11960a.m66093b();
            this.f55601a.put(abstractC11834D, c11960a);
        }
        c11960a.f55606c = c11852c;
        c11960a.f55604a |= 8;
    }

    /* renamed from: e */
    public void m66107e(RecyclerView.AbstractC11834D abstractC11834D, RecyclerView.AbstractC11849m.C11852c c11852c) {
        C11960a c11960a = this.f55601a.get(abstractC11834D);
        if (c11960a == null) {
            c11960a = C11960a.m66093b();
            this.f55601a.put(abstractC11834D, c11960a);
        }
        c11960a.f55605b = c11852c;
        c11960a.f55604a |= 4;
    }

    /* renamed from: f */
    public void m66106f() {
        this.f55601a.clear();
        this.f55602b.m20200d();
    }

    /* renamed from: g */
    public RecyclerView.AbstractC11834D m66105g(long j) {
        return this.f55602b.m20196h(j);
    }

    /* renamed from: h */
    public boolean m66104h(RecyclerView.AbstractC11834D abstractC11834D) {
        C11960a c11960a = this.f55601a.get(abstractC11834D);
        if (c11960a != null && (c11960a.f55604a & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean m66103i(RecyclerView.AbstractC11834D abstractC11834D) {
        C11960a c11960a = this.f55601a.get(abstractC11834D);
        if (c11960a != null && (c11960a.f55604a & 4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public void m66102j() {
        C11960a.m66094a();
    }

    /* renamed from: k */
    public void m66101k(RecyclerView.AbstractC11834D abstractC11834D) {
        m66096p(abstractC11834D);
    }

    /* renamed from: l */
    public final RecyclerView.AbstractC11849m.C11852c m66100l(RecyclerView.AbstractC11834D abstractC11834D, int i) {
        C11960a m94263m;
        RecyclerView.AbstractC11849m.C11852c c11852c;
        int m94267f = this.f55601a.m94267f(abstractC11834D);
        if (m94267f >= 0 && (m94263m = this.f55601a.m94263m(m94267f)) != null) {
            int i2 = m94263m.f55604a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                m94263m.f55604a = i3;
                if (i == 4) {
                    c11852c = m94263m.f55605b;
                } else if (i == 8) {
                    c11852c = m94263m.f55606c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.f55601a.mo34405k(m94267f);
                    C11960a.m66092c(m94263m);
                }
                return c11852c;
            }
        }
        return null;
    }

    /* renamed from: m */
    public RecyclerView.AbstractC11849m.C11852c m66099m(RecyclerView.AbstractC11834D abstractC11834D) {
        return m66100l(abstractC11834D, 8);
    }

    /* renamed from: n */
    public RecyclerView.AbstractC11849m.C11852c m66098n(RecyclerView.AbstractC11834D abstractC11834D) {
        return m66100l(abstractC11834D, 4);
    }

    /* renamed from: o */
    public void m66097o(InterfaceC11961b interfaceC11961b) {
        for (int size = this.f55601a.size() - 1; size >= 0; size--) {
            RecyclerView.AbstractC11834D m94264i = this.f55601a.m94264i(size);
            C11960a mo34405k = this.f55601a.mo34405k(size);
            int i = mo34405k.f55604a;
            if ((i & 3) == 3) {
                interfaceC11961b.mo66090b(m94264i);
            } else if ((i & 1) != 0) {
                RecyclerView.AbstractC11849m.C11852c c11852c = mo34405k.f55605b;
                if (c11852c == null) {
                    interfaceC11961b.mo66090b(m94264i);
                } else {
                    interfaceC11961b.mo66089c(m94264i, c11852c, mo34405k.f55606c);
                }
            } else if ((i & 14) == 14) {
                interfaceC11961b.mo66091a(m94264i, mo34405k.f55605b, mo34405k.f55606c);
            } else if ((i & 12) == 12) {
                interfaceC11961b.mo66088d(m94264i, mo34405k.f55605b, mo34405k.f55606c);
            } else if ((i & 4) != 0) {
                interfaceC11961b.mo66089c(m94264i, mo34405k.f55605b, null);
            } else if ((i & 8) != 0) {
                interfaceC11961b.mo66091a(m94264i, mo34405k.f55605b, mo34405k.f55606c);
            }
            C11960a.m66092c(mo34405k);
        }
    }

    /* renamed from: p */
    public void m66096p(RecyclerView.AbstractC11834D abstractC11834D) {
        C11960a c11960a = this.f55601a.get(abstractC11834D);
        if (c11960a == null) {
            return;
        }
        c11960a.f55604a &= -2;
    }

    /* renamed from: q */
    public void m66095q(RecyclerView.AbstractC11834D abstractC11834D) {
        int size = this.f55602b.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            } else if (abstractC11834D == this.f55602b.m20188q(size)) {
                this.f55602b.m20189p(size);
                break;
            } else {
                size--;
            }
        }
        C11960a remove = this.f55601a.remove(abstractC11834D);
        if (remove != null) {
            C11960a.m66092c(remove);
        }
    }
}
