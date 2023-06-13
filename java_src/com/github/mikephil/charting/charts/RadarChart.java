package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.util.AttributeSet;
import p000.C37875aI6;
/* loaded from: classes5.dex */
public class RadarChart extends PieRadarChartBase<C35235Pm4> {

    /* renamed from: J */
    public float f70095J;

    /* renamed from: K */
    public float f70096K;

    /* renamed from: P */
    public int f70097P;

    /* renamed from: Q */
    public int f70098Q;

    /* renamed from: R */
    public int f70099R;

    /* renamed from: S */
    public boolean f70100S;

    /* renamed from: T */
    public int f70101T;

    /* renamed from: U */
    public C37875aI6 f70102U;

    /* renamed from: W */
    public C39672dI6 f70103W;

    /* renamed from: p0 */
    public C50927wH6 f70104p0;

    public RadarChart(Context context) {
        super(context);
        this.f70095J = 2.5f;
        this.f70096K = 1.5f;
        this.f70097P = Color.rgb(122, 122, 122);
        this.f70098Q = Color.rgb(122, 122, 122);
        this.f70099R = 150;
        this.f70100S = true;
        this.f70101T = 0;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    /* renamed from: O */
    public void mo51950O() {
        super.mo51950O();
        this.f70102U = new C37875aI6(C37875aI6.EnumC10624a.LEFT);
        this.f70095J = AbstractC34967Oi6.m91656e(1.5f);
        this.f70096K = AbstractC34967Oi6.m91656e(0.75f);
        this.f70049q = new C35001Om4(this, this.f70052t, this.f70051s);
        this.f70103W = new C39672dI6(this.f70051s, this.f70102U, this);
        this.f70104p0 = new C50927wH6(this.f70051s, this.f70042j, this);
        this.f70050r = new C35469Qm4(this);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    /* renamed from: T */
    public void mo51966T() {
        if (this.f70035c == null) {
            return;
        }
        mo51965Y();
        C39672dI6 c39672dI6 = this.f70103W;
        C37875aI6 c37875aI6 = this.f70102U;
        c39672dI6.mo8936a(c37875aI6.f44171H, c37875aI6.f44170G, c37875aI6.m71677c0());
        C50927wH6 c50927wH6 = this.f70104p0;
        C49149tH6 c49149tH6 = this.f70042j;
        c50927wH6.mo8936a(c49149tH6.f44171H, c49149tH6.f44170G, false);
        C41175fq2 c41175fq2 = this.f70045m;
        if (c41175fq2 != null && !c41175fq2.m40774E()) {
            this.f70048p.m35769a(this.f70035c);
        }
        mo51967r();
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    /* renamed from: Y */
    public void mo51965Y() {
        super.mo51965Y();
        C37875aI6 c37875aI6 = this.f70102U;
        C37875aI6.EnumC10624a enumC10624a = C37875aI6.EnumC10624a.LEFT;
        c37875aI6.mo71674j(((C35235Pm4) this.f70035c).m33542q(enumC10624a), ((C35235Pm4) this.f70035c).m33544o(enumC10624a));
        this.f70042j.mo71674j(0.0f, ((C35235Pm4) this.f70035c).m33548k().mo21241L0());
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    /* renamed from: c0 */
    public int mo51964c0(float f) {
        float m91644q = AbstractC34967Oi6.m91644q(f - m51969j0());
        float m51958n0 = m51958n0();
        int mo21241L0 = ((C35235Pm4) this.f70035c).m33548k().mo21241L0();
        int i = 0;
        while (i < mo21241L0) {
            int i2 = i + 1;
            if ((i2 * m51958n0) - (m51958n0 / 2.0f) > m91644q) {
                return i;
            }
            i = i2;
        }
        return 0;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    /* renamed from: f0 */
    public float mo51963f0() {
        RectF m106372o = this.f70051s.m106372o();
        return Math.min(m106372o.width() / 2.0f, m106372o.height() / 2.0f);
    }

    @Override // p000.InterfaceC44058ki0
    /* renamed from: g */
    public float mo28587g() {
        return this.f70102U.f44171H;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    /* renamed from: h0 */
    public float mo51962h0() {
        if (this.f70042j.m93268f() && this.f70042j.m76152A()) {
            return this.f70042j.f110254L;
        }
        return AbstractC34967Oi6.m91656e(10.0f);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    /* renamed from: i0 */
    public float mo51961i0() {
        return this.f70048p.m35766d().getTextSize() * 4.0f;
    }

    /* renamed from: l0 */
    public float m51960l0() {
        RectF m106372o = this.f70051s.m106372o();
        return Math.min(m106372o.width() / 2.0f, m106372o.height() / 2.0f) / this.f70102U.f44172I;
    }

    /* renamed from: m0 */
    public int m51959m0() {
        return this.f70101T;
    }

    /* renamed from: n0 */
    public float m51958n0() {
        return 360.0f / ((C35235Pm4) this.f70035c).m33548k().mo21241L0();
    }

    /* renamed from: o0 */
    public int m51957o0() {
        return this.f70099R;
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f70035c == null) {
            return;
        }
        if (this.f70042j.m93268f()) {
            C50927wH6 c50927wH6 = this.f70104p0;
            C49149tH6 c49149tH6 = this.f70042j;
            c50927wH6.mo8936a(c49149tH6.f44171H, c49149tH6.f44170G, false);
        }
        this.f70104p0.mo7041i(canvas);
        if (this.f70100S) {
            this.f70049q.mo14999c(canvas);
        }
        if (this.f70102U.m93268f() && this.f70102U.m76151B()) {
            this.f70103W.mo44407l(canvas);
        }
        this.f70049q.mo15000b(canvas);
        if (m52008X()) {
            this.f70049q.mo14998d(canvas, this.f70058z);
        }
        if (this.f70102U.m93268f() && !this.f70102U.m76151B()) {
            this.f70103W.mo44407l(canvas);
        }
        this.f70103W.mo44408i(canvas);
        this.f70049q.mo14997e(canvas);
        this.f70048p.m35765e(canvas);
        m52005u(canvas);
        mo51999v(canvas);
    }

    /* renamed from: p0 */
    public int m51956p0() {
        return this.f70097P;
    }

    /* renamed from: q0 */
    public int m51955q0() {
        return this.f70098Q;
    }

    /* renamed from: r0 */
    public float m51954r0() {
        return this.f70095J;
    }

    /* renamed from: s0 */
    public float m51953s0() {
        return this.f70096K;
    }

    public void setDrawWeb(boolean z) {
        this.f70100S = z;
    }

    public void setSkipWebLineCount(int i) {
        this.f70101T = Math.max(0, i);
    }

    public void setWebAlpha(int i) {
        this.f70099R = i;
    }

    public void setWebColor(int i) {
        this.f70097P = i;
    }

    public void setWebColorInner(int i) {
        this.f70098Q = i;
    }

    public void setWebLineWidth(float f) {
        this.f70095J = AbstractC34967Oi6.m91656e(f);
    }

    public void setWebLineWidthInner(float f) {
        this.f70096K = AbstractC34967Oi6.m91656e(f);
    }

    /* renamed from: t0 */
    public C37875aI6 m51952t0() {
        return this.f70102U;
    }

    /* renamed from: u0 */
    public float m51951u0() {
        return this.f70102U.f44172I;
    }

    public RadarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70095J = 2.5f;
        this.f70096K = 1.5f;
        this.f70097P = Color.rgb(122, 122, 122);
        this.f70098Q = Color.rgb(122, 122, 122);
        this.f70099R = 150;
        this.f70100S = true;
        this.f70101T = 0;
    }

    public RadarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f70095J = 2.5f;
        this.f70096K = 1.5f;
        this.f70097P = Color.rgb(122, 122, 122);
        this.f70098Q = Color.rgb(122, 122, 122);
        this.f70099R = 150;
        this.f70100S = true;
        this.f70101T = 0;
    }
}
