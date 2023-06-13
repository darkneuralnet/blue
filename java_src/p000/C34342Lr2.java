package p000;

import java.util.Arrays;
import java.util.HashMap;
import p000.C37211Xy0;
import p000.C48017rN5;
/* renamed from: Lr2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C34342Lr2 {

    /* renamed from: r */
    public static boolean f22120r = false;

    /* renamed from: s */
    public static boolean f22121s = true;

    /* renamed from: t */
    public static boolean f22122t = true;

    /* renamed from: u */
    public static boolean f22123u = true;

    /* renamed from: v */
    public static boolean f22124v = false;

    /* renamed from: w */
    public static int f22125w = 1000;

    /* renamed from: x */
    public static C38572bU2 f22126x;

    /* renamed from: y */
    public static long f22127y;

    /* renamed from: z */
    public static long f22128z;

    /* renamed from: d */
    public InterfaceC5100a f22132d;

    /* renamed from: g */
    public C30303xo[] f22135g;

    /* renamed from: n */
    public final C38370b80 f22142n;

    /* renamed from: q */
    public InterfaceC5100a f22145q;

    /* renamed from: a */
    public boolean f22129a = false;

    /* renamed from: b */
    public int f22130b = 0;

    /* renamed from: c */
    public HashMap<String, C48017rN5> f22131c = null;

    /* renamed from: e */
    public int f22133e = 32;

    /* renamed from: f */
    public int f22134f = 32;

    /* renamed from: h */
    public boolean f22136h = false;

    /* renamed from: i */
    public boolean f22137i = false;

    /* renamed from: j */
    public boolean[] f22138j = new boolean[32];

    /* renamed from: k */
    public int f22139k = 1;

    /* renamed from: l */
    public int f22140l = 0;

    /* renamed from: m */
    public int f22141m = 32;

    /* renamed from: o */
    public C48017rN5[] f22143o = new C48017rN5[f22125w];

    /* renamed from: p */
    public int f22144p = 0;

    /* renamed from: Lr2$a */
    /* loaded from: classes.dex */
    public interface InterfaceC5100a {
        /* renamed from: a */
        void mo4688a(C48017rN5 c48017rN5);

        /* renamed from: b */
        C48017rN5 mo4687b(C34342Lr2 c34342Lr2, boolean[] zArr);

        /* renamed from: c */
        void mo4686c(InterfaceC5100a interfaceC5100a);

        void clear();

        C48017rN5 getKey();

        boolean isEmpty();
    }

    /* renamed from: Lr2$b */
    /* loaded from: classes.dex */
    public class C5101b extends C30303xo {
        public C5101b(C38370b80 c38370b80) {
            this.f118140e = new C48609sN5(this, c38370b80);
        }
    }

    public C34342Lr2() {
        this.f22135g = null;
        this.f22135g = new C30303xo[32];
        m96293D();
        C38370b80 c38370b80 = new C38370b80();
        this.f22142n = c38370b80;
        this.f22132d = new Q24(c38370b80);
        if (f22124v) {
            this.f22145q = new C5101b(c38370b80);
        } else {
            this.f22145q = new C30303xo(c38370b80);
        }
    }

    /* renamed from: s */
    public static C30303xo m96273s(C34342Lr2 c34342Lr2, C48017rN5 c48017rN5, C48017rN5 c48017rN52, float f) {
        return c34342Lr2.m96274r().m4679j(c48017rN5, c48017rN52, f);
    }

    /* renamed from: x */
    public static C38572bU2 m96268x() {
        return f22126x;
    }

    /* renamed from: A */
    public void m96296A() throws Exception {
        C38572bU2 c38572bU2 = f22126x;
        if (c38572bU2 != null) {
            c38572bU2.f57536e++;
        }
        if (this.f22132d.isEmpty()) {
            m96278n();
        } else if (!this.f22136h && !this.f22137i) {
            m96295B(this.f22132d);
        } else {
            C38572bU2 c38572bU22 = f22126x;
            if (c38572bU22 != null) {
                c38572bU22.f57548q++;
            }
            boolean z = false;
            int i = 0;
            while (true) {
                if (i < this.f22140l) {
                    if (!this.f22135g[i].f118141f) {
                        break;
                    }
                    i++;
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                m96295B(this.f22132d);
                return;
            }
            C38572bU2 c38572bU23 = f22126x;
            if (c38572bU23 != null) {
                c38572bU23.f57547p++;
            }
            m96278n();
        }
    }

    /* renamed from: B */
    public void m96295B(InterfaceC5100a interfaceC5100a) throws Exception {
        C38572bU2 c38572bU2 = f22126x;
        if (c38572bU2 != null) {
            c38572bU2.f57551t++;
            c38572bU2.f57552u = Math.max(c38572bU2.f57552u, this.f22139k);
            C38572bU2 c38572bU22 = f22126x;
            c38572bU22.f57553v = Math.max(c38572bU22.f57553v, this.f22140l);
        }
        m96271u(interfaceC5100a);
        m96294C(interfaceC5100a, false);
        m96278n();
    }

    /* renamed from: C */
    public final int m96294C(InterfaceC5100a interfaceC5100a, boolean z) {
        C38572bU2 c38572bU2 = f22126x;
        if (c38572bU2 != null) {
            c38572bU2.f57539h++;
        }
        for (int i = 0; i < this.f22139k; i++) {
            this.f22138j[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C38572bU2 c38572bU22 = f22126x;
            if (c38572bU22 != null) {
                c38572bU22.f57540i++;
            }
            i2++;
            if (i2 >= this.f22139k * 2) {
                return i2;
            }
            if (interfaceC5100a.getKey() != null) {
                this.f22138j[interfaceC5100a.getKey().f106919d] = true;
            }
            C48017rN5 mo4687b = interfaceC5100a.mo4687b(this, this.f22138j);
            if (mo4687b != null) {
                boolean[] zArr = this.f22138j;
                int i3 = mo4687b.f106919d;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (mo4687b != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f22140l; i5++) {
                    C30303xo c30303xo = this.f22135g[i5];
                    if (c30303xo.f118136a.f106926k != C48017rN5.EnumC27904a.UNRESTRICTED && !c30303xo.f118141f && c30303xo.m4669t(mo4687b)) {
                        float mo4655h = c30303xo.f118140e.mo4655h(mo4687b);
                        if (mo4655h < 0.0f) {
                            float f2 = (-c30303xo.f118137b) / mo4655h;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C30303xo c30303xo2 = this.f22135g[i4];
                    c30303xo2.f118136a.f106920e = -1;
                    C38572bU2 c38572bU23 = f22126x;
                    if (c38572bU23 != null) {
                        c38572bU23.f57541j++;
                    }
                    c30303xo2.m4665x(mo4687b);
                    C48017rN5 c48017rN5 = c30303xo2.f118136a;
                    c48017rN5.f106920e = i4;
                    c48017rN5.m16019h(this, c30303xo2);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    /* renamed from: D */
    public final void m96293D() {
        int i = 0;
        if (f22124v) {
            while (i < this.f22140l) {
                C30303xo c30303xo = this.f22135g[i];
                if (c30303xo != null) {
                    this.f22142n.f56960a.mo30347b(c30303xo);
                }
                this.f22135g[i] = null;
                i++;
            }
            return;
        }
        while (i < this.f22140l) {
            C30303xo c30303xo2 = this.f22135g[i];
            if (c30303xo2 != null) {
                this.f22142n.f56961b.mo30347b(c30303xo2);
            }
            this.f22135g[i] = null;
            i++;
        }
    }

    /* renamed from: E */
    public void m96292E() {
        C38370b80 c38370b80;
        int i = 0;
        while (true) {
            c38370b80 = this.f22142n;
            C48017rN5[] c48017rN5Arr = c38370b80.f56963d;
            if (i >= c48017rN5Arr.length) {
                break;
            }
            C48017rN5 c48017rN5 = c48017rN5Arr[i];
            if (c48017rN5 != null) {
                c48017rN5.m16022e();
            }
            i++;
        }
        c38370b80.f56962c.mo30346c(this.f22143o, this.f22144p);
        this.f22144p = 0;
        Arrays.fill(this.f22142n.f56963d, (Object) null);
        HashMap<String, C48017rN5> hashMap = this.f22131c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f22130b = 0;
        this.f22132d.clear();
        this.f22139k = 1;
        for (int i2 = 0; i2 < this.f22140l; i2++) {
            C30303xo c30303xo = this.f22135g[i2];
            if (c30303xo != null) {
                c30303xo.f118138c = false;
            }
        }
        m96293D();
        this.f22140l = 0;
        if (f22124v) {
            this.f22145q = new C5101b(this.f22142n);
        } else {
            this.f22145q = new C30303xo(this.f22142n);
        }
    }

    /* renamed from: a */
    public final C48017rN5 m96291a(C48017rN5.EnumC27904a enumC27904a, String str) {
        C48017rN5 mo30348a = this.f22142n.f56962c.mo30348a();
        if (mo30348a == null) {
            mo30348a = new C48017rN5(enumC27904a, str);
            mo30348a.m16020g(enumC27904a, str);
        } else {
            mo30348a.m16022e();
            mo30348a.m16020g(enumC27904a, str);
        }
        int i = this.f22144p;
        int i2 = f22125w;
        if (i >= i2) {
            int i3 = i2 * 2;
            f22125w = i3;
            this.f22143o = (C48017rN5[]) Arrays.copyOf(this.f22143o, i3);
        }
        C48017rN5[] c48017rN5Arr = this.f22143o;
        int i4 = this.f22144p;
        this.f22144p = i4 + 1;
        c48017rN5Arr[i4] = mo30348a;
        return mo30348a;
    }

    /* renamed from: b */
    public void m96290b(C43042iz0 c43042iz0, C43042iz0 c43042iz02, float f, int i) {
        C37211Xy0.EnumC9561b enumC9561b = C37211Xy0.EnumC9561b.LEFT;
        C48017rN5 m96275q = m96275q(c43042iz0.mo7200q(enumC9561b));
        C37211Xy0.EnumC9561b enumC9561b2 = C37211Xy0.EnumC9561b.TOP;
        C48017rN5 m96275q2 = m96275q(c43042iz0.mo7200q(enumC9561b2));
        C37211Xy0.EnumC9561b enumC9561b3 = C37211Xy0.EnumC9561b.RIGHT;
        C48017rN5 m96275q3 = m96275q(c43042iz0.mo7200q(enumC9561b3));
        C37211Xy0.EnumC9561b enumC9561b4 = C37211Xy0.EnumC9561b.BOTTOM;
        C48017rN5 m96275q4 = m96275q(c43042iz0.mo7200q(enumC9561b4));
        C48017rN5 m96275q5 = m96275q(c43042iz02.mo7200q(enumC9561b));
        C48017rN5 m96275q6 = m96275q(c43042iz02.mo7200q(enumC9561b2));
        C48017rN5 m96275q7 = m96275q(c43042iz02.mo7200q(enumC9561b3));
        C48017rN5 m96275q8 = m96275q(c43042iz02.mo7200q(enumC9561b4));
        C30303xo m96274r = m96274r();
        double d = f;
        double d2 = i;
        m96274r.m4672q(m96275q2, m96275q4, m96275q6, m96275q8, (float) (Math.sin(d) * d2));
        m96288d(m96274r);
        C30303xo m96274r2 = m96274r();
        m96274r2.m4672q(m96275q, m96275q3, m96275q5, m96275q7, (float) (Math.cos(d) * d2));
        m96288d(m96274r2);
    }

    /* renamed from: c */
    public void m96289c(C48017rN5 c48017rN5, C48017rN5 c48017rN52, int i, float f, C48017rN5 c48017rN53, C48017rN5 c48017rN54, int i2, int i3) {
        C30303xo m96274r = m96274r();
        m96274r.m4681h(c48017rN5, c48017rN52, i, f, c48017rN53, c48017rN54, i2);
        if (i3 != 8) {
            m96274r.m4685d(this, i3);
        }
        m96288d(m96274r);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m96288d(C30303xo c30303xo) {
        C48017rN5 m4667v;
        if (c30303xo == null) {
            return;
        }
        C38572bU2 c38572bU2 = f22126x;
        if (c38572bU2 != null) {
            c38572bU2.f57537f++;
            if (c30303xo.f118141f) {
                c38572bU2.f57538g++;
            }
        }
        boolean z = true;
        if (this.f22140l + 1 >= this.f22141m || this.f22139k + 1 >= this.f22134f) {
            m96266z();
        }
        boolean z2 = false;
        if (!c30303xo.f118141f) {
            c30303xo.m4689D(this);
            if (c30303xo.isEmpty()) {
                return;
            }
            c30303xo.m4671r();
            if (c30303xo.m4683f(this)) {
                C48017rN5 m96276p = m96276p();
                c30303xo.f118136a = m96276p;
                int i = this.f22140l;
                m96280l(c30303xo);
                if (this.f22140l == i + 1) {
                    this.f22145q.mo4686c(c30303xo);
                    m96294C(this.f22145q, true);
                    if (m96276p.f106920e == -1) {
                        if (c30303xo.f118136a == m96276p && (m4667v = c30303xo.m4667v(m96276p)) != null) {
                            C38572bU2 c38572bU22 = f22126x;
                            if (c38572bU22 != null) {
                                c38572bU22.f57541j++;
                            }
                            c30303xo.m4665x(m4667v);
                        }
                        if (!c30303xo.f118141f) {
                            c30303xo.f118136a.m16019h(this, c30303xo);
                        }
                        if (f22124v) {
                            this.f22142n.f56960a.mo30347b(c30303xo);
                        } else {
                            this.f22142n.f56961b.mo30347b(c30303xo);
                        }
                        this.f22140l--;
                    }
                    if (c30303xo.m4670s()) {
                        return;
                    }
                    z2 = z;
                }
            }
            z = false;
            if (c30303xo.m4670s()) {
            }
        }
        if (!z2) {
            m96280l(c30303xo);
        }
    }

    /* renamed from: e */
    public C30303xo m96287e(C48017rN5 c48017rN5, C48017rN5 c48017rN52, int i, int i2) {
        if (f22121s && i2 == 8 && c48017rN52.f106923h && c48017rN5.f106920e == -1) {
            c48017rN5.m16021f(this, c48017rN52.f106922g + i);
            return null;
        }
        C30303xo m96274r = m96274r();
        m96274r.m4675n(c48017rN5, c48017rN52, i);
        if (i2 != 8) {
            m96274r.m4685d(this, i2);
        }
        m96288d(m96274r);
        return m96274r;
    }

    /* renamed from: f */
    public void m96286f(C48017rN5 c48017rN5, int i) {
        if (f22121s && c48017rN5.f106920e == -1) {
            float f = i;
            c48017rN5.m16021f(this, f);
            for (int i2 = 0; i2 < this.f22130b + 1; i2++) {
                C48017rN5 c48017rN52 = this.f22142n.f56963d[i2];
                if (c48017rN52 != null && c48017rN52.f106930o && c48017rN52.f106931p == c48017rN5.f106919d) {
                    c48017rN52.m16021f(this, c48017rN52.f106932q + f);
                }
            }
            return;
        }
        int i3 = c48017rN5.f106920e;
        if (i3 != -1) {
            C30303xo c30303xo = this.f22135g[i3];
            if (c30303xo.f118141f) {
                c30303xo.f118137b = i;
                return;
            } else if (c30303xo.f118140e.mo4654i() == 0) {
                c30303xo.f118141f = true;
                c30303xo.f118137b = i;
                return;
            } else {
                C30303xo m96274r = m96274r();
                m96274r.m4676m(c48017rN5, i);
                m96288d(m96274r);
                return;
            }
        }
        C30303xo m96274r2 = m96274r();
        m96274r2.m4680i(c48017rN5, i);
        m96288d(m96274r2);
    }

    /* renamed from: g */
    public void m96285g(C48017rN5 c48017rN5, C48017rN5 c48017rN52, int i, boolean z) {
        C30303xo m96274r = m96274r();
        C48017rN5 m96272t = m96272t();
        m96272t.f106921f = 0;
        m96274r.m4674o(c48017rN5, c48017rN52, m96272t, i);
        m96288d(m96274r);
    }

    /* renamed from: h */
    public void m96284h(C48017rN5 c48017rN5, C48017rN5 c48017rN52, int i, int i2) {
        C30303xo m96274r = m96274r();
        C48017rN5 m96272t = m96272t();
        m96272t.f106921f = 0;
        m96274r.m4674o(c48017rN5, c48017rN52, m96272t, i);
        if (i2 != 8) {
            m96279m(m96274r, (int) (m96274r.f118140e.mo4655h(m96272t) * (-1.0f)), i2);
        }
        m96288d(m96274r);
    }

    /* renamed from: i */
    public void m96283i(C48017rN5 c48017rN5, C48017rN5 c48017rN52, int i, boolean z) {
        C30303xo m96274r = m96274r();
        C48017rN5 m96272t = m96272t();
        m96272t.f106921f = 0;
        m96274r.m4673p(c48017rN5, c48017rN52, m96272t, i);
        m96288d(m96274r);
    }

    /* renamed from: j */
    public void m96282j(C48017rN5 c48017rN5, C48017rN5 c48017rN52, int i, int i2) {
        C30303xo m96274r = m96274r();
        C48017rN5 m96272t = m96272t();
        m96272t.f106921f = 0;
        m96274r.m4673p(c48017rN5, c48017rN52, m96272t, i);
        if (i2 != 8) {
            m96279m(m96274r, (int) (m96274r.f118140e.mo4655h(m96272t) * (-1.0f)), i2);
        }
        m96288d(m96274r);
    }

    /* renamed from: k */
    public void m96281k(C48017rN5 c48017rN5, C48017rN5 c48017rN52, C48017rN5 c48017rN53, C48017rN5 c48017rN54, float f, int i) {
        C30303xo m96274r = m96274r();
        m96274r.m4678k(c48017rN5, c48017rN52, c48017rN53, c48017rN54, f);
        if (i != 8) {
            m96274r.m4685d(this, i);
        }
        m96288d(m96274r);
    }

    /* renamed from: l */
    public final void m96280l(C30303xo c30303xo) {
        int i;
        if (f22122t && c30303xo.f118141f) {
            c30303xo.f118136a.m16021f(this, c30303xo.f118137b);
        } else {
            C30303xo[] c30303xoArr = this.f22135g;
            int i2 = this.f22140l;
            c30303xoArr[i2] = c30303xo;
            C48017rN5 c48017rN5 = c30303xo.f118136a;
            c48017rN5.f106920e = i2;
            this.f22140l = i2 + 1;
            c48017rN5.m16019h(this, c30303xo);
        }
        if (f22122t && this.f22129a) {
            int i3 = 0;
            while (i3 < this.f22140l) {
                if (this.f22135g[i3] == null) {
                    System.out.println("WTF");
                }
                C30303xo c30303xo2 = this.f22135g[i3];
                if (c30303xo2 != null && c30303xo2.f118141f) {
                    c30303xo2.f118136a.m16021f(this, c30303xo2.f118137b);
                    if (f22124v) {
                        this.f22142n.f56960a.mo30347b(c30303xo2);
                    } else {
                        this.f22142n.f56961b.mo30347b(c30303xo2);
                    }
                    this.f22135g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f22140l;
                        if (i4 >= i) {
                            break;
                        }
                        C30303xo[] c30303xoArr2 = this.f22135g;
                        int i6 = i4 - 1;
                        C30303xo c30303xo3 = c30303xoArr2[i4];
                        c30303xoArr2[i6] = c30303xo3;
                        C48017rN5 c48017rN52 = c30303xo3.f118136a;
                        if (c48017rN52.f106920e == i4) {
                            c48017rN52.f106920e = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f22135g[i5] = null;
                    }
                    this.f22140l = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f22129a = false;
        }
    }

    /* renamed from: m */
    public void m96279m(C30303xo c30303xo, int i, int i2) {
        c30303xo.m4684e(m96277o(i2, null), i);
    }

    /* renamed from: n */
    public final void m96278n() {
        for (int i = 0; i < this.f22140l; i++) {
            C30303xo c30303xo = this.f22135g[i];
            c30303xo.f118136a.f106922g = c30303xo.f118137b;
        }
    }

    /* renamed from: o */
    public C48017rN5 m96277o(int i, String str) {
        C38572bU2 c38572bU2 = f22126x;
        if (c38572bU2 != null) {
            c38572bU2.f57543l++;
        }
        if (this.f22139k + 1 >= this.f22134f) {
            m96266z();
        }
        C48017rN5 m96291a = m96291a(C48017rN5.EnumC27904a.ERROR, str);
        int i2 = this.f22130b + 1;
        this.f22130b = i2;
        this.f22139k++;
        m96291a.f106919d = i2;
        m96291a.f106921f = i;
        this.f22142n.f56963d[i2] = m96291a;
        this.f22132d.mo4688a(m96291a);
        return m96291a;
    }

    /* renamed from: p */
    public C48017rN5 m96276p() {
        C38572bU2 c38572bU2 = f22126x;
        if (c38572bU2 != null) {
            c38572bU2.f57545n++;
        }
        if (this.f22139k + 1 >= this.f22134f) {
            m96266z();
        }
        C48017rN5 m96291a = m96291a(C48017rN5.EnumC27904a.SLACK, null);
        int i = this.f22130b + 1;
        this.f22130b = i;
        this.f22139k++;
        m96291a.f106919d = i;
        this.f22142n.f56963d[i] = m96291a;
        return m96291a;
    }

    /* renamed from: q */
    public C48017rN5 m96275q(Object obj) {
        C48017rN5 c48017rN5 = null;
        if (obj == null) {
            return null;
        }
        if (this.f22139k + 1 >= this.f22134f) {
            m96266z();
        }
        if (obj instanceof C37211Xy0) {
            C37211Xy0 c37211Xy0 = (C37211Xy0) obj;
            c48017rN5 = c37211Xy0.m75994i();
            if (c48017rN5 == null) {
                c37211Xy0.m75984s(this.f22142n);
                c48017rN5 = c37211Xy0.m75994i();
            }
            int i = c48017rN5.f106919d;
            if (i == -1 || i > this.f22130b || this.f22142n.f56963d[i] == null) {
                if (i != -1) {
                    c48017rN5.m16022e();
                }
                int i2 = this.f22130b + 1;
                this.f22130b = i2;
                this.f22139k++;
                c48017rN5.f106919d = i2;
                c48017rN5.f106926k = C48017rN5.EnumC27904a.UNRESTRICTED;
                this.f22142n.f56963d[i2] = c48017rN5;
            }
        }
        return c48017rN5;
    }

    /* renamed from: r */
    public C30303xo m96274r() {
        C30303xo mo30348a;
        if (f22124v) {
            mo30348a = this.f22142n.f56960a.mo30348a();
            if (mo30348a == null) {
                mo30348a = new C5101b(this.f22142n);
                f22128z++;
            } else {
                mo30348a.m4664y();
            }
        } else {
            mo30348a = this.f22142n.f56961b.mo30348a();
            if (mo30348a == null) {
                mo30348a = new C30303xo(this.f22142n);
                f22127y++;
            } else {
                mo30348a.m4664y();
            }
        }
        C48017rN5.m16024c();
        return mo30348a;
    }

    /* renamed from: t */
    public C48017rN5 m96272t() {
        C38572bU2 c38572bU2 = f22126x;
        if (c38572bU2 != null) {
            c38572bU2.f57544m++;
        }
        if (this.f22139k + 1 >= this.f22134f) {
            m96266z();
        }
        C48017rN5 m96291a = m96291a(C48017rN5.EnumC27904a.SLACK, null);
        int i = this.f22130b + 1;
        this.f22130b = i;
        this.f22139k++;
        m96291a.f106919d = i;
        this.f22142n.f56963d[i] = m96291a;
        return m96291a;
    }

    /* renamed from: u */
    public final int m96271u(InterfaceC5100a interfaceC5100a) throws Exception {
        boolean z;
        int i = 0;
        while (true) {
            if (i < this.f22140l) {
                C30303xo c30303xo = this.f22135g[i];
                if (c30303xo.f118136a.f106926k != C48017rN5.EnumC27904a.UNRESTRICTED && c30303xo.f118137b < 0.0f) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            boolean z2 = false;
            int i2 = 0;
            while (!z2) {
                C38572bU2 c38572bU2 = f22126x;
                if (c38572bU2 != null) {
                    c38572bU2.f57542k++;
                }
                i2++;
                float f = Float.MAX_VALUE;
                int i3 = -1;
                int i4 = -1;
                int i5 = 0;
                for (int i6 = 0; i6 < this.f22140l; i6++) {
                    C30303xo c30303xo2 = this.f22135g[i6];
                    if (c30303xo2.f118136a.f106926k != C48017rN5.EnumC27904a.UNRESTRICTED && !c30303xo2.f118141f && c30303xo2.f118137b < 0.0f) {
                        int i7 = 9;
                        if (f22123u) {
                            int mo4654i = c30303xo2.f118140e.mo4654i();
                            int i8 = 0;
                            while (i8 < mo4654i) {
                                C48017rN5 mo4661b = c30303xo2.f118140e.mo4661b(i8);
                                float mo4655h = c30303xo2.f118140e.mo4655h(mo4661b);
                                if (mo4655h > 0.0f) {
                                    int i9 = 0;
                                    while (i9 < i7) {
                                        float f2 = mo4661b.f106924i[i9] / mo4655h;
                                        if ((f2 < f && i9 == i5) || i9 > i5) {
                                            i4 = mo4661b.f106919d;
                                            i5 = i9;
                                            i3 = i6;
                                            f = f2;
                                        }
                                        i9++;
                                        i7 = 9;
                                    }
                                }
                                i8++;
                                i7 = 9;
                            }
                        } else {
                            for (int i10 = 1; i10 < this.f22139k; i10++) {
                                C48017rN5 c48017rN5 = this.f22142n.f56963d[i10];
                                float mo4655h2 = c30303xo2.f118140e.mo4655h(c48017rN5);
                                if (mo4655h2 > 0.0f) {
                                    for (int i11 = 0; i11 < 9; i11++) {
                                        float f3 = c48017rN5.f106924i[i11] / mo4655h2;
                                        if ((f3 < f && i11 == i5) || i11 > i5) {
                                            i4 = i10;
                                            i5 = i11;
                                            i3 = i6;
                                            f = f3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (i3 != -1) {
                    C30303xo c30303xo3 = this.f22135g[i3];
                    c30303xo3.f118136a.f106920e = -1;
                    C38572bU2 c38572bU22 = f22126x;
                    if (c38572bU22 != null) {
                        c38572bU22.f57541j++;
                    }
                    c30303xo3.m4665x(this.f22142n.f56963d[i4]);
                    C48017rN5 c48017rN52 = c30303xo3.f118136a;
                    c48017rN52.f106920e = i3;
                    c48017rN52.m16019h(this, c30303xo3);
                } else {
                    z2 = true;
                }
                if (i2 > this.f22139k / 2) {
                    z2 = true;
                }
            }
            return i2;
        }
        return 0;
    }

    /* renamed from: v */
    public void m96270v(C38572bU2 c38572bU2) {
        f22126x = c38572bU2;
    }

    /* renamed from: w */
    public C38370b80 m96269w() {
        return this.f22142n;
    }

    /* renamed from: y */
    public int m96267y(Object obj) {
        C48017rN5 m75994i = ((C37211Xy0) obj).m75994i();
        if (m75994i != null) {
            return (int) (m75994i.f106922g + 0.5f);
        }
        return 0;
    }

    /* renamed from: z */
    public final void m96266z() {
        int i = this.f22133e * 2;
        this.f22133e = i;
        this.f22135g = (C30303xo[]) Arrays.copyOf(this.f22135g, i);
        C38370b80 c38370b80 = this.f22142n;
        c38370b80.f56963d = (C48017rN5[]) Arrays.copyOf(c38370b80.f56963d, this.f22133e);
        int i2 = this.f22133e;
        this.f22138j = new boolean[i2];
        this.f22134f = i2;
        this.f22141m = i2;
        C38572bU2 c38572bU2 = f22126x;
        if (c38572bU2 != null) {
            c38572bU2.f57535d++;
            c38572bU2.f57546o = Math.max(c38572bU2.f57546o, i2);
            C38572bU2 c38572bU22 = f22126x;
            c38572bU22.f57556y = c38572bU22.f57546o;
        }
    }
}
