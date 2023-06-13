package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
/* loaded from: classes5.dex */
public class CandleStickChart extends BarLineChartBase<C41043fd0> implements InterfaceC41636gd0 {
    public CandleStickChart(Context context) {
        super(context);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    /* renamed from: O */
    public void mo51950O() {
        super.mo51950O();
        this.f70049q = new C42229hd0(this, this.f70052t, this.f70051s);
        mo51991M().m76139N(0.5f);
        mo51991M().m76140M(0.5f);
    }

    @Override // p000.InterfaceC41636gd0
    /* renamed from: n */
    public C41043fd0 mo37971n() {
        return (C41043fd0) this.f70035c;
    }

    public CandleStickChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CandleStickChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
