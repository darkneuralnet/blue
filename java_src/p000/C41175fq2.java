package p000;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import java.util.ArrayList;
import java.util.List;
/* renamed from: fq2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C41175fq2 extends AbstractC34817Ns0 {

    /* renamed from: h */
    public C41768gq2[] f80786h;

    /* renamed from: g */
    public C41768gq2[] f80785g = new C41768gq2[0];

    /* renamed from: i */
    public boolean f80787i = false;

    /* renamed from: j */
    public EnumC20548d f80788j = EnumC20548d.LEFT;

    /* renamed from: k */
    public EnumC20550f f80789k = EnumC20550f.BOTTOM;

    /* renamed from: l */
    public EnumC20549e f80790l = EnumC20549e.HORIZONTAL;

    /* renamed from: m */
    public boolean f80791m = false;

    /* renamed from: n */
    public EnumC20546b f80792n = EnumC20546b.LEFT_TO_RIGHT;

    /* renamed from: o */
    public EnumC20547c f80793o = EnumC20547c.SQUARE;

    /* renamed from: p */
    public float f80794p = 8.0f;

    /* renamed from: q */
    public float f80795q = 3.0f;

    /* renamed from: r */
    public DashPathEffect f80796r = null;

    /* renamed from: s */
    public float f80797s = 6.0f;

    /* renamed from: t */
    public float f80798t = 0.0f;

    /* renamed from: u */
    public float f80799u = 5.0f;

    /* renamed from: v */
    public float f80800v = 3.0f;

    /* renamed from: w */
    public float f80801w = 0.95f;

    /* renamed from: x */
    public float f80802x = 0.0f;

    /* renamed from: y */
    public float f80803y = 0.0f;

    /* renamed from: z */
    public float f80804z = 0.0f;

    /* renamed from: A */
    public float f80780A = 0.0f;

    /* renamed from: B */
    public boolean f80781B = false;

    /* renamed from: C */
    public List<C37536Zi1> f80782C = new ArrayList(16);

    /* renamed from: D */
    public List<Boolean> f80783D = new ArrayList(16);

    /* renamed from: E */
    public List<C37536Zi1> f80784E = new ArrayList(16);

    /* renamed from: fq2$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C20545a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f80805a;

        static {
            int[] iArr = new int[EnumC20549e.values().length];
            f80805a = iArr;
            try {
                iArr[EnumC20549e.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f80805a[EnumC20549e.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: fq2$b */
    /* loaded from: classes5.dex */
    public enum EnumC20546b {
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT
    }

    /* renamed from: fq2$c */
    /* loaded from: classes5.dex */
    public enum EnumC20547c {
        NONE,
        EMPTY,
        DEFAULT,
        SQUARE,
        CIRCLE,
        LINE
    }

    /* renamed from: fq2$d */
    /* loaded from: classes5.dex */
    public enum EnumC20548d {
        LEFT,
        CENTER,
        RIGHT
    }

    /* renamed from: fq2$e */
    /* loaded from: classes5.dex */
    public enum EnumC20549e {
        HORIZONTAL,
        VERTICAL
    }

    /* renamed from: fq2$f */
    /* loaded from: classes5.dex */
    public enum EnumC20550f {
        TOP,
        CENTER,
        BOTTOM
    }

    public C41175fq2() {
        this.f25314e = AbstractC34967Oi6.m91656e(10.0f);
        this.f25311b = AbstractC34967Oi6.m91656e(5.0f);
        this.f25312c = AbstractC34967Oi6.m91656e(3.0f);
    }

    /* renamed from: A */
    public EnumC20550f m40778A() {
        return this.f80789k;
    }

    /* renamed from: B */
    public float m40777B() {
        return this.f80797s;
    }

    /* renamed from: C */
    public float m40776C() {
        return this.f80798t;
    }

    /* renamed from: D */
    public boolean m40775D() {
        return this.f80791m;
    }

    /* renamed from: E */
    public boolean m40774E() {
        return this.f80787i;
    }

    /* renamed from: F */
    public void m40773F(List<C41768gq2> list) {
        this.f80785g = (C41768gq2[]) list.toArray(new C41768gq2[list.size()]);
    }

    /* renamed from: i */
    public void m40772i(Paint paint, C32951Fs6 c32951Fs6) {
        boolean z;
        float m91656e;
        boolean z2;
        float m91656e2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i;
        float f7;
        float m91656e3 = AbstractC34967Oi6.m91656e(this.f80794p);
        float m91656e4 = AbstractC34967Oi6.m91656e(this.f80800v);
        float m91656e5 = AbstractC34967Oi6.m91656e(this.f80799u);
        float m91656e6 = AbstractC34967Oi6.m91656e(this.f80797s);
        float m91656e7 = AbstractC34967Oi6.m91656e(this.f80798t);
        boolean z3 = this.f80781B;
        C41768gq2[] c41768gq2Arr = this.f80785g;
        int length = c41768gq2Arr.length;
        this.f80780A = m40757x(paint);
        this.f80804z = m40758w(paint);
        int i2 = C20545a.f80805a[this.f80790l.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                float m91650k = AbstractC34967Oi6.m91650k(paint);
                float m91648m = AbstractC34967Oi6.m91648m(paint) + m91656e7;
                float m106376k = c32951Fs6.m106376k() * this.f80801w;
                this.f80783D.clear();
                this.f80782C.clear();
                this.f80784E.clear();
                int i3 = 0;
                float f8 = 0.0f;
                int i4 = -1;
                float f9 = 0.0f;
                float f10 = 0.0f;
                while (i3 < length) {
                    C41768gq2 c41768gq2 = c41768gq2Arr[i3];
                    float f11 = m91656e3;
                    float f12 = m91656e6;
                    if (c41768gq2.f84339b != EnumC20547c.NONE) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (Float.isNaN(c41768gq2.f84340c)) {
                        m91656e2 = f11;
                    } else {
                        m91656e2 = AbstractC34967Oi6.m91656e(c41768gq2.f84340c);
                    }
                    String str = c41768gq2.f84338a;
                    C41768gq2[] c41768gq2Arr2 = c41768gq2Arr;
                    float f13 = m91648m;
                    this.f80783D.add(Boolean.FALSE);
                    if (i4 == -1) {
                        f = 0.0f;
                    } else {
                        f = f9 + m91656e4;
                    }
                    if (str != null) {
                        f2 = m91656e4;
                        this.f80782C.add(AbstractC34967Oi6.m91659b(paint, str));
                        if (z2) {
                            f7 = m91656e5 + m91656e2;
                        } else {
                            f7 = 0.0f;
                        }
                        f4 = f + f7 + this.f80782C.get(i3).f48979c;
                    } else {
                        f2 = m91656e4;
                        float f14 = m91656e2;
                        this.f80782C.add(C37536Zi1.m72661b(0.0f, 0.0f));
                        if (z2) {
                            f3 = f14;
                        } else {
                            f3 = 0.0f;
                        }
                        f4 = f + f3;
                        if (i4 == -1) {
                            i4 = i3;
                        }
                    }
                    if (str != null || i3 == length - 1) {
                        float f15 = f10;
                        int i5 = (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1));
                        if (i5 == 0) {
                            f5 = 0.0f;
                        } else {
                            f5 = f12;
                        }
                        if (z3 && i5 != 0 && m106376k - f15 < f5 + f4) {
                            this.f80784E.add(C37536Zi1.m72661b(f15, m91650k));
                            float max = Math.max(f8, f15);
                            List<Boolean> list = this.f80783D;
                            if (i4 > -1) {
                                i = i4;
                            } else {
                                i = i3;
                            }
                            list.set(i, Boolean.TRUE);
                            f8 = max;
                            f6 = f4;
                        } else {
                            f6 = f15 + f5 + f4;
                        }
                        if (i3 == length - 1) {
                            this.f80784E.add(C37536Zi1.m72661b(f6, m91650k));
                            f8 = Math.max(f8, f6);
                        }
                        f10 = f6;
                    }
                    if (str != null) {
                        i4 = -1;
                    }
                    i3++;
                    m91656e4 = f2;
                    m91656e3 = f11;
                    m91656e6 = f12;
                    m91648m = f13;
                    f9 = f4;
                    c41768gq2Arr = c41768gq2Arr2;
                }
                float f16 = m91648m;
                this.f80802x = f8;
                this.f80803y = (m91650k * this.f80784E.size()) + (f16 * (this.f80784E.size() == 0 ? 0 : this.f80784E.size() - 1));
            }
        } else {
            float m91650k2 = AbstractC34967Oi6.m91650k(paint);
            float f17 = 0.0f;
            float f18 = 0.0f;
            float f19 = 0.0f;
            boolean z4 = false;
            for (int i6 = 0; i6 < length; i6++) {
                C41768gq2 c41768gq22 = c41768gq2Arr[i6];
                if (c41768gq22.f84339b != EnumC20547c.NONE) {
                    z = true;
                } else {
                    z = false;
                }
                if (Float.isNaN(c41768gq22.f84340c)) {
                    m91656e = m91656e3;
                } else {
                    m91656e = AbstractC34967Oi6.m91656e(c41768gq22.f84340c);
                }
                String str2 = c41768gq22.f84338a;
                if (!z4) {
                    f19 = 0.0f;
                }
                if (z) {
                    if (z4) {
                        f19 += m91656e4;
                    }
                    f19 += m91656e;
                }
                if (str2 != null) {
                    if (z && !z4) {
                        f19 += m91656e5;
                    } else if (z4) {
                        f17 = Math.max(f17, f19);
                        f18 += m91650k2 + m91656e7;
                        f19 = 0.0f;
                        z4 = false;
                    }
                    f19 += AbstractC34967Oi6.m91657d(paint, str2);
                    if (i6 < length - 1) {
                        f18 += m91650k2 + m91656e7;
                    }
                } else {
                    f19 += m91656e;
                    if (i6 < length - 1) {
                        f19 += m91656e4;
                    }
                    z4 = true;
                }
                f17 = Math.max(f17, f19);
            }
            this.f80802x = f17;
            this.f80803y = f18;
        }
        this.f80803y += this.f25312c;
        this.f80802x += this.f25311b;
    }

    /* renamed from: j */
    public List<Boolean> m40771j() {
        return this.f80783D;
    }

    /* renamed from: k */
    public List<C37536Zi1> m40770k() {
        return this.f80782C;
    }

    /* renamed from: l */
    public List<C37536Zi1> m40769l() {
        return this.f80784E;
    }

    /* renamed from: m */
    public EnumC20546b m40768m() {
        return this.f80792n;
    }

    /* renamed from: n */
    public C41768gq2[] m40767n() {
        return this.f80785g;
    }

    /* renamed from: o */
    public C41768gq2[] m40766o() {
        return this.f80786h;
    }

    /* renamed from: p */
    public EnumC20547c m40765p() {
        return this.f80793o;
    }

    /* renamed from: q */
    public DashPathEffect m40764q() {
        return this.f80796r;
    }

    /* renamed from: r */
    public float m40763r() {
        return this.f80795q;
    }

    /* renamed from: s */
    public float m40762s() {
        return this.f80794p;
    }

    /* renamed from: t */
    public float m40761t() {
        return this.f80799u;
    }

    /* renamed from: u */
    public EnumC20548d m40760u() {
        return this.f80788j;
    }

    /* renamed from: v */
    public float m40759v() {
        return this.f80801w;
    }

    /* renamed from: w */
    public float m40758w(Paint paint) {
        float f = 0.0f;
        for (C41768gq2 c41768gq2 : this.f80785g) {
            String str = c41768gq2.f84338a;
            if (str != null) {
                float m91660a = AbstractC34967Oi6.m91660a(paint, str);
                if (m91660a > f) {
                    f = m91660a;
                }
            }
        }
        return f;
    }

    /* renamed from: x */
    public float m40757x(Paint paint) {
        C41768gq2[] c41768gq2Arr;
        float f;
        float m91656e = AbstractC34967Oi6.m91656e(this.f80799u);
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (C41768gq2 c41768gq2 : this.f80785g) {
            if (Float.isNaN(c41768gq2.f84340c)) {
                f = this.f80794p;
            } else {
                f = c41768gq2.f84340c;
            }
            float m91656e2 = AbstractC34967Oi6.m91656e(f);
            if (m91656e2 > f3) {
                f3 = m91656e2;
            }
            String str = c41768gq2.f84338a;
            if (str != null) {
                float m91657d = AbstractC34967Oi6.m91657d(paint, str);
                if (m91657d > f2) {
                    f2 = m91657d;
                }
            }
        }
        return f2 + f3 + m91656e;
    }

    /* renamed from: y */
    public EnumC20549e m40756y() {
        return this.f80790l;
    }

    /* renamed from: z */
    public float m40755z() {
        return this.f80800v;
    }
}
