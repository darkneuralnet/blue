package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
/* loaded from: classes5.dex */
public class ScatterChart extends BarLineChartBase<C45882nm5> implements InterfaceC46475om5 {
    public ScatterChart(Context context) {
        super(context);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    /* renamed from: O */
    public void mo51950O() {
        super.mo51950O();
        this.f70049q = new C45289mm5(this, this.f70052t, this.f70051s);
        mo51991M().m76139N(0.5f);
        mo51991M().m76140M(0.5f);
    }

    @Override // p000.InterfaceC46475om5
    /* renamed from: b */
    public C45882nm5 mo20507b() {
        return (C45882nm5) this.f70035c;
    }

    public ScatterChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScatterChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
