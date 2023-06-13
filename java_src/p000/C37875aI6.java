package p000;

import android.graphics.Paint;
/* renamed from: aI6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C37875aI6 extends AbstractC9544Xu {

    /* renamed from: J */
    public boolean f50252J;

    /* renamed from: K */
    public boolean f50253K;

    /* renamed from: L */
    public boolean f50254L;

    /* renamed from: M */
    public boolean f50255M;

    /* renamed from: N */
    public boolean f50256N;

    /* renamed from: O */
    public boolean f50257O;

    /* renamed from: P */
    public int f50258P;

    /* renamed from: Q */
    public float f50259Q;

    /* renamed from: R */
    public float f50260R;

    /* renamed from: S */
    public float f50261S;

    /* renamed from: T */
    public EnumC10625b f50262T;

    /* renamed from: U */
    public EnumC10624a f50263U;

    /* renamed from: V */
    public float f50264V;

    /* renamed from: W */
    public float f50265W;

    /* renamed from: aI6$a */
    /* loaded from: classes5.dex */
    public enum EnumC10624a {
        LEFT,
        RIGHT
    }

    /* renamed from: aI6$b */
    /* loaded from: classes5.dex */
    public enum EnumC10625b {
        OUTSIDE_CHART,
        INSIDE_CHART
    }

    public C37875aI6() {
        this.f50252J = true;
        this.f50253K = true;
        this.f50254L = false;
        this.f50255M = false;
        this.f50256N = false;
        this.f50257O = false;
        this.f50258P = -7829368;
        this.f50259Q = 1.0f;
        this.f50260R = 10.0f;
        this.f50261S = 10.0f;
        this.f50262T = EnumC10625b.OUTSIDE_CHART;
        this.f50264V = 0.0f;
        this.f50265W = Float.POSITIVE_INFINITY;
        this.f50263U = EnumC10624a.LEFT;
        this.f25312c = 0.0f;
    }

    /* renamed from: P */
    public EnumC10624a m71690P() {
        return this.f50263U;
    }

    /* renamed from: Q */
    public EnumC10625b m71689Q() {
        return this.f50262T;
    }

    /* renamed from: R */
    public float m71688R() {
        return this.f50265W;
    }

    /* renamed from: S */
    public float m71687S() {
        return this.f50264V;
    }

    /* renamed from: T */
    public float m71686T(Paint paint) {
        paint.setTextSize(this.f25314e);
        return AbstractC34967Oi6.m91660a(paint, m76126u()) + (m93269e() * 2.0f);
    }

    /* renamed from: U */
    public float m71685U(Paint paint) {
        paint.setTextSize(this.f25314e);
        float m91657d = AbstractC34967Oi6.m91657d(paint, m76126u()) + (m93270d() * 2.0f);
        float m71687S = m71687S();
        float m71688R = m71688R();
        if (m71687S > 0.0f) {
            m71687S = AbstractC34967Oi6.m91656e(m71687S);
        }
        if (m71688R > 0.0f && m71688R != Float.POSITIVE_INFINITY) {
            m71688R = AbstractC34967Oi6.m91656e(m71688R);
        }
        if (m71688R <= 0.0d) {
            m71688R = m91657d;
        }
        return Math.max(m71687S, Math.min(m91657d, m71688R));
    }

    /* renamed from: V */
    public float m71684V() {
        return this.f50261S;
    }

    /* renamed from: W */
    public float m71683W() {
        return this.f50260R;
    }

    /* renamed from: X */
    public int m71682X() {
        return this.f50258P;
    }

    /* renamed from: Y */
    public float m71681Y() {
        return this.f50259Q;
    }

    /* renamed from: Z */
    public boolean m71680Z() {
        return this.f50252J;
    }

    /* renamed from: a0 */
    public boolean m71679a0() {
        return this.f50253K;
    }

    /* renamed from: b0 */
    public boolean m71678b0() {
        return this.f50255M;
    }

    /* renamed from: c0 */
    public boolean m71677c0() {
        return this.f50254L;
    }

    /* renamed from: d0 */
    public boolean m71676d0() {
        return m93268f() && m76152A() && m71689Q() == EnumC10625b.OUTSIDE_CHART;
    }

    /* renamed from: e0 */
    public void m71675e0(boolean z) {
        this.f50253K = z;
    }

    @Override // p000.AbstractC9544Xu
    /* renamed from: j */
    public void mo71674j(float f, float f2) {
        float m71684V;
        float m71683W;
        if (Math.abs(f2 - f) == 0.0f) {
            f2 += 1.0f;
            f -= 1.0f;
        }
        float abs = Math.abs(f2 - f);
        if (this.f44168E) {
            m71684V = this.f44171H;
        } else {
            m71684V = f - ((abs / 100.0f) * m71684V());
        }
        this.f44171H = m71684V;
        if (this.f44169F) {
            m71683W = this.f44170G;
        } else {
            m71683W = f2 + ((abs / 100.0f) * m71683W());
        }
        this.f44170G = m71683W;
        this.f44172I = Math.abs(this.f44171H - m71683W);
    }

    public C37875aI6(EnumC10624a enumC10624a) {
        this.f50252J = true;
        this.f50253K = true;
        this.f50254L = false;
        this.f50255M = false;
        this.f50256N = false;
        this.f50257O = false;
        this.f50258P = -7829368;
        this.f50259Q = 1.0f;
        this.f50260R = 10.0f;
        this.f50261S = 10.0f;
        this.f50262T = EnumC10625b.OUTSIDE_CHART;
        this.f50264V = 0.0f;
        this.f50265W = Float.POSITIVE_INFINITY;
        this.f50263U = enumC10624a;
        this.f25312c = 0.0f;
    }
}
