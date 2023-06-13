package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
/* renamed from: iy5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C43037iy5 {

    /* renamed from: m */
    public static final NC0 f91787m = new C37404Yt4(0.5f);

    /* renamed from: a */
    public QC0 f91788a;

    /* renamed from: b */
    public QC0 f91789b;

    /* renamed from: c */
    public QC0 f91790c;

    /* renamed from: d */
    public QC0 f91791d;

    /* renamed from: e */
    public NC0 f91792e;

    /* renamed from: f */
    public NC0 f91793f;

    /* renamed from: g */
    public NC0 f91794g;

    /* renamed from: h */
    public NC0 f91795h;

    /* renamed from: i */
    public L91 f91796i;

    /* renamed from: j */
    public L91 f91797j;

    /* renamed from: k */
    public L91 f91798k;

    /* renamed from: l */
    public L91 f91799l;

    /* renamed from: iy5$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC24659c {
        /* renamed from: a */
        NC0 mo31481a(NC0 nc0);
    }

    /* renamed from: a */
    public static C24658b m31544a() {
        return new C24658b();
    }

    /* renamed from: b */
    public static C24658b m31543b(Context context, int i, int i2) {
        return m31542c(context, i, i2, 0);
    }

    /* renamed from: c */
    public static C24658b m31542c(Context context, int i, int i2, int i3) {
        return m31541d(context, i, i2, new C20168f0(i3));
    }

    /* renamed from: d */
    public static C24658b m31541d(Context context, int i, int i2, NC0 nc0) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(C37098Xl4.ShapeAppearance);
        try {
            int i3 = obtainStyledAttributes.getInt(C37098Xl4.ShapeAppearance_cornerFamily, 0);
            int i4 = obtainStyledAttributes.getInt(C37098Xl4.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = obtainStyledAttributes.getInt(C37098Xl4.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = obtainStyledAttributes.getInt(C37098Xl4.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = obtainStyledAttributes.getInt(C37098Xl4.ShapeAppearance_cornerFamilyBottomLeft, i3);
            NC0 m31532m = m31532m(obtainStyledAttributes, C37098Xl4.ShapeAppearance_cornerSize, nc0);
            NC0 m31532m2 = m31532m(obtainStyledAttributes, C37098Xl4.ShapeAppearance_cornerSizeTopLeft, m31532m);
            NC0 m31532m3 = m31532m(obtainStyledAttributes, C37098Xl4.ShapeAppearance_cornerSizeTopRight, m31532m);
            NC0 m31532m4 = m31532m(obtainStyledAttributes, C37098Xl4.ShapeAppearance_cornerSizeBottomRight, m31532m);
            return new C24658b().m31515E(i4, m31532m2).m31511I(i5, m31532m3).m31482z(i6, m31532m4).m31487u(i7, m31532m(obtainStyledAttributes, C37098Xl4.ShapeAppearance_cornerSizeBottomLeft, m31532m));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public static C24658b m31540e(Context context, AttributeSet attributeSet, int i, int i2) {
        return m31539f(context, attributeSet, i, i2, 0);
    }

    /* renamed from: f */
    public static C24658b m31539f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return m31538g(context, attributeSet, i, i2, new C20168f0(i3));
    }

    /* renamed from: g */
    public static C24658b m31538g(Context context, AttributeSet attributeSet, int i, int i2, NC0 nc0) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C37098Xl4.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C37098Xl4.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C37098Xl4.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return m31541d(context, resourceId, resourceId2, nc0);
    }

    /* renamed from: m */
    public static NC0 m31532m(TypedArray typedArray, int i, NC0 nc0) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return nc0;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new C20168f0(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i2 == 6) {
            return new C37404Yt4(peekValue.getFraction(1.0f, 1.0f));
        }
        return nc0;
    }

    /* renamed from: h */
    public L91 m31537h() {
        return this.f91798k;
    }

    /* renamed from: i */
    public QC0 m31536i() {
        return this.f91791d;
    }

    /* renamed from: j */
    public NC0 m31535j() {
        return this.f91795h;
    }

    /* renamed from: k */
    public QC0 m31534k() {
        return this.f91790c;
    }

    /* renamed from: l */
    public NC0 m31533l() {
        return this.f91794g;
    }

    /* renamed from: n */
    public L91 m31531n() {
        return this.f91799l;
    }

    /* renamed from: o */
    public L91 m31530o() {
        return this.f91797j;
    }

    /* renamed from: p */
    public L91 m31529p() {
        return this.f91796i;
    }

    /* renamed from: q */
    public QC0 m31528q() {
        return this.f91788a;
    }

    /* renamed from: r */
    public NC0 m31527r() {
        return this.f91792e;
    }

    /* renamed from: s */
    public QC0 m31526s() {
        return this.f91789b;
    }

    /* renamed from: t */
    public NC0 m31525t() {
        return this.f91793f;
    }

    /* renamed from: u */
    public boolean m31524u(RectF rectF) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f91799l.getClass().equals(L91.class) && this.f91797j.getClass().equals(L91.class) && this.f91796i.getClass().equals(L91.class) && this.f91798k.getClass().equals(L91.class)) {
            z = true;
        } else {
            z = false;
        }
        float mo29259a = this.f91792e.mo29259a(rectF);
        if (this.f91793f.mo29259a(rectF) == mo29259a && this.f91795h.mo29259a(rectF) == mo29259a && this.f91794g.mo29259a(rectF) == mo29259a) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((this.f91789b instanceof C39853dc5) && (this.f91788a instanceof C39853dc5) && (this.f91790c instanceof C39853dc5) && (this.f91791d instanceof C39853dc5)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z && z2 && z3) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public C24658b m31523v() {
        return new C24658b(this);
    }

    /* renamed from: w */
    public C43037iy5 m31522w(float f) {
        return m31523v().m31493o(f).m31495m();
    }

    /* renamed from: x */
    public C43037iy5 m31521x(NC0 nc0) {
        return m31523v().m31492p(nc0).m31495m();
    }

    /* renamed from: y */
    public C43037iy5 m31520y(InterfaceC24659c interfaceC24659c) {
        return m31523v().m31512H(interfaceC24659c.mo31481a(m31527r())).m31508L(interfaceC24659c.mo31481a(m31525t())).m31484x(interfaceC24659c.mo31481a(m31535j())).m31517C(interfaceC24659c.mo31481a(m31533l())).m31495m();
    }

    public C43037iy5(C24658b c24658b) {
        this.f91788a = c24658b.f91800a;
        this.f91789b = c24658b.f91801b;
        this.f91790c = c24658b.f91802c;
        this.f91791d = c24658b.f91803d;
        this.f91792e = c24658b.f91804e;
        this.f91793f = c24658b.f91805f;
        this.f91794g = c24658b.f91806g;
        this.f91795h = c24658b.f91807h;
        this.f91796i = c24658b.f91808i;
        this.f91797j = c24658b.f91809j;
        this.f91798k = c24658b.f91810k;
        this.f91799l = c24658b.f91811l;
    }

    /* renamed from: iy5$b */
    /* loaded from: classes6.dex */
    public static final class C24658b {

        /* renamed from: a */
        public QC0 f91800a;

        /* renamed from: b */
        public QC0 f91801b;

        /* renamed from: c */
        public QC0 f91802c;

        /* renamed from: d */
        public QC0 f91803d;

        /* renamed from: e */
        public NC0 f91804e;

        /* renamed from: f */
        public NC0 f91805f;

        /* renamed from: g */
        public NC0 f91806g;

        /* renamed from: h */
        public NC0 f91807h;

        /* renamed from: i */
        public L91 f91808i;

        /* renamed from: j */
        public L91 f91809j;

        /* renamed from: k */
        public L91 f91810k;

        /* renamed from: l */
        public L91 f91811l;

        public C24658b() {
            this.f91800a = QM2.m88642b();
            this.f91801b = QM2.m88642b();
            this.f91802c = QM2.m88642b();
            this.f91803d = QM2.m88642b();
            this.f91804e = new C20168f0(0.0f);
            this.f91805f = new C20168f0(0.0f);
            this.f91806g = new C20168f0(0.0f);
            this.f91807h = new C20168f0(0.0f);
            this.f91808i = QM2.m88641c();
            this.f91809j = QM2.m88641c();
            this.f91810k = QM2.m88641c();
            this.f91811l = QM2.m88641c();
        }

        /* renamed from: n */
        public static float m31494n(QC0 qc0) {
            if (qc0 instanceof C39853dc5) {
                return ((C39853dc5) qc0).f76883a;
            }
            if (qc0 instanceof EF0) {
                return ((EF0) qc0).f7143a;
            }
            return -1.0f;
        }

        /* renamed from: A */
        public C24658b m31519A(QC0 qc0) {
            this.f91802c = qc0;
            float m31494n = m31494n(qc0);
            if (m31494n != -1.0f) {
                m31518B(m31494n);
            }
            return this;
        }

        /* renamed from: B */
        public C24658b m31518B(float f) {
            this.f91806g = new C20168f0(f);
            return this;
        }

        /* renamed from: C */
        public C24658b m31517C(NC0 nc0) {
            this.f91806g = nc0;
            return this;
        }

        /* renamed from: D */
        public C24658b m31516D(L91 l91) {
            this.f91808i = l91;
            return this;
        }

        /* renamed from: E */
        public C24658b m31515E(int i, NC0 nc0) {
            return m31514F(QM2.m88643a(i)).m31512H(nc0);
        }

        /* renamed from: F */
        public C24658b m31514F(QC0 qc0) {
            this.f91800a = qc0;
            float m31494n = m31494n(qc0);
            if (m31494n != -1.0f) {
                m31513G(m31494n);
            }
            return this;
        }

        /* renamed from: G */
        public C24658b m31513G(float f) {
            this.f91804e = new C20168f0(f);
            return this;
        }

        /* renamed from: H */
        public C24658b m31512H(NC0 nc0) {
            this.f91804e = nc0;
            return this;
        }

        /* renamed from: I */
        public C24658b m31511I(int i, NC0 nc0) {
            return m31510J(QM2.m88643a(i)).m31508L(nc0);
        }

        /* renamed from: J */
        public C24658b m31510J(QC0 qc0) {
            this.f91801b = qc0;
            float m31494n = m31494n(qc0);
            if (m31494n != -1.0f) {
                m31509K(m31494n);
            }
            return this;
        }

        /* renamed from: K */
        public C24658b m31509K(float f) {
            this.f91805f = new C20168f0(f);
            return this;
        }

        /* renamed from: L */
        public C24658b m31508L(NC0 nc0) {
            this.f91805f = nc0;
            return this;
        }

        /* renamed from: m */
        public C43037iy5 m31495m() {
            return new C43037iy5(this);
        }

        /* renamed from: o */
        public C24658b m31493o(float f) {
            return m31513G(f).m31509K(f).m31518B(f).m31485w(f);
        }

        /* renamed from: p */
        public C24658b m31492p(NC0 nc0) {
            return m31512H(nc0).m31508L(nc0).m31517C(nc0).m31484x(nc0);
        }

        /* renamed from: q */
        public C24658b m31491q(int i, float f) {
            return m31490r(QM2.m88643a(i)).m31493o(f);
        }

        /* renamed from: r */
        public C24658b m31490r(QC0 qc0) {
            return m31514F(qc0).m31510J(qc0).m31519A(qc0).m31486v(qc0);
        }

        /* renamed from: s */
        public C24658b m31489s(L91 l91) {
            this.f91810k = l91;
            return this;
        }

        /* renamed from: t */
        public C24658b m31488t(int i, float f) {
            return m31486v(QM2.m88643a(i)).m31485w(f);
        }

        /* renamed from: u */
        public C24658b m31487u(int i, NC0 nc0) {
            return m31486v(QM2.m88643a(i)).m31484x(nc0);
        }

        /* renamed from: v */
        public C24658b m31486v(QC0 qc0) {
            this.f91803d = qc0;
            float m31494n = m31494n(qc0);
            if (m31494n != -1.0f) {
                m31485w(m31494n);
            }
            return this;
        }

        /* renamed from: w */
        public C24658b m31485w(float f) {
            this.f91807h = new C20168f0(f);
            return this;
        }

        /* renamed from: x */
        public C24658b m31484x(NC0 nc0) {
            this.f91807h = nc0;
            return this;
        }

        /* renamed from: y */
        public C24658b m31483y(int i, float f) {
            return m31519A(QM2.m88643a(i)).m31518B(f);
        }

        /* renamed from: z */
        public C24658b m31482z(int i, NC0 nc0) {
            return m31519A(QM2.m88643a(i)).m31517C(nc0);
        }

        public C24658b(C43037iy5 c43037iy5) {
            this.f91800a = QM2.m88642b();
            this.f91801b = QM2.m88642b();
            this.f91802c = QM2.m88642b();
            this.f91803d = QM2.m88642b();
            this.f91804e = new C20168f0(0.0f);
            this.f91805f = new C20168f0(0.0f);
            this.f91806g = new C20168f0(0.0f);
            this.f91807h = new C20168f0(0.0f);
            this.f91808i = QM2.m88641c();
            this.f91809j = QM2.m88641c();
            this.f91810k = QM2.m88641c();
            this.f91811l = QM2.m88641c();
            this.f91800a = c43037iy5.f91788a;
            this.f91801b = c43037iy5.f91789b;
            this.f91802c = c43037iy5.f91790c;
            this.f91803d = c43037iy5.f91791d;
            this.f91804e = c43037iy5.f91792e;
            this.f91805f = c43037iy5.f91793f;
            this.f91806g = c43037iy5.f91794g;
            this.f91807h = c43037iy5.f91795h;
            this.f91808i = c43037iy5.f91796i;
            this.f91809j = c43037iy5.f91797j;
            this.f91810k = c43037iy5.f91798k;
            this.f91811l = c43037iy5.f91799l;
        }
    }

    public C43037iy5() {
        this.f91788a = QM2.m88642b();
        this.f91789b = QM2.m88642b();
        this.f91790c = QM2.m88642b();
        this.f91791d = QM2.m88642b();
        this.f91792e = new C20168f0(0.0f);
        this.f91793f = new C20168f0(0.0f);
        this.f91794g = new C20168f0(0.0f);
        this.f91795h = new C20168f0(0.0f);
        this.f91796i = QM2.m88641c();
        this.f91797j = QM2.m88641c();
        this.f91798k = QM2.m88641c();
        this.f91799l = QM2.m88641c();
    }
}
