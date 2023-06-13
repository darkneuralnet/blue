package p000;

import co.bird.android.model.GeometryCollection;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.EnumSet;
/* renamed from: kw6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C44204kw6 {

    /* renamed from: a */
    public EnumSet<EnumC31832Ay3> f95242a;

    /* renamed from: b */
    public final int f95243b;

    /* renamed from: c */
    public C40414eZ3 f95244c;

    /* renamed from: d */
    public C32066By3 f95245d;

    /* renamed from: e */
    public boolean f95246e;

    /* renamed from: f */
    public int f95247f;

    /* renamed from: g */
    public String f95248g;

    /* renamed from: kw6$b */
    /* loaded from: classes8.dex */
    public class C25562b implements GB0 {

        /* renamed from: b */
        public final EnumSet<EnumC31832Ay3> f95249b;

        /* renamed from: c */
        public final EnumSet<EnumC31832Ay3> f95250c;

        /* renamed from: a */
        public EnumSet<EnumC31832Ay3> m28117a() {
            return this.f95250c;
        }

        @Override // p000.GB0
        /* renamed from: d */
        public void mo16954d(EB0 eb0, int i) {
            EnumSet<EnumC31832Ay3> enumSet = this.f95249b;
            EnumC31832Ay3 enumC31832Ay3 = EnumC31832Ay3.Z;
            if (enumSet.contains(enumC31832Ay3) && !this.f95250c.contains(enumC31832Ay3) && !Double.isNaN(eb0.mo1714W0(i))) {
                this.f95250c.add(enumC31832Ay3);
            }
            EnumSet<EnumC31832Ay3> enumSet2 = this.f95249b;
            EnumC31832Ay3 enumC31832Ay32 = EnumC31832Ay3.M;
            if (enumSet2.contains(enumC31832Ay32) && !this.f95250c.contains(enumC31832Ay32) && !Double.isNaN(eb0.mo1706v3(i))) {
                this.f95250c.add(enumC31832Ay32);
            }
        }

        @Override // p000.GB0
        /* renamed from: e */
        public boolean mo16953e() {
            return false;
        }

        @Override // p000.GB0
        public boolean isDone() {
            return this.f95250c.equals(this.f95249b);
        }

        public C25562b(EnumSet<EnumC31832Ay3> enumSet) {
            this.f95250c = EnumSet.of(EnumC31832Ay3.X, EnumC31832Ay3.Y);
            this.f95249b = enumSet;
        }
    }

    public C44204kw6() {
        this(2);
    }

    /* renamed from: A */
    public static String m28149A(C52053yB0 c52053yB0, C52053yB0 c52053yB02) {
        return "LINESTRING ( " + m28123u(c52053yB0) + ", " + m28123u(c52053yB02) + " )";
    }

    /* renamed from: B */
    public static String m28148B(EB0 eb0) {
        StringBuilder sb = new StringBuilder();
        sb.append("LINESTRING");
        sb.append(" ");
        if (eb0.size() == 0) {
            sb.append("EMPTY");
        } else {
            sb.append("(");
            for (int i = 0; i < eb0.size(); i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(m28124t(eb0.mo1708n2(i), eb0.mo1716N0(i)));
            }
            sb.append(")");
        }
        return sb.toString();
    }

    /* renamed from: C */
    public static String m28147C(C52053yB0[] c52053yB0Arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("LINESTRING");
        sb.append(" ");
        if (c52053yB0Arr.length == 0) {
            sb.append("EMPTY");
        } else {
            sb.append("(");
            for (int i = 0; i < c52053yB0Arr.length; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(m28123u(c52053yB0Arr[i]));
            }
            sb.append(")");
        }
        return sb.toString();
    }

    /* renamed from: F */
    public static String m28144F(double d, C32066By3 c32066By3) {
        return c32066By3.m113211c(d);
    }

    /* renamed from: s */
    public static C32066By3 m28125s(C40414eZ3 c40414eZ3) {
        return C32066By3.m113213a(c40414eZ3.m42765a());
    }

    /* renamed from: t */
    public static String m28124t(double d, double d2) {
        return C32066By3.f3145b.m113211c(d) + " " + C32066By3.f3145b.m113211c(d2);
    }

    /* renamed from: u */
    public static String m28123u(C52053yB0 c52053yB0) {
        return m28124t(c52053yB0.f118922b, c52053yB0.f118923c);
    }

    /* renamed from: z */
    public static String m28118z(char c, int i) {
        StringBuilder sb = new StringBuilder(i);
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(c);
        }
        return sb.toString();
    }

    /* renamed from: D */
    public String m28146D(WB1 wb1) {
        StringWriter stringWriter = new StringWriter();
        try {
            m28145E(wb1, false, stringWriter);
        } catch (IOException unused) {
            C4596Ko.m98280e();
        }
        return stringWriter.toString();
    }

    /* renamed from: E */
    public final void m28145E(WB1 wb1, boolean z, Writer writer) throws IOException {
        m28139e(wb1, z, writer, m28122v(wb1));
    }

    /* renamed from: a */
    public final void m28143a(EB0 eb0, EnumSet<EnumC31832Ay3> enumSet, int i, Writer writer, C32066By3 c32066By3) throws IOException {
        writer.write(m28144F(eb0.mo1708n2(i), c32066By3) + " " + m28144F(eb0.mo1716N0(i), c32066By3));
        if (enumSet.contains(EnumC31832Ay3.Z)) {
            writer.write(" ");
            writer.write(m28144F(eb0.mo1714W0(i), c32066By3));
        }
        if (enumSet.contains(EnumC31832Ay3.M)) {
            writer.write(" ");
            writer.write(m28144F(eb0.mo1706v3(i), c32066By3));
        }
    }

    /* renamed from: b */
    public final void m28142b(XB1 xb1, EnumSet<EnumC31832Ay3> enumSet, boolean z, int i, Writer writer, C32066By3 c32066By3) throws IOException {
        writer.write(GeometryCollection.GeoCollID);
        writer.write(" ");
        m28130n(enumSet, writer);
        m28141c(xb1, enumSet, z, i, writer, c32066By3);
    }

    /* renamed from: c */
    public final void m28141c(XB1 xb1, EnumSet<EnumC31832Ay3> enumSet, boolean z, int i, Writer writer, C32066By3 c32066By3) throws IOException {
        if (xb1.mo77232f0() == 0) {
            writer.write("EMPTY");
            return;
        }
        writer.write("(");
        int i2 = i;
        for (int i3 = 0; i3 < xb1.mo77232f0(); i3++) {
            if (i3 > 0) {
                writer.write(", ");
                i2 = i + 1;
            }
            m28140d(xb1.mo77236d0(i3), enumSet, z, i2, writer, c32066By3);
        }
        writer.write(")");
    }

    /* renamed from: d */
    public final void m28140d(WB1 wb1, EnumSet<EnumC31832Ay3> enumSet, boolean z, int i, Writer writer, C32066By3 c32066By3) throws IOException {
        m28121w(z, i, writer);
        if (wb1 instanceof FW3) {
            m28129o((FW3) wb1, enumSet, z, i, writer, c32066By3);
        } else if (wb1 instanceof C34108Kr2) {
            m28137g((C34108Kr2) wb1, enumSet, z, i, writer, c32066By3);
        } else if (wb1 instanceof C32002Br2) {
            m28138f((C32002Br2) wb1, enumSet, z, i, writer, c32066By3);
        } else if (wb1 instanceof CX3) {
            m28128p((CX3) wb1, enumSet, z, i, writer, c32066By3);
        } else if (wb1 instanceof VW2) {
            m28134j((VW2) wb1, enumSet, z, i, writer, c32066By3);
        } else if (wb1 instanceof DW2) {
            m28136h((DW2) wb1, enumSet, z, i, writer, c32066By3);
        } else if (wb1 instanceof WW2) {
            m28132l((WW2) wb1, enumSet, z, i, writer, c32066By3);
        } else if (wb1 instanceof XB1) {
            m28142b((XB1) wb1, enumSet, z, i, writer, c32066By3);
        } else {
            C4596Ko.m98279f("Unsupported Geometry implementation:" + wb1.getClass());
        }
    }

    /* renamed from: e */
    public final void m28139e(WB1 wb1, boolean z, Writer writer, C32066By3 c32066By3) throws IOException {
        C25562b c25562b = new C25562b(this.f95242a);
        wb1.mo77235e(c25562b);
        m28140d(wb1, c25562b.m28117a(), z, 0, writer, c32066By3);
    }

    /* renamed from: f */
    public final void m28138f(C32002Br2 c32002Br2, EnumSet<EnumC31832Ay3> enumSet, boolean z, int i, Writer writer, C32066By3 c32066By3) throws IOException {
        writer.write("LINESTRING");
        writer.write(" ");
        m28130n(enumSet, writer);
        m28126r(c32002Br2.m113440M0(), enumSet, z, i, false, writer, c32066By3);
    }

    /* renamed from: g */
    public final void m28137g(C34108Kr2 c34108Kr2, EnumSet<EnumC31832Ay3> enumSet, boolean z, int i, Writer writer, C32066By3 c32066By3) throws IOException {
        writer.write("LINEARRING");
        writer.write(" ");
        m28130n(enumSet, writer);
        m28126r(c34108Kr2.m113440M0(), enumSet, z, i, false, writer, c32066By3);
    }

    /* renamed from: h */
    public final void m28136h(DW2 dw2, EnumSet<EnumC31832Ay3> enumSet, boolean z, int i, Writer writer, C32066By3 c32066By3) throws IOException {
        writer.write("MULTILINESTRING");
        writer.write(" ");
        m28130n(enumSet, writer);
        m28135i(dw2, enumSet, z, i, writer, c32066By3);
    }

    /* renamed from: i */
    public final void m28135i(DW2 dw2, EnumSet<EnumC31832Ay3> enumSet, boolean z, int i, Writer writer, C32066By3 c32066By3) throws IOException {
        if (dw2.mo77232f0() == 0) {
            writer.write("EMPTY");
            return;
        }
        writer.write("(");
        boolean z2 = false;
        int i2 = i;
        int i3 = 0;
        while (i3 < dw2.mo77232f0()) {
            if (i3 > 0) {
                writer.write(", ");
                i2 = i + 1;
                z2 = true;
            }
            boolean z3 = z2;
            int i4 = i2;
            m28126r(((C32002Br2) dw2.mo77236d0(i3)).m113440M0(), enumSet, z, i4, z3, writer, c32066By3);
            i3++;
            z2 = z3;
            i2 = i4;
        }
        writer.write(")");
    }

    /* renamed from: j */
    public final void m28134j(VW2 vw2, EnumSet<EnumC31832Ay3> enumSet, boolean z, int i, Writer writer, C32066By3 c32066By3) throws IOException {
        writer.write("MULTIPOINT");
        writer.write(" ");
        m28130n(enumSet, writer);
        m28133k(vw2, enumSet, z, i, writer, c32066By3);
    }

    /* renamed from: k */
    public final void m28133k(VW2 vw2, EnumSet<EnumC31832Ay3> enumSet, boolean z, int i, Writer writer, C32066By3 c32066By3) throws IOException {
        if (vw2.mo77232f0() == 0) {
            writer.write("EMPTY");
            return;
        }
        writer.write("(");
        for (int i2 = 0; i2 < vw2.mo77232f0(); i2++) {
            if (i2 > 0) {
                writer.write(", ");
                m28120x(z, i2, i + 1, writer);
            }
            m28126r(((FW3) vw2.mo77236d0(i2)).m107068L0(), enumSet, z, i, false, writer, c32066By3);
        }
        writer.write(")");
    }

    /* renamed from: l */
    public final void m28132l(WW2 ww2, EnumSet<EnumC31832Ay3> enumSet, boolean z, int i, Writer writer, C32066By3 c32066By3) throws IOException {
        writer.write("MULTIPOLYGON");
        writer.write(" ");
        m28130n(enumSet, writer);
        m28131m(ww2, enumSet, z, i, writer, c32066By3);
    }

    /* renamed from: m */
    public final void m28131m(WW2 ww2, EnumSet<EnumC31832Ay3> enumSet, boolean z, int i, Writer writer, C32066By3 c32066By3) throws IOException {
        if (ww2.mo77232f0() == 0) {
            writer.write("EMPTY");
            return;
        }
        writer.write("(");
        boolean z2 = false;
        int i2 = i;
        int i3 = 0;
        while (i3 < ww2.mo77232f0()) {
            if (i3 > 0) {
                writer.write(", ");
                i2 = i + 1;
                z2 = true;
            }
            boolean z3 = z2;
            int i4 = i2;
            m28127q((CX3) ww2.mo77236d0(i3), enumSet, z, i4, z3, writer, c32066By3);
            i3++;
            z2 = z3;
            i2 = i4;
        }
        writer.write(")");
    }

    /* renamed from: n */
    public final void m28130n(EnumSet<EnumC31832Ay3> enumSet, Writer writer) throws IOException {
        if (enumSet.contains(EnumC31832Ay3.Z)) {
            writer.append("Z");
        }
        if (enumSet.contains(EnumC31832Ay3.M)) {
            writer.append("M");
        }
    }

    /* renamed from: o */
    public final void m28129o(FW3 fw3, EnumSet<EnumC31832Ay3> enumSet, boolean z, int i, Writer writer, C32066By3 c32066By3) throws IOException {
        writer.write("POINT");
        writer.write(" ");
        m28130n(enumSet, writer);
        m28126r(fw3.m107068L0(), enumSet, z, i, false, writer, c32066By3);
    }

    /* renamed from: p */
    public final void m28128p(CX3 cx3, EnumSet<EnumC31832Ay3> enumSet, boolean z, int i, Writer writer, C32066By3 c32066By3) throws IOException {
        writer.write("POLYGON");
        writer.write(" ");
        m28130n(enumSet, writer);
        m28127q(cx3, enumSet, z, i, false, writer, c32066By3);
    }

    /* renamed from: q */
    public final void m28127q(CX3 cx3, EnumSet<EnumC31832Ay3> enumSet, boolean z, int i, boolean z2, Writer writer, C32066By3 c32066By3) throws IOException {
        if (cx3.mo77226r0()) {
            writer.write("EMPTY");
            return;
        }
        if (z2) {
            m28121w(z, i, writer);
        }
        writer.write("(");
        m28126r(cx3.m112157L0().m113440M0(), enumSet, z, i, false, writer, c32066By3);
        for (int i2 = 0; i2 < cx3.m112155O0(); i2++) {
            writer.write(", ");
            m28126r(cx3.m112156M0(i2).m113440M0(), enumSet, z, i + 1, true, writer, c32066By3);
        }
        writer.write(")");
    }

    /* renamed from: r */
    public final void m28126r(EB0 eb0, EnumSet<EnumC31832Ay3> enumSet, boolean z, int i, boolean z2, Writer writer, C32066By3 c32066By3) throws IOException {
        if (eb0.size() == 0) {
            writer.write("EMPTY");
            return;
        }
        if (z2) {
            m28121w(z, i, writer);
        }
        writer.write("(");
        for (int i2 = 0; i2 < eb0.size(); i2++) {
            if (i2 > 0) {
                writer.write(", ");
                int i3 = this.f95247f;
                if (i3 > 0 && i2 % i3 == 0) {
                    m28121w(z, i + 1, writer);
                }
            }
            m28143a(eb0, enumSet, i2, writer, c32066By3);
        }
        writer.write(")");
    }

    /* renamed from: v */
    public final C32066By3 m28122v(WB1 wb1) {
        C32066By3 c32066By3 = this.f95245d;
        if (c32066By3 != null) {
            return c32066By3;
        }
        return m28125s(wb1.m78755h0());
    }

    /* renamed from: w */
    public final void m28121w(boolean z, int i, Writer writer) throws IOException {
        if (z && i > 0) {
            writer.write("\n");
            for (int i2 = 0; i2 < i; i2++) {
                writer.write(this.f95248g);
            }
        }
    }

    /* renamed from: x */
    public final void m28120x(boolean z, int i, int i2, Writer writer) throws IOException {
        int i3 = this.f95247f;
        if (i3 > 0 && i % i3 == 0) {
            m28121w(z, i2, writer);
        }
    }

    /* renamed from: y */
    public void m28119y(int i) {
        if (i > 0) {
            this.f95248g = m28118z(' ', i);
            return;
        }
        throw new IllegalArgumentException("Tab count must be positive");
    }

    public C44204kw6(int i) {
        this.f95244c = null;
        this.f95245d = null;
        this.f95246e = false;
        this.f95247f = -1;
        m28119y(2);
        this.f95243b = i;
        if (i >= 2 && i <= 4) {
            EnumSet<EnumC31832Ay3> of = EnumSet.of(EnumC31832Ay3.X, EnumC31832Ay3.Y);
            this.f95242a = of;
            if (i > 2) {
                of.add(EnumC31832Ay3.Z);
            }
            if (i > 3) {
                this.f95242a.add(EnumC31832Ay3.M);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid output dimension (must be 2 to 4)");
    }
}
