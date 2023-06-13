package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
/* loaded from: classes5.dex */
public class BubbleChart extends BarLineChartBase<C40116e30> implements InterfaceC40709f30 {
    public BubbleChart(Context context) {
        super(context);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    /* renamed from: O */
    public void mo51950O() {
        super.mo51950O();
        this.f70049q = new C39524d30(this, this.f70052t, this.f70051s);
    }

    @Override // p000.InterfaceC40709f30
    /* renamed from: a */
    public C40116e30 mo42233a() {
        return (C40116e30) this.f70035c;
    }

    public BubbleChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BubbleChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
