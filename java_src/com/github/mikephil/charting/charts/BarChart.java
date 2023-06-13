package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import p000.C37875aI6;
/* loaded from: classes5.dex */
public class BarChart extends BarLineChartBase<C28485sx> implements InterfaceC28967tx {

    /* renamed from: J0 */
    public boolean f69984J0;

    /* renamed from: K0 */
    public boolean f69985K0;

    /* renamed from: L0 */
    public boolean f69986L0;

    /* renamed from: M0 */
    public boolean f69987M0;

    public BarChart(Context context) {
        super(context);
        this.f69984J0 = false;
        this.f69985K0 = true;
        this.f69986L0 = false;
        this.f69987M0 = false;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    /* renamed from: G */
    public OM1 mo51997G(float f, float f2) {
        if (this.f70035c == null) {
            Log.e("MPAndroidChart", "Can't select by touch. No data set.");
            return null;
        }
        OM1 mo7729a = m52020H().mo7729a(f, f2);
        if (mo7729a != null && mo11174f()) {
            return new OM1(mo7729a.m92387h(), mo7729a.m92385j(), mo7729a.m92386i(), mo7729a.m92384k(), mo7729a.m92391d(), -1, mo7729a.m92393b());
        }
        return mo7729a;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    /* renamed from: O */
    public void mo51950O() {
        super.mo51950O();
        this.f70049q = new C28070rx(this, this.f70052t, this.f70051s);
        setHighlighter(new C29704vx(this));
        mo51991M().m76139N(0.5f);
        mo51991M().m76140M(0.5f);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    /* renamed from: Z */
    public void mo52048Z() {
        if (this.f69987M0) {
            this.f70042j.mo71674j(((C28485sx) this.f70035c).m33546m() - (((C28485sx) this.f70035c).m13373s() / 2.0f), ((C28485sx) this.f70035c).m33547l() + (((C28485sx) this.f70035c).m13373s() / 2.0f));
        } else {
            this.f70042j.mo71674j(((C28485sx) this.f70035c).m33546m(), ((C28485sx) this.f70035c).m33547l());
        }
        C37875aI6 c37875aI6 = this.f70013s0;
        C37875aI6.EnumC10624a enumC10624a = C37875aI6.EnumC10624a.LEFT;
        c37875aI6.mo71674j(((C28485sx) this.f70035c).m33542q(enumC10624a), ((C28485sx) this.f70035c).m33544o(enumC10624a));
        C37875aI6 c37875aI62 = this.f70014t0;
        C37875aI6.EnumC10624a enumC10624a2 = C37875aI6.EnumC10624a.RIGHT;
        c37875aI62.mo71674j(((C28485sx) this.f70035c).m33542q(enumC10624a2), ((C28485sx) this.f70035c).m33544o(enumC10624a2));
    }

    @Override // p000.InterfaceC28967tx
    /* renamed from: e */
    public boolean mo11175e() {
        return this.f69985K0;
    }

    @Override // p000.InterfaceC28967tx
    /* renamed from: f */
    public boolean mo11174f() {
        return this.f69984J0;
    }

    @Override // p000.InterfaceC28967tx
    /* renamed from: m */
    public boolean mo11173m() {
        return this.f69986L0;
    }

    @Override // p000.InterfaceC28967tx
    /* renamed from: q */
    public C28485sx mo11172q() {
        return (C28485sx) this.f70035c;
    }

    public void setDrawBarShadow(boolean z) {
        this.f69986L0 = z;
    }

    public void setDrawValueAboveBar(boolean z) {
        this.f69985K0 = z;
    }

    public void setFitBars(boolean z) {
        this.f69987M0 = z;
    }

    public void setHighlightFullBarEnabled(boolean z) {
        this.f69984J0 = z;
    }

    public BarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69984J0 = false;
        this.f69985K0 = true;
        this.f69986L0 = false;
        this.f69987M0 = false;
    }

    public BarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f69984J0 = false;
        this.f69985K0 = true;
        this.f69986L0 = false;
        this.f69987M0 = false;
    }
}
