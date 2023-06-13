package p000;

import com.google.firebase.crashlytics.internal.common.IdManager;
import java.util.ArrayList;
import p000.C34342Lr2;
import p000.C48017rN5;
/* renamed from: xo */
/* loaded from: classes.dex */
public class C30303xo implements C34342Lr2.InterfaceC5100a {

    /* renamed from: e */
    public InterfaceC30304a f118140e;

    /* renamed from: a */
    public C48017rN5 f118136a = null;

    /* renamed from: b */
    public float f118137b = 0.0f;

    /* renamed from: c */
    public boolean f118138c = false;

    /* renamed from: d */
    public ArrayList<C48017rN5> f118139d = new ArrayList<>();

    /* renamed from: f */
    public boolean f118141f = false;

    /* renamed from: xo$a */
    /* loaded from: classes.dex */
    public interface InterfaceC30304a {
        /* renamed from: a */
        boolean mo4662a(C48017rN5 c48017rN5);

        /* renamed from: b */
        C48017rN5 mo4661b(int i);

        /* renamed from: c */
        float mo4660c(C30303xo c30303xo, boolean z);

        void clear();

        /* renamed from: d */
        void mo4659d(C48017rN5 c48017rN5, float f, boolean z);

        /* renamed from: e */
        void mo4658e(float f);

        /* renamed from: f */
        void mo4657f(C48017rN5 c48017rN5, float f);

        /* renamed from: g */
        void mo4656g();

        /* renamed from: h */
        float mo4655h(C48017rN5 c48017rN5);

        /* renamed from: i */
        int mo4654i();

        /* renamed from: j */
        float mo4653j(int i);

        /* renamed from: k */
        float mo4652k(C48017rN5 c48017rN5, boolean z);
    }

    public C30303xo() {
    }

    /* renamed from: A */
    public void m4692A(C34342Lr2 c34342Lr2, C48017rN5 c48017rN5, boolean z) {
        if (c48017rN5 != null && c48017rN5.f106923h) {
            this.f118137b += c48017rN5.f106922g * this.f118140e.mo4655h(c48017rN5);
            this.f118140e.mo4652k(c48017rN5, z);
            if (z) {
                c48017rN5.m16023d(this);
            }
            if (C34342Lr2.f22122t && this.f118140e.mo4654i() == 0) {
                this.f118141f = true;
                c34342Lr2.f22129a = true;
            }
        }
    }

    /* renamed from: B */
    public void mo4691B(C34342Lr2 c34342Lr2, C30303xo c30303xo, boolean z) {
        this.f118137b += c30303xo.f118137b * this.f118140e.mo4660c(c30303xo, z);
        if (z) {
            c30303xo.f118136a.m16023d(this);
        }
        if (C34342Lr2.f22122t && this.f118136a != null && this.f118140e.mo4654i() == 0) {
            this.f118141f = true;
            c34342Lr2.f22129a = true;
        }
    }

    /* renamed from: C */
    public void m4690C(C34342Lr2 c34342Lr2, C48017rN5 c48017rN5, boolean z) {
        if (c48017rN5 != null && c48017rN5.f106930o) {
            float mo4655h = this.f118140e.mo4655h(c48017rN5);
            this.f118137b += c48017rN5.f106932q * mo4655h;
            this.f118140e.mo4652k(c48017rN5, z);
            if (z) {
                c48017rN5.m16023d(this);
            }
            this.f118140e.mo4659d(c34342Lr2.f22142n.f56963d[c48017rN5.f106931p], mo4655h, z);
            if (C34342Lr2.f22122t && this.f118140e.mo4654i() == 0) {
                this.f118141f = true;
                c34342Lr2.f22129a = true;
            }
        }
    }

