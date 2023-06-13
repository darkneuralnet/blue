package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import java.util.List;
/* loaded from: classes5.dex */
public class PieChart extends PieRadarChartBase<C47476qT3> {

    /* renamed from: J */
    public RectF f70072J;

    /* renamed from: K */
    public boolean f70073K;

    /* renamed from: P */
    public float[] f70074P;

    /* renamed from: Q */
    public float[] f70075Q;

    /* renamed from: R */
    public boolean f70076R;

    /* renamed from: S */
    public boolean f70077S;

    /* renamed from: T */
    public boolean f70078T;

    /* renamed from: U */
    public boolean f70079U;

    /* renamed from: W */
    public CharSequence f70080W;

    /* renamed from: p0 */
    public PE2 f70081p0;

    /* renamed from: q0 */
    public float f70082q0;

    /* renamed from: r0 */
    public float f70083r0;

    /* renamed from: s0 */
    public boolean f70084s0;

    /* renamed from: t0 */
    public float f70085t0;

    /* renamed from: u0 */
    public float f70086u0;

    /* renamed from: v0 */
    public float f70087v0;

    public PieChart(Context context) {
        super(context);
        this.f70072J = new RectF();
        this.f70073K = true;
        this.f70074P = new float[1];
        this.f70075Q = new float[1];
        this.f70076R = true;
        this.f70077S = false;
        this.f70078T = false;
        this.f70079U = false;
        this.f70080W = "";
        this.f70081p0 = PE2.m90558c(0.0f, 0.0f);
        this.f70082q0 = 50.0f;
        this.f70083r0 = 55.0f;
        this.f70084s0 = true;
        this.f70085t0 = 100.0f;
        this.f70086u0 = 360.0f;
        this.f70087v0 = 0.0f;
    }

    /* renamed from: A0 */
    public boolean m51995A0() {
        return this.f70077S;
    }

    /* renamed from: B0 */
    public boolean m51994B0() {
        return this.f70078T;
    }

