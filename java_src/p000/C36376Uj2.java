package p000;

import java.util.ArrayDeque;
/* renamed from: Uj2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C36376Uj2 {

    /* renamed from: a */
    public C35908Sj2 f37888a;

    /* renamed from: b */
    public long f37889b;

    /* renamed from: c */
    public double f37890c;

    /* renamed from: Uj2$a */
    /* loaded from: classes8.dex */
    public static class C8428a implements InterfaceC36142Tj2 {

        /* renamed from: a */
        public double f37891a;

        /* renamed from: b */
        public C35908Sj2 f37892b = null;

        /* renamed from: c */
        public double f37893c = 0.0d;

        /* renamed from: d */
        public C52053yB0 f37894d;

        public C8428a(C52053yB0 c52053yB0, double d) {
            this.f37894d = c52053yB0;
            this.f37891a = d;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
            if (r9.m84996a().compareTo(r8.f37892b.m84996a()) >= 1) goto L16;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
        @Override // p000.InterfaceC36142Tj2
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo25796a(C35908Sj2 c35908Sj2) {
            boolean z;
            double m3887f = this.f37894d.m3887f(c35908Sj2.m84996a());
            boolean z2 = false;
            if (m3887f <= this.f37891a) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return;
            }
            C35908Sj2 c35908Sj22 = this.f37892b;
            if (c35908Sj22 != null) {
                double d = this.f37893c;
                if (m3887f >= d) {
                    if (c35908Sj22 != null) {
                        if (m3887f == d) {
                        }
                    }
                    if (!z2) {
                        this.f37892b = c35908Sj2;
                        this.f37893c = m3887f;
                        return;
                    }
                    return;
                }
            }
            z2 = true;
            if (!z2) {
            }
        }

        /* renamed from: b */
        public C35908Sj2 m80964b() {
            return this.f37892b;
        }

        /* renamed from: c */
        public C48772sf1 m80963c() {
            C48772sf1 c48772sf1 = new C48772sf1(this.f37894d);
            c48772sf1.m13877h(this.f37891a);
            return c48772sf1;
        }
    }

    /* renamed from: Uj2$b */
    /* loaded from: classes8.dex */
    public static class C8429b {

        /* renamed from: a */
        public C35908Sj2 f37895a;

        /* renamed from: b */
        public boolean f37896b;

        public C8429b(C35908Sj2 c35908Sj2, boolean z) {
            this.f37895a = c35908Sj2;
            this.f37896b = z;
        }

        /* renamed from: a */
        public C35908Sj2 m80962a() {
            return this.f37895a;
        }

        /* renamed from: b */
        public boolean m80961b() {
            return this.f37896b;
        }
    }

    public C36376Uj2() {
        this(0.0d);
    }

    /* renamed from: a */
    public final C35908Sj2 m80970a(C52053yB0 c52053yB0) {
        C8428a c8428a = new C8428a(c52053yB0, this.f37890c);
        m80965f(c8428a.m80963c(), c8428a);
        return c8428a.m80964b();
    }

    /* renamed from: b */
    public C35908Sj2 m80969b(C52053yB0 c52053yB0) {
        return m80968c(c52053yB0, null);
    }

    /* renamed from: c */
    public C35908Sj2 m80968c(C52053yB0 c52053yB0, Object obj) {
        C35908Sj2 m80970a;
        if (this.f37888a == null) {
            C35908Sj2 c35908Sj2 = new C35908Sj2(c52053yB0, obj);
            this.f37888a = c35908Sj2;
            return c35908Sj2;
        } else if (this.f37890c > 0.0d && (m80970a = m80970a(c52053yB0)) != null) {
            m80970a.m84992e();
            return m80970a;
        } else {
            return m80967d(c52053yB0, obj);
        }
    }

    /* renamed from: d */
    public final C35908Sj2 m80967d(C52053yB0 c52053yB0, Object obj) {
        boolean z;
        C35908Sj2 m84993d;
        C35908Sj2 c35908Sj2 = this.f37888a;
        C35908Sj2 c35908Sj22 = c35908Sj2;
        boolean z2 = true;
        boolean z3 = true;
        while (c35908Sj2 != null) {
            z2 = false;
            if (c52053yB0.m3887f(c35908Sj2.m84996a()) <= this.f37890c) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c35908Sj2.m84992e();
                return c35908Sj2;
            }
            double m84986k = c35908Sj2.m84986k(z3);
            if (!z3 ? c52053yB0.f118923c < m84986k : c52053yB0.f118922b < m84986k) {
                z2 = true;
            }
            if (z2) {
                m84993d = c35908Sj2.m84994c();
            } else {
                m84993d = c35908Sj2.m84993d();
            }
            z3 = !z3;
            C35908Sj2 c35908Sj23 = m84993d;
            c35908Sj22 = c35908Sj2;
            c35908Sj2 = c35908Sj23;
        }
        this.f37889b++;
        C35908Sj2 c35908Sj24 = new C35908Sj2(c52053yB0, obj);
        if (z2) {
            c35908Sj22.m84988i(c35908Sj24);
        } else {
            c35908Sj22.m84987j(c35908Sj24);
        }
        return c35908Sj24;
    }

    /* renamed from: e */
    public C35908Sj2 m80966e(C52053yB0 c52053yB0) {
        C35908Sj2 c35908Sj2 = this.f37888a;
        boolean z = true;
        while (c35908Sj2 != null) {
            if (c35908Sj2.m84996a().m3886g(c52053yB0)) {
                return c35908Sj2;
            }
            if (c35908Sj2.m84991f(z, c52053yB0)) {
                c35908Sj2 = c35908Sj2.m84994c();
            } else {
                c35908Sj2 = c35908Sj2.m84993d();
            }
            z = !z;
        }
        return null;
    }

    /* renamed from: f */
    public void m80965f(C48772sf1 c48772sf1, InterfaceC36142Tj2 interfaceC36142Tj2) {
        ArrayDeque arrayDeque = new ArrayDeque();
        C35908Sj2 c35908Sj2 = this.f37888a;
        boolean z = true;
        while (true) {
            if (c35908Sj2 != null) {
                arrayDeque.push(new C8429b(c35908Sj2, z));
                if (c35908Sj2.m84990g(z, c48772sf1)) {
                    c35908Sj2 = c35908Sj2.m84994c();
                    if (c35908Sj2 != null) {
                        z = !z;
                    }
                } else {
                    c35908Sj2 = null;
                }
            } else if (!arrayDeque.isEmpty()) {
                C8429b c8429b = (C8429b) arrayDeque.pop();
                C35908Sj2 m80962a = c8429b.m80962a();
                boolean m80961b = c8429b.m80961b();
                if (c48772sf1.m13884a(m80962a.m84996a())) {
                    interfaceC36142Tj2.mo25796a(m80962a);
                }
                if (m80962a.m84989h(m80961b, c48772sf1)) {
                    C35908Sj2 m84993d = m80962a.m84993d();
                    if (m84993d != null) {
                        m80961b = !m80961b;
                    }
                    z = m80961b;
                    c35908Sj2 = m84993d;
                } else {
                    z = m80961b;
                    c35908Sj2 = null;
                }
            } else {
                return;
            }
        }
    }

    public C36376Uj2(double d) {
        this.f37888a = null;
        this.f37890c = d;
    }
}
