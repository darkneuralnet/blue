package p000;

import android.graphics.Canvas;
import com.github.mikephil.charting.charts.RadarChart;
/* renamed from: wH6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C50927wH6 extends C49742uH6 {

    /* renamed from: p */
    public RadarChart f115761p;

    public C50927wH6(C32951Fs6 c32951Fs6, C49149tH6 c49149tH6, RadarChart radarChart) {
        super(c32951Fs6, c49149tH6, null);
        this.f115761p = radarChart;
    }

    @Override // p000.C49742uH6
    /* renamed from: i */
    public void mo7041i(Canvas canvas) {
        if (this.f112153h.m93268f() && this.f112153h.m76152A()) {
            float m12531P = this.f112153h.m12531P();
            PE2 m90558c = PE2.m90558c(0.5f, 0.25f);
            this.f47608e.setTypeface(this.f112153h.m93271c());
            this.f47608e.setTextSize(this.f112153h.m93272b());
            this.f47608e.setColor(this.f112153h.m93273a());
            float m51958n0 = this.f115761p.m51958n0();
            float m51960l0 = this.f115761p.m51960l0();
            PE2 m52001z = this.f115761p.m52001z();
            PE2 m90558c2 = PE2.m90558c(0.0f, 0.0f);
            for (int i = 0; i < ((C35235Pm4) this.f115761p.getData()).m33548k().mo21241L0(); i++) {
                float f = i;
                String mo58186a = this.f112153h.m76125v().mo58186a(f, this.f112153h);
                AbstractC34967Oi6.m91643r(m52001z, (this.f115761p.m51951u0() * m51960l0) + (this.f112153h.f110254L / 2.0f), ((f * m51958n0) + this.f115761p.m51969j0()) % 360.0f, m90558c2);
                m10482f(canvas, mo58186a, m90558c2.f28146c, m90558c2.f28147d - (this.f112153h.f110255M / 2.0f), m90558c, m12531P);
            }
            PE2.m90555f(m52001z);
            PE2.m90555f(m90558c2);
            PE2.m90555f(m90558c);
        }
    }

    @Override // p000.C49742uH6
    /* renamed from: n */
    public void mo7040n(Canvas canvas) {
    }
}