    /* renamed from: C0 */
    public boolean m51993C0(int i) {
        if (!m52008X()) {
            return false;
        }
        int i2 = 0;
        while (true) {
            OM1[] om1Arr = this.f70058z;
            if (i2 >= om1Arr.length) {
                return false;
            }
            if (((int) om1Arr[i2].m92387h()) == i) {
                return true;
            }
            i2++;
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart
    /* renamed from: J */
    public float[] mo51992J(OM1 om1) {
        int m92387h;
        PE2 m51987o0 = m51987o0();
        float mo51963f0 = mo51963f0();
        float f = (mo51963f0 / 10.0f) * 3.6f;
        if (m51977y0()) {
            f = (mo51963f0 - ((mo51963f0 / 100.0f) * m51981u0())) / 2.0f;
        }
        float f2 = mo51963f0 - f;
        float m51969j0 = m51969j0();
        float f3 = this.f70074P[(int) om1.m92387h()] / 2.0f;
        double d = f2;
        float cos = (float) ((Math.cos(Math.toRadians(((this.f70075Q[m92387h] + m51969j0) - f3) * this.f70052t.m36087b())) * d) + m51987o0.f28146c);
        PE2.m90555f(m51987o0);
        return new float[]{cos, (float) ((d * Math.sin(Math.toRadians(((m51969j0 + this.f70075Q[m92387h]) - f3) * this.f70052t.m36087b()))) + m51987o0.f28147d)};
    }

    @Override // com.github.mikephil.charting.charts.Chart
    @Deprecated
    /* renamed from: M */
    public C49149tH6 mo51991M() {
        throw new RuntimeException("PieChart has no XAxis");
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    /* renamed from: O */
    public void mo51950O() {
        super.mo51950O();
        this.f70049q = new C46883pT3(this, this.f70052t, this.f70051s);
        this.f70042j = null;
        this.f70050r = new C48661sT3(this);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    /* renamed from: Y */
    public void mo51965Y() {
        m51989m0();
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    /* renamed from: c0 */
    public int mo51964c0(float f) {
        float m91644q = AbstractC34967Oi6.m91644q(f - m51969j0());
        int i = 0;
        while (true) {
            float[] fArr = this.f70075Q;
            if (i < fArr.length) {
                if (fArr[i] > m91644q) {
                    return i;
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    /* renamed from: f0 */
    public float mo51963f0() {
        RectF rectF = this.f70072J;
        if (rectF == null) {
            return 0.0f;
        }
        return Math.min(rectF.width() / 2.0f, this.f70072J.height() / 2.0f);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    /* renamed from: h0 */
    public float mo51962h0() {
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    /* renamed from: i0 */
    public float mo51961i0() {
        return this.f70048p.m35766d().getTextSize() * 2.0f;
    }

    /* renamed from: l0 */
    public final float m51990l0(float f, float f2) {
        return (f / f2) * this.f70086u0;
    }

    /* renamed from: m0 */
    public final void m51989m0() {
        boolean z;
        int m33551g = ((C47476qT3) this.f70035c).m33551g();
        if (this.f70074P.length != m33551g) {
            this.f70074P = new float[m33551g];
        } else {
            for (int i = 0; i < m33551g; i++) {
                this.f70074P[i] = 0.0f;
            }
        }
        if (this.f70075Q.length != m33551g) {
            this.f70075Q = new float[m33551g];
        } else {
            for (int i2 = 0; i2 < m33551g; i2++) {
                this.f70075Q[i2] = 0.0f;
            }
        }
        float m17495u = ((C47476qT3) this.f70035c).m17495u();
        List<XO1> m33552f = ((C47476qT3) this.f70035c).m33552f();
        float f = this.f70087v0;
        if (f != 0.0f && m33551g * f <= this.f70086u0) {
            z = true;
        } else {
            z = false;
        }
        float[] fArr = new float[m33551g];
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i3 = 0;
        for (int i4 = 0; i4 < ((C47476qT3) this.f70035c).m33553e(); i4++) {
            XO1 xo1 = m33552f.get(i4);
            for (int i5 = 0; i5 < xo1.mo21241L0(); i5++) {
                float m51990l0 = m51990l0(Math.abs(xo1.mo21237h(i5).mo51938c()), m17495u);
                if (z) {
                    float f4 = this.f70087v0;
                    float f5 = m51990l0 - f4;
                    if (f5 <= 0.0f) {
                        fArr[i3] = f4;
                        f2 += -f5;
                    } else {
                        fArr[i3] = m51990l0;
                        f3 += f5;
                    }
                }
                this.f70074P[i3] = m51990l0;
                if (i3 == 0) {
                    this.f70075Q[i3] = m51990l0;
                } else {
                    float[] fArr2 = this.f70075Q;
                    fArr2[i3] = fArr2[i3 - 1] + m51990l0;
                }
                i3++;
            }
        }
        if (z) {
            for (int i6 = 0; i6 < m33551g; i6++) {
                float f6 = fArr[i6];
                float f7 = f6 - (((f6 - this.f70087v0) / f3) * f2);
                fArr[i6] = f7;
                if (i6 == 0) {
                    this.f70075Q[0] = fArr[0];
                } else {
                    float[] fArr3 = this.f70075Q;
                    fArr3[i6] = fArr3[i6 - 1] + f7;
                }
            }
            this.f70074P = fArr;
        }
    }

    /* renamed from: n0 */
    public float[] m51988n0() {
        return this.f70075Q;
    }

    /* renamed from: o0 */
    public PE2 m51987o0() {
        return PE2.m90558c(this.f70072J.centerX(), this.f70072J.centerY());
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RS0 rs0 = this.f70049q;
        if (rs0 != null && (rs0 instanceof C46883pT3)) {
            ((C46883pT3) rs0).m19224s();
        }
        super.onDetachedFromWindow();
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f70035c == null) {
            return;
        }
        this.f70049q.mo15000b(canvas);
        if (m52008X()) {
            this.f70049q.mo14998d(canvas, this.f70058z);
        }
        this.f70049q.mo14999c(canvas);
        this.f70049q.mo14997e(canvas);
        this.f70048p.m35765e(canvas);
        m52005u(canvas);
        mo51999v(canvas);
    }

    /* renamed from: p0 */
    public CharSequence m51986p0() {
        return this.f70080W;
    }

    /* renamed from: q0 */
    public PE2 m51985q0() {
        PE2 pe2 = this.f70081p0;
        return PE2.m90558c(pe2.f28146c, pe2.f28147d);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    /* renamed from: r */
    public void mo51967r() {
        super.mo51967r();
        if (this.f70035c == null) {
            return;
        }
        float m51973b0 = m51973b0() / 2.0f;
        PE2 m52001z = m52001z();
        float m77039s = ((C47476qT3) this.f70035c).m17497s().m77039s();
        RectF rectF = this.f70072J;
        float f = m52001z.f28146c;
        float f2 = m52001z.f28147d;
        rectF.set((f - m51973b0) + m77039s, (f2 - m51973b0) + m77039s, (f + m51973b0) - m77039s, (f2 + m51973b0) - m77039s);
        PE2.m90555f(m52001z);
    }

    /* renamed from: r0 */
    public float m51984r0() {
        return this.f70085t0;
    }

    /* renamed from: s0 */
    public RectF m51983s0() {
        return this.f70072J;
    }

    public void setCenterText(CharSequence charSequence) {
        if (charSequence == null) {
            this.f70080W = "";
        } else {
            this.f70080W = charSequence;
        }
    }

    public void setCenterTextColor(int i) {
        ((C46883pT3) this.f70049q).m19229n().setColor(i);
    }

    public void setCenterTextOffset(float f, float f2) {
        this.f70081p0.f28146c = AbstractC34967Oi6.m91656e(f);
        this.f70081p0.f28147d = AbstractC34967Oi6.m91656e(f2);
    }

    public void setCenterTextRadiusPercent(float f) {
        this.f70085t0 = f;
    }

    public void setCenterTextSize(float f) {
        ((C46883pT3) this.f70049q).m19229n().setTextSize(AbstractC34967Oi6.m91656e(f));
    }

    public void setCenterTextSizePixels(float f) {
        ((C46883pT3) this.f70049q).m19229n().setTextSize(f);
    }

    public void setCenterTextTypeface(Typeface typeface) {
        ((C46883pT3) this.f70049q).m19229n().setTypeface(typeface);
    }

    public void setDrawCenterText(boolean z) {
        this.f70084s0 = z;
    }

    public void setDrawEntryLabels(boolean z) {
        this.f70073K = z;
    }

    public void setDrawHoleEnabled(boolean z) {
        this.f70076R = z;
    }

    public void setDrawRoundedSlices(boolean z) {
        this.f70079U = z;
    }

    @Deprecated
    public void setDrawSliceText(boolean z) {
        this.f70073K = z;
    }

    public void setDrawSlicesUnderHole(boolean z) {
        this.f70077S = z;
    }

    public void setEntryLabelColor(int i) {
        ((C46883pT3) this.f70049q).m19228o().setColor(i);
    }

    public void setEntryLabelTextSize(float f) {
        ((C46883pT3) this.f70049q).m19228o().setTextSize(AbstractC34967Oi6.m91656e(f));
    }

    public void setEntryLabelTypeface(Typeface typeface) {
        ((C46883pT3) this.f70049q).m19228o().setTypeface(typeface);
    }

    public void setHoleColor(int i) {
        ((C46883pT3) this.f70049q).m19227p().setColor(i);
    }

    public void setHoleRadius(float f) {
        this.f70082q0 = f;
    }

    public void setMaxAngle(float f) {
        if (f > 360.0f) {
            f = 360.0f;
        }
        if (f < 90.0f) {
            f = 90.0f;
        }
        this.f70086u0 = f;
    }

    public void setMinAngleForSlices(float f) {
        float f2 = this.f70086u0;
        if (f > f2 / 2.0f) {
            f = f2 / 2.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        this.f70087v0 = f;
    }

    public void setTransparentCircleAlpha(int i) {
        ((C46883pT3) this.f70049q).m19226q().setAlpha(i);
    }

    public void setTransparentCircleColor(int i) {
        Paint m19226q = ((C46883pT3) this.f70049q).m19226q();
        int alpha = m19226q.getAlpha();
        m19226q.setColor(i);
        m19226q.setAlpha(alpha);
    }

    public void setTransparentCircleRadius(float f) {
        this.f70083r0 = f;
    }

    public void setUsePercentValues(boolean z) {
        this.f70078T = z;
    }

    /* renamed from: t0 */
    public float[] m51982t0() {
        return this.f70074P;
    }

    /* renamed from: u0 */
    public float m51981u0() {
        return this.f70082q0;
    }

    /* renamed from: v0 */
    public float m51980v0() {
        return this.f70083r0;
    }

    /* renamed from: w0 */
    public boolean m51979w0() {
        return this.f70084s0;
    }

    /* renamed from: x0 */
    public boolean m51978x0() {
        return this.f70073K;
    }

    /* renamed from: y0 */
    public boolean m51977y0() {
        return this.f70076R;
    }

    /* renamed from: z0 */
    public boolean m51976z0() {
        return this.f70079U;
    }

    public PieChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70072J = new RectF();
        this.f70073K = true;
        this.f70074P = new float[1];
        this.f70075Q = new float[1];
        this.f70076R = true;
        this.f70077S = false;
        this.f70078T = false;
        this.f70079U = false;
        this.f70080W = "";
        this.f70081p0 = PE2.m90558c(0.0f, 0.0f);
        this.f70082q0 = 50.0f;
        this.f70083r0 = 55.0f;
        this.f70084s0 = true;
        this.f70085t0 = 100.0f;
        this.f70086u0 = 360.0f;
        this.f70087v0 = 0.0f;
    }

    public PieChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f70072J = new RectF();
        this.f70073K = true;
        this.f70074P = new float[1];
        this.f70075Q = new float[1];
        this.f70076R = true;
        this.f70077S = false;
        this.f70078T = false;
        this.f70079U = false;
        this.f70080W = "";
        this.f70081p0 = PE2.m90558c(0.0f, 0.0f);
        this.f70082q0 = 50.0f;
        this.f70083r0 = 55.0f;
        this.f70084s0 = true;
        this.f70085t0 = 100.0f;
        this.f70086u0 = 360.0f;
        this.f70087v0 = 0.0f;
    }
}