    /* renamed from: D */
    public void m4689D(C34342Lr2 c34342Lr2) {
        if (c34342Lr2.f22135g.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int mo4654i = this.f118140e.mo4654i();
            for (int i = 0; i < mo4654i; i++) {
                C48017rN5 mo4661b = this.f118140e.mo4661b(i);
                if (mo4661b.f106920e != -1 || mo4661b.f106923h || mo4661b.f106930o) {
                    this.f118139d.add(mo4661b);
                }
            }
            int size = this.f118139d.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    C48017rN5 c48017rN5 = this.f118139d.get(i2);
                    if (c48017rN5.f106923h) {
                        m4692A(c34342Lr2, c48017rN5, true);
                    } else if (c48017rN5.f106930o) {
                        m4690C(c34342Lr2, c48017rN5, true);
                    } else {
                        mo4691B(c34342Lr2, c34342Lr2.f22135g[c48017rN5.f106920e], true);
                    }
                }
                this.f118139d.clear();
            } else {
                z = true;
            }
        }
        if (C34342Lr2.f22122t && this.f118136a != null && this.f118140e.mo4654i() == 0) {
            this.f118141f = true;
            c34342Lr2.f22129a = true;
        }
    }

    @Override // p000.C34342Lr2.InterfaceC5100a
    /* renamed from: a */
    public void mo4688a(C48017rN5 c48017rN5) {
        int i = c48017rN5.f106921f;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f118140e.mo4657f(c48017rN5, f);
    }

    @Override // p000.C34342Lr2.InterfaceC5100a
    /* renamed from: b */
    public C48017rN5 mo4687b(C34342Lr2 c34342Lr2, boolean[] zArr) {
        return m4666w(zArr, null);
    }

    @Override // p000.C34342Lr2.InterfaceC5100a
    /* renamed from: c */
    public void mo4686c(C34342Lr2.InterfaceC5100a interfaceC5100a) {
        if (interfaceC5100a instanceof C30303xo) {
            C30303xo c30303xo = (C30303xo) interfaceC5100a;
            this.f118136a = null;
            this.f118140e.clear();
            for (int i = 0; i < c30303xo.f118140e.mo4654i(); i++) {
                this.f118140e.mo4659d(c30303xo.f118140e.mo4661b(i), c30303xo.f118140e.mo4653j(i), true);
            }
        }
    }

    @Override // p000.C34342Lr2.InterfaceC5100a
    public void clear() {
        this.f118140e.clear();
        this.f118136a = null;
        this.f118137b = 0.0f;
    }

    /* renamed from: d */
    public C30303xo m4685d(C34342Lr2 c34342Lr2, int i) {
        this.f118140e.mo4657f(c34342Lr2.m96277o(i, "ep"), 1.0f);
        this.f118140e.mo4657f(c34342Lr2.m96277o(i, "em"), -1.0f);
        return this;
    }

    /* renamed from: e */
    public C30303xo m4684e(C48017rN5 c48017rN5, int i) {
        this.f118140e.mo4657f(c48017rN5, i);
        return this;
    }

    /* renamed from: f */
    public boolean m4683f(C34342Lr2 c34342Lr2) {
        boolean z;
        C48017rN5 m4682g = m4682g(c34342Lr2);
        if (m4682g == null) {
            z = true;
        } else {
            m4665x(m4682g);
            z = false;
        }
        if (this.f118140e.mo4654i() == 0) {
            this.f118141f = true;
        }
        return z;
    }

    /* renamed from: g */
    public C48017rN5 m4682g(C34342Lr2 c34342Lr2) {
        boolean m4668u;
        boolean m4668u2;
        int mo4654i = this.f118140e.mo4654i();
        C48017rN5 c48017rN5 = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        C48017rN5 c48017rN52 = null;
        for (int i = 0; i < mo4654i; i++) {
            float mo4653j = this.f118140e.mo4653j(i);
            C48017rN5 mo4661b = this.f118140e.mo4661b(i);
            if (mo4661b.f106926k == C48017rN5.EnumC27904a.UNRESTRICTED) {
                if (c48017rN5 == null) {
                    m4668u2 = m4668u(mo4661b, c34342Lr2);
                } else if (f > mo4653j) {
                    m4668u2 = m4668u(mo4661b, c34342Lr2);
                } else if (!z && m4668u(mo4661b, c34342Lr2)) {
                    f = mo4653j;
                    c48017rN5 = mo4661b;
                    z = true;
                }
                z = m4668u2;
                f = mo4653j;
                c48017rN5 = mo4661b;
            } else if (c48017rN5 == null && mo4653j < 0.0f) {
                if (c48017rN52 == null) {
                    m4668u = m4668u(mo4661b, c34342Lr2);
                } else if (f2 > mo4653j) {
                    m4668u = m4668u(mo4661b, c34342Lr2);
                } else if (!z2 && m4668u(mo4661b, c34342Lr2)) {
                    f2 = mo4653j;
                    c48017rN52 = mo4661b;
                    z2 = true;
                }
                z2 = m4668u;
                f2 = mo4653j;
                c48017rN52 = mo4661b;
            }
        }
        if (c48017rN5 != null) {
            return c48017rN5;
        }
        return c48017rN52;
    }

    @Override // p000.C34342Lr2.InterfaceC5100a
    public C48017rN5 getKey() {
        return this.f118136a;
    }

    /* renamed from: h */
    public C30303xo m4681h(C48017rN5 c48017rN5, C48017rN5 c48017rN52, int i, float f, C48017rN5 c48017rN53, C48017rN5 c48017rN54, int i2) {
        if (c48017rN52 == c48017rN53) {
            this.f118140e.mo4657f(c48017rN5, 1.0f);
            this.f118140e.mo4657f(c48017rN54, 1.0f);
            this.f118140e.mo4657f(c48017rN52, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f118140e.mo4657f(c48017rN5, 1.0f);
            this.f118140e.mo4657f(c48017rN52, -1.0f);
            this.f118140e.mo4657f(c48017rN53, -1.0f);
            this.f118140e.mo4657f(c48017rN54, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f118137b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            this.f118140e.mo4657f(c48017rN5, -1.0f);
            this.f118140e.mo4657f(c48017rN52, 1.0f);
            this.f118137b = i;
        } else if (f >= 1.0f) {
            this.f118140e.mo4657f(c48017rN54, -1.0f);
            this.f118140e.mo4657f(c48017rN53, 1.0f);
            this.f118137b = -i2;
        } else {
            float f2 = 1.0f - f;
            this.f118140e.mo4657f(c48017rN5, f2 * 1.0f);
            this.f118140e.mo4657f(c48017rN52, f2 * (-1.0f));
            this.f118140e.mo4657f(c48017rN53, (-1.0f) * f);
            this.f118140e.mo4657f(c48017rN54, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f118137b = ((-i) * f2) + (i2 * f);
            }
        }
        return this;
    }

    /* renamed from: i */
    public C30303xo m4680i(C48017rN5 c48017rN5, int i) {
        this.f118136a = c48017rN5;
        float f = i;
        c48017rN5.f106922g = f;
        this.f118137b = f;
        this.f118141f = true;
        return this;
    }

    @Override // p000.C34342Lr2.InterfaceC5100a
    public boolean isEmpty() {
        return this.f118136a == null && this.f118137b == 0.0f && this.f118140e.mo4654i() == 0;
    }

    /* renamed from: j */
    public C30303xo m4679j(C48017rN5 c48017rN5, C48017rN5 c48017rN52, float f) {
        this.f118140e.mo4657f(c48017rN5, -1.0f);
        this.f118140e.mo4657f(c48017rN52, f);
        return this;
    }

    /* renamed from: k */
    public C30303xo m4678k(C48017rN5 c48017rN5, C48017rN5 c48017rN52, C48017rN5 c48017rN53, C48017rN5 c48017rN54, float f) {
        this.f118140e.mo4657f(c48017rN5, -1.0f);
        this.f118140e.mo4657f(c48017rN52, 1.0f);
        this.f118140e.mo4657f(c48017rN53, f);
        this.f118140e.mo4657f(c48017rN54, -f);
        return this;
    }

    /* renamed from: l */
    public C30303xo m4677l(float f, float f2, float f3, C48017rN5 c48017rN5, C48017rN5 c48017rN52, C48017rN5 c48017rN53, C48017rN5 c48017rN54) {
        this.f118137b = 0.0f;
        if (f2 != 0.0f && f != f3) {
            if (f == 0.0f) {
                this.f118140e.mo4657f(c48017rN5, 1.0f);
                this.f118140e.mo4657f(c48017rN52, -1.0f);
            } else if (f3 == 0.0f) {
                this.f118140e.mo4657f(c48017rN53, 1.0f);
                this.f118140e.mo4657f(c48017rN54, -1.0f);
            } else {
                float f4 = (f / f2) / (f3 / f2);
                this.f118140e.mo4657f(c48017rN5, 1.0f);
                this.f118140e.mo4657f(c48017rN52, -1.0f);
                this.f118140e.mo4657f(c48017rN54, f4);
                this.f118140e.mo4657f(c48017rN53, -f4);
            }
        } else {
            this.f118140e.mo4657f(c48017rN5, 1.0f);
            this.f118140e.mo4657f(c48017rN52, -1.0f);
            this.f118140e.mo4657f(c48017rN54, 1.0f);
            this.f118140e.mo4657f(c48017rN53, -1.0f);
        }
        return this;
    }

    /* renamed from: m */
    public C30303xo m4676m(C48017rN5 c48017rN5, int i) {
        if (i < 0) {
            this.f118137b = i * (-1);
            this.f118140e.mo4657f(c48017rN5, 1.0f);
        } else {
            this.f118137b = i;
            this.f118140e.mo4657f(c48017rN5, -1.0f);
        }
        return this;
    }

    /* renamed from: n */
    public C30303xo m4675n(C48017rN5 c48017rN5, C48017rN5 c48017rN52, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f118137b = i;
        }
        if (!z) {
            this.f118140e.mo4657f(c48017rN5, -1.0f);
            this.f118140e.mo4657f(c48017rN52, 1.0f);
        } else {
            this.f118140e.mo4657f(c48017rN5, 1.0f);
            this.f118140e.mo4657f(c48017rN52, -1.0f);
        }
        return this;
    }

    /* renamed from: o */
    public C30303xo m4674o(C48017rN5 c48017rN5, C48017rN5 c48017rN52, C48017rN5 c48017rN53, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f118137b = i;
        }
        if (!z) {
            this.f118140e.mo4657f(c48017rN5, -1.0f);
            this.f118140e.mo4657f(c48017rN52, 1.0f);
            this.f118140e.mo4657f(c48017rN53, 1.0f);
        } else {
            this.f118140e.mo4657f(c48017rN5, 1.0f);
            this.f118140e.mo4657f(c48017rN52, -1.0f);
            this.f118140e.mo4657f(c48017rN53, -1.0f);
        }
        return this;
    }

    /* renamed from: p */
    public C30303xo m4673p(C48017rN5 c48017rN5, C48017rN5 c48017rN52, C48017rN5 c48017rN53, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f118137b = i;
        }
        if (!z) {
            this.f118140e.mo4657f(c48017rN5, -1.0f);
            this.f118140e.mo4657f(c48017rN52, 1.0f);
            this.f118140e.mo4657f(c48017rN53, -1.0f);
        } else {
            this.f118140e.mo4657f(c48017rN5, 1.0f);
            this.f118140e.mo4657f(c48017rN52, -1.0f);
            this.f118140e.mo4657f(c48017rN53, 1.0f);
        }
        return this;
    }

    /* renamed from: q */
    public C30303xo m4672q(C48017rN5 c48017rN5, C48017rN5 c48017rN52, C48017rN5 c48017rN53, C48017rN5 c48017rN54, float f) {
        this.f118140e.mo4657f(c48017rN53, 0.5f);
        this.f118140e.mo4657f(c48017rN54, 0.5f);
        this.f118140e.mo4657f(c48017rN5, -0.5f);
        this.f118140e.mo4657f(c48017rN52, -0.5f);
        this.f118137b = -f;
        return this;
    }

    /* renamed from: r */
    public void m4671r() {
        float f = this.f118137b;
        if (f < 0.0f) {
            this.f118137b = f * (-1.0f);
            this.f118140e.mo4656g();
        }
    }

    /* renamed from: s */
    public boolean m4670s() {
        C48017rN5 c48017rN5 = this.f118136a;
        return c48017rN5 != null && (c48017rN5.f106926k == C48017rN5.EnumC27904a.UNRESTRICTED || this.f118137b >= 0.0f);
    }

    /* renamed from: t */
    public boolean m4669t(C48017rN5 c48017rN5) {
        return this.f118140e.mo4662a(c48017rN5);
    }

    public String toString() {
        return m4663z();
    }

    /* renamed from: u */
    public final boolean m4668u(C48017rN5 c48017rN5, C34342Lr2 c34342Lr2) {
        return c48017rN5.f106929n <= 1;
    }

    /* renamed from: v */
    public C48017rN5 m4667v(C48017rN5 c48017rN5) {
        return m4666w(null, c48017rN5);
    }

    /* renamed from: w */
    public final C48017rN5 m4666w(boolean[] zArr, C48017rN5 c48017rN5) {
        C48017rN5.EnumC27904a enumC27904a;
        int mo4654i = this.f118140e.mo4654i();
        C48017rN5 c48017rN52 = null;
        float f = 0.0f;
        for (int i = 0; i < mo4654i; i++) {
            float mo4653j = this.f118140e.mo4653j(i);
            if (mo4653j < 0.0f) {
                C48017rN5 mo4661b = this.f118140e.mo4661b(i);
                if ((zArr == null || !zArr[mo4661b.f106919d]) && mo4661b != c48017rN5 && (((enumC27904a = mo4661b.f106926k) == C48017rN5.EnumC27904a.SLACK || enumC27904a == C48017rN5.EnumC27904a.ERROR) && mo4653j < f)) {
                    f = mo4653j;
                    c48017rN52 = mo4661b;
                }
            }
        }
        return c48017rN52;
    }

    /* renamed from: x */
    public void m4665x(C48017rN5 c48017rN5) {
        C48017rN5 c48017rN52 = this.f118136a;
        if (c48017rN52 != null) {
            this.f118140e.mo4657f(c48017rN52, -1.0f);
            this.f118136a.f106920e = -1;
            this.f118136a = null;
        }
        float mo4652k = this.f118140e.mo4652k(c48017rN5, true) * (-1.0f);
        this.f118136a = c48017rN5;
        if (mo4652k == 1.0f) {
            return;
        }
        this.f118137b /= mo4652k;
        this.f118140e.mo4658e(mo4652k);
    }

    /* renamed from: y */
    public void m4664y() {
        this.f118136a = null;
        this.f118140e.clear();
        this.f118137b = 0.0f;
        this.f118141f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m4663z() {
        String str;
        boolean z;
        float mo4653j;
        int i;
        if (this.f118136a == null) {
            str = "0";
        } else {
            str = "" + this.f118136a;
        }
        String str2 = str + " = ";
        if (this.f118137b != 0.0f) {
            str2 = str2 + this.f118137b;
            z = true;
        } else {
            z = false;
        }
        int mo4654i = this.f118140e.mo4654i();
        for (int i2 = 0; i2 < mo4654i; i2++) {
            C48017rN5 mo4661b = this.f118140e.mo4661b(i2);
            if (mo4661b != null && (this.f118140e.mo4653j(i2)) != 0.0f) {
                String c48017rN5 = mo4661b.toString();
                if (!z) {
                    if (mo4653j < 0.0f) {
                        str2 = str2 + "- ";
                        mo4653j *= -1.0f;
                    }
                    if (mo4653j == 1.0f) {
                        str2 = str2 + c48017rN5;
                    } else {
                        str2 = str2 + mo4653j + " " + c48017rN5;
                    }
                    z = true;
                } else if (i > 0) {
                    str2 = str2 + " + ";
                    if (mo4653j == 1.0f) {
                    }
                    z = true;
                } else {
                    str2 = str2 + " - ";
                    mo4653j *= -1.0f;
                    if (mo4653j == 1.0f) {
                    }
                    z = true;
                }
            }
        }
        if (!z) {
            return str2 + IdManager.DEFAULT_VERSION_NAME;
        }
        return str2;
    }

    public C30303xo(C38370b80 c38370b80) {
        this.f118140e = new C27394po(this, c38370b80);
    }
}
