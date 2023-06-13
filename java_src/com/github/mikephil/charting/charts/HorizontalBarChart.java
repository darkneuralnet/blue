package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import p000.C37875aI6;
import p000.C49149tH6;
/* loaded from: classes5.dex */
public class HorizontalBarChart extends BarChart {

    /* renamed from: N0 */
    public RectF f70070N0;

    /* renamed from: O0 */
    public float[] f70071O0;

    public HorizontalBarChart(Context context) {
        super(context);
        this.f70070N0 = new RectF();
        this.f70071O0 = new float[2];
    }

    @Override // com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.Chart
    /* renamed from: G */
    public OM1 mo51997G(float f, float f2) {
        if (this.f70035c == null) {
            if (this.f70034b) {
                Log.e("MPAndroidChart", "Can't select by touch. No data set.");
                return null;
            }
            return null;
        }
        return m52020H().mo7729a(f2, f);
    }

    @Override // com.github.mikephil.charting.charts.Chart
    /* renamed from: J */
    public float[] mo51992J(OM1 om1) {
        return new float[]{om1.m92389f(), om1.m92390e()};
    }

    @Override // com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    /* renamed from: O */
    public void mo51950O() {
        this.f70051s = new C39712dN1();
        super.mo51950O();
        this.f70017w0 = new E96(this.f70051s);
        this.f70018x0 = new E96(this.f70051s);
        this.f70049q = new C37915aN1(this, this.f70052t, this.f70051s);
        setHighlighter(new C38508bN1(this));
        this.f70015u0 = new C39061cI6(this.f70051s, this.f70013s0, this.f70017w0);
        this.f70016v0 = new C39061cI6(this.f70051s, this.f70014t0, this.f70018x0);
        this.f70019y0 = new C50334vH6(this.f70051s, this.f70042j, this.f70017w0, this);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, p000.InterfaceC30784yx
    /* renamed from: c */
    public float mo2232c() {
        mo2231d(C37875aI6.EnumC10624a.LEFT).m110830h(this.f70051s.m106379h(), this.f70051s.m106381f(), this.f69996G0);
        return (float) Math.max(this.f70042j.f44171H, this.f69996G0.f26255d);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, p000.InterfaceC30784yx
    /* renamed from: o */
    public float mo2230o() {
        mo2231d(C37875aI6.EnumC10624a.LEFT).m110830h(this.f70051s.m106379h(), this.f70051s.m106377j(), this.f69998H0);
        return (float) Math.min(this.f70042j.f44170G, this.f69998H0.f26255d);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    /* renamed from: r */
    public void mo51967r() {
        m52047a0(this.f70070N0);
        RectF rectF = this.f70070N0;
        float f = rectF.left + 0.0f;
        float f2 = rectF.top + 0.0f;
        float f3 = rectF.right + 0.0f;
        float f4 = rectF.bottom + 0.0f;
        if (this.f70013s0.m71676d0()) {
            f2 += this.f70013s0.m71686T(this.f70015u0.m74024c());
        }
        if (this.f70014t0.m71676d0()) {
            f4 += this.f70014t0.m71686T(this.f70016v0.m74024c());
        }
        C49149tH6 c49149tH6 = this.f70042j;
        float f5 = c49149tH6.f110254L;
        if (c49149tH6.m93268f()) {
            if (this.f70042j.m12530Q() == C49149tH6.EnumC28671a.BOTTOM) {
                f += f5;
            } else {
                if (this.f70042j.m12530Q() != C49149tH6.EnumC28671a.TOP) {
                    if (this.f70042j.m12530Q() == C49149tH6.EnumC28671a.BOTH_SIDED) {
                        f += f5;
                    }
                }
                f3 += f5;
            }
        }
        float m52021F = f2 + m52021F();
        float m52022E = f3 + m52022E();
        float m52024C = f4 + m52024C();
        float m52023D = f + m52023D();
        float m91656e = AbstractC34967Oi6.m91656e(this.f70011q0);
        this.f70051s.m106397K(Math.max(m91656e, m52023D), Math.max(m91656e, m52021F), Math.max(m91656e, m52022E), Math.max(m91656e, m52024C));
        if (this.f70034b) {
            Log.i("MPAndroidChart", "offsetLeft: " + m52023D + ", offsetTop: " + m52021F + ", offsetRight: " + m52022E + ", offsetBottom: " + m52024C);
            StringBuilder sb = new StringBuilder();
            sb.append("Content: ");
            sb.append(this.f70051s.m106372o().toString());
            Log.i("MPAndroidChart", sb.toString());
        }
        m52028t0();
        mo51996u0();
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRange(float f, float f2) {
        float f3 = this.f70042j.f44172I;
        this.f70051s.m106390R(f3 / f, f3 / f2);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRangeMaximum(float f) {
        this.f70051s.m106388T(this.f70042j.f44172I / f);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRangeMinimum(float f) {
        this.f70051s.m106392P(this.f70042j.f44172I / f);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleYRange(float f, float f2, C37875aI6.EnumC10624a enumC10624a) {
        this.f70051s.m106391Q(m52043e0(enumC10624a) / f, m52043e0(enumC10624a) / f2);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleYRangeMaximum(float f, C37875aI6.EnumC10624a enumC10624a) {
        this.f70051s.m106389S(m52043e0(enumC10624a) / f);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleYRangeMinimum(float f, C37875aI6.EnumC10624a enumC10624a) {
        this.f70051s.m106393O(m52043e0(enumC10624a) / f);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    /* renamed from: u0 */
    public void mo51996u0() {
        D96 d96 = this.f70018x0;
        C37875aI6 c37875aI6 = this.f70014t0;
        float f = c37875aI6.f44171H;
        float f2 = c37875aI6.f44172I;
        C49149tH6 c49149tH6 = this.f70042j;
        d96.m110826m(f, f2, c49149tH6.f44172I, c49149tH6.f44171H);
        D96 d962 = this.f70017w0;
        C37875aI6 c37875aI62 = this.f70013s0;
        float f3 = c37875aI62.f44171H;
        float f4 = c37875aI62.f44172I;
        C49149tH6 c49149tH62 = this.f70042j;
        d962.m110826m(f3, f4, c49149tH62.f44172I, c49149tH62.f44171H);
    }

    public HorizontalBarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70070N0 = new RectF();
        this.f70071O0 = new float[2];
    }

    public HorizontalBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f70070N0 = new RectF();
        this.f70071O0 = new float[2];
    }
}
