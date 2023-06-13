package p000;
/* renamed from: pZ */
/* loaded from: classes6.dex */
public class C27315pZ extends L91 implements Cloneable {

    /* renamed from: b */
    public float f103791b;

    /* renamed from: c */
    public float f103792c;

    /* renamed from: d */
    public float f103793d;

    /* renamed from: e */
    public float f103794e;

    /* renamed from: f */
    public float f103795f;

    /* renamed from: g */
    public float f103796g = -1.0f;

    public C27315pZ(float f, float f2, float f3) {
        this.f103792c = f;
        this.f103791b = f2;
        m19114m(f3);
        this.f103795f = 0.0f;
    }

    @Override // p000.L91
    /* renamed from: e */
    public void mo19121e(float f, float f2, float f3, C50744vy5 c50744vy5) {
        boolean z;
        float f4;
        float f5;
        float f6 = this.f103793d;
        if (f6 == 0.0f) {
            c50744vy5.m7666m(f, 0.0f);
            return;
        }
        float f7 = ((this.f103792c * 2.0f) + f6) / 2.0f;
        float f8 = f3 * this.f103791b;
        float f9 = f2 + this.f103795f;
        float f10 = (this.f103794e * f3) + ((1.0f - f3) * f7);
        if (f10 / f7 >= 1.0f) {
            c50744vy5.m7666m(f, 0.0f);
            return;
        }
        float f11 = this.f103796g;
        float f12 = f11 * f3;
        if (f11 != -1.0f && Math.abs((f11 * 2.0f) - f6) >= 0.1f) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = z;
        if (!z2) {
            f5 = 1.75f;
            f4 = 0.0f;
        } else {
            f4 = f10;
            f5 = 0.0f;
        }
        float f13 = f7 + f8;
        float f14 = f4 + f8;
        float sqrt = (float) Math.sqrt((f13 * f13) - (f14 * f14));
        float f15 = f9 - sqrt;
        float f16 = f9 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f14));
        float f17 = (90.0f - degrees) + f5;
        c50744vy5.m7666m(f15, 0.0f);
        float f18 = f8 * 2.0f;
        c50744vy5.m7678a(f15 - f8, 0.0f, f15 + f8, f18, 270.0f, degrees);
        if (z2) {
            c50744vy5.m7678a(f9 - f7, (-f7) - f4, f9 + f7, f7 - f4, 180.0f - f17, (f17 * 2.0f) - 180.0f);
        } else {
            float f19 = this.f103792c;
            float f20 = f12 * 2.0f;
            float f21 = f9 - f7;
            c50744vy5.m7678a(f21, -(f12 + f19), f21 + f19 + f20, f19 + f12, 180.0f - f17, ((f17 * 2.0f) - 180.0f) / 2.0f);
            float f22 = f9 + f7;
            float f23 = this.f103792c;
            c50744vy5.m7666m(f22 - ((f23 / 2.0f) + f12), f23 + f12);
            float f24 = this.f103792c;
            c50744vy5.m7678a(f22 - (f20 + f24), -(f12 + f24), f22, f24 + f12, 90.0f, f17 - 90.0f);
        }
        c50744vy5.m7678a(f16 - f8, 0.0f, f16 + f8, f18, 270.0f - degrees, degrees);
        c50744vy5.m7666m(f, 0.0f);
    }

    /* renamed from: f */
    public float m19120f() {
        return this.f103794e;
    }

    /* renamed from: g */
    public float m19119g() {
        return this.f103796g;
    }

    /* renamed from: h */
    public float m19118h() {
        return this.f103792c;
    }

    /* renamed from: j */
    public float m19117j() {
        return this.f103791b;
    }

    /* renamed from: k */
    public float m19116k() {
        return this.f103793d;
    }

    /* renamed from: l */
    public float m19115l() {
        return this.f103795f;
    }

    /* renamed from: m */
    public void m19114m(float f) {
        if (f >= 0.0f) {
            this.f103794e = f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    /* renamed from: n */
    public void m19113n(float f) {
        this.f103796g = f;
    }

    /* renamed from: o */
    public void m19112o(float f) {
        this.f103792c = f;
    }

    /* renamed from: p */
    public void m19111p(float f) {
        this.f103791b = f;
    }

    /* renamed from: q */
    public void m19110q(float f) {
        this.f103793d = f;
    }

    /* renamed from: r */
    public void m19109r(float f) {
        this.f103795f = f;
    }
}
